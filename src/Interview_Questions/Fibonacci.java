package Interview_Questions;

import java.util.Scanner;

public class Fibonacci {

    // 0 1 1 2 3 5 8
    // 0 1 2 3 4 5 6


    public static int fib(int n){

        if (n <= 1){
            return n;
        }
            return (fib(n -2) + fib(n-1));




    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number:");
        //int n = input.nextInt();
        System.out.println(fib(7));
    }
}
