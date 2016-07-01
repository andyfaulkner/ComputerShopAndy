package DatabaseLogic;

import ProgramLogic.Customer;

import java.sql.*;

/**
 * Created by student on 30-Jun-16.
 */
public class MySQLLogic {
    static Statement statement;
    ResultSet rs = null;

    static Connection conn;
    static String username = "root";
    static String password = "Password100";
    static String url = "jdbc:mysql://localhost:3306/computerShopDatabase?UseSSL=false";

    MySQLLogic(Connection connection){ this.conn = connection; }

    //create the table for customers
    private static void createCustomersTable(Statement statement) throws SQLException {
        statement.executeUpdate("CREATE TABLE Customers ("
                + "Id INTEGER NOT NULL AUTO_INCREMENT,"
                + "FirstName VARCHAR(40) NOT NULL,"
                + "LastName VARCHAR(40) NOT NULL,"
                + "PhoneNumber VARCHAR(40) NOT NULL,"
                + "Email VARCHAR(40) NOT NULL,"
                + "Laptop BOOL NOT NULL,"
                + "Weight INT NOT NULL,"
                + "BatteryLife INT NOT NULL,"
                + "Monitor INT NOT NULL,"
                + "PRIMARY KEY (ID))");
    }

    public static void addCustomerToDatabase (Customer customer) throws Exception{

        //get the driver
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);

        PreparedStatement statement = conn.prepareStatement("INSERT INTO " +
                "Customers (FirstName, LastName, PhoneNumber, Email, Laptop, Weight, BatteryLife, Monitor)" +
                "Values (?,?,?,?,?,?,?,?)");
        int laptopBool = 0;
        statement.setString(1, customer.getFirstName());
        statement.setString(2, customer.getLastName());
        statement.setString(3, customer.getPhoneNumber());
        statement.setString(4, customer.getEmail());
        if(customer.isLaptop()){
            laptopBool = 1;
        }
        statement.setString(5, String.valueOf(laptopBool));
        statement.setString(6, String.valueOf(customer.getWeight()));
        statement.setString(7, String.valueOf(customer.getBatteryLife()));
        statement.setString(8, String.valueOf(customer.getMonitorSize()));

        statement.executeUpdate();
        statement.close();
        conn.close();

    }

    public static void getAllCustomers(){

    }


//    public void createDatabaseTables() throws SQLException {
//        Statement statement = conn.createStatement();
//        createTable(statement);
//        statement.close();
//        CreateBookList();
//    }

    public static void implementDb() throws Exception{
        //get the driver
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection(url, username, password);
        statement = conn.createStatement();
        new MySQLLogic(conn).createCustomersTable(statement);
        conn.close();
    }
}
