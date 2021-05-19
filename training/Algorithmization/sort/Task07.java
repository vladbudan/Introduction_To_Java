package by.epam.training.Algorithmization.sort;

// Пусть даны две неубывающие последовательности действительных чисел
// a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать
// те места, на которые нужно вставлять элементы последовательности
// b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая
// последовательность осталась возрастающей.

import java.util.Random;

public class Task07 {

    public static void main(String[] args) {

        int n = 10;
        int m = 10;

        double[] a = getArr(n);
        double[] b = getArr(m);

        System.out.println("Последовательность а: ");
        printArr(a);
        System.out.println("Последовательность b: ");
        printArr(b);

        int i = 0;
        int j = 0;
        int count = 0;
        while(j < b.length) {
            if(b[j] >= a[i]) {
                i++;
                if(i >= a.length) {
                    for(int k = j; k < b.length; k++) {
                        System.out.print(" b" + k);
                    }
                    System.out.print(" вставляем в конец последовательности  'a'");
                    break;
                }
                continue;
            } else {
                if(j == (b.length - 1) || b[j + 1] >= a[i]) {
                    for(int k = j - count; k <= j; k++) {
                        System.out.print(" b" + k);
                    }
                    System.out.print(" вставляем перед элементом а" + i + "\n");
                    count = 0;
                    j++;
                    continue;
                } else {
                    j++;
                    count++;
                }
            }
        }


    }

    public static double[] getArr(int n) {

        Random rand = new Random();
        double[] arr = new double[n];
        arr[0] = rand.nextDouble() * 21 - 15;
        for(int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + rand.nextDouble() * 5;
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
