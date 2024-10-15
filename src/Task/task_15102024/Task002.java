package Task.task_15102024;

public class Task002 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        //Line |   exp   |a
        //5    |NA       |10
        //6    |++a = 11 |11
        //6    |a++ = 11 |12
        //6    |a++ = 12 |13
        //6    11+11+12 = 34 and a=13
        System.out.println(a);
    }
}
