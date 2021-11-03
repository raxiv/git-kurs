package tictactoe;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        char[] array = {'_','_','_','_','_','_','_','_','_'};
        char[][] multi = {
                {'_','_','_'},
                {'_','_','_'},
                {'_','_','_'}
        };
        printMulti(multi);
        boolean flag = true;
        boolean mark = true;

        int x = 0;
        int y = 0;
        while(flag){
            System.out.println("Enter the coordinates:");
          String cord = scanner.nextLine();
          char[] chars = cord.toCharArray();
           x = Integer.parseInt(String.valueOf(chars[0]));
           y = Integer.parseInt((String.valueOf((chars[2]))));


             if(x<1 || x >3 ||y<1 || y >3 ){
                System.out.println("Coordinates should be from 1 to 3!");
            }else if(multi[x-1][y-1]!='_'){
                System.out.println("This cell is occupied! Choose another one!");
            }else{
                 if(mark){
                     multi[x-1][y-1]='X';
                     mark = false;
                 }else{
                     multi[x-1][y-1]='O';
                     mark= true;
                 }
                 char[] arrays = multiToOne(multi);
                 printMulti(multi);
                 if(whoWinFinal(arrays)){
                     flag =false;
                 }



            }
        }






    }

    public static char[] multiToOne(char[][] multi){
        char[] returned = {multi[0][0],multi[0][1],multi[0][2],multi[1][0],multi[1][1],multi[1][2],
                multi[2][0],multi[2][1],multi[2][2]};

        return returned;
    }

public static void printMulti(char[][] array){
    System.out.println("---------");
    System.out.println("| " + array[0][0] + " " + array[0][1]+ " " + array[0][2] + " |");
    System.out.println("| " + array[1][0] + " " + array[1][1]+ " " + array[1][2] + " |");
    System.out.println("| " + array[2][0] + " " + array[2][1]+ " " + array[2][2] + " |");
    System.out.println("---------");
}


    public static void printGame(char[] array){
        System.out.println("---------");
        System.out.println("| " + array[0] + " " + array[1]+ " " + array[2] + " |");
        System.out.println("| " + array[3] + " " + array[4]+ " " + array[5] + " |");
        System.out.println("| " + array[6] + " " + array[7]+ " " + array[8] + " |");
        System.out.println("---------");
    }



    public static boolean whoWinFinal(char[] array){
        if(whoWin2(array,'O')){
            System.out.println("O wins");
            return true;
        }else if(whoWin2(array,'X')){
            System.out.println("X wins");
            return true;
        }else if(isDraw(array)==1){
        System.out.println("Draw");
        return true;
    }
        return false;
    }
    public static void whoWin(char[] array) {

        if(whoWin2(array,'O') && whoWin2(array,'X')){
            System.out.println("Impossible");

        }else{
            if(whoWin2(array,'O')){
                System.out.println("O wins");
            }else if(whoWin2(array,'X')){
                System.out.println("X wins");
            }else if(isDraw(array)==1){
                System.out.println("Draw");
            }else if(isEmpty(array) && isRight(array)){
                System.out.println("Game not finished");
            } else{
                System.out.println("Impossible");
            }
        }

}


public static boolean isRight(char[] array){

        int xCount = 0;
        int oCount = 0;

    for (int i = 0; i <array.length ; i++) {
        char temp = array[i];
        if(temp=='X'){
            xCount++;
        }else if(temp=='O'){
            oCount++;
        }
    }

    if(Math.abs(xCount-oCount)>1){
        return false;
    }
    return true;
}

public static int isDraw(char[] array){
        int xCount = 0;
        int oCount = 0;

    for (int i = 0; i <array.length ; i++) {
        if(array[i]=='X'){
            xCount++;
        }else if(array[i] == 'O'){
            oCount++;
        }

        if(xCount+oCount==9){
            return 1;
        }
    }
    return -1;
}



public static boolean isEmpty(char[] array){
    for (int i = 0; i <array.length ; i++) {
        if(array[i] == '_'){
            return true;
        }
    }
    return false;
}


public static boolean whoWin2(char[] array, char mark) {
    if ((array[0] == mark && array[1] == mark & array[2] == mark)
            || (array[3] == mark && array[4] == mark & array[5] == mark)
            || (array[6] == mark && array[7] == mark & array[8] == mark)

            || (array[0] == mark && array[3] == mark & array[6] == mark)
            || (array[1] == mark && array[4] == mark & array[7] == mark)
            || (array[2] == mark && array[5] == mark & array[8] == mark)


            || (array[0] == mark && array[4] == mark & array[8] == mark)
            || (array[2] == mark && array[4] == mark & array[6] == mark)) {
        return true;
    }
    return false;
}
}