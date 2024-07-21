
public class Main {
    public static void main(String[] args) {
    //Task-1
        System.out.println("Task-1");

        int clientOS = 1;
            if (clientOS == 1) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
    //Task-2
        System.out.println("Task-2");
            int clientOS1 = 1;
            int clientDeviceYear = 2015;
            if (clientOS1 == 1 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else if (clientOS1 == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOS1 == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            } else if (clientOS1 == 0 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            }
    //Task-3
        System.out.println("Task-3");
            int year = 2025;
        if (year < 1584) {
            System.out.println(year + " год не является високосным.");
        } else if ((year % 4 == 0 && year % 100 > 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }
    //Task-4
        System.out.println("Task-4");
        int deliveryDistance = 60;
        int deliveryDays;

        if (deliveryDistance <= 0) {
            System.out.println("Ошибка: расстояние должно быть положительным числом.");
            return;
        } else if (deliveryDistance > 100) {
            System.out.println("Доставка невозможна: расстояние превышает 100 км.");
            return;
        }

        if (deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance <= 60) {
            deliveryDays = 2;
        } else {
            deliveryDays = 3;
        }

        System.out.println("Потребуется дней: " + deliveryDays);
    //Task-5
        System.out.println("Task-5");
                int monthNumber = 9;

        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Ошибка: номер месяца должен быть в диапазоне от 1 до 12.");
            return;
        }

        String season;

        switch (monthNumber) {
            case 1: // Январь
            case 2: // Февраль
            case 12: // Декабрь
                season = "Зима";
                break;
            case 3: // Март
            case 4: // Апрель
            case 5: // Май
                season = "Весна";
                break;
            case 6: // Июнь
            case 7: // Июль
            case 8: // Август
                season = "Лето";
                break;
            case 9: // Сентябрь
            case 10: // Октябрь
            case 11: // Ноябрь
                season = "Осень";
                break;
            default:
                season = "Неизвестный сезон";
                break;
        }

        System.out.println("Месяц номер " + monthNumber + " принадлежит к сезону: " + season);
    }
}