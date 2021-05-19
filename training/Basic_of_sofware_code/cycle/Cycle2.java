package by.epam.training.Basic_of_sofware_code.cycle;

// Вычислить значения функции на отрезке [a, b] с шагом h: y = { x, x > 2; -x, x <= 2
public class Cycle2 {

    public static void main(String[] args) {

        int a = -5;
        int b = 10;
        int h = 4;
        int y;

        for(int x = a; x <= b; x += h) {
            if(x > 2) {
                y = x;
            } else {
                y = -x;
            }
            System.out.println("При x = " + x + ", y = " + y);
        }
    }
}
