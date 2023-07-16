
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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

    public static void task6() {
        System.out.println("\nЗадача 6");

        byte countBanana = 5;
        byte weightBanana = 80;
        byte countMilk = 2;
        byte weightMilk = 105;
        byte countIceCream = 2;
        byte weightIceCream = 100;
        byte countEggs = 4;
        byte weightEggs = 70;
        int allWeight_g = countBanana * weightBanana + countEggs * weightEggs + countIceCream * weightIceCream + countMilk * weightMilk;
        float allWeight_Kg = allWeight_g / 1000f;

        System.out.println("В коктеле спортсмена " + allWeight_g + " грамм или " + allWeight_Kg + " килограмм");
        System.out.println("\nРешение задачи ниже: \n allWeight_g = countBanana * weightBanana + countEggs * weightEggs + countIceCream * weightIceCream + countMilk * weightMilk;");
        System.out.println(" allWeight_Kg = allWeight_g / 1000f;");
    }

    public static void task7() {
        System.out.println("\nЗадача 7");

        short loseWeight = 7000;
        short minWeight = 250;
        short maxWeight = 500;
        int daysMin = loseWeight / maxWeight;
        int daysMax = loseWeight / minWeight;
        int daysMiddle = (daysMax + daysMin) / 2;

        System.out.println("Сбрасывая каждый день по " + minWeight + " можно сбросить 7 кг за " + daysMax + " дней.");
        System.out.println("Сбрасывая каждый день по " + maxWeight + " можно сбросить 7 кг за " + daysMin+ " дней.");
        System.out.println("В среднем сбросить 7 кг можно за " + daysMiddle + " дней.");

        System.out.println("\nРешение задачи ниже: \n daysMin = loseWeight / maxWeight;");
        System.out.println(" daysMax = loseWeight / minWeight; \n daysMiddle = (daysMax + daysMin) / 2.");
    }

    public static void task8() {
        System.out.println("\nЗадача 8");

        int moneyMisha = 67_760;
        int moneyDenis = 83_690;
        int moneyKristina = 76_230;
        float percentage = 1.1f;
        float yearDifMisha = moneyMisha * percentage * 12 - moneyMisha * 12;
        float yearDifDenis = moneyDenis * percentage * 12 - moneyDenis * 12;
        float yearDifKristina = moneyKristina * percentage * 12 - moneyKristina * 12;

        System.out.println("Денис теперь получает " + moneyDenis * percentage + " рублей. Годовой доход вырос на " + yearDifDenis + " рублей");
        System.out.println("Миша теперь получает " + moneyMisha * percentage + " рублей. Годовой доход вырос на " + yearDifMisha + " рублей");
        System.out.println("Кристина теперь получает " + moneyKristina * percentage + " рублей. Годовой доход вырос на " + yearDifKristina + " рублей");
    }




}
//Задача 8
//Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
// В компании есть правило: чем дольше сотрудник работает в компании,
// тем ценнее он для бизнеса. Поэтому сотрудники, которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год.
// Каждый год повышение составляет 10% от текущей зарплаты.
//
//К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:
//
//Маша получает 67 760 рублей в месяц.
//Денис получает 83 690 рублей в месяц.
//Кристина получает 76 230 рублей в месяц.
//Каждому нужно увеличить зарплату на 10% от текущей месячной.
// Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.
//
//Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.
//
//Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
//
//
//
//Критерии оценки
//Корректно использовали типы переменных.
//Операцию умножения выполнили верно.
//Операцию сложения выполнили верно.
//Все условия задания выполнили.