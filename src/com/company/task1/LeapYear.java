package com.company.task1;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите год: ");
        int year = in.nextInt();
        if (year % 400 == 0 || !(year % 100 == 0) && year % 4 == 0){
            System.out.println("Високосный год");
        }
        else{
            System.out.println("Обычный год");
        }
    }
}
