package by.epam.training.Algorithmization.sort;

import java.util.Random;

// Сортировка вставками. Дана последовательность чисел а1, а2, ... аn. Требуется переставить числа
// в порядке возрастания. Делается это следующим образом. Пусть а1, а2, ..., аi - упорядоченная последовательность,
// т.е. а1 <= a2 <= ... <= an. Берется следующее ai + 1 и вставляется в последовательность так, чтобы новая последовательность
// была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i + 1 до n не будут перебраны. Примечание.
// Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
// Двоичный поиск оформить в виде отдельной функции.

public class Task05 {

    static int[] arr;

    public static void main(String[] args) {

        int n = 10;

        arr = new int[]{2, 4, 0, 8, -6, 17};

        System.out.println("Начальная последовательность: ");
        printArr(arr);

        for(int i = 1; i < arr.length; i++) {
            int next = arr[i];
            int index = binSearch(0, i - 1, next);
            for(int j = i; j > index; j--) {
                arr[j] = arr[j - 1];
            }
            arr[index] = next;
        }

        System.out.println("Отсортированная последовательность: ");
        printArr(arr);

    }

    public static int binSearch(int startIndex, int endIndex, int element) {

        if(endIndex == startIndex) {
            if(element < arr[startIndex]) {
                return startIndex;
            } else {
                return ++startIndex;
            }
        }

        int middle = (endIndex - startIndex) / 2 + startIndex;

        if(element < arr[middle]) {
            endIndex = middle--;
        } else {
            startIndex++;
        }

        return binSearch(startIndex, endIndex, element);

    }

    public static int[] getArr(int n) {

        Random rand = new Random();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
