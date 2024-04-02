import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        int array[] = generateArray();
        System.out.println(Arrays.toString(array));
        System.out.println(findAverage(array));
    }

    public static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers in the array?");
        int length = scanner.nextInt();
        System.out.println("Enter the minimum value");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum value");
        int max = scanner.nextInt();

        int[] array = new int[length];
        Random random = new Random();


        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(max - min + 1) + min;
        }


        return array;
    }

    public static double findAverage(int[] array){
        double average = 0;

        for(int i = 0; i < array.length; i++){
            average+= array[i];
        }


        return (average / array.length);
    }
}
