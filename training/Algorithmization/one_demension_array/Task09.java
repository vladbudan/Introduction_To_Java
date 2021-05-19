package by.epam.training.Algorithmization.one_demension_array;

// В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
// Если таких чисел несколько, то определить наименьшее из них.
public class Task09 {

    public static void main(String[] args) {

        int[] arr = {8, 9, 2, 17, 8, 9, 16, 8, 29, 41, 9, 2, 9};

        int value = 0;
        int count = 1;

        for(int i = 0; i < arr.length - 1; i++) {

            int countNew = 1;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    countNew++;
                }
            }
            if(countNew > count) {
                count = countNew;
                value = arr[i];
            }
        }

        System.out.println("value: " + value + ", count: " + count);
    }

}




