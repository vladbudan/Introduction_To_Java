package by.epam.training.Basic_of_sofware_code.branching;

// Заданы размеры А,В прямоугольного отверстия и размеры x, y, z кирпича.
// Определить, пройдёт ли кирпич через отверстие.
public class Branching4 {

    public static void main(String[] args) {

        double A = 6;
        double B = 5;

        double x = 3;
        double y = 4;
        double z = 6;

        if(x < A && y < B || y < A && z < B || z < A && x < B) {
            System.out.println("Кирпич проходит в прямоугольное отверстие.");
        }
        else {
            System.out.println("Кирпич Не проходит в прямоугольное отверстие.");
        }
    }
}
