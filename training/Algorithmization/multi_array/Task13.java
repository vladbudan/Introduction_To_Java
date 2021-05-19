package by.epam.training.Algorithmization.multi_array;

import java.util.Random;

// Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов.
public class Task13 {

    public static void main(String[] args) {

        int m = 5;
        int n = 10;

        int[][] arr = createArr(m, n);

        System.out.println("Начальная матрица: ");
        printArr(arr);

        for(int i = 0; i < n; i++) {
            boolean sort = true;
            while(sort) {
                sort = false;
                for(int j = 1; j < m; j++) {
                    if(arr[j][i] < arr[j - 1][i]) {
                        int temp = arr[j][i];
                        arr[j][i] = arr[j - 1][i];
                        arr[j - 1][i] = temp;
                        sort = true;
                    }
                }
            }
        }

        System.out.println("Отсортированный столбец матрицы по возрастанию: ");
        printArr(arr);

        for(int i = 0; i < n; i++) {
            boolean sort = true;
            while(sort) {
                sort = false;
                for(int j = 1; j < m; j++) {
                    if(arr[j][i] > arr[j - 1][i]) {
                        int temp = arr[j][i];
                        arr[j][i] = arr[j - 1][i];
                        arr[j - 1][i] = temp;
                        sort = true;
                    }
                }
            }
        }

        System.out.println("Отсортированный столбец матрицы по убыванию: ");
        printArr(arr);

    }

    public static int[][] createArr(int m, int n) {

        Random rand = new Random();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for(int[] line : arr) {
            for(int n : line) {
                System.out.print(" " + n);
            }
            System.out.println();
        }
        System.out.println();
    }
}
