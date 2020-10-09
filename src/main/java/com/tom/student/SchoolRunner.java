package com.tom.student;

import java.util.Scanner;

public class SchoolRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student stu = new Student("Andrei", 77, 99);
        stu.print();
        System.out.println("High score : " + stu.highest());
//        userinput(scanner);
    }

    private static void userinput(Scanner scanner) {
        System.out.println("Please enter your name");
        String name = scanner.next();

        System.out.println("Please enter english score");
        int english = scanner.nextInt();

        System.out.println("Please enter math score");
        int math = scanner.nextInt();
        Student stu = new Student(name, english, math);
        stu.print();
        System.out.println("High score : " + stu.highest());
    }
}
