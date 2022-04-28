import javax.swing.*;
import java.awt.*;

public class Car {

    private CustomRectangel Formola;

    public Car() {
        this.Formola = new CustomRectangel(150, 350, 40, 40, Color.red);
    }

    public void MoveDown() {
        this.Formola.MoveDownCar();
    }

    public void MoveUp() {
        this.Formola.MoveUpCar();
    }

    public void MoveLeft() {
        this.Formola.MoveLeftCar();

    }

    public void MoveRighet() {
        this.Formola.MoveRighetCar();
    }

    public void BreakApart() {
        this.Formola.MoveDownObstacles();
    }

    public void Paint(Graphics Graphics) {
        this.Formola.Paint(Graphics);

    }

    public CustomRectangel getFront() {
        return this.Formola;
    }

}
