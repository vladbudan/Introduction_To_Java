package by.epam.training.Algorithmization.decomposition;

// Вычислить площадь правильного шестиугольника со стороной а, используя метод вычисления площади треугольника

public class Task03 {

    public static void main(String[] args) {

        double a = 6;

        double hexagonS = 6 * triangleS(a);

        System.out.println("Площадь шестиугольника = " + hexagonS);

    }

    public static double triangleS(double a) {

        double b = a;
        double c = a;

        double p;
        p = (a + b + c) / 2;

        double s;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

}
