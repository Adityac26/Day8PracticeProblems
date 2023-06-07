

import static java.lang.Integer.parseInt;

public class SpringSeason {
    public static void main(String[] args) {

        int m= parseInt(args[0]);
        int d= parseInt(args[1]);


        boolean flag = (m == 3 && d >= 20 && d <= 31)
                ||(m == 4 && d >= 1 && d <= 31)
                || (m == 5 && d >= 1 && d <= 31)
                || (m == 6 && d >= 1 && d <= 20);

        System.out.println(flag);


    }

}
