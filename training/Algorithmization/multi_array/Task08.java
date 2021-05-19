package by.epam.training.Algorithmization.multi_array;

import java.util.Random;
import java.util.Scanner;

// В числовой матрице поменять местами два любых столбца. т.е. все элементы одного столбца
// поставить на соответствующие им позиции другого, а его элементы второго переместить в первый.
// Номера столбцов вводит пользователь с клавиатуры.
public class Task08 {

    public static void main(String[] args) {

        int m = 3;
        int n = 4;

        int[][] arr = createArr(m, n);

        System.out.println("Созданная матрица: ");
        printArr(arr);

        int x = 0;
        int y = 0;

        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("Введите число x для первого столбца (от 0 до " + (n - 1) + "): ");
            if(sc.hasNextInt() && (x = sc.nextInt()) >= 0 && x < n) {
                sc.nextLine();
                break;
            }
            else {
                System.out.println("Введенные данные некорректны!");
                sc.nextLine();
            }
        }

        while(true) {
            System.out.println("Введите число y для первого столбца (от 0 до " + (n - 1) + "): ");
            if(sc.hasNextInt() && (y = sc.nextInt()) >= 0 && y < n) {
                sc.nextLine();
                break;
            }
            else {
                System.out.println("Введенные данные некорректны!");
                sc.nextLine();
            }
        }

        for(int i = 0; i < arr.length; i++) {
            if( x != y) {
                int temp = arr[i][x];
                arr[i][x] = arr[i][y];
                arr[i][y] = temp;
            }
        }

        System.out.println("Поменяли столбцы: " + x + " и " + y + "");
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
