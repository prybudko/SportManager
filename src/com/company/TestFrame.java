package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import javax.swing.*;

public class TestFrame extends JFrame {

     private Early early;
     private Legs legs;
     private Window window;
     private Сhest chest;
     private Shoulders shoulders;
     private Back back;
     private Arms arms;
     private ArrayList<JFrame> earlyList = new ArrayList<JFrame>();
     private ArrayList<JFrame> legsList = new ArrayList<JFrame>();
     private ArrayList<JFrame> windowList = new ArrayList<JFrame>();
     private ArrayList<JFrame> chestList = new ArrayList<JFrame>();
     private ArrayList<JFrame> shouldersList = new ArrayList<JFrame>();
     private ArrayList<JFrame> backList = new ArrayList<JFrame>();
     private ArrayList<JFrame> armsList = new ArrayList<JFrame>();

    public  void createGUI() {

        JFrame frame = new JFrame("Test frame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JMenuBar menuBar = new JMenuBar();
       ////////картинка
        JPanel panel = new JPanel();
        JLabel labelFon = new JLabel();
        ImageIcon icon1 = createIcon("fon.png");
        labelFon.setIcon(icon1);
        panel.add(labelFon);
        /////
        JMenu fileMenu = new JMenu("Меню");
        JMenu newMenu = new JMenu("Теория");
        fileMenu.add(newMenu);

        JMenuItem txtFileItem = new JMenuItem("Плечи");
        newMenu.add(txtFileItem);

        JMenuItem imgFileItem = new JMenuItem("Грудь");
        newMenu.add(imgFileItem);

        JMenuItem folderItem = new JMenuItem("Руки");
        newMenu.add(folderItem);

        JMenuItem backItem = new JMenuItem("Спина");
        newMenu.add(backItem);

        JMenuItem armItem = new JMenuItem("Ноги");
        newMenu.add(armItem);

        JMenuItem openItem = new JMenu("Мои показатели");
        fileMenu.add(openItem);

        JMenuItem earlyItem = new JMenuItem("Ранее");
        openItem.add(earlyItem);

        JMenuItem nowItem = new JMenuItem("Теперь");
        openItem.add(nowItem);

        JMenuItem closeAllItem = new JMenuItem("Close all");
        fileMenu.add(closeAllItem);

        fileMenu.addSeparator();
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(exitItem);

        exitItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        nowItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                window = new Window("Program");
                window.setVisible(true);
                window.getDefaultCloseOperation();
                window.setSize(500, 300);
                window.setResizable(false);
                window.setLocationRelativeTo(null);
                windowList.add(window);
            }
        });
        imgFileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                chest = new Сhest();
                chest.startProgram();
                chest.setLocationRelativeTo(null);
                chest.getDefaultCloseOperation();
                chestList.add(chest);
            }
        });
        txtFileItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                shoulders = new Shoulders();
                shoulders.setLocationRelativeTo(null);
                shoulders.getDefaultCloseOperation();
                shouldersList.add(shoulders);
            }
        });
        backItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                back = new Back();
                back.setLocationRelativeTo(null);
                back.getDefaultCloseOperation();
                backList.add(back);
            }
        });
        folderItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                arms = new Arms();
                arms.setLocationRelativeTo(null);
                arms.getDefaultCloseOperation();
                armsList.add(arms);
            }
        });
        armItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                legs = new Legs();
                legs.setLocationRelativeTo(null);
                legs.getDefaultCloseOperation();
                legsList.add(legs);
            }
        });
        earlyItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                early = new Early("Ранее");
                early.setVisible(true);
                early.getDefaultCloseOperation();
                early.setSize(500, 300);
                early.setResizable(false);
                early.setLocationRelativeTo(null);
                early.openFile();
                early.out();
                earlyList.add(early);
            }
        });
        closeAllItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                    closeM(earlyList);
                    closeM(legsList);
                    closeM(windowList);
                    closeM(chestList);
                    closeM(shouldersList);
                    closeM(backList);
                    closeM(armsList);

            }
        });

        menuBar.add(fileMenu);
        frame.setJMenuBar(menuBar);
        frame.setPreferredSize(new Dimension(500, 500));
        frame.pack();
        ///картинка
        frame.getContentPane().add(panel);
        ////
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }
    protected static ImageIcon createIcon(String path) {
        URL imgURL = TestFrame.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("File not found " + path);
            return null;
        }
    }

    private void closeM (ArrayList<JFrame> arrayList){

        while (!arrayList.isEmpty()){
            arrayList.get(0).dispose();
            arrayList.remove(0);
        }
}
}


