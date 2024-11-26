package CodingPractice;

import java.util.Scanner;

public class ex3_Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string you want to find palindrome or not");
        String str = sc.next();// Example: Malayalam
        boolean checkPalindrome = isPalindrome(str);
        System.out.println("Is Palindrome ="+checkPalindrome);
    }
   static boolean isPalindrome(String s)
    {
        s=s.toLowerCase();
        for (int i=0;i<s.length()/2;i++)
        {
            char start = s.charAt(i);
            char end = s.charAt(s.length()-1-i);
            if(start!=end)
                return false;
        }
        return true;
    }
}
