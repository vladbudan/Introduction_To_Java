package by.epam.training.Algorithmization.multi_array;

// Сформировать квадратную матрицу порядка N по правилу: A[I, J] = sin(I2 - J2 / N)
// и подсчитать кол-во положительных чисел в ней.
public class Task07 {

    public static void main(String[] args) {

        int n = 5;

        int count = 0;

        double[][] arr = new double[n][n];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                arr[i][j] = Math.sin((double)(i * i - j * j) / n);
                if(arr[i][j] > 0) {
                    count++;
                }
            }
        }

        System.out.println("Созданная матрица: ");
        printArr(arr);

        System.out.println("Кол-во положительных чисел в ней: " + count);
    }

    static void printArr(double[][] arr) {
        for(double[] line : arr) {
            for(double n : line) {
                System.out.print(" " + n);
            }
            System.out.println();
        }
        System.out.println();
    }
}
