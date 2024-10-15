package Task.task_15102024;

public class Task001 {
    public static void main(String[] args) {
        //Finding the largest of three numbers using ternary operator
        int a=10,b=29,c=66;
        int maxNum = a>b?(a>c?a:c):(b>c?b:c);
        System.out.printf("The largest number is %d",maxNum);
    }
}
