package by.epam.training.Basic_of_sofware_code.cycle;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
// Таблица символов (ASCII)
public class Cycle6 {

    public static void main(String[] args) {

        for(int i = 32; i <= 126; i++) {
            System.out.println(i + " " + (char) i);
        }

    }
}
