package by.epam.training.Basic_of_sofware_code.branching;

// Вычислить значение функции f(x) = {x2 - 3x + 9, если x <= 3; 1 / x3 - 6, если x>3}
public class Branching5 {

    public static void main(String[] args) {

        double x = 2;
        double y;

        if(x <= 3) {
            y = Math.pow(x, 2) - 3 * x + 9;
        }
        else {
            y = 1 / (Math.pow(x, 3) - 6);
        }
        System.out.println("f(x) = " + y);
    }
}
