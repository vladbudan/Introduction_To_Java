package by.epam.training.Basic_of_sofware_code.linear;

// Вычислить значение выражения по формуле: (sinX + cosY / cosX - sinY) * tgXY
public class LinearTask3 {

    public static void main(String[] args) {

        double x = 30;
        double y = 60;

        double xRad;
        double yRad;

        double result;

        // перевод в радианы
        xRad = x * Math.PI / 180.0;
        yRad = y * Math.PI / 180.0;
        result = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(xRad * yRad);

        System.out.println("Значение выражения = " + result);
    }
}
