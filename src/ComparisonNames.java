import java.util.Scanner;

public class ComparisonNames {
    //если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
    static String validName = "Вячеслав";
    static String message = "Привет, Вячеслав";
    static Scanner scanner = new Scanner(System.in);
    static void compareNames() {
        System.out.println("Введите имя:");
        String userName = scanner.nextLine();  //Запускаем сканер для ввода имени пользователем
        if (validName.equals(userName)) {
                System.out.println(message);
            } else {
            System.out.println("Нет такого имени");
        }
    }
}