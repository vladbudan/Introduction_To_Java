package by.epam.training.Algorithmization.one_demension_array;

// Даны действительные числа а1, а2, ... аn. Найти max(a1 + a2n, a2 + a2n-1, ..., an + an+1)
public class Task07 {

    public static void main(String[] args) {

        int[] arr = {5, 10, 15, 0, 14, -11, 22, 153, -89, 17};

        int n = 5;

        for(int i = 0; i < 2 * n; i++) {
            System.out.println(arr[i]);
        }

        int max = arr[0] + arr[2 * n - 1];

        for(int i = 0; i < n; i++) {
            int temp = arr[i] + arr[2 * n - 1 - i];
            System.out.println(temp);
            if(max < temp) {
                max = temp;
            }
        }

        System.out.println("max = " + max);
    }

}
