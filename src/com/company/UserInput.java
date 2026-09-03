package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        System.out.println("This program is specificaly how we are taking data from the user:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 +num2;
        System.out.println("The sum is : ");
        System.out.println(sum);

    }
}
