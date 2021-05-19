package by.epam.training.Algorithmization.multi_array;

import java.util.Random;

// Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем
// в каждом столбце число единиц равно номеру столбцу.
public class Task14 {

    public static void main(String[] args) {

        int m = 5;
        int n = 6;

        if(n > m) n = m;

        Random rand = new Random();

        int[][] arr = new int[m][n];
        for(int i = 0; i < n; i++) {
            int count = i + 1;
            while(count > 0) {
                int index = rand.nextInt(m);
                if(arr[index][i] == 0) {
                    arr[index][i] = 1;
                    count--;
                }
            }
        }

        System.out.println("Созданная матрица: ");
        printArr(arr);

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
