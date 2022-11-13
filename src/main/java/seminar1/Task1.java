package seminar1;

import java.io.File;
import java.util.Random;

public class Task1 {
    // ���������� 3 ������, ����� � ������ �� ��� �������� ������ ����������
    public static void main(String[] args) {

        int[] numbers = {2, 5, 6};
        printRangeOfArray(numbers, 0, 2);
        checkFilename("src/main/resources/file.txt");
        System.out.println(generateRandomNumber(0));
    }

    public static void printRangeOfArray(int[] numbers, int start, int end) {
        for (start = 0; start < end; start++) {
            validIndexArray(numbers.length, start);
            System.out.println("[" + start + "] = " + numbers[start]);
        }
    }

    public static void validIndexArray(int length, int index) {            // ����� ��������� ������� ��� ��������� �������
        if (index < 0 || index >= length) {
            throw new IllegalArgumentException("incorrect index in Array: " + "[" + index + "]");
        }
    }

    public static void checkFilename(String filename) {                     // ����� �������� ������������ ����� �����
        File file = new File(filename);
        if (!file.exists()) {
            throw new IllegalArgumentException("incorrect filename: " + filename);
        }
    }

    public static int generateRandomNumber(int n) {                       // ����� ��������� ����� �� 1 �� n
        if (n <= 0) {
            throw new IllegalArgumentException("n must  be natural value");
        }
        return new Random().nextInt(n + 1);
    }

}
