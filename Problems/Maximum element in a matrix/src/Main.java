import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array = new int[n][m];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
                array[i][j] = scanner.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int a = 0;
        int b = 0;

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <m ; j++) {
               if(array[i][j]>max){
                   max = array[i][j];
                   a=i;
                   b=j;
               }
            }
        }


        System.out.println(a + " " +b);



    }
}