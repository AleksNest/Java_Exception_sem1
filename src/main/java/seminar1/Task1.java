package seminar1;

import java.io.File;
import java.util.Random;

public class Task1 {
    // Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
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

    public static void validIndexArray(int length, int index) {            // метод отсечения индекса вне диапозона массива
        if (index < 0 || index >= length) {
            throw new IllegalArgumentException("incorrect index in Array: " + "[" + index + "]");
        }
    }

    public static void checkFilename(String filename) {                     // метод проверки корректности имени файла
        File file = new File(filename);
        if (!file.exists()) {
            throw new IllegalArgumentException("incorrect filename: " + filename);
        }
    }

    public static int generateRandomNumber(int n) {                       // Метод генерации чисел от 1 до n
        if (n <= 0) {
            throw new IllegalArgumentException("n must  be natural value");
        }
        return new Random().nextInt(n + 1);
    }

}
