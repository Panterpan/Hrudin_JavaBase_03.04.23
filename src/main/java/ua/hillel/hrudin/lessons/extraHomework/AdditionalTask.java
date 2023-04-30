package ua.hillel.hrudin.lessons.extraHomework;

import java.util.Arrays;

public class AdditionalTask {
    public static void main(String[] args) {

        //Дан масив [1, 2, 3]. Зробіть із нього масив [3, 2, 1].
        int[] mass1 = new int[]{1, 2, 3};
        int[] mass2 = new int[mass1.length];

        for (int i = mass1.length - 1, j = 0; i >= 0; i--, j++) {
            mass2[j] = mass1[i];
        }
        System.out.println(Arrays.toString(mass1));
        System.out.println(Arrays.toString(mass2));

        // Дан масив [1, 2, 3].  Додайте йому до кінця елементи 4, 5, 6.
        int[] mas1 = new int[]{1, 2, 3};
        int[] mas2 = new int[]{4, 5, 6};
        int[] mas3 = new int[mas1.length + mas2.length];
        // version 1
//        for (int i = 0, j = mas2.length; i < mas1.length && j <= mas2.length + mas1.length - 1 ; i++, j++ ) {
//            mas3[i] = mas1[i];
//            mas3[j] = mas2[i];
//        }
        // version 2
        int count = 0;
        for (int i = 0; i < mas1.length; i++) {
            mas3[i] = mas1[i];
            count++;
        }
        for (int j = 0; j < mas2.length; j++) {
            mas3[count++] = mas2[j];
        }
        System.out.println(Arrays.toString(mas1));
        System.out.println(Arrays.toString(mas2));
        System.out.println(Arrays.toString(mas3));

        // Дан масив [1, 2, 3].  Додайте йому на початок елементи 4, 5, 6.
        // version 1
        int[] masss1 = new int[]{1, 2, 3};
        int[] masss2 = new int[]{4, 5, 6};
        int[] masss3 = new int[mas1.length + mas2.length];
        for (int i = 0, j = masss2.length; i < masss1.length && j <= masss1.length + masss2.length - 1; i++, j++) {
            masss3[i] = masss2[i];
            masss3[j] = masss1[i];
        }

        System.out.println(Arrays.toString(masss3));

        // Дан масив [3, 4, 1, 2, 7]. Відсортуйте його.
        int[] sortArr = {3, 4, 1, 2, 7};
        int j;
        for (int i = 1; i < sortArr.length; i++) {
            int swap = sortArr[i];
            for (j = i; j > 0 && swap < sortArr[j - 1]; j--) {
                sortArr[j] = sortArr[j - 1];
            }
            sortArr[j] = swap;
        }
        System.out.println(Arrays.toString(sortArr));

        // Дан масив з елементами 'Привіт, ', 'світ' і '!'. Необхідно вивести на екран фразу 'Привіт, світ!'.
        String[] str = {"Привіт,", "світ", "!" };
        for (String stray : str) {
            System.out.print(stray);
        }
        System.out.println(" ");

        // Створіть масив arr = ['a', 'b', 'c', 'd'] і за допомогою його виведіть на екран рядок 'a+b, c+d'.
        String[] arr = {"a", "b", "c", "d" };
        // version1
        for (int i = 0; i < arr.length; i += 2) {
            if (arr[i].equals("a")) {
                System.out.print(arr[i] + "+" + arr[i + 1]);
            } else if (arr[i].equals("c")) {
                System.out.print(", " + arr[i] + "+" + arr[i + 1]);
            }
        }
        System.out.println(" ");
        // version2
        for (int i = 0; i < arr.length - 1; i += 2) {
            System.out.print(arr[i] + "+" + arr[i + 1]);
            if (i != arr.length - 2) {
                System.out.print(", ");
            }
        }
        System.out.println(" ");

        // Задание:         Напишите сценарий, который найдет в массиве все отрицательные значения и заменить их на значения 0.
        // После этого выведет на экран все элементы массива.         int[] values = {10, 20, -2, 6, 11, -10, 125, -3, 8, 0, 3};

        int[] values = {10, 20, -2, 6, 11, -10, 125, -3, 8, 0, 3};
        for (int i = 0; i < values.length; i++) {
            if (values[i] < 0) {
                values[i] = 0;
            }
        }
        System.out.println(Arrays.toString(values));

        // Задание:         Найдите первый положительный элемент массива и выведите его на экран.
        int[] values1 = {-1, -5, -6, -3, -10, -5, 3, 4, -1, -8, 1, -10, 3};
        for (int i = 0; i < values1.length; i++) {
            if (values1[i] > 0) {
                System.out.println(values1[i]);
                break;
            }
        }
        // Дано массив.Найдите среднее арифметическое для значений этого массива.
        // Выведите на экран только те элементы, которые больше этого среднего арифместического значения
        int[] values3 = {10, 20, 48, 6, 11, 9, 125, 1, 8, 0, 3, 255, 77, 11, 170, 4, 28};
        int summ = 0;
        for (int i = 0; i < values3.length; i++) {
            summ += values3[i];
        }
        double average = (double) summ / values3.length;
        System.out.println(summ);
        System.out.println(average);
        for (int i = 0; i < values3.length; i++) {
            if (values3[i] > average) {
                System.out.print(values3[i] + " ");
            }
        }

    }
}
