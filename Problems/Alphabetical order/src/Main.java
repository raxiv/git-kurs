import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String[] array = text.split(" ");
        boolean flag = false;
        String result ="false";

        for (int i = 0; i < array.length-1 ; i++) {
            if((array[i].compareTo(array[i+1])<0)){
                result="true";
            }else if((array[i].compareTo(array[i+1])==0)){
                result = "true";
            }else{
                result="false";
            }
        }

        System.out.println(result);
    }
}