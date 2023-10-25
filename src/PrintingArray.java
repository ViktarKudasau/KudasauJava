import java.util.Scanner;

public class PrintingArray {
    //на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    static Scanner scanner = new Scanner(System.in);
    static void printArray() {
        System.out.println("Введите желаемый размер массива (кол-во элементов в массиве:)");
        int sizeArray = scanner.nextInt();
        double [] array = new double[sizeArray];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Введите число (элемент массива №" + i +"):");
            array[i] = scanner.nextDouble();
        }
        System.out.println("Элементы массива, кратные 3:");
        for (double i : array) {
            if (i % 3 == 0 && i != 0) {
                System.out.print(" " + i);
            }
        }
    }
}
