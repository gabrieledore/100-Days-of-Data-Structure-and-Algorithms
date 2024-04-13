import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day13a {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(bubbleSort(arr)));

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


    public static int[] bubbleSort(int[] array){
        for(int j = 0; j < array.length -1; j++){
            for(int i = 0; i < array.length -1; i++){
                if(array[i] > array[i+1]){
                    int tmp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tmp;
                }
            }
        }

        return array;
    }


}
