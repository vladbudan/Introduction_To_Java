package by.epam.training.Basic_of_sofware_code.cycle;

// Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых
// больше или равен заданному е. Общий член ряда имеет вид: an = (1 / 2n ) + (1 / 3n)
public class Cycle5 {

    public static void main(String[] args) {

        double an;
        double e = 0.3;
        double sum = 0;

        for(int n = 1; n < 10; n++) {
            an = 1 / Math.pow(2, n) + 1 / Math.pow(3, n);
            if(Math.abs(an) >= e) {
                sum += an;
            }
        }
        System.out.println("Сумма = " + sum);
    }
}
