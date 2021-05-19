package by.epam.training.Basic_of_sofware_code.linear;

//№2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
public class LinearTask2 {

    public static void main(String[] args) {

        double a = 2;
        double b = 10;
        double c = 5;

        double result;

        result = (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
        System.out.println("Значение выражения = " + result);
    }
}
















