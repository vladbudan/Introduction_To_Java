package by.epam.training.Basic_of_sofware_code.branching;

// Найти max{min(a, b), min(c, d)}
public class Branching2 {

    public static void main(String[] args) {

        int a = 3;      int minAB;
        int b = 7;      int minCD;
        int c = 5;      int maxFromMin;
        int d = 10;


        if(a < b) { minAB = a; }
        else { minAB = b; }

        if(c < d) { minCD = c; }
        else { minCD = d; }

        if(minAB > minCD) { maxFromMin = minAB; }
        else { maxFromMin = minCD; }

        System.out.println("Максимальный из минимальных элементов: " + maxFromMin);
    }
}
