package by.epam.training.Algorithmization.one_demension_array;

// Даны целые числа а1, а2, ... an. Вывести на печать только те числа, для которых аi > i
public class Task05 {

    public static void main(String[] args) {

        int[] arr = {3, 5, -8, 15, 2, 23, 0, -11, 40};

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] > i) {
                System.out.println(arr[i] + " ");
            }
        }

    }

}
