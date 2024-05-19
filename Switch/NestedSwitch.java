package com.me;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empId = in.nextInt();
        String department = in.next();

        switch (empId) {
            case 1:
                System.out.println("vishal");
                break;
            case 2:
                System.out.println("gullu");
                break;
            case 3:
                System.out.println("vishnu");
                switch (department) {
                    case "welder" -> System.out.println("welder department");
                    case "machine" -> System.out.println("machine department");
                    case "vip" -> System.out.println("velai illa pattadhaari");
                    default -> System.out.println("No department entered");
                }
                break;
            default:
                System.out.println("Enter correct empId");
                break;
        }
    }
}
