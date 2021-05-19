package by.epam.training.Algorithmization.decomposition;

// Написать метод (методы) для нахождения наибольшего общего делителя
// и наименьшего общего кратного двух натуральных чисел: ( НОК(A, B) = A * B / НОД(A, B) )

public class Task01 {

    public static void main(String[] args) {

        int a = 50;
        int b = 30;
        System.out.println("НОД: " + maxCommonDivisor(a, b));
        System.out.println("НОК: " + (a * b / maxCommonDivisor(a, b)));

    }

    public static int maxCommonDivisor(int a, int b) {

        while (b != 0 && a != 0) {
            if (a > b) {
                a %= b;
            } else {
                b %= a;
            }
        }
        return a + b;
    }

}



