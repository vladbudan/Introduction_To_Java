package by.epam.training.Basic_of_sofware_code.cycle;

// Найти сумму квадратов первых ста чисел.
public class Cycle3 {

    public static void main(String[] args) {

        int x = 0;
        int sum = 0;

        // 1 Способ
        while(x < 100) {
            x++;
            sum += x * x;
        }
        System.out.println("Сумма = " + sum);


        // 2 Способ
        for(int i = 1; i <= 100; i++) {
            sum += i * i;
        }
        System.out.println("Сумма = " + sum);
    }
}
