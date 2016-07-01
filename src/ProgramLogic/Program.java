package ProgramLogic;

import DatabaseLogic.MySQLLogic;

import java.util.Scanner;

/**
 * Created by student on 01-Jul-16.
 */
public class Program {

    //global variables
    public static Scanner scan = new Scanner(System.in);


    public static void main(String[]args) {

        menu();

    }

    static void menu(){
        int choice;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Add a new computer or customer");
            System.out.println("2. Search for a computer");
            System.out.println("3. Match the customer with a computer");
            System.out.println("4. Display all computers");
            System.out.println("5. Display all customers");
            System.out.println("6. Exit");
            System.out.println("Choose an option: ");


            choice = Integer.parseInt(scan.nextLine());


        } while (choice < 1 || choice > 6);
        {

            switch (choice) {
                case 1:
                    addSubMenu();
                    break;
                case 2:
//                    //method to add the table to the database
//                    try {
//                        MySQLLogic.implementDb();
//                    } catch (Exception e) {
//                        e.printStackTrace();
//                    }

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case  5:
                    displayAllCustomers();
                    break;
                case  6:
                    break;
                default :
                    break;
            }
        }
    }



    public static void addSubMenu() {
        int choice;
        do {
            System.out.println("----- Menu -----");
            System.out.println("1. Add a new computer");
            System.out.println("2. Add a new customer");
            System.out.println("3. Return to previous menu");
            System.out.println("Choose an option: ");


            choice = Integer.parseInt(scan.nextLine());


        } while (choice < 1 || choice > 3);
        {

            switch (choice) {
                case 1:
                    addComputer();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    menu();
                    break;
                default :
                    break;
            }
        }
    }

    public static void addComputer() {
    }

    public static void addCustomer() {

        String firstName, lastName, email, phoneNumber;
        int monitor;
        char laptop;
        boolean laptopBool = false;
        int weight = 0;
        int batteryLife = 0;

        System.out.println("Enter first name: ");
        firstName = scan.nextLine();

        System.out.println("Enter last name: ");
        lastName = scan.nextLine();

        System.out.println("Enter phone number: ");
        phoneNumber = scan.nextLine();

        System.out.println("Enter email: ");
        email = scan.nextLine();

        System.out.println("Does the customer want a laptop? y/n");
        laptop = scan.nextLine().charAt(0);
        if(laptop == 'y'){
            laptopBool = true;
        }

        if (laptopBool){
            System.out.println("How much would you like it to weight in kilo's?");
            weight = scan.nextInt();

            System.out.println("How much battery life would you like in hours?");
            batteryLife = scan.nextInt();
        }

        System.out.println("What size screen or monitor would you like?");
        monitor = scan.nextInt();

        Customer temp = new Customer(firstName, lastName, phoneNumber, email, laptopBool, weight, batteryLife, monitor);


        try {
            MySQLLogic.addCustomerToDatabase(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }

        menu();
    }

    private static void displayAllCustomers() {

    }

}
