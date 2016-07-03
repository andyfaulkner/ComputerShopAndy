package ComputerStoreGUI;

import javax.swing.*;
import java.awt.*;

/**
 * Created by student on 01-Jul-16.
 */
public class ComputerStoreGUI extends JFrame {

    //Global variable declaration
    JFrame mainFrame;
    JPanel panelComputer, panelCustomer, panelControls, startPanel;
    JMenuBar menuBar;
    JButton btnNext, btnPrevious, btnSave;
    JTextArea txtFirstName, txtLastName, txtTelephoneNumber, txtEmail, txtComputerName, txtDescription, txtCPUSpeed, txtRAM, txtHardDraveCapacity;
    JTextArea txtPrice;
    JComboBox cmbCPUType, cmbGraphicsCard;
    JMenu fileMenu, addMenu, editMenu, sortMenu;
    JMenuItem  addComputer, addCustomer;


    //constructor to call all the methods to display the gui
    public ComputerStoreGUI(){

        mainWindowConfig();

    }

    //Setup for the main window for the application
    public void mainWindowConfig() {
        mainFrame = new JFrame("Computer Shop Application");
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setSize(380, 500);
        mainFrame.setResizable(false);
        mainFrame.setLocationRelativeTo(null);

        //implement the menu bar
        menuBarConfig();
        mainFrame.add(menuBar, BorderLayout.NORTH);

        //testing panel visibility
        JPanel panelCenter= new JPanel(new FlowLayout());
        panelCenter.setSize(380, 450);
        mainFrame.add(panelCenter, BorderLayout.CENTER);

        //implement the starting panel
        startPanelConfig();
        panelCenter.add(startPanel);

        //implement the computer panel
        computerWindowConfig();
        panelCenter.add(panelComputer);
        panelComputer.setVisible(false);

        //implement the customer panel
        customerWindowConfig();
        panelCenter.add(panelCustomer);
        panelCustomer.setVisible(false);

        //implement the control panel
        controlPanelConfig();
        mainFrame.add(panelControls, BorderLayout.SOUTH);

        //set visible
        mainFrame.setVisible(true);

    }

    public void menuBarConfig(){
        menuBar = new JMenuBar();

        //file menu functions
        fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        //add menu functions
        addMenu = new JMenu("Add");
        menuBar.add(addMenu);
        addComputer = new JMenuItem("Add a computer");
        addComputer.addActionListener(event -> {
            //call to the add computer logic
            addComputerMenuFunction();
        });
        addMenu.add(addComputer);
        addCustomer = new JMenuItem("Add a customer");
        addCustomer.addActionListener(event -> {
            //call to the add customer logic
            addCustomerMenuFunction();
        });
        addMenu.add(addCustomer);

    }

    //setup for the control panel
    public void controlPanelConfig(){
        panelControls = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        panelControls.setSize(400, 50);
        btnPrevious = new JButton("<< Previous");
        btnPrevious.addActionListener(event -> {
            //previous record button function
        });
        panelControls.add(btnPrevious);
        btnPrevious.setVisible(false);
        btnNext = new JButton("Next >>");
        btnNext.addActionListener(event -> {
            //next button function
        });
        panelControls.add(btnNext);
        btnNext.setVisible(false);
        btnSave = new JButton("Save Contact");

        btnSave.setVisible(false);
        panelControls.add(btnSave);

    }

    public void startPanelConfig(){
        startPanel = new JPanel(new FlowLayout());
        startPanel.setSize(380, 450);
        JLabel lblIntro = new JLabel("Welcome to the Computer Store Application");
        startPanel.add(lblIntro, BorderLayout.CENTER);
    }

    public void computerWindowConfig(){
        panelComputer = new JPanel(new GridLayout(11,2));
        panelComputer.setSize(380, 450);

        JLabel lblComputerName = new JLabel("Computer Name: ");
        panelComputer.add(lblComputerName);
        txtComputerName = new JTextArea();
        panelComputer.add(txtComputerName);

    }

    public void customerWindowConfig(){
        panelCustomer = new JPanel(new GridLayout(8,2));
        panelCustomer.setSize(380, 450);

        JLabel lblFirstName = new JLabel("First Name: ");
        panelCustomer.add(lblFirstName);
        txtFirstName = new JTextArea();
        panelCustomer.add(txtFirstName);

        JLabel lblLastName = new JLabel("Last Name: ");
        panelCustomer.add(lblLastName);
        txtLastName = new JTextArea();
        panelCustomer.add(txtLastName);

        JLabel lblTelephone = new JLabel("Telephone Number: ");
        panelCustomer.add(lblTelephone);
        txtTelephoneNumber = new JTextArea();
        panelCustomer.add(txtTelephoneNumber);

        JLabel lblEmail = new JLabel("Email: ");
        panelCustomer.add(lblEmail);
        txtEmail = new JTextArea();
        panelCustomer.add(txtEmail);
    }

    public void addComputerMenuFunction(){
        startPanel.setVisible(false);
        panelComputer.setVisible(true);

        btnSave.setVisible(true);
        btnSave.addActionListener(event -> {
            btnSave.setVisible(false);
            panelComputer.setVisible(false);
            startPanel.setVisible(true);
        });
    }

    public void addCustomerMenuFunction(){
        startPanel.setVisible(false);
        panelCustomer.setVisible(true);

        btnSave.setVisible(true);
        btnSave.addActionListener(event -> {
            btnSave.setVisible(false);
            panelCustomer.setVisible(false);
            startPanel.setVisible(true);
        });
    }
}
