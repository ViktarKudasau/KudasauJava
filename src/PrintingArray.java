import java.util.Scanner;

public class PrintingArray {
    //на входе есть числовой массив, необходимо вывести элементы массива кратные 3
    static Scanner scanner = new Scanner(System.in);
    static  int sizeArray;
    static int[] array;
    static void printArray() {
        System.out.println("Введите желаемый размер массива (кол-во элементов в массиве:)");
        sizeArray = scanner.nextInt();                    //Задаем размер массива целых чисел
        array = new int[sizeArray];                       //Задаем массив целых чисел
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 201) - 100);    //Заполняем массив случайными числами
        }
        System.out.println("Элементы массива, кратные 3:");
        for (int i : array) {
            if (i % 3 == 0 && i != 0) {   // Проверяем, делится ли эл-т массива на число 3 без остатка
                System.out.print(" " + i);     // Выводим на печать эл-ты массива, кратные 3
            }
        }
    }
}
