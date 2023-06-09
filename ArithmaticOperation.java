package Homework.day8practice;

import java.util.Scanner;

public class ArithmaticOperation {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        /*
        find max and min
         */
        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));

        int eq1= a+b*c;
        int eq2= c+a/b;
        int eq3= a%b+c;
        int eq4= a*b+c;

        System.out.println("max "+max);
        System.out.println("min "+min);

        System.out.println(eq1);
        System.out.println(eq2);
        System.out.println(eq3);
        System.out.println(eq4);





    }
}
