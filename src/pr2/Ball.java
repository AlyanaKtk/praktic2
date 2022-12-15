package pr2;

public class Ball {
    public double x = 0.0;
    public double y = 0.0;
    public Ball(double x, double y)
    {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x, double y)
    {
        this.x = x;
        this.y = y;
    }
    public void move(double xdisp, double ydisp)
    {
        this.x += xdisp;
        this.y += ydisp;
    }
    public String ToString()
    {
        return "Ball{ x = " + x + ", y = " + y + "}";
    }
}