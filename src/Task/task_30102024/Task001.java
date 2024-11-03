package Task.task_30102024;

import java.util.Scanner;

public class Task001 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows and columns:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i= 0;i <num;i++)
        {
            for(int j=num;j>i;j--)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
