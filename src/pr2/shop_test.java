package pr2;
import java.lang.*;
import java.util.Scanner;
public class shop_test implements Shoptest
{
    public void enter()
    {
        System.out.println("Enter the name of the new computer");
    }
    public static void main(String[] args)
    {
        shop_test sh = new shop_test();
        Shop compshop = new Shop();
        sh.enter();
        String name;
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        compshop.addcomputer(name);
        compshop.findcomputer(name);
    }
}
