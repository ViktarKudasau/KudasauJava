import java.util.Scanner;

public class PrintingArray {
    //�� ����� ���� �������� ������, ���������� ������� �������� ������� ������� 3
    static Scanner scanner = new Scanner(System.in);
    static  int sizeArray;
    static int[] array;
    static void printArray() {
        System.out.println("������� �������� ������ ������� (���-�� ��������� � �������:)");
        sizeArray = scanner.nextInt();                    //������ ������ ������� ����� �����
        array = new int[sizeArray];                       //������ ������ ����� �����
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 201) - 100);    //��������� ������ ���������� �������
        }
        System.out.println("�������� �������, ������� 3:");
        for (int i : array) {
            if (i % 3 == 0 && i != 0) {   // ���������, ������� �� ��-� ������� �� ����� 3 ��� �������
                System.out.print(" " + i);     // ������� �� ������ ��-�� �������, ������� 3
            }
        }
    }
}
