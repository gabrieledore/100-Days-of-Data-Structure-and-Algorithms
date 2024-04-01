import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(sumArray(arr));
    }


    public static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = scanner.nextInt();
        System.out.println("Ente the minimum value you want");
        int min = scanner.nextInt();
        System.out.println("Ente the maximum value you want");
        int max = scanner.nextInt();


        int[] array = new int[length];

        for(int i = 0; i < length; i++){
            Random random  = new Random();
            array[i] = random.nextInt(max - min) + min;
        }


        return array;
    }


    public static int sumArray(int[] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum+=array[i];
        }

        return sum;
    }
}
