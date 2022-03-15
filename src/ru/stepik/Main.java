package ru.stepik;


public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;

        double[] array1 = {1.57, 7.654, 9.986};
        double sum1 = 0;

        char[] array2 = new char[6];
        array2[0] = 'S';
        array2[1] = 'k';
        array2[2] = 'y';
        array2[3] = 'p';
        array2[4] = 'r';
        array2[5] = 'o';


    }

    public static void task2() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum++;
            if (array.length == sum) {
                System.out.print(array[i]);
            } else
                System.out.print(array[i] + ", ");
        }
        System.out.println("");

        double[] array1 = {1.57, 7.654, 9.986};
        double sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1++;
            if (array1.length == sum1) {
                System.out.print(array1[i]);
            } else
                System.out.print(array1[i] + ", ");
        }
        System.out.println("");

        char[] array2 = new char[6];
        array2[0] = 'S';
        array2[1] = 'k';
        array2[2] = 'y';
        array2[3] = 'p';
        array2[4] = 'r';
        array2[5] = 'o';
        char sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            sum2++;
            if (array2.length == sum2) {
                System.out.print(array2[i]);
            } else
                System.out.print(array2[i] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        int sum = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            sum++;
            if (array.length == sum) {
                System.out.print(array[i]);
            } else
                System.out.print(array[i] + ", ");
        }
        System.out.println("");

        double[] array1 = {1.57, 7.654, 9.986};
        double sum1 = 0;
        for (int i = array1.length - 1; i >= 0; i--) {
            sum1++;
            if (array1.length == sum1) {
                System.out.print(array1[i]);
            } else
                System.out.print(array1[i] + ", ");
        }
        System.out.println("");

        char[] array2 = new char[6];
        array2[0] = 'S';
        array2[1] = 'k';
        array2[2] = 'y';
        array2[3] = 'p';
        array2[4] = 'r';
        array2[5] = 'o';
        char sum2 = 0;
        for (int i = array2.length - 1; i >= 0; i--) {
            sum2++;
            if (array2.length == sum2) {
                System.out.print(array2[i]);
            } else
                System.out.print(array2[i] + ", ");
        }
        System.out.println();
    }

    public static void task4() {
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] += 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum++;
            if (array.length != sum) {
                System.out.print(array[i] + ", ");
            } else
                System.out.print(array[i]);
        }
    }
}
