package by.epam.training.Algorithmization.sort;

// Сортировка обменами. Дана последовательность чисел  а1 <= a2 <= ... <= an. Требуется поставить числа
// в порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+ 1, то делается
// перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
// Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

// Непонятно условие задачи. Массив отсортирован изначально. Возможно в условии ошибка
public class Task04 {

    public static void main(String[] args) {


        int[] arr = {0, 1, 1, 2, 4, 5, 9, 9, 10, 11, 11, 12, 17, 20, 21};

        System.out.println("Начальный массив: ");
        printArr(arr);

        int count = 0;
        boolean sort = true;

        while(sort) {
            sort = false;
            for(int i = 0; i < arr.length - 1; i++) {
                if(arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    count++;
                    sort = true;
                }
            }
        }

        System.out.println("Отсортированный массив: ");
        printArr(arr);
        System.out.println("Кол-во перестановок: " + count);

    }

    public static void printArr(int[] arr) {
        for(int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
