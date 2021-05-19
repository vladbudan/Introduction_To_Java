package by.epam.training.Algorithmization.sort;

import java.util.Random;

// Даны две последовательности а1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
// Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
// Примечание. Дополнительный массив не использовать.

public class Task02 {

    public static void main(String[] args) {

        int[] arr1 = {1, 3, 5, 7, 9};
        int[] arr2 = {2, 4, 6, 8, 10};

        System.out.print("Массив 1: ");
        printArr(arr1);
        System.out.print("Массив 2: ");
        printArr(arr2);

        System.out.print("Полученная последовательность: ");
        int i = 0;
        int j = 0;
        while(true) {
            if(i == arr1.length) {
                for(; j < arr2.length; j++) {
                    System.out.println(arr2[j] + " ");
                }
                break;
            }
            if(j == arr2.length) {
                for(; i < arr1.length; i++) {
                    System.out.println(arr1[i] + " ");
                }
                break;
            }
            if(arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                System.out.print(arr1[i] + " ");
                i++;
            }
        }

    }

    public static void printArr(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
