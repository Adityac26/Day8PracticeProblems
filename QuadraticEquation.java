package Homework.day8practice;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int det = b * b - 4 * a * c;

        if (det > 0) {
            double firstroot = -b + Math.sqrt(det) / (2 * a);
            double secondroot = -b - Math.sqrt(det) / (2 * a);
            System.out.println("firstroot " + firstroot);
            System.out.println("secondroot " + secondroot);
        } else if (det == 0) {
            double firstroot = -b / (2 * a);
            System.out.println("firstroot " + firstroot);

        } else {
            System.out.println("roots are not real");
        }
    }
}
