import java.util.Scanner;

public class ComparisonNames {
    //если введенное им€ совпадает с ¬€чеслав, то вывести Уѕривет, ¬€чеславФ, если нет, то вывести "Ќет такого имени"
    static String validName = "¬€чеслав";
    static String userName;
    static String message = "ѕривет, ¬€чеслав";
    static Scanner scanner = new Scanner(System.in);
    static void compareNames() {
        System.out.println("¬ведите им€:");
        userName = scanner.nextLine();
        if (validName.equals(userName)) {
                System.out.println(message);
            } else {
            System.out.println("Ќет такого имени");
        }
    }
}