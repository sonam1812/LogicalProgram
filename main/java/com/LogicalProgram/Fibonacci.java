package com.LogicalProgram;
import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		System.out.println("Enter the length of series : ");
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        
        int firstNum = 0, secondNum = 1;
        int upcomingNum;
        System.out.print(firstNum + " " + secondNum);

        for (int i = 2; i < length; i++) {
            upcomingNum = firstNum + secondNum;
            System.out.print(" " + upcomingNum);
            firstNum = secondNum;
            secondNum = upcomingNum;
        }
    }
}

	


