
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");
        byte byteVariable = 126;
        short shortVariable = 32_000;
        int intVariable = 1_000_000;
        long longVariable = 1_000_000_000;

        float floatVariable = 123.456f;
        double doubleVariable = 1234567.1234567f;

        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVariable с типом short равно " + shortVariable);
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVariable с типом double равно " + doubleVariable);
    }

    public static void task2() {
        System.out.println("\nЗадача 2");

        float first = 27.12f;
        long second = 987_678_965_549L;
        double third = 2.786;
        short fourth = 569;
        short fifth = -159;
        short sixth = 27897;
        byte seventh = 67;

        System.out.println(first + "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth + "\n" + sixth + "\n" + seventh);
    }

    public static void task3() {
        System.out.println("\nЗадача 3");

        byte ludmila = 23;
        byte anna = 27;
        byte ecaterina = 30;
        short allPaper = 480;

        int countPaper = allPaper / (ludmila + anna + ecaterina);

        System.out.println("На каждого ученика рассчитано " + countPaper + " листов бумаги.");
        System.out.println("Решение задачи ниже: \nallPaper / (ludmila + anna + ecaterina)");
    }

    public static void task4() {
        System.out.println("\nЗадача 4");

        byte bottleForOneMinute = 16 / 2;
        int twentyMinute = 20 * bottleForOneMinute;
        int oneDay = 3 * twentyMinute * 24;
        int threeDay = oneDay * 3;
        int month = threeDay * 10;

        System.out.println("За 20 минут машина произвела " + twentyMinute + " штук бутылок");
        System.out.println("За сутки машина произвела " + oneDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + threeDay + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");

        System.out.println("\nРешение задачи ниже: \n bottleForOneMinute = 16 / 2; \n twentyMinute = 20 * bottleForOneMinute;");
        System.out.println(" oneDay = 3 * twentyMinute * 24; \n threeDay = oneDay * 3; \n month = threeDay * 10.");
    }

    public static void task5() {
        System.out.println("\nЗадача 5");

        byte allJar = 120;
        byte white = 2;
        byte brown = 4;
        int classRoom = allJar / (white + brown);
        int whiteJar = classRoom * white;
        int brownJar = allJar - whiteJar;

        System.out.println("В школе, где " + classRoom + " классов, нужно " + whiteJar + " банок белой краски и " + brownJar + " банок коричневой краски");
        System.out.println("\nРешение задачи ниже: \n classRoom = allJar / (white + brown); \n whiteJar = classRoom * white;");
        System.out.println(" brownJar = allJar - whiteJar.");
    }
}
//Задача 5
//        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой.
//        На один класс уходит 2 банки белой и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
//        Выведите результат задачи в консоль в формате:
//        «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
//        Для объявления переменных не используйте тип var.
//
//
//
//        Критерии оценки
//        Корректно использовали типы переменных.
//        В решении не использовали тип переменной var.
//        Переменные назвали согласно правилам Java.
//        Соблюдаются правила пунктуации.
//        Решение задания вывели в консоль.