package by.epam.training.Basic_of_sofware_code.linear;

// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в часах, минутах  и секундах в следующей форме: ННч ММмин SSc.
public class LinearTask5 {

    public static void main(String[] args) {

        int number = 7380;

        int hours = number / 3600;

        int temp = number - hours * 3600;

        int minutes = temp / 60;

        int seconds = temp - minutes * 60;

        System.out.println(hours + "ч " + minutes + "мин " + seconds + "c");
    }
}

