import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day5 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(insertionSort(arr)));
    }

    public static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = scanner.nextInt();

        System.out.println("Enter the minimum value of the array");
        int min = scanner.nextInt();
        System.out.println("Enter the maximum value of the array");
        int max = scanner.nextInt();

        int[] array = new int[length];
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(max - min + 1) + min;
        }


        return array;
    }

    public static int[] insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++){
            int j = i-1;
            while(j >= 0 && array[i] < array[j]){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i--;
                j--;
            }
        }
        return array;
    }
}
