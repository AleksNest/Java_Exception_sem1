package seminar1;

import java.util.Arrays;

// ���������� �����, ����������� � �������� ���������� ��� ������������� �������, � ������������ ����� ������
// ������ ������� �������� ����� �������� ��������� ���� �������� �������� � ��� �� ������.
// ���� ����� �������� �� �����, ���������� ���-�� ���������� ������������.
// �����: ��� ���������� ������ ������������ ����������, ������� ������������ ����� ������� - RuntimeException, �.�. ����.
public class Task3 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4};
        int[] arr2 = {1, 0, 4, 5};
        System.out.println(Arrays.toString(dif(arr1, arr2)));
    }

    public static int[] dif(int[] arr1, int[] arr2) {

        if (arr1.length != arr2.length) {
            throw new RuntimeException("Length of arrays should be the same");
        }

        int[] arrNew = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new ArithmeticException("division by zero");
            }
            arrNew[i] = arr1[i] / arr2[i];
        }

        return arrNew;
    }
}