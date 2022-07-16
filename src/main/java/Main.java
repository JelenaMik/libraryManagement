import library.MenuController;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MenuController menuController = new MenuController();
        JOptionPane.showMessageDialog(null, "Welcome to the library!");
        menuController.start();
    }

}
