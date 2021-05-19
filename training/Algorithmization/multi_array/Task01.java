package by.epam.training.Algorithmization.multi_array;

// Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task01 {

    public static void main(String[] args) {

        int[][] arr = {{3, 5, 7},
                       {4, 8, 2},
                       {2, 4, 6}};

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j += 2) {
                if(arr[0][j] > arr[arr.length - 1][j]) {
                    System.out.println(arr[i][j]);
                }
            }
            System.out.println();
        }

    }

}


