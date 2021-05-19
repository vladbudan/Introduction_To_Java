package by.epam.training.Algorithmization.multi_array;

// Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел
// 1, 2, 3, ... n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей
// равны между собой. Построить такой квадрат.
public class Task16 {

    public static void main(String[] args) {

        int n = 5;
        int last = n * n;

        // Проверка корректности введенного n
        if(n < 3 || n % 2 == 0) {
            System.out.println("Некорректно задан порядок квадрата, измените n и перезапустите программу");
            System.exit(1);
        }

        // Создаем квадрат
        int[][] square = new int[n][n];

        // следующее число в последовательности
        int next = 1;

        // Координаты текущей ячейки
        int j = 0;
        int i = n / 2;

        // Координаты для проверки занята ли ячейка
        int jj = 0;
        int ii = 0;
        square[j][i] = next;

        // Заполняем квадрат
        while(next < last) {
            // Сохраняем координаты ячейки, чтобы была возможность к ней вернуться
            jj = j;
            ii = i;
            // Сдвигаем ячейку вправо и вверх
            j--;
            i++;
            // Проверяем не вышла ли ячейка за пределы квадрата
            if(j < 0) j = n - 1;
            if(i >= n) i = 0;
            // Проверяем не занята ли ячейка, если занята, то ищем свободную
            while(true) {
                if(square[j][i] == 0) {
                    break;
                } else {
                    j = jj + 1;
                    i = ii;
                    if(j >= n) j = 0;
                    jj = j;
                }
            }
            // Записываем следующее число в полученную ячейку
            next++;
            square[j][i] = next;
        }

        System.out.println("Полученный магический квадрат");
        printArr(square);

    }

    public static void printArr(int[][] arr) {
        for(int[] line : arr) {
            for(int n : line) {
                if(n >= 1000)
                    System.out.print(" " + n);
                else if(n >= 100)
                    System.out.print("  " + n);
                else if(n >= 10)
                    System.out.print("   " + n);
                else
                    System.out.print("    " + n);
            }
            System.out.println();
        }
    }

}
