package by.epam.training.Algorithmization.sort;

// Заданы два одномерных массива с различным количеством элементов и натуральное число k.
// Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
// при этом не используя дополнительный массив.

public class Task01 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};

        int[] arr2 = {0, 0, 0, 0, 0, 0, 0};

        int k = 3;

        if(k < 0 || k >= arr1.length) {
            System.out.println("Некорректные данные!");
            System.exit(1);
        }

        System.out.println("Объединённый массив: ");

        for(int i = 0; i < k; i++) {
            System.out.print(arr1[i] + " ");
        }
        for(int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        for(int i = k + 1; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

    }

}
