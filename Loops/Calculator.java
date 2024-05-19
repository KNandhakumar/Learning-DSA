package com.me;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Take input form user till user does not press X or x
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true)
        {
            // tale the operator as input
            System.out.print("Enter the operator :");
            char op = in.next().trim().charAt(0);
            System.out.println();
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%')
            {
                // input two numbers
                System.out.print("Enter any two numbers :");
                int n1 = in.nextInt();
                int n2 = in.nextInt();
                System.out.println();
                // + operator
                if (op == '+'){
                    ans = n1+n2;
                }
                // - operator
                if (op == '-'){
                    ans = n1-n2;
                }

                // * operator
                if (op == '*'){
                    ans = n1*n2;
                }

                // / operator
                if (op == '/'){
                    if (n2 != 0){
                        ans = n1/n2;
                    }
                }

                // % operator
                if (op == '%'){
                    ans = n1%n2;
                }
            } else if (op == 'X' || op == 'x') {
                break;
            }
            else {
                System.out.println("invalid");
            }
            System.out.println(ans);
        }
    }
}
