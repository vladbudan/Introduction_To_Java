package by.epam.training.Algorithmization.one_demension_array;

// Дана последовательность целых чисел а1, а2, ..., аn. Образовать новую последовательность,
// выбросив из исходной те члены, которые равны min(a1, a2, ..., an).
public class Task08 {

    public static void main(String[] args) {

        int[] arr = {2, 1, 0, 10, 14, 0, 24, 16, 7, 12};

        int arrMin = arr[0];

        for(int an : arr) {
            if(arrMin > an) {
                arrMin = an;
            }
        }

        int countMin = 0;

        for(int an : arr) {
            if(an == arrMin) {
                countMin++;
            }
        }

        int[] arrNew = new int[arr.length - countMin];

        int j = 0;

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > arrMin) {
                arrNew[j] = arr[i];
                j++;
            }
        }

        printArray(arrNew);
    }

    public static void printArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
