import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        int[] arr1 = uniqueArray(generateArray());
        int[] arr2 = uniqueArray(generateArray());
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arraysIntersection(arr1, arr2)));

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

    public static int[] uniqueArray(int[] array){
        int count = 0, n = array.length;
        Arrays.sort(array);
        for(int i = 0; i < n-1; i++){
            int val = array[i];
            if(array[i+1] == array[i]){
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


    public static int[] arraysIntersection(int[] arr1, int[] arr2){
        Arrays.sort(arr1);
        int count = 0;

        for(int num : arr2){
            if(Arrays.stream(arr1).anyMatch(x -> x == num)){
                count++;
            }
        }

        int[] array = new int[count];
        int index = 0;
        for(int num : arr2){
            if(Arrays.stream(arr1).anyMatch(x -> x == num)){
                array[index] = num;
                index++;
            }
        }

        return array;
    }


}
