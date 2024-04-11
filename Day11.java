import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        int[] arr1 = generateArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(rotateArray(arr1)));
    }

    public static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = scanner.nextInt();
        System.out.println("Enter the minimum number of the array");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum number of the array");
        int max = scanner.nextInt();


        int[] array = new int[length];
        Random random =  new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(max - min + 1) + min;
        }

        return array;
    }


    public static int[] rotateArray(int[] array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the rotation number (to right)");
        int rotation = scanner.nextInt();
        int length = array.length;
        int[] newArr = new int[length];

        for (int j = 0; j < array.length; j++) {
            int position = (rotation + j) % length;
            newArr[position] = array[j];
        }

        return newArr;
    }


}
