package pr2;
import java.lang.*;
public class Circle_cl {
    public double radius;
    public double diametr;
    public void setRadius(double radius) {
        this.radius = radius;
        this.diametr = radius*2;

    }

    public void setDiametr(double diametr) {
        this.diametr = diametr;
        this.radius = diametr/2;
    }

    public double getRadius() {
        return radius;
    }

    public double getDiametr() {
        return diametr;
    }
    public double Square()
    {
        return Math.PI*radius;
    }
    public double Length()
    {
        return Math.PI*diametr;
    }
    public void compare(double r1, double r2)
    {
        if (r1 > r2)
        {
            System.out.println("Радиус первой окружности больше.");
        }
        else
            System.out.println("Радиус второй окружности больше");
        if (r1*2 > r2*2)
        {
            System.out.println("Диаметр первой окружности больше.");
        }
        else
            System.out.println("Диаметр второй окружности больше");
    }
}
