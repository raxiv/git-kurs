import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i <array.length ; i++) {
            array[i] = scanner.nextInt();
        }


        int lastElement = array[size-1];

            int[] array2 = new int[size];

        for (int i = 1; i <array.length ; i++) {
            array2[i] = array[i-1];
        }
        array2[0] = lastElement;



        for (int i = 0; i <array.length ; i++) {
            System.out.print(array2[i] + " ");
        }
    }
}