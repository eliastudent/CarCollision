import java.awt.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

import javax.swing.*;

public class GameScen extends JPanel {
    private Car pleyer;
    private CustomRectangel[] obstacles;
protected int Score;
    public GameScen(int x, int y, int WHIDTH, int HIGHET) {
        this.setBounds(x, y, WHIDTH, HIGHET);
        this.pleyer = new Car();
        this.mainGameLoop();
        Random random = new Random();
        int lower = -20000;
        int maxer = 0;
        this.obstacles = new CustomRectangel[300];
        for (int i = 0; i < this.obstacles.length; i++) {
            CustomRectangel obstacle = null;
            do {
                obstacle = new CustomRectangel(random.nextInt(WHIDTH), random.nextInt(maxer - lower) + lower, 20, 20,
                        Color.GREEN);
            } while (obstacle.CheckCollision(this.pleyer.getFront()));
            this.obstacles[i] = obstacle;
        }
    }

    public void Paint(Graphics Graphics) {
        Graphics.fillRect(this.x, this.y, this.width, this.heighet);
        Graphics.setColor(this.color);
        Rectangle CarRectangel = new Rectangle(this.x, this.y, this.width, this.heighet);
        Rectangle core=4;
    }

}
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Score
        g.setColor(Color.red);
        g.setFont(new Font("nnnn",Font.BOLD,20));
        g.drawString("SCORE:"+Score,550,30);
        //game over

        this.pleyer.Paint(g);
        for (int i = 0; i < this.obstacles.length; i++) {
            this.obstacles[i].Paint(g);
        }
    }

    public void MoveDownObstacles() {
        for (int i = 0; i < obstacles.length; i++) {
            obstacles[i].MoveDownObstacles();
        }
    }

    public void mainGameLoop() {

        new Thread(() -> {
            PleyerMovment PleyerMovment = new PleyerMovment(this.pleyer);
            this.setFocusable(true);
            this.requestFocus();
            this.addKeyListener(PleyerMovment);
            while (true) {
                try {
                    MoveDownObstacles();
                    repaint();
                    Score++;
                    Thread.sleep(15);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
    }

}
