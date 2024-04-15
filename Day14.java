import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day14 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(mergeSort(arr)));
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


    public static int[] mergeSort(int[] array){
        int mid = array.length/2;
        int[] leftHalf = new int[mid];
        int[] rightHalf = new int[array.length - mid];

        if(array.length < 2){
            return array;
        }
        for(int i = 0; i < array.length; i++){
            if(i < mid){
                leftHalf[i] = array[i];
            } else{
                rightHalf[i - mid] = array[i];
            }
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(array, leftHalf, rightHalf);
        return array;
    }


    private static void merge(int[] array, int[] leftHalf, int[] rightHalf){
        int leftSize = leftHalf.length, rightSize = rightHalf.length;
        int i = 0, j = 0, k = 0;


        while(i < leftSize && j < rightSize){
            if(leftHalf[i] < rightHalf[j]){
                array[k] = leftHalf[i];
                i++;
            } else{
                array[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i < leftSize){
            array[k] = leftHalf[i];
            i++; k++;
        }

        while(j < rightSize){
            array[k] = rightHalf[j];
            j++; k++;
        }
    }

}
