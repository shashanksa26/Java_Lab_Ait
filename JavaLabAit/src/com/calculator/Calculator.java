package com.calculator;
import java.util.*;
public class Calculator
{
    public static void main(String args[])
    {
        System.out.println("For Addition press 1\nFor Substraction 2\nFor Multiplication 3\nFor Division 4\nFor modulus 5");
        Scanner sc =new Scanner(System.in);
        int choice =sc.nextInt();
        System.out.println("enter 1st no.");
        double num1 =sc.nextDouble();
        System.out.println("enter 2nd no.");
        double num2 =sc.nextDouble();
        double res=0;
        switch(choice)
        {
            case 1: res=num1 + num2;
            break;
            case 2: res=num1-num2;
            break;
            case 3:res=num1*num2;
            break;
            case 4: res=num1/num2;
            break;
            case 5: res=num1%num2;
            break;
            default : System.out.println("invalid operator.");
        }
        System.out.print("The result is: "+res);        
        sc.close();

    }
    
}
