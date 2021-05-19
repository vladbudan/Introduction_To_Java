package by.epam.training.Basic_of_sofware_code.linear;

// Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение числа.
public class LinearTask4 {

    public static void main(String[] args) {

        double num1 = 135.269;

        int firstPart = (int) num1;  // 135
        int secondPart = (int) ((num1 - firstPart) * 1000);  // 269
        double num2 = secondPart + firstPart * 0.001;  // 269 + 0.135

        System.out.println("Начальное значение числа: " + num1);
        System.out.println("Полученное значение числа: " + num2);
    }
}
