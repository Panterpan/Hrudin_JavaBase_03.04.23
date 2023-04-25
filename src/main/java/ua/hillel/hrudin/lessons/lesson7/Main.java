package ua.hillel.hrudin.lessons.lesson7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        int [] array = new int[5];
//
//        array [0] = 9;
//        array [1] = 2;
//        array [2] = 7;
//        array [3] = 8;
//        array [4] = 8;

//        System.out.println(array[3]);

//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == 2 || array[i] == 7){
//                array [i] = 83;
//            }
//            System.out.println(array[i]);
//
//        }
//
////        for (int value : array) {
////            System.out.println(value);
////
////        }
//        System.out.println(Arrays.toString(array));

//        int[] value = new int[10];
//        for (int i = 0; i < value.length; i++) {
//            value [i] = (int) (Math.random()*11);
//
//        }
//        System.out.println(Arrays.toString(value));
//
//        for (int i = 0; i < value.length; i++) {
//
//            if (i == value.length-1){
//                System.out.print(value[i]);
//            } else {
//                System.out.print(value[i] + ", ");
//            }
//      }


        int[] people = {15, 22, 59, 63, 1, 93, 99, 43, 19, 99};

        int max = people[0];
        for (int i = 1; i < people.length; i++) {
//            if (max < people[i]){
//                max = people[i];
//            }
            max = Math.max(max, people[i]);
        }
        System.out.println(max);
        for (int i = 0; i < people.length; i++) {
            if (max == people[i]){
                System.out.println(max + " " + i);
            }

        }

    }
}
