import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day6 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));
        System.out.println("===============");
        System.out.println(Arrays.toString(binarySorting(arr)));    }

    public static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = scanner.nextInt();


        int[] array = new int[length];
        Random random = new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(2);
        }


        return array;
    }

    public static int[] binarySorting(int[] array){
        int j = 0;
        int k = 0;

        for(int num : array){
            switch(num){
                case 0 -> j++;
                case 1 -> k++;
            }
        }


        for(int i = 0; i < array.length; i++){
            if(j != 0){
                array[i] = 0;
                j--;
            } else{
                array[i] = 1;
                k--;
            }
        }

        

        return array;
    }
}
