package by.epam.training.Basic_of_sofware_code.branching;

// Даны три точки А(x1, y1), B(x2, y2), C(x3, y3). Определить будут ли они расположены
public class Branching3 {

    public static void main(String[] args) {

        double x1 = 2;   double x2 = 3;   double x3 = 4;
        double y1 = 2;   double y2 = 3;   double y3 = 4;

        double a;
        double b;
        double c;

        // Образуем из трёх точек треугольник. Находим каждую сторону, затем высчитываем полупериметр и площадь. 
        // Если площадь равна нулю, значит точки расположены на одной прямой. Если нет - не расположены.
        a = Math.sqrt((Math.pow(Math.abs(x1 - x2),2)) + Math.pow(Math.abs(y1 - y2), 2));
        b = Math.sqrt((Math.pow(Math.abs(x2 - x3),2)) + Math.pow(Math.abs(y2 - y3), 2));
        c = Math.sqrt((Math.pow(Math.abs(x1 - x3),2)) + Math.pow(Math.abs(y1 - y3), 2));

        double p;
        double s;

        p = (a + b + c) / 2;
        s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println("Площадь = " + s);
    }
}
