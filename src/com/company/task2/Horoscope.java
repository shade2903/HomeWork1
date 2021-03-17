package com.company.task2;

import java.util.Scanner;

public class Horoscope {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите знак зодиака");
        String sign = in.nextLine();
        String text = sign.toLowerCase();

        switch (text) {
            case "овен":
                System.out.println("Овен 21 марта -19 апреля");
                break;
            case "телец":
                System.out.println("Телец 20 апреля - 20 мая");
                break;
            case "близнецы":
                System.out.println("Близнецы 21 мая - 20 июня");
                break;
            case "рак":
                System.out.println("Рак 20 июня - 22 июля");
                break;
            case "лев":
                System.out.println("Лев 23 июля - 22 августа");
                break;
            case "дева":
                System.out.println("Дева 23 августа - 22 сентября");
                break;
            case "весы":
                System.out.println("Весы 23 сентября - 22 октября");
                break;
            case "скорпион":
                System.out.println("Скорпион 22 октября - 21 ноября");
                break;
            case "стрелец":
                System.out.println("Стрелец 22 ноября - 21 декабря");
                break;
            case "козерог":
                System.out.println("Козерог 22 декабря - 19 января");
                break;
            case "водолей":
                System.out.println("Водолей 20 января - 18 февраля");
                break;
            case "рыбы":
                System.out.println("Рыбы 19 февраля - 20 марта");
                break;
            default:
                System.out.println("Введенного знака зодиака не существует");

        }
    }
}
