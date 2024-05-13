package ex25042024;

import java.util.Scanner;

public class Lab005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value for the X");
        double x = sc.nextDouble();
        System.out.println("enter the value for y");
        double y = sc.nextDouble();
        System.out.println("enter the value for z");
        double z = sc.nextDouble();

        double results;

        results = Math.cbrt((Math.pow(x,2)+Math.pow(y,2)-Math.abs(z)));
        System.out.println(results);

        sc.close();

    }
}
