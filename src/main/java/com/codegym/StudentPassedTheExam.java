package com.codegym;

import java.util.Scanner;

public class StudentPassedTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("how many studens? ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("amount of students should not exceed 30");
            }
        }
        while (size > 30);
        int[] list = new int[size];
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            System.out.println("enter the mark of student " + (i + 1));
            list[i] = scanner.nextInt();
            while (list[i] < 0 || list[i] > 10) {
                System.out.println("wrong mark!");
                System.out.println("enter the mark of student " + (i + 1));
                list[i] = scanner.nextInt();
            }
        }
        for (int temporature : list) {
            System.out.print(temporature + "\t");
            if (temporature >= 5 && temporature <= 10) {
                count++;
            }
        }
        System.out.println();
        System.out.print(count + " students passed the exam.");
    }


}
