import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day13b {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(selectionSort(arr)));

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


    public static int[] selectionSort(int[] array){
        int[] arr = new int[array.length];
        for(int i = 0; i < array.length; i++){
            int min = array[i];
            int index = i;
            for(int j = i; j < array.length; j++){
                if(array[j] < min){
                    min = array[j];
                    index = j;
                }
            }
            int tmp = min;
            array[index] = array[i];
            array[i] = min;
        }
        return array;
    }


}
