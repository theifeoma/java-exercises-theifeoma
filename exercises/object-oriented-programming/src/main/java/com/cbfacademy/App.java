package main.java.com.cbfacademy;

import main.java.com.cbfacademy.accounts.Account;
import main.java.com.cbfacademy.shapes.*;

public class App {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        Cylinder cylinder1 = new Cylinder(2.0, 3.0);
        Sphere sphere = new Sphere(34.0);
        Rectangle rect = new Rectangle(5.0, 5.0);

        Paint paint = new Paint();

        paint.amount(rect);

    }
}
