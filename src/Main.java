import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//задача 1
        System.out.println("задача 1");

        int[] inputArray1 = {1093, 5000, 2075, 6893, 1500};
        float[] outputArray1 = new float[4];
        float sum = 0f;
        for (int element : inputArray1) {
            sum += element;
        }
        outputArray1[0] = sum;
        outputArray1[3] = sum / inputArray1.length;
        int max = -1;
        for (int element : inputArray1) {
            if (element > max) {
                max = element;
            }
        }
        outputArray1[1] = max;
        int min = 1000000;
        for (int element : inputArray1) {
            if (element < min) {
                min = element;
            }
        }
        outputArray1[2] = min;
        System.out.println(Arrays.toString(inputArray1));
        System.out.println(Arrays.toString(outputArray1));

//задача 2
        System.out.println("задача 2");

        int[] inputArray2 = {96532, 74568, 85214, 83256, 98540};
        float[] outputArray2 = new float[5];
        int index = 0;
        for (int element : inputArray2) {
            outputArray2[index] = element * 0.13f;
            index++;
        }
        System.out.println(Arrays.toString(inputArray2));
        System.out.println(Arrays.toString(outputArray2));

//задача 3
        System.out.println("задача 3");

        int[] inputArray3 = {1093, 7000, 2075, 6893, 1500};
        boolean[] outputArray3 = new boolean[5];
        int index2 = 0;
        for (int element : inputArray3) {
            if (element > 5000) {
                outputArray3[index2] = true;
            }
            index2++;
        }
        System.out.println(Arrays.toString(inputArray3));
        System.out.println(Arrays.toString(outputArray3));

//задача 4
        System.out.println("задача 4");

        int[] inputArray4 = {1093, 7000, -2075, 6893, -1500};
        boolean[] outputArray4 = {true};
        for (int element : inputArray4) {
            if (element < 0) {
                outputArray4[0] = false;
                break;
            }
        }
        System.out.println(Arrays.toString(inputArray4));
        System.out.println(Arrays.toString(outputArray4));

//задача 5
        System.out.println("задача 5");

        int[] inputArray5 = {981093000, 970000000, -2000075, 680903000, 815000000};
        int[] outputArray5 = new int[1];
        int monthRentable = 0;
        for (int element : inputArray5) {
            if (element > 0) {
                monthRentable++;
            }
        }
        outputArray5[0] = monthRentable;
        System.out.println(Arrays.toString(inputArray5));
        System.out.println(Arrays.toString(outputArray5));
    }
}