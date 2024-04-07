import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("===============");
        System.out.println(Arrays.toString(uniqueArray(arr)));
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

    public static int[] uniqueArray(int[] array){
        int count = 0, n = array.length;

            for(int i = 0; i < n; i++){
                int val = array[i];
                if(Arrays.stream(array, i+1, n).anyMatch(x -> x == val)){
                   count++;
                }
            }


        int[] arr = new int[array.length - count];
        int p = 0;
        for (int value : array) {
            if (Arrays.stream(arr).noneMatch(x -> x == value)) {
                arr[p] = value;
                p++;
            }
        }
        return arr;
    }
}
