package lesson1;

import java.util.Random;

public class lesson1 {
    public static void main(String[] args) {

        String dumbledore = "Дамболдор", mcgonagall = "Хуй знает кто это", snape = "Снейп", lipun = "Липун", hugrid = "Хагрид";

        String teacher = "Школьные учителя: ";

        System.out.println(teacher + dumbledore + ", " + mcgonagall + ", " + snape + ", " + lipun + ", " + hugrid);

        int grade1 = new Random().nextInt(1, 12);
        int grade2 = new Random().nextInt(1, 12);

        boolean result;

        if (grade1 > 5 && grade2 > 5) {
            result = true;
            System.out.println("Обе оценки больше 5! result = " + result);
            System.out.println("Оценки: " + grade1 + " и " + grade2);
        } else {
            result = false;
            System.out.println("Оценки не больше 5! result = " + result);
            System.out.println("Оценки: " + grade1 + " и " + grade2);
        }

        float avg = (grade1 + grade2) / 2;
        System.out.println("Средняя оценка: " + avg);

        int ostatok = 4199 % 13 + 4199 % 14 + 4199 % 15 + 4199 % 16 + 4199 % 17 + 4199 % 19;
        System.out.println(ostatok);
    }
}
