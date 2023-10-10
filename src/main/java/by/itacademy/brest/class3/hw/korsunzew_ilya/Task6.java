package by.itacademy.brest.class3.hw.korsunzew_ilya;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите целое пожительно число: ");
        int n = Integer.parseInt(reader.readLine());
        //extra ; below
        ;
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Факториал " + n + " равен " + factorial);
    }
}
//score
//9