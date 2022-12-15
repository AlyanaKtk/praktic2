package pr2;
import java.lang.*;
import java.util.Scanner;
public class circlecltest {

    public static void main(String[] args)
    {
        double r = 5.2;
        Circle_cl c = new Circle_cl();
        c.setDiametr(r);
        System.out.println(c.getRadius());
        r = 8.2;
        c.setRadius(r);
        System.out.println(c.getDiametr());
        double r2 = 9.2;
        c.compare(r, r2);
    }


}
