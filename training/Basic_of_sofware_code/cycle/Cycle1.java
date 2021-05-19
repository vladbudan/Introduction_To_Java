package by.epam.training.Basic_of_sofware_code.cycle;

// Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.
public class Cycle1 {

    public static void main(String[] args) {

        int i = 1;
        int number = 10;
        int sum = 0;

        while(number >= i) {
            sum += i;
            i++;
        }
        System.out.println("Сумма чисел: " + sum);
    }
}
