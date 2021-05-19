package by.epam.training.Algorithmization.decomposition;

// На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие,
// между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

public class Task04 {

    public static void main(String[] args) {

        double[][] a = {{1, 2}, {5, 8}, {-6, 15}, {7, 14}, {0,11}, {-10, -3}};

        // Выводим на экран заданые точки
        System.out.println("Даны точки с координатами (x, y):");
        printPoints(a);
        System.out.println();

        // Получаем координаты максимально-удаленных точек
        double[][] maxDistancePoints = maxDistancePoints(a);

        // Выводим на экран найденные точки
        System.out.println("Координаты (x, y) максимально-удаленных точек:");
        printPoints(maxDistancePoints);
        System.out.println("Расстояние между точками = " + getDistance(maxDistancePoints));

    }

    public static double[][] maxDistancePoints(double[][] points) {
        double[][] maxDistancePoints = new double[2][2];
        double maxDistance = 0;
        for (int i = 0; i < points.length - 1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = getDistance(points[i], points[j]);
                if (maxDistance < distance) {
                    maxDistance = distance;
                    maxDistancePoints[0] = points[i];
                    maxDistancePoints[1] = points[j];
                }
            }
        }
        return maxDistancePoints;
    }

    public static double getDistance(double[]... a) {
        double distance = Math.sqrt(Math.pow(a[0][0] - a[1][0], 2) + Math.pow(a[0][1] - a[1][1], 2));
        return distance;
    }

    public static void printPoints(double[][] points) {
        for (int i = 0; i < points.length; i++) {
            System.out.print("(" + points[i][0] + ", " + points[i][1] + "), ");
        }
        System.out.println();
    }

}
