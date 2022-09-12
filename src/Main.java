public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Домашнее задание

        // задание 1

        System.out.println("задание 1.");
        int clientOS = 1;
        int clientDeviceYear = 2014;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // задание 2

        System.out.println("задание 1.");
        if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке - https://vgif.ru/gifs/145/vgif-ru-19259.gif ");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // задание 3

        System.out.println("задание 3.");
        int year = 2020;
        if ((year % 4 == 0)) {
            System.out.println(year + " год является високосным.");
        } else if ((year % 4 == 0) && (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

        // задание 4

        System.out.println("задание 4.");
        int deliveryDistance = 97;
        int oneDeys = 1;
        int twoDeys = 2;
        int threeDeys = 3;
        int fourDays = 4;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней " + oneDeys);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней " + twoDeys);
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней " + threeDeys);
        } else {
            System.out.println("Потребуется дней " + fourDays + " или больше");
        }

        // задание 5

        System.out.println("задание 5.");
        int monthNumber = 11;

        switch (monthNumber) {
            case 1:
            case 2:
                System.out.println("Зима.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            case 12:
                System.out.println("Зима");
                break;
            default:
        }
    }
}
