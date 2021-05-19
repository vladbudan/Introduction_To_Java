package by.epam.training.Basic_of_sofware_code.linear;

// Для данной области составить линейную программу, которая печатает true, если точка с координатами (x, y)
// принадлежит закрашенной области, и false - в противном случае.
public class LinearTask6 {

    public static void main(String[] args) {

        int x = -2;
        int y = 3;

        if(y >= 0 && y <= 4 && x >= -2 && x <= 2 || y <= 0 && y >= -3 && x >= -4 && x <= 4) {
            System.out.println(true);
        }
        else {
            System.out.println(false);
        }
        System.out.println("Точка с координатами (" + x + ", " + y + ") принадлежит закрашенной области");
    }
}
