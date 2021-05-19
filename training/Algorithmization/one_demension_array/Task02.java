package by.epam.training.Algorithmization.one_demension_array;

// Дана последовательность действительных чисел а1, а2, ... аn. Заменить все её члены,
// большие данного Z, этим числом. Подсчитать количество замен.
public class Task02 {

    public static void main(String[] args) {

        int z = 15;

        int[] arr = {5, 1, 12, 26, 101, 3, 18, 11, 8, 20};

        int count = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] > z) {
                arr[i] = z;
                count++;
            }
        }

        for(int i : arr) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Количество замен: " + count);
    }

}
