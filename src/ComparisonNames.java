import java.util.Scanner;

public class ComparisonNames {
    //���� ��������� ��� ��������� � ��������, �� ������� �������, ��������, ���� ���, �� ������� "��� ������ �����"
    static String validName = "��������";
    static String userName;
    static String message = "������, ��������";
    static Scanner scanner = new Scanner(System.in);
    static void compareNames() {
        System.out.println("������� ���:");
        userName = scanner.nextLine();
        if (validName.equals(userName)) {
                System.out.println(message);
            } else {
            System.out.println("��� ������ �����");
        }
    }
}