package by.epam.training.Algorithmization.one_demension_array;

// Дан массив действительных чисел, размерность которого N. Подсчитать,
// сколько в нем отрицательных, положительных и нулевых элементов.
public class Task03 {

    public static void main(String[] args) {

        int[] arr = {4, -3, 18, 44, 0, -12, 15, -32, 11, 97};

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] > 0) {
                positiveCount++;
            }
            else if(arr[i] < 0) {
                negativeCount++;
            }
            else {
                zeroCount++;
            }

        }

        System.out.println("Положительных: " + positiveCount + ", отрицательных: " + negativeCount + ", нулевых: " + zeroCount);
    }

}
