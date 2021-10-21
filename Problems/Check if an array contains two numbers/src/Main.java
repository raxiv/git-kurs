import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i <array.length ; i++) {
            array[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        boolean flag = false;

        for (int i = 0; i <array.length-1 ; i++) {
            if((array[i] == n && array[i+1]==m) || (array[i] == m && array[i+1]==n) ){
                flag = true;
            }
        }
        System.out.println(" " + flag);
    }
}