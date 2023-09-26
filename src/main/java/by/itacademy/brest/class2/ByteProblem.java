package by.itacademy.brest.class2;

public class ByteProblem {
    public static void main(String[] args) {
        for (byte i = 1; i <= 128; i++) {
            if (i == 127) {
                System.out.println("circle");
            }
            System.out.println(i);
        }
//        byte a = (byte) 129;
//        System.out.println("circle: " + a);
//        int originalNumber = 10; // Начальное число
//        int numberOfShifts = 4;  // Количество сдвигов влево
//
//// Выполняем сдвиг влево
//        int shiftedNumber = originalNumber << numberOfShifts;
//
//// Теперь выполняем обратное смещение вправо
//        int previousNumber = shiftedNumber >> numberOfShifts;
//
//        System.out.println("Исходное число: " + originalNumber);
//        System.out.println("Число после сдвига влево: " + shiftedNumber);
//        System.out.println("Предыдущее число: " + previousNumber);

    }

    public static void myMethod(int a, boolean b, String c){
        if (b){
            System.out.println(a);
        } else {
            System.out.println(c);
        }
    }
}
