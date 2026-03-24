// Question 1:-  Write a program to check the given 
package com.piyush;
import java.util.Scanner;
public class CheckPrime {
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("True");
		}
		else {
			System.out.println("false");
		}
	}
}
