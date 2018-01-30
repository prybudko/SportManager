package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

/**
 * Created by Asus on 12.04.2017.
 */
public class Early extends JFrame {
    String [] mDzim = new String[6];
    JLabel dzimEarly = new JLabel();
    JLabel chDzimEarly = new JLabel();
    double chDzim;

    JLabel tiagaEarly = new JLabel();
    JLabel chTiagaEarly = new JLabel();
    double chTiaga;

    JLabel prusEarly = new JLabel();
    JLabel chPrusEarly = new JLabel();
    double chPrus;

    JLabel tricEarly = new JLabel();
    JLabel chTricEarly = new JLabel();
    double chTric;

    JLabel bicEarly = new JLabel();
    JLabel chBicEarly = new JLabel();
    double chBic;

    JLabel plechEarly = new JLabel();
    JLabel chPlechEarly = new JLabel();
    double chPlech;

    public Early (String s){
        super(s);
        setLayout(new GridLayout(6,6,5,10));

        dzimEarly = new JLabel("Жим лёжа");
        dzimEarly.setPreferredSize(new Dimension(70, 20));
        chDzimEarly = new JLabel("");
        chDzimEarly.setPreferredSize(new Dimension(70, 20));

        tiagaEarly = new JLabel("Становая тяга");
        tiagaEarly.setPreferredSize(new Dimension(70, 20));
        chTiagaEarly = new JLabel("");
        chTiagaEarly.setPreferredSize(new Dimension(70, 20));

        prusEarly = new JLabel("Присяд");
        prusEarly.setPreferredSize(new Dimension(70, 20));
        chPrusEarly = new JLabel("");
        chPrusEarly.setPreferredSize(new Dimension(70, 20));

        tricEarly = new JLabel("Жим узким хватом");
        tricEarly.setPreferredSize(new Dimension(70, 20));
        chTricEarly = new JLabel("");
        chTricEarly.setPreferredSize(new Dimension(70, 20));

        bicEarly = new JLabel("Подъем штанги штанги на бицепс");
        bicEarly.setPreferredSize(new Dimension(70, 20));
        chBicEarly = new JLabel("");
        chBicEarly.setPreferredSize(new Dimension(70, 20));

        plechEarly = new JLabel("Армейский жим");
        plechEarly.setPreferredSize(new Dimension(70, 20));
        chPlechEarly = new JLabel("");
        chPlechEarly.setPreferredSize(new Dimension(70, 20));

        add (dzimEarly);
        add (chDzimEarly);
        add (prusEarly);
        add (chPrusEarly);
        add (tiagaEarly);
        add (chTiagaEarly);
        add (tricEarly);
        add (chTricEarly);
        add (bicEarly);
        add (chBicEarly);
        add (plechEarly);
        add (chPlechEarly);
    }

    public void openFile (){
        String url = "jdbc:mysql://localhost:3306/sportdb";
        try {
            Connection connection = DriverManager.getConnection(url, "root", "root");
            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT *FROM sport");
                int i = 0;
                while (resultSet.next()) {
                    mDzim[i] = resultSet.getString("partBody");
                    i++;
                }
                resultSet.close();
                statement.close();
            } finally {
                connection.close();
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void out (){

            chDzim = Double.parseDouble(mDzim[0]);
            chDzimEarly.setText(String.valueOf(chDzim));
            chPrus = Double.parseDouble(mDzim[1]);
            chPrusEarly.setText(String.valueOf(chPrus));
            chTiaga= Double.parseDouble(mDzim[2]);
            chTiagaEarly.setText(String.valueOf(chTiaga));
            chTric = Double.parseDouble(mDzim[3]);
            chTricEarly.setText(String.valueOf(chTric));
            chBic = Double.parseDouble(mDzim[4]);
            chBicEarly.setText(String.valueOf(chBic));
            chPlech = Double.parseDouble(mDzim[5]);
            chPlechEarly.setText(String.valueOf(chPlech));
    }
}
