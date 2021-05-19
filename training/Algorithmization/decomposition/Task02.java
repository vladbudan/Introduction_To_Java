package by.epam.training.Algorithmization.decomposition;

// Написать метод (методы) для нахождения наибольшего общего делителя четырёх натуральных чисел.

public class Task02 {

    public static void main(String[] args) {

        int a = 128;
        int b = 16;
        int c = 32;
        int d = 28;

        int ab = maxCommonDivisor(a, b);
        int bc = maxCommonDivisor(ab, c);
        int result = maxCommonDivisor(bc, d);

        System.out.println("НОД четырех натуральных чисел = " + result);
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


