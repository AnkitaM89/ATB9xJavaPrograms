package Task.task_09102024;

import java.sql.SQLOutput;

public class Task002 {
    public static double PI=3.14;
    //public static final double PI = 3.14; /* Final Keyword is used to create constant in JAVA*/
    public static void main(String[] args) {
        System.out.println("Value of PI is:"+PI);
        System.out.println("Trying to assign new value to PI:"+3.15);
        PI=3.15;
        System.out.println("Value of PI is:"+PI);
    }
}
