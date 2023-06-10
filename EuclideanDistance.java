package Day8;

import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter x1 point");
        int x1 = sc.nextInt();

        System.out.println("enter x2 point");
        int x2 = sc.nextInt();

        System.out.println("enter y1 point");
        int y1 = sc.nextInt();

        System.out.println("enter y2 point");
        int y2 = sc.nextInt();

        double dis= Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("distance beetween ("+x1+","+y1+") , ("+x2+","+y2+") : "+dis);
    }
}
