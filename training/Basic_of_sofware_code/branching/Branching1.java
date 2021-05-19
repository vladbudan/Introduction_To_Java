package by.epam.training.Basic_of_sofware_code.branching;

// Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
// и если да, то будет ли он прямоугольным.
public class Branching1 {

    public static void main(String[] args) {

        int corner1 = 90;
        int corner2 = 30;

        int corner3 = 180 - (corner1 + corner2);

        if(corner1 > 0 && corner2 > 0 && corner3 > 0) {
            System.out.println("Такой прямоугольник существует");
            if(corner1 == 90 || corner2 == 90 || corner3 == 90) {
                System.out.println("Треугольник является прямоугольным");
            }
        }
        else {
            System.out.println("Прямоугольник не существует");
        }
    }
}






