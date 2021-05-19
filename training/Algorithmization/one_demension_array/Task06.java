package by.epam.training.Algorithmization.one_demension_array;

// Задана последовательность N вещественных чисел. Вычислить сумму чисел,
// порядковые номера которых являются простыми числами.
public class Task06 {

    public static void main(String[] args) {

        int[] arr = {12, 15, 17, 23, 4, 13, 19, 2, 18, 27};

        int sum = 0;

        for(int i = 2; i < arr.length; i++) {
            boolean simple = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    simple = false;
                    break;
                }
            }
            if(simple) {
                sum += arr[i];
            }
        }

        System.out.println("Сумма простых чисел порядковых номеров = " + sum);
    }

}
