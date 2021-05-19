package by.epam.training.Basic_of_sofware_code.cycle;

import java.util.Scanner;

// Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
// m и n вводятся с клавиатуры.
public class Cycle7 {

    public static void main(String[] args) {

        int m;
        int n;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число : ");
        m = scanner.nextInt();
        System.out.println("Введите число: ");
        n = scanner.nextInt();

        if(m < n) {
            for(int i = 2; i < m; i++) {
                if(m % i == 0) {
                    System.out.println(i + " - делитель числа m");
                }
            }
            for(int j = 2; j < n; j++) {
                if(n % j == 0) {
                    System.out.println(j + " - делитель числа n");
                }
            }
        }
        else {
            System.out.println("Неверный ввод");
        }

    }
}
