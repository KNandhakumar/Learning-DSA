package com.me;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
//        trim() this is space trimming method;
//        CharAt index values 96 to 122 small letters and 122 to more is capital letters
//        charAt(0) this is index find;
//        System.out.println(in.next().trim().charAt(0));
          Scanner in = new Scanner(System.in);
          char ch = in.next().charAt(0);
//        h >= 'a' && h <= 'z'
          if (ch >= 'a' && ch <= 'z')
          {
              System.out.println("lowercase");
          }
          else {
              System.out.println("uppercase");
          }
    }
}
