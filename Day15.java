import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(quickSort(arr, 0, (arr.length -1))));

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

    private static int[] swap(int[] array, int num1, int num2){
        int tmp = array[num1];
        array[num1] = array[num2];
        array[num2] = tmp;

        return array;
    }

    public static int[] quickSort(int[] array, int lowIndex, int highIndex){
        if(lowIndex >= highIndex){
            return array;
        }

        int pivot = array[highIndex];
        int leftPointer = lowIndex;
        int rightPointer = highIndex;


        while(leftPointer < rightPointer){
            while(array[leftPointer] <= pivot && leftPointer < rightPointer){
                leftPointer++;
            }

            while(array[rightPointer] >= pivot && leftPointer < rightPointer){
                rightPointer--;
            }

            swap(array, leftPointer, rightPointer);
        }
            swap(array, leftPointer, highIndex);
            quickSort(array, lowIndex, leftPointer -1);
            quickSort(array, leftPointer + 1, highIndex);

            return array;
    }



}
