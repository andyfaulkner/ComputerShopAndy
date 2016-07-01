package ComputerStoreGUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by student on 01-Jul-16.
 */
public class ComputerStoreGUI extends JFrame {

    //Global variable declaration
    JFrame mainFrame;
    JPanel panelComputer, panelCustomer, panelControls;
    JMenuBar menuBar;
    JButton btnSave;
    JTextArea txtFirstName, txtLastName, txtTelephoneNumber, txtEmail, txtComputerName, txtDescription, txtCPUSpeed, txtRAM, txtHardDraveCapacity;
    JTextArea txtPrice;
    JComboBox cmbCPUType, cmbGraphicsCard;
    JMenu fileMenu, editMenu, sortMenu;
    JMenuItem  addComputer, addCustomer;


    //constructor to call all the methods to display the gui
    public AdressBookGUI(){

        mainWindowConfig();

    }

    //Setup for the main window for the application
    public void mainWindowConfig() {
        mainFrame = new JFrame("Computer Shop Application");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(380, 360);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);


    }

    public void computerWindowConfig(){
        panelComputer = new JPanel(new GridLayout(11,2));
        panelComputer.setSize(380, 450);

        JLabel lblComputerName = new JLabel("Computer Name: ");
        panelComputer.add(lblFirstName);
        txtFirstName = new JTextArea();
        panelAddress.add(txtFirstName);



    }

}
