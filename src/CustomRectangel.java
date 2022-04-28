import java.awt.*;
import javax.swing.*;

public class CustomRectangel {
    private int x;
    private int y;
    private int width;
    private int heighet;
    private Color color;

    public void Paint(Graphics Graphics) {
        Graphics.fillRect(this.x, this.y, this.width, this.heighet);
        Graphics.setColor(this.color);
    }

    public CustomRectangel(int x, int y, int width, int heighet, Color color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.heighet = heighet;
        this.color = color;
    }

    public void MoveRighetCar() {
        this.x = x + 5;

    }

    public void MoveLeftCar() {
        this.x = x - 5;
    }

    public void MoveUpCar() {
        this.y = y - 5;
    }

    public void MoveDownCar() {
        this.y = y + 5;
    }

    public void MoveRighetObstacles() {
        this.x++;

    }

    public void MoveLeftObstacles() {
        this.x--;
    }

    public void MoveUpObstacles() {
        this.y--;
    }

    public void MoveDownObstacles() {
        this.y++;
    }

    public boolean CheckCollision(CustomRectangel other) {
        boolean collision = false;
        Rectangle thisRectangel = new Rectangle(this.x, this.y, this.width, this.heighet);
        Rectangle otherRectangel = new Rectangle(other.x, other.y, other.width, other.heighet);
        if (thisRectangel.intersects(otherRectangel)) {
            collision = true;
        }
        return collision;
    }
}
