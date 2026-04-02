package com.piyush;
import java.util.Scanner;

public class ArrayPalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Palindrome elements are:");

        for (int i = 0; i < size; i++) {

            int n = arr[i];
            int temp = n;
            int rev = 0;

            while (n > 0) {
                int d = n % 10;
                rev = rev * 10 + d;
                n = n / 10;
            }

            if (temp == rev) {
                System.out.println(temp);
            }
        }
    }
}