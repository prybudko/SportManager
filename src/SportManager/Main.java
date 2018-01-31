package SportManager;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);
        TestFrame testFrame = new TestFrame();
        testFrame.createGUI();

    }
}
