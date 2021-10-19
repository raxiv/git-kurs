import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);



        int numberOfRows = scanner.nextInt();
        int numberOfColumns = scanner.nextInt();
        int[][] array = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i <numberOfRows ; i++) {
            for (int j = 0; j <numberOfColumns ; j++) {
                array[i][j] = scanner.nextInt();
            }
        }



        int k = scanner.nextInt();


        int foundROw = 0;
        int counter = 0;

        for (int i = 0; i <numberOfRows ; i++) {
            counter=0;
            for (int j = 0; j <numberOfColumns ; j++) {
                //System.out.println(array[i-1][j]);
                if(array[i][j]==0){
                  counter++;
                    if(counter == k){
                        System.out.println(i+1);
                        return;
                    }
                }else{
                    counter=0;
                    continue;
                }
            }


        }
        if(counter == k){
            System.out.println(foundROw);
        }else{
            System.out.println(0);
        }



    }
}