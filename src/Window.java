import javax.swing.*;

public class Window extends JFrame {

    public static void main(String[] args) {
        Window window = new Window();
    }

    public static final int WINDOW_WHIDTH = 700          ;
    public static final int WINDOW_HIGHET = 600;

    public Window() {
        GameScen gameScene = new GameScen(0, 0, WINDOW_WHIDTH, WINDOW_HIGHET);
        this.add(gameScene);
        this.setSize(WINDOW_WHIDTH, WINDOW_HIGHET);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setLayout(null);
        this.setResizable(false);

    }
}
