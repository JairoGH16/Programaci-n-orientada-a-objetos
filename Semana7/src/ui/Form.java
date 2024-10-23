package ui;
import Models.Customer;
import Models.Employee;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Form extends JFrame{
    private JPanel homePanel;
    private JTable employeesTbl;
    private JTextField salary;
    private JTextField firstname;
    private JTextField lastname;
    private JButton createButton;
    private JTabbedPane tabbedPane1;
    private JTable table1;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton createButton1;
    private ArrayList <Employee> employees =new ArrayList<Employee>();
    private ArrayList <Customer> customers =new ArrayList<Customer>();



    public Form(){
        loadEmployeesTable();
        loadCustomers();
        setContentPane(homePanel);
        setLocationRelativeTo(null);
        setSize(800,600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Bank POO");
        setVisible(true);


        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                employees.add(new Employee(
                        "",
                        firstname.getText(),
                        lastname.getText(),
                        Integer.parseInt(salary.getText())
                ));
                firstname.setText("");
                lastname.setText("");
                salary.setText("");
                loadEmployeesTable();
            }
        });
        createButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                customers.add(new Customer(
                        "",
                        textField1.getText(),
                        textField2.getText(),
                        textField3.getText()
                ));
                textField1.setText("");
                textField2.setText("");
                textField3.setText("");
                loadCustomers();
            }
        });
    }
    public void loadCustomers(){
        String[] columns = {"ID","First Name", "Last Name", "Account number"};
        Object[][]data = new Object[customers.size()][columns.length];
        for (int i = 0; i < customers.size(); i++) {
            data[i][0]= customers.get(i).getId();
            data[i][1]=customers.get(i).getFirstname();
            data[i][2]= customers.get(i).getLastname();
            data[i][3]= customers.get(i).getAccountNumber();

        }
        table1.setModel(
                new DefaultTableModel(
                        data,
                        columns
                ));
    }
    public void loadEmployeesTable(){
        String[] columns = {"ID","First Name", "Last Name", "Salary"};
        Object[][]data = new Object[employees.size()][columns.length];
        for (int i = 0; i < employees.size(); i++) {
            data[i][0]= employees.get(i).getId();
            data[i][1]=employees.get(i).getFirstname();
            data[i][2]= employees.get(i).getLastname();
            data[i][3]= employees.get(i).getSalary();

        }
        employeesTbl.setModel(
                new DefaultTableModel(
                        data,
                        columns
                ));

    }


}
