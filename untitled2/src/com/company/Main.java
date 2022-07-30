package com.company;

import java.util.Scanner;

import static java.lang.System.in;

public class Main {

    public static void main(String[] args) {
        // write your code here
            Scanner ss = new Scanner(in);
            System.out.println("a: ");
            int a = ss.nextInt();
            System.out.println("b: ");
            int b = ss.nextInt();
            int count = 0;
            for (int i = a; i <= b; i++) {
                    count += i;
            }
            System.out.println();
            System.out.println("jami"+count );
    }

}