package by.epam.training.Algorithmization.one_demension_array;

// Даны действительные числа а1, а2, ... аn. Поменть местами наибольший и наименьший элементы.
public class Task04 {

    public static void main(String[] args) {

        int[] arr = {2, 7, -5, 10, 16, 0, 9, -1, 21};

        int maxIndex = 0;
        int minIndex = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
            if(arr[i] < arr[minIndex]) {
                minIndex = i;
            }

        }

        int temp;
        temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
