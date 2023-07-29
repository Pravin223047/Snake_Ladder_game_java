package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;


public class Congratulations1 extends JFrame implements ActionListener {

    JButton button, button1;
    ImageIcon icon;
    JLabel image1, image2, label1, label2;

    Congratulations1() {
        setTitle("Congratulation");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        label1 = new JLabel("CONGRALULATIONS");
        label1.setBounds(110, 20, 320, 30);
        label1.setFont(new Font("serif", Font.PLAIN, 30));
        label1.setVisible(true);
        add(label1);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/Player2"));
        Image i2 = i1.getImage().getScaledInstance(200, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 0, 420, 300);
        add(image);
        
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/congrats"));
        Image i8 = i7.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel image3 = new JLabel(i9);
        image3.setBounds(-20, 63, 150, 150);
        image.add(image3);
        
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/congrats"));
        Image i11 = i10.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel image4 = new JLabel(i12);
        image4.setBounds(278, 63, 150, 150);
        image.add(image4);

        button = new JButton("PLAY AGAIN");
        button.setBounds(80, 250, 150, 30);
        button.setBackground(Color.BLACK);
        button.setForeground(Color.WHITE);
        button.addActionListener(this);
        add(button);

       


        button1 = new JButton("BACK");
        button1.setBounds(280, 250, 150, 30);
        button1.addActionListener(this);
        button1.setBackground(Color.BLACK);
        button1.setForeground(Color.WHITE);
        add(button1);

        setSize(530, 380);
        setLocation(650, 350);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
            if (ae.getSource() == button) {
                 setVisible(false);
                 new Snake();
            }
            if (ae.getSource() == button1) {
                setVisible(false);
        }
        
    }

    public static void main(String[] args) {
        new Congratulations1();
    }
}
