import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day4 {
    public static void main(String[] args) {
        int[] array = generateArray();
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArray(array)));
    }

    public static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int length = scanner.nextInt();

        System.out.println("Enter the min value of the array");
        int min = scanner.nextInt();
        System.out.println("Enter the max value of the array");
        int max = scanner.nextInt();

        int[] array = new int[length];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(max - min + 1) + min;
        }


        return array;
    }


    public static int[] reverseArray(int[] array){

        for(int i = 0; i < array.length / 2; i++){
            int tmp = array[i];
            array[i] = array[array.length-1-i];
            array[array.length-1-i] = tmp;
        }


        return array;
    }
}
