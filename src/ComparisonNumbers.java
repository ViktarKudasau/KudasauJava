import java.util.Scanner;
public class ComparisonNumbers {
    //��������� ��������: ���� ��������� ����� ������ 7, �� ������� �������
    static double numberOne = 7;
    static double numberUser;
    static String message = "������";
    static String answer;
    static Scanner scanner = new Scanner(System.in);
    static void compareNumbers() {
        while (true) {
            System.out.println("������� �����:");
            numberUser = scanner.nextDouble();
            if (numberUser > numberOne){
                System.out.println(message);
                break;
            }else {
                System.out.println("��������� ����� ������ ���� ����� ���������. ������ ����������? '��' ��� '���' :");
                scanner = new Scanner(System.in);
                answer = scanner.nextLine();
                while ((!answer.equalsIgnoreCase("���")) && (!answer.equalsIgnoreCase("��"))){
                    System.out.println("������������ ���������. ������� ���������� '��' ��� '���' ?:");
                    answer = scanner.nextLine();
                }
                if (answer.equalsIgnoreCase("���")){
                    System.out.println("�� ����� �� ���������� ��������� �����");
                    break;
                }
            }
        }
    }
}
