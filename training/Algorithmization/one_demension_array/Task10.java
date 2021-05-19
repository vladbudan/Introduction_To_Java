package by.epam.training.Algorithmization.one_demension_array;

import java.util.Random;

// Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент
// (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
public class Task10 {

    public static void main(String[] args) {

        int n = 10;

        int[] arr = new int[n];

        Random rand = new Random();
        for(int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10);
        }

        System.out.println("Начальный массив: ");
        printArray(arr);

        int newLength = (arr.length - 1) / 2 + 1;
        for(int i = 1; i < newLength; i++) {
            arr[i] = arr[2 * i];
        }

        for(int i = newLength; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println("\nИзменённый массив: ");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

}
