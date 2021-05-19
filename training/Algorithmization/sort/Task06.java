package by.epam.training.Algorithmization.sort;

// Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его
// по возрастанию. Делается это следующим образом: сравниваются два соседних
// элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
// элемент вперед. Если ai > a(i + 1), то производится перестановка
// и сдвигаются на один элемент назад. Составить алгоритм этой сортировки.

import java.util.Random;

public class Task06 {

    public static void main(String[] args) {

        int n = 10;

        double[] arr = getArr(n);

        System.out.println("Начальная последовательность: ");
        printArr(arr);

        int i = 1;
        while(i < arr.length) {
            if(arr[i - 1] <= arr[i]){
                i++;
                continue;
            } else {
                double temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                if(i > 1) i--;
            }
        }

        System.out.println("0тсортированная последовательность: ");
        printArr(arr);

    }

    public static double[] getArr(int n) {

        Random rand = new Random();
        double[] arr = new double[n];
        for(int i = 0; i < n; i++) {
            arr[i] = rand.nextDouble() * 21 - 10;
        }
        return arr;
    }

    public static void printArr(double[] arr) {
        for(double i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
