package com.oddeven.problem;

import java.util.Scanner;

public class OddEven {
	//int num;
	
	public static void checkOddEven(int num)
	{
		
	if(num % 2 == 0)
        System.out.println(num + " is even");
    else
        System.out.println(num + " is odd");
	}
	
	public static void main(String[] args) {
		int num;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        num = sc.nextInt();

        sc.close();
    
        checkOddEven(num);
	}
}
