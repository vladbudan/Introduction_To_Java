package by.epam.training.Algorithmization.one_demension_array;

// В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
public class Task01 {

    public static void main(String[] args) {

        int k = 3;

        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sum = 0;

        for(int i : a) {
            if(i % k == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма: " + sum);
    }

}
