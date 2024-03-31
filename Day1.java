import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day1 {

    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(minAndMaxValues(arr)));

    }


    public static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many numbers do you want?");
        int length = scanner.nextInt();
        System.out.println("Enter the minimum values");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum values");
        int max = scanner.nextInt();


        int[] array = new int[length];

        for(int i = 0; i < length; i++){
            Random random = new Random();
            array[i] = random.nextInt(max - min + 1);
        }

        return array;
    }



    public static int[] minAndMaxValues(int[] array){
        int minimum = Integer.MAX_VALUE;
        int maximum = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++){
            if(array[i] < minimum){
                minimum = array[i];
            }
            if(array[i] > maximum){
                maximum = array[i];
            }
        }

        int[] values = {minimum, maximum};
        return values;
    }
}
