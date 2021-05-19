package by.epam.training.Algorithmization.sort;

import java.util.Random;

// Сортировка выбором. Дана последовательность чисел  а1 <= a2 <= ... <= an. Требуется переставить
// элементы так, чтобы они были по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
// элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
// повторяется. Написать алгоритм сортировки выбором.

public class Task03 {

    public static void main(String[] args) {


        int[] arr = {1, 2, 3, 3, 4, 5, 5, 5, 6, 7, 8, 9, 9, 10};

        System.out.println("Начальный массив: ");
        printArr(arr);

        for(int i = 0; i < arr.length - 1; i++) {
            int max = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[max] < arr[j]) max = j;
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }

        System.out.println("Отсортированный массив: ");
        printArr(arr);

    }

    public static void printArr(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
