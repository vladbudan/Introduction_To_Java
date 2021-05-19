package by.epam.training.Algorithmization.multi_array;

import java.util.Random;

// Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму
// матрицу и номера строк, в которых число 5 встречается три и более раз.
public class Task11 {

    public static void main(String[] args) {

        int m = 10;
        int n = 20;

        int[][] arr = createArr(m, n);

        System.out.println("Матрица 10х20 с случайными сичлами от 0 до 15: ");
        printArr(arr);

        System.out.println("Строки, содержащие число 5 более трех раз: ");

        for(int i = 0; i < arr.length; i++) {
            int count = 0;
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == 5) {
                    count++;
                    if(count >= 3) {
                        System.out.println(" " + i);
                        break;
                    }
                }
            }
        }

    }

    public static int[][] createArr(int m, int n) {

        Random rand = new Random();
        int[][] arr = new int[m][n];
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = rand.nextInt(16);
            }
        }
        return arr;
    }

    public static void printArr(int[][] arr) {
        for(int[] line : arr) {
            for(int n : line) {
                if (n > 9)
                    System.out.print(" " + n);
                else
                    System.out.print("  " + n);
            }
            System.out.println();
        }
    }

}
