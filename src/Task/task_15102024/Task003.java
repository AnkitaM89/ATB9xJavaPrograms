package Task.task_15102024;

public class Task003 {
    public static void main(String[] args) {
        int a = 20;
        System.out.println(--a + a++ + a--);
        //Line |   exp   |a
        //5    |NA       |20
        //6    |--a = 19 |19
        //6    |a++ = 19 |20
        //6    |a-- = 20 |19
        //6    19+19+20 = 58 and a=19
        System.out.println(a);
    }
}
