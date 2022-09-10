package com.company;
public class PascalTriangle {
    public static void pasclaTriangle(int num) {
        for (int i = 0; i < num; i++) {
            int number = 1;
            System.out.print(number);
            for (int j = 0; j < i; j++) {
                number = number * (i - j) / (j + 1);
                System.out.print(" " + number);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        pasclaTriangle(8);
    }
}
