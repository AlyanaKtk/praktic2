package pr2;
import java.lang.*;
import java.util.Scanner;
public class Dog {
    public String name;
    public int age;
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int  human_age()
    {
        return this.age *= 7;
    }
    public void ToString()
    {
        System.out.println("Dog{ name = " + name + ", age = " + age + ", human age = " + human_age()+ "}");
    }
}
