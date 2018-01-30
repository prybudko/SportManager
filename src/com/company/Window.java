package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * Created by Asus on 09.04.2017.
 */
public class Window extends JFrame{
    JButton button;
    JLabel label;
    JTextField textField;
    double ch;
    Eventt eventt = new Eventt();
    JButton button1;
    JLabel label1;
    JTextField textField1;
    double ch1;
    JButton button2;
    JLabel label2;
    JTextField textField2;
    double ch2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JTextField textTric;
    JLabel labelTric;
    JButton buttonTric;
    double chTric;
    JLabel labelNazvaTric;
    JTextField textBic;
    JLabel labelBic;
    JButton buttonBic;
    double chBic;
    JLabel labelNazvaBic;
    JTextField textPlech;
    JLabel labelPlech;
    JButton buttonPlech;
    double chPlech;
    JLabel labelNazvaPlech;


    public Window (String s) {
        super(s);

        setLayout(new GridLayout(6,3,5,10));
        label3 = new JLabel("Жим");
        label3.setPreferredSize(new Dimension(70, 20));
        label4 = new JLabel("Присед");
        label4.setPreferredSize(new Dimension(70, 20));
        label5 = new JLabel("Тяга");
        label5.setPreferredSize(new Dimension(70, 20));
        button = new JButton("Передать");
        label = new JLabel("");
        label.setPreferredSize(new Dimension(70, 20));
        textField = new JTextField(3);
        button1 = new JButton("Передать");
        label1 = new JLabel("");
        label1.setPreferredSize(new Dimension(70, 20));
        textField1 = new JTextField(3);
        button2 = new JButton("Передать");
        label2 = new JLabel("");
        label2.setPreferredSize(new Dimension(70, 20));
        textField2 = new JTextField(3);

        labelNazvaTric = new JLabel("Жим узким хватом");
        labelNazvaTric.setPreferredSize(new Dimension(70, 20));
        buttonTric = new JButton("Передать");
        labelTric = new JLabel("");
        labelTric.setPreferredSize(new Dimension(70, 20));
        textTric = new JTextField(3);

        labelNazvaBic = new JLabel("Подъем штанги");
        labelNazvaBic.setPreferredSize(new Dimension(70, 20));
        buttonBic = new JButton("Передать");
        labelBic = new JLabel("");
        labelBic.setPreferredSize(new Dimension(70, 20));
        textBic = new JTextField(3);

        labelNazvaPlech = new JLabel("Армейский жим");
        labelNazvaPlech.setPreferredSize(new Dimension(70, 20));
        buttonPlech = new JButton("Передать");
        labelPlech = new JLabel("");
        labelPlech.setPreferredSize(new Dimension(70, 20));
        textPlech = new JTextField(3);

        add (label3);
        add(textField);
        add (button);
        add (label);
        add (label4);
        add(textField1);
        add (button1);
        add (label1);
        add (label5);
        add(textField2);
        add (button2);
        add (label2);

        add (labelNazvaTric);
        add (textTric);
        add (buttonTric);
        add (labelTric);

        add (labelNazvaBic);
        add (textBic);
        add (buttonBic);
        add (labelBic);

        add (labelNazvaPlech);
        add (textPlech);
        add (buttonPlech);
        add (labelPlech);

        button.addActionListener(eventt);
        button1.addActionListener(eventt);
        button2.addActionListener(eventt);
        buttonTric.addActionListener(eventt);
        buttonBic.addActionListener(eventt);
        buttonPlech.addActionListener(eventt);
    }
    public class Eventt implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ex) {
            String url = "jdbc:mysql://localhost:3306/sportdb";
            try {
            Connection connection = DriverManager.getConnection(url, "root", "root");
            PreparedStatement preparedStatement;
            try {
           try{ if (ex.getSource() == button){

               preparedStatement = connection.prepareStatement("DELETE FROM sport WHERE id=1");
               preparedStatement.executeUpdate();
               ch = Double.parseDouble(textField.getText());
               label.setText(String.valueOf(ch));
               preparedStatement = connection.prepareStatement("INSERT INTO sport(id, partBody) VALUES (?,?)");
               preparedStatement.setInt (1, 1);
               preparedStatement.setString(2,String.valueOf(ch));
               preparedStatement.executeUpdate();

            }else if (ex.getSource() == button1){
               preparedStatement = connection.prepareStatement("DELETE FROM sport WHERE id=2");
               preparedStatement.executeUpdate();
               ch1 = Double.parseDouble(textField1.getText());
               label1.setText(String.valueOf(ch1));
               preparedStatement = connection.prepareStatement("INSERT INTO sport(id, partBody) VALUES (?,?)");
               preparedStatement.setInt (1, 2);
               preparedStatement.setString(2,String.valueOf(ch1));
               preparedStatement.executeUpdate();

            }else if (ex.getSource() == button2){
               preparedStatement = connection.prepareStatement("DELETE FROM sport WHERE id=3");
               preparedStatement.executeUpdate();
               ch2 = Double.parseDouble(textField2.getText());
               label2.setText(String.valueOf(ch2));
               preparedStatement = connection.prepareStatement("INSERT INTO sport(id, partBody) VALUES (?,?)");
               preparedStatement.setInt (1, 3);
               preparedStatement.setString(2,String.valueOf(ch2));
               preparedStatement.executeUpdate();

            }else if (ex.getSource() == buttonTric){
               preparedStatement = connection.prepareStatement("DELETE FROM sport WHERE id=4");
               preparedStatement.executeUpdate();
               chTric = Double.parseDouble(textTric.getText());
               labelTric.setText(String.valueOf(chTric));
               preparedStatement = connection.prepareStatement("INSERT INTO sport(id, partBody) VALUES (?,?)");
               preparedStatement.setInt (1, 4);
               preparedStatement.setString(2,String.valueOf(chTric));
               preparedStatement.executeUpdate();

            }else if (ex.getSource() == buttonBic){
               preparedStatement = connection.prepareStatement("DELETE FROM sport WHERE id=5");
               preparedStatement.executeUpdate();
               chBic = Double.parseDouble(textBic.getText());
               labelBic.setText(String.valueOf(chBic));
               preparedStatement = connection.prepareStatement("INSERT INTO sport(id, partBody) VALUES (?,?)");
               preparedStatement.setInt (1, 5);
               preparedStatement.setString(2,String.valueOf(chBic));
               preparedStatement.executeUpdate();

            }else if (ex.getSource() == buttonPlech){
               preparedStatement = connection.prepareStatement("DELETE FROM sport WHERE id=6");
               preparedStatement.executeUpdate();
               chPlech = Double.parseDouble(textPlech.getText());
               labelPlech.setText(String.valueOf(chPlech));
               preparedStatement = connection.prepareStatement("INSERT INTO sport(id, partBody) VALUES (?,?)");
               preparedStatement.setInt (1, 6);
               preparedStatement.setString(2,String.valueOf(chPlech));
               preparedStatement.executeUpdate();
           }

           }catch (Exception exx) {
               JOptionPane.showMessageDialog(null,"Некорректная запись");
           }
                } finally {
                    connection.close();
                }
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}
