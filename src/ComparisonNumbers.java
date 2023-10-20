import java.util.Scanner;
public class ComparisonNumbers {
    //Составить алгоритм: если введенное число больше 7, то вывести “Привет”
    static double numberOne = 7;
    static double numberUser;
    static String message = "Привет";
    static String answer;
    static Scanner scanner = new Scanner(System.in);
    static void compareNumbers() {
        while (true) {
            System.out.println("Введите число:");
            numberUser = scanner.nextDouble();
            if (numberUser > numberOne){
                System.out.println(message);
                break;
            }else {
                System.out.println("Введенное число меньше либо равно заданному. Хотите продолжить? 'да' или 'нет' :");
                scanner = new Scanner(System.in);
                answer = scanner.nextLine();
                while ((!answer.equalsIgnoreCase("нет")) && (!answer.equalsIgnoreCase("да"))){
                    System.out.println("Некорректное выражение. Желаете продолжить 'да' или 'нет' ?:");
                    answer = scanner.nextLine();
                }
                if (answer.equalsIgnoreCase("нет")){
                    System.out.println("Вы вышли из приложения сравнения чисел");
                    break;
                }
            }
        }
    }
}
