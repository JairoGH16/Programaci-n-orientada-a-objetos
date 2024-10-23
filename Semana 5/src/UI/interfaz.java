package UI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class interfaz extends JFrame {
    private JLabel label1;
    private JButton button1;
    private JPanel panel1;
    private JTextField textField1;

    public interfaz() {
        setContentPane(panel1);
        setTitle("Clase POO");
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Que hacer cuando se cierra la aplicacion
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "This is a message ");
            }
        });
        textField1.setText("Ingrese su nombre");
    }
}
