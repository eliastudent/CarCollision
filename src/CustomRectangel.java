import java.awt.*;
import javax.swing.*;
//obstaclesRectangel = new Rectangle(this.x, this.y, this.width, this.heighet);

     //   if (CarRectangel.intersects(obstaclesRectangel)) {`
      //  S

public class CustomRectangel extends JFrame {
    private int x;
    private int y;
    private int width;
    private int heighet;
    private Color color;



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

 //   public boolean CheckCollision(CustomRectangel other) {
   //     boolean collision = false;
        //Rectangle CarRectangel = new Rectangle(this.x, this.y, this.width, this.heighet);
        //Rectangle obstaclesRectangel = new Rectangle(this.x, this.y, this.width, this.heighet);


           // collision = true;
      //  }
        //return collision;
    }
//}
