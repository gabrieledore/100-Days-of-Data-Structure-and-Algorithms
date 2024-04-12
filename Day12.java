import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(binarySearch(arr));
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
        Arrays.sort(array);
        return array;
    }


    public static boolean binarySearch(int[] array){
        int length = array.length-1;
        int min = 0;
        int max = length;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value to search");
        int number = scanner.nextInt();
        boolean result = false;
        while (max - min > 0){
            if(array[max/2] == number){
                result = true;
                break;
            } else{
                if(number > array[max/2]){
                    min +=1;
                } else {
                    max-=1;
                }
            }
        }
        return result;
    }


}
