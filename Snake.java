package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Snake extends JFrame implements ActionListener {

    JButton button, button1;
    ImageIcon icon;
    JLabel image1, image2, label1, label2;
    JTextField roll;
    int number, point = 0, point1 = 0, x = -69, y = 838, chance = 1;
    int px1 = 23, px2 = 115, px3 = 207, px4 = 299, px5 = 391, px6 = 483, px7 = 575, px8 = 667, px9 = 759, px10 = 851;
    int py1 = 838, py2 = 746, py3 = 654, py4 = 562, py5 = 475, py6 = 380, py7 = 290, py8 = 200, py9 = 107, py10 = 20;

    Snake() {
        setTitle("Snake Ladder Game");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/snake.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 980, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1000, 980);
        add(image);

        label1 = new JLabel("PLAYER 1");
        label1.setBounds(1059, 220, 120, 20);
        label1.setFont(new Font("serif", Font.PLAIN, 20));
        label1.setVisible(true);
        add(label1);

        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/dice.jpeg"));
        Image icon2 = icon.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon icon3 = new ImageIcon(icon2);
        button = new JButton(icon3);
        button.setBounds(1063, 250, 80, 80);
        button.addActionListener(this);
        add(button);

        ImageIcon pawn = new ImageIcon(ClassLoader.getSystemResource("icons/Blue.png"));
        Image pawn2 = pawn.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        ImageIcon pawn3 = new ImageIcon(pawn2);
        image1 = new JLabel(pawn3);
        image1.setVisible(true);
        image.add(image1);

        label2 = new JLabel("PLAYER 2");
        label2.setBounds(1059, 520, 120, 20);
        label2.setFont(new Font("serif", Font.PLAIN, 20));
        label2.setVisible(true);
        add(label2);

        ImageIcon icon1 = new ImageIcon(ClassLoader.getSystemResource("icons/dice.jpeg"));
        Image icon4 = icon1.getImage().getScaledInstance(120, 120, Image.SCALE_DEFAULT);
        ImageIcon icon5 = new ImageIcon(icon4);
        button1 = new JButton(icon5);
        button1.setBounds(1063, 550, 80, 80);
        button1.addActionListener(this);
        add(button1);

        ImageIcon pawn1 = new ImageIcon(ClassLoader.getSystemResource("icons/Yellow.png"));
        Image pawn4 = pawn1.getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT);
        ImageIcon pawn5 = new ImageIcon(pawn4);
        image2 = new JLabel(pawn5);
        image2.setVisible(true);
        image.add(image2);

        setSize(1220, 1020);
        setLocation(450, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
         if (chance == 1) {
            if (ae.getSource() == button) {
                Random ran = new Random();
                number = ran.nextInt(1, 7);
                image1.setBounds(x, y, 120, 120);
                point += number;
                roll = new JTextField("     " + number);
                roll.setBounds(1063, 350, 80, 40);
                roll.setFont(new Font("serif", Font.BOLD, 25));
                add(roll);
               

                switch (point) {

                    case 1:
                        image1.setBounds(px3, py4, 120, 120);
                        point = 38;
                        break;
                    case 2:
                        image1.setBounds(px2, py1, 120, 120);
                        break;
                    case 3:
                        image1.setBounds(px3, py1, 120, 120);
                        break;
                    case 4:
                        image1.setBounds(px7, py2, 120, 120);
                        point = 14;
                        break;
                    case 5:
                        image1.setBounds(px5, py1, 120, 120);
                        break;
                    case 6:
                        image1.setBounds(px6, py1, 120, 120);
                        break;
                    case 7:
                        image1.setBounds(px7, py1, 120, 120);
                        break;
                    case 8:
                        image1.setBounds(px10, py3, 120, 120);
                        point = 30;
                        break;
                    case 9:
                        image1.setBounds(px9, py1, 120, 120);
                        break;
                    case 10:
                        image1.setBounds(px10, py1, 120, 120);
                        break;
                    case 11:
                        image1.setBounds(px10, py2, 120, 120);
                        break;
                    case 12:
                        image1.setBounds(px9, py2, 120, 120);
                        break;
                    case 13:
                        image1.setBounds(px8, py2, 120, 120);
                        break;
                    case 14:
                        image1.setBounds(px7, py2, 120, 120);
                        break;
                    case 15:
                        image1.setBounds(px6, py2, 120, 120);
                        break;
                    case 16:
                        image1.setBounds(px5, py2, 120, 120);
                        break;
                    case 17:
                        image1.setBounds(px4, py2, 120, 120);
                        break;
                    case 18:
                        image1.setBounds(px3, py2, 120, 120);
                        break;
                    case 19:
                        image1.setBounds(px2, py2, 120, 120);
                        break;
                    case 20:
                        image1.setBounds(px1, py2, 120, 120);
                        break;
                    case 21:
                        image1.setBounds(px2, py5, 120, 120);
                        point = 42;
                        break;
                    case 22:
                        image1.setBounds(px2, py3, 120, 120);
                        break;
                    case 23:
                        image1.setBounds(px3, py3, 120, 120);
                        break;
                    case 24:
                        image1.setBounds(px4, py3, 120, 120);
                        break;
                    case 25:
                        image1.setBounds(px5, py3, 120, 120);
                        break;
                    case 26:
                        image1.setBounds(px6, py3, 120, 120);
                        break;
                    case 27:
                        image1.setBounds(px7, py3, 120, 120);
                        break;
                    case 28:
                        image2.setBounds(px5, py8, 120, 120);
                        point = 76;
                        break;
                    case 29:
                        image1.setBounds(px9, py3, 120, 120);
                        break;
                    case 30:
                        image1.setBounds(px10, py3, 120, 120);
                        break;
                    case 31:
                        image1.setBounds(px10, py4, 120, 120);
                        break;
                    case 32:
                        image1.setBounds(px10, py1, 120, 120);
                        point = 10;
                        break;
                    case 33:
                        image1.setBounds(px8, py4, 120, 120);
                        break;
                    case 34:
                        image1.setBounds(px7, py4, 120, 120);
                        break;
                    case 35:
                        image1.setBounds(px6, py4, 120, 120);
                        break;
                    case 36:
                        image1.setBounds(px6, py1, 120, 120);
                        point = 6;
                        break;
                    case 37:
                        image1.setBounds(px4, py4, 120, 120);
                        break;
                    case 38:
                        image1.setBounds(px3, py4, 120, 120);
                        break;
                    case 39:
                        image1.setBounds(px2, py4, 120, 120);
                        break;
                    case 40:
                        image1.setBounds(px1, py4, 120, 120);
                        break;
                    case 41:
                        image1.setBounds(px1, py5, 120, 120);
                        break;
                    case 42:
                        image1.setBounds(px2, py5, 120, 120);
                        break;
                    case 43:
                        image1.setBounds(px3, py5, 120, 120);
                        break;
                    case 44:
                        image1.setBounds(px4, py5, 120, 120);
                        break;
                    case 45:
                        image1.setBounds(px5, py5, 120, 120);
                        break;
                    case 46:
                        image1.setBounds(px6, py5, 120, 120);
                        break;
                    case 47:
                        image1.setBounds(px7, py5, 120, 120);
                        break;
                    case 48:
                        image1.setBounds(px6, py3, 120, 120);
                        point = 26;
                        break;
                    case 49:
                        image1.setBounds(px9, py5, 120, 120);
                        break;
                    case 50:
                        image1.setBounds(px7, py7, 120, 120);
                        point = 67;
                        break;
                    case 51:
                        image1.setBounds(px10, py6, 120, 120);
                        break;
                    case 52:
                        image1.setBounds(px9, py6, 120, 120);
                        break;
                    case 53:
                        image1.setBounds(px8, py6, 120, 120);
                        break;
                    case 54:
                        image1.setBounds(px7, py6, 120, 120);
                        break;
                    case 55:
                        image1.setBounds(px6, py6, 120, 120);
                        break;
                    case 56:
                        image1.setBounds(px5, py6, 120, 120);
                        break;
                    case 57:
                        image1.setBounds(px4, py6, 120, 120);
                        break;
                    case 58:
                        image1.setBounds(px3, py6, 120, 120);
                        break;
                    case 59:
                        image1.setBounds(px2, py6, 120, 120);
                        break;
                    case 60:
                        image1.setBounds(px1, py6, 120, 120);
                        break;
                    case 61:
                        image1.setBounds(px1, py7, 120, 120);
                        break;
                    case 62:
                        image1.setBounds(px3, py2, 120, 120);
                        point = 18;
                        break;
                    case 63:
                        image1.setBounds(px3, py7, 120, 120);
                        break;
                    case 64:
                        image1.setBounds(px4, py7, 120, 120);
                        break;
                    case 65:
                        image1.setBounds(px5, py7, 120, 120);
                        break;
                    case 66:
                        image1.setBounds(px6, py7, 120, 120);
                        break;
                    case 67:
                        image1.setBounds(px7, py7, 120, 120);
                        break;
                    case 68:
                        image1.setBounds(px8, py7, 120, 120);
                        break;
                    case 69:
                        image1.setBounds(px9, py7, 120, 120);
                        break;
                    case 70:
                        image1.setBounds(px10, py7, 120, 120);
                        break;
                    case 71:
                        image1.setBounds(px9, py10, 120, 120);
                        point = 92;
                        break;
                    case 72:
                        image1.setBounds(px9, py8, 120, 120);
                        break;
                    case 73:
                        image1.setBounds(px8, py8, 120, 120);
                        break;
                    case 74:
                        image1.setBounds(px7, py8, 120, 120);
                        break;
                    case 75:
                        image1.setBounds(px6, py8, 120, 120);
                        break;
                    case 76:
                        image1.setBounds(px5, py8, 120, 120);
                        break;
                    case 77:
                        image1.setBounds(px4, py8, 120, 120);
                        break;
                    case 78:
                        image1.setBounds(px3, py8, 120, 120);
                        break;
                    case 79:
                        image1.setBounds(px2, py8, 120, 120);
                        break;
                    case 80:
                        image1.setBounds(px2, py10, 120, 120);
                        point = 99;
                        break;
                    case 81:
                        image1.setBounds(px1, py9, 120, 120);
                        break;
                    case 82:
                        image1.setBounds(px2, py9, 120, 120);
                        break;
                    case 83:
                        image1.setBounds(px3, py9, 120, 120);
                        break;
                    case 84:
                        image1.setBounds(px4, py9, 120, 120);
                        break;
                    case 85:
                        image1.setBounds(px5, py9, 120, 120);
                        break;
                    case 86:
                        image1.setBounds(px6, py9, 120, 120);
                        break;
                    case 87:
                        image1.setBounds(px7, py9, 120, 120);
                        break;
                    case 88:
                        image1.setBounds(px4, py3, 120, 120);
                        point = 24;
                        break;
                    case 89:
                        image1.setBounds(px9, py9, 120, 120);
                        break;
                    case 90:
                        image1.setBounds(px10, py9, 120, 120);
                        break;
                    case 91:
                        image1.setBounds(px10, py10, 120, 120);
                        break;
                    case 92:
                        image1.setBounds(px9, py10, 120, 120);
                        break;
                    case 93:
                        image1.setBounds(px8, py10, 120, 120);
                        break;
                    case 94:
                        image1.setBounds(px7, py10, 120, 120);
                        break;
                    case 95:
                        image1.setBounds(px5, py6, 120, 120);
                        point = 56;
                        break;
                    case 96:
                        image1.setBounds(px5, py10, 120, 120);
                        break;
                    case 97:
                        image1.setBounds(px3, py8, 120, 120);
                        point = 78;
                        break;
                    case 98:
                        image1.setBounds(px3, py10, 120, 120);
                        break;
                    case 99:
                        image1.setBounds(px2, py10, 120, 120);
                        break;
                    case 100:
                        image1.setBounds(px1, py10, 120, 120);
                        break;
                    default:
                        if (point >= 100) {
                            setVisible(false);
                            JOptionPane.showMessageDialog(null, "   PLAYER 1 IS WINNER");
                            new Congatulation();
                        }
                        

                }chance = 2;
                
            }
            
        }
             if (chance == 2) {
            if (ae.getSource() == button1) {
                Random ran = new Random();
                number = ran.nextInt(1, 7);
                image2.setBounds(x, y, 120, 120);
                point1 += number;
                roll = new JTextField("     " + number);
                roll.setBounds(1063, 650, 80, 40);
                roll.setFont(new Font("serif", Font.BOLD, 25));
                add(roll);
                

                switch (point1) {

                    case 1:
                        image2.setBounds(px3, py4, 120, 120);
                        point1 = 38;
                        break;
                    case 2:
                        image2.setBounds(px2, py1, 120, 120);
                        break;
                    case 3:
                        image2.setBounds(px3, py1, 120, 120);
                        break;
                    case 4:
                        image2.setBounds(px7, py2, 120, 120);
                        point1 = 14;
                        break;
                    case 5:
                        image2.setBounds(px5, py1, 120, 120);
                        break;
                    case 6:
                        image2.setBounds(px6, py1, 120, 120);
                        break;
                    case 7:
                        image2.setBounds(px7, py1, 120, 120);
                        break;
                    case 8:
                        image2.setBounds(px10, py3, 120, 120);
                        point1 = 30;
                        break;
                    case 9:
                        image2.setBounds(px9, py1, 120, 120);
                        break;
                    case 10:
                        image2.setBounds(px10, py1, 120, 120);
                        break;
                    case 11:
                        image2.setBounds(px10, py2, 120, 120);
                        break;
                    case 12:
                        image2.setBounds(px9, py2, 120, 120);
                        break;
                    case 13:
                        image2.setBounds(px8, py2, 120, 120);
                        break;
                    case 14:
                        image2.setBounds(px7, py2, 120, 120);
                        break;
                    case 15:
                        image2.setBounds(px6, py2, 120, 120);
                        break;
                    case 16:
                        image2.setBounds(px5, py2, 120, 120);
                        break;
                    case 17:
                        image2.setBounds(px4, py2, 120, 120);
                        break;
                    case 18:
                        image2.setBounds(px3, py2, 120, 120);
                        break;
                    case 19:
                        image2.setBounds(px2, py2, 120, 120);
                        break;
                    case 20:
                        image2.setBounds(px1, py2, 120, 120);
                        break;
                    case 21:
                        image2.setBounds(px2, py5, 120, 120);
                        point1 = 42;
                        break;
                    case 22:
                        image2.setBounds(px2, py3, 120, 120);
                        break;
                    case 23:
                        image2.setBounds(px3, py3, 120, 120);
                        break;
                    case 24:
                        image2.setBounds(px4, py3, 120, 120);
                        break;
                    case 25:
                        image2.setBounds(px5, py3, 120, 120);
                        break;
                    case 26:
                        image2.setBounds(px6, py3, 120, 120);
                        break;
                    case 27:
                        image2.setBounds(px7, py3, 120, 120);
                        break;
                    case 28:
                        image2.setBounds(px5, py8, 120, 120);
                        point1 = 76;
                        break;
                    case 29:
                        image2.setBounds(px9, py3, 120, 120);
                        break;
                    case 30:
                        image2.setBounds(px10, py3, 120, 120);
                        break;
                    case 31:
                        image2.setBounds(px10, py4, 120, 120);
                        break;
                    case 32:
                        image2.setBounds(px10, py1, 120, 120);
                        point1 = 10;
                        break;
                    case 33:
                        image2.setBounds(px8, py4, 120, 120);
                        break;
                    case 34:
                        image2.setBounds(px7, py4, 120, 120);
                        break;
                    case 35:
                        image2.setBounds(px6, py4, 120, 120);
                        break;
                    case 36:
                        image2.setBounds(px6, py1, 120, 120);
                        point1 = 6;
                        break;
                    case 37:
                        image2.setBounds(px4, py4, 120, 120);
                        break;
                    case 38:
                        image2.setBounds(px3, py4, 120, 120);
                        break;
                    case 39:
                        image2.setBounds(px2, py4, 120, 120);
                        break;
                    case 40:
                        image2.setBounds(px1, py4, 120, 120);
                        break;
                    case 41:
                        image2.setBounds(px1, py5, 120, 120);
                        break;
                    case 42:
                        image2.setBounds(px2, py5, 120, 120);
                        break;
                    case 43:
                        image2.setBounds(px3, py5, 120, 120);
                        break;
                    case 44:
                        image2.setBounds(px4, py5, 120, 120);
                        break;
                    case 45:
                        image2.setBounds(px5, py5, 120, 120);
                        break;
                    case 46:
                        image2.setBounds(px6, py5, 120, 120);
                        break;
                    case 47:
                        image2.setBounds(px7, py5, 120, 120);
                        break;
                    case 48:
                        image2.setBounds(px6, py3, 120, 120);
                        point1 = 26;
                        break;
                    case 49:
                        image2.setBounds(px9, py5, 120, 120);
                        break;
                    case 50:
                        image2.setBounds(px7, py7, 120, 120);
                        point1 = 67;
                        break;
                    case 51:
                        image2.setBounds(px10, py6, 120, 120);
                        break;
                    case 52:
                        image2.setBounds(px9, py6, 120, 120);
                        break;
                    case 53:
                        image2.setBounds(px8, py6, 120, 120);
                        break;
                    case 54:
                        image2.setBounds(px7, py6, 120, 120);
                        break;
                    case 55:
                        image2.setBounds(px6, py6, 120, 120);
                        break;
                    case 56:
                        image2.setBounds(px5, py6, 120, 120);
                        break;
                    case 57:
                        image2.setBounds(px4, py6, 120, 120);
                        break;
                    case 58:
                        image2.setBounds(px3, py6, 120, 120);
                        break;
                    case 59:
                        image2.setBounds(px2, py6, 120, 120);
                        break;
                    case 60:
                        image2.setBounds(px1, py6, 120, 120);
                        break;
                    case 61:
                        image2.setBounds(px1, py7, 120, 120);
                        break;
                    case 62:
                        image2.setBounds(px3, py2, 120, 120);
                        point1 = 18;
                        break;
                    case 63:
                        image2.setBounds(px3, py7, 120, 120);
                        break;
                    case 64:
                        image2.setBounds(px4, py7, 120, 120);
                        break;
                    case 65:
                        image2.setBounds(px5, py7, 120, 120);
                        break;
                    case 66:
                        image2.setBounds(px6, py7, 120, 120);
                        break;
                    case 67:
                        image2.setBounds(px7, py7, 120, 120);
                        break;
                    case 68:
                        image2.setBounds(px8, py7, 120, 120);
                        break;
                    case 69:
                        image2.setBounds(px9, py7, 120, 120);
                        break;
                    case 70:
                        image2.setBounds(px10, py7, 120, 120);
                        break;
                    case 71:
                        image2.setBounds(px9, py10, 120, 120);
                        point1 = 92;
                        break;
                    case 72:
                        image2.setBounds(px9, py8, 120, 120);
                        break;
                    case 73:
                        image2.setBounds(px8, py8, 120, 120);
                        break;
                    case 74:
                        image2.setBounds(px7, py8, 120, 120);
                        break;
                    case 75:
                        image2.setBounds(px6, py8, 120, 120);
                        break;
                    case 76:
                        image2.setBounds(px5, py8, 120, 120);
                        break;
                    case 77:
                        image2.setBounds(px4, py8, 120, 120);
                        break;
                    case 78:
                        image2.setBounds(px3, py8, 120, 120);
                        break;
                    case 79:
                        image2.setBounds(px2, py8, 120, 120);
                        break;
                    case 80:
                        image2.setBounds(px2, py10, 120, 120);
                        point1 = 99;
                        break;
                    case 81:
                        image2.setBounds(px1, py9, 120, 120);
                        break;
                    case 82:
                        image2.setBounds(px2, py9, 120, 120);
                        break;
                    case 83:
                        image2.setBounds(px3, py9, 120, 120);
                        break;
                    case 84:
                        image2.setBounds(px4, py9, 120, 120);
                        break;
                    case 85:
                        image2.setBounds(px5, py9, 120, 120);
                        break;
                    case 86:
                        image2.setBounds(px6, py9, 120, 120);
                        break;
                    case 87:
                        image2.setBounds(px7, py9, 120, 120);
                        break;
                    case 88:
                        image2.setBounds(px4, py3, 120, 120);
                        point1 = 24;
                        break;
                    case 89:
                        image2.setBounds(px9, py9, 120, 120);
                        break;
                    case 90:
                        image2.setBounds(px10, py9, 120, 120);
                        break;
                    case 91:
                        image2.setBounds(px10, py10, 120, 120);
                        break;
                    case 92:
                        image2.setBounds(px9, py10, 120, 120);
                        break;
                    case 93:
                        image2.setBounds(px8, py10, 120, 120);
                        break;
                    case 94:
                        image2.setBounds(px7, py10, 120, 120);
                        break;
                    case 95:
                        image2.setBounds(px5, py6, 120, 120);
                        point1 = 56;
                        break;
                    case 96:
                        image2.setBounds(px5, py10, 120, 120);
                        break;
                    case 97:
                        image2.setBounds(px3, py8, 120, 120);
                        point1 = 78;
                        break;
                    case 98:
                        image2.setBounds(px3, py10, 120, 120);
                        break;
                    case 99:
                        image2.setBounds(px2, py10, 120, 120);
                        break;
                    case 100:
                        image2.setBounds(px1, py10, 120, 120);
                        break;
                    default:
                        if (point1 >= 100) {
                            setVisible(false);
                            JOptionPane.showMessageDialog(null, "  PLAYER 2 IS WINNER");
                            new Congratulations1();
                        }
                } chance = 1;
                

            }
               
        }
        
    }

    public static void main(String[] args) {
        new Snake();
    }
}
