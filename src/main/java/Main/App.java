package Main;

import vista.MainFrame;

public class App {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new MainFrame().setVisible(true));
    }
}
