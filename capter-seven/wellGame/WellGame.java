import java.util.Scanner;

public class WellGame{
    public static void main(String[] args){
        int[][] well = new int[3][3];

        for(int i = 0;i < 3;i++)
            for(int j = 0 ;j < 3;j++)
                well[i][j] = -1;
        int flag = 1;
        do{
            show(well);
            flag = printAsk(well,flag);
           if(havaWiner(well))
               break;
           else if (isFull(well))
               break;
           else
               continue;
        }while(1>0);
    }

    static void show(int[][] well){
        for(int i = 0;i < well.length;i++){
            System.out.println("-------------");
            for(int j  = 0 ;j  < 3;j++){
                System.out.print("|"+tochar(well[i][j]));
            }
            System.out.print("|\n");
        }
            System.out.println("-------------");
    }

    static int printAsk(int[][] well,int flag){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a row (1,2,or3) for player ");
        if(flag == 1)
            System.out.print("X:");
        else
            System.out.print("O:");
        int row = input.nextInt();
        System.out.print("Enter a colum (1,2,or3) for player ");
        if(flag == 1)
            System.out.print("X:");
        else
            System.out.print("O:");
        int colum = input.nextInt();
        if(well[row][colum]== -1){
            if(flag == 1)
            well[row][colum] = 1;
        else
            well[row][colum] = 0;
        return -1*flag;
        }
        else{
            System.out.println("The point hava pieces! plese retry.");
            printAsk(well,flag);
            return flag;
        }
    }
    static boolean havaWiner(int[][] well){
        int winNumber = -1;
        boolean isHavaWinner = false;
        for(int i = 0;i<well.length;i++){
            int temp = well[i][0];
        if(temp != -1){
            for(int j = 1;j< well[i].length;j++){
                if(temp != well[i][j])
                    break;
                else if(j == (well[i].length-1)){
                    winNumber = temp;
                    isHavaWinner = true;
                }
                else
                continue;
            }
        }
        else
        continue;
        }
        for(int i = 0;i < well[0].length;i++){
            int temp = well[0][i];
            if(temp != -1){
            for(int j = 0;j < well.length;j++){
                if(temp != well[j][i])
                        break;
                else if(j == well.length-1){
                    isHavaWinner = true;
                    winNumber = temp;
                }
                else
                    continue;
            }
        }
        else
            continue;
        }
      //  int temp = well[well.length/2][well.length/2];


        if(isHavaWinner){
            show(well);
            printWon(winNumber);
        }
        if(isFull(well)&&!isHavaWinner)
            System.out.println("hava no won!");
        return isHavaWinner;
    }

    static void printWon(int winNumber){
        if(winNumber == 0)
            System.out.println("O player won!");
        else
            System.out.println("X player won!");
    }
    static String tochar(int number){
        if(number == 0)
            return "O";
        else if(number == 1)
            return "x";
        else
             return " ";
    }
    static boolean isFull(int[][] well){
        boolean temp = true;
        for(int i = 0;i < well.length;i++)
            for(int j = 0 ;j < well[i].length;j++)
                if(well[i][j] == -1)
                    temp = false;
        return temp;
   }
}
