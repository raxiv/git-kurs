import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[][] array = new String[n][n];

        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                if( (i ==j) || (i==n-j-1)  || (i==n/2) || (j==n/2) ){
                    System.out.print( "*");
                    System.out.print(" ");
                }else{
                    System.out.print(".");
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}