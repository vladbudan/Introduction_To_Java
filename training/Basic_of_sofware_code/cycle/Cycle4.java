package by.epam.training.Basic_of_sofware_code.cycle;

// Составить программу нахождения произведения квадратов первых двухсот чисел.
public class Cycle4 {

    public static void main(String[] args) {

        // 1 Способ
        double count = 0;
        double composition = 1;
        double number = 2;

        while(count <= 200) {
            composition *= number * number;
            number += 0.01;
            count++;
        }
        System.out.println("Произведение квадратов чисел равно " + composition);


        // 2 Способ
        double composition1 = 1;
        double number1 = 2;

        for(double i = 0; i <= 200; i++) {
            composition1 *= number1 * number1;
            number1 += 0.01;
        }
        System.out.println("Произведение квадратов чисел равно " + composition1);
    }
}
