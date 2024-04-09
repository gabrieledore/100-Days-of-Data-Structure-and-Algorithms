import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        int[] arr = generateArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(dutchProblem(arr)));
    }

    public static int[] generateArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int length = scanner.nextInt();
        int[] array = new int[length];
        Random random =  new Random();

        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(3);
        }

        return array;
    }

    public static int[] dutchProblem(int[] array){
        int z = 0, o = 0, t = 0;

        for(int num : array){
            switch(num){
                case 0 -> z++;
                case 1 -> o++;
                case 2 -> t++;

            }
        }



        for(int i = 0; i < array.length; i++){
            if(z !=0){
                array[i] = 0;
                z--;
            } else if(o != 0){
                array[i] = 1;
                o--;
            } else{
                array[i] = 2;
            }
        }
        return array;

    }
}
