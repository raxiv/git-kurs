package tictactoe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        String symbols = scanner.nextLine();

        char[] array = symbols.toCharArray();
SFSF
        System.out.println("---------");
        System.out.println("| " + array[0] + " " + array[1]+ " " + array[2] + " |");
        System.out.println("| " + array[3] + " " + array[4]+ " " + array[5] + " |");
        System.out.println("| " + array[6] + " " + array[7]+ " " + array[8] + " |");
        System.out.println("---------");

    }
}
