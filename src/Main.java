
public class Main {
    public static void main(String[] args) {

        task1();
        task2();
    }
    public static void task1() {
        System.out.println("Зажача 1");
        byte byteVariable = 126;
        short shortVarialbe = 32_000;
        int intVariable = 1_000_000;
        long longVariable = 1_000_000_000;

        float floatVariable = 123.456f;
        double doubleVarialbe = 1234567.1234567f;

        System.out.println("Значение переменной byteVariable с типом byte равно " + byteVariable);
        System.out.println("Значение переменной shortVarialbe с типом short равно " + shortVarialbe);
        System.out.println("Значение переменной intVariable с типом int равно " + intVariable);
        System.out.println("Значение переменной longVariable с типом long равно " + longVariable);
        System.out.println("Значение переменной floatVariable с типом float равно " + floatVariable);
        System.out.println("Значение переменной doubleVarialbe с типом double равно " + doubleVarialbe);
    }
    public static void task2() {



    }
}
//Задача 1
//        Объявите переменные типа int, byte, short, long, float, double.
//
//        Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
//
//        Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».