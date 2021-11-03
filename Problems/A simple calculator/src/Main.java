import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] array= text.split(" ");
        long x = Long.parseLong(array[0]);
        long y = Long.parseLong(array[2]);



        String choice = array[1];
        switch (choice){
            case "+":
                System.out.println(x+y);
                break;
            case "-":
                System.out.println(x-y);
                break;
            case "*":
                System.out.println(x*y);
                break;
            case "/":
                if(x==0 || y==0){
                    System.out.println("Division by 0!");
                    break;
                }else{
                    System.out.println(x/y);
                    break;
                }

            default:
                System.out.println("Unknown operator");
        }
    }
}