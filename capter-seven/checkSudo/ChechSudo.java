import java.util.Scanner;

public class ChechSudo{
    public static void main(String[] args){
        int[][] grid = readASolution();
        System.out.println(isValid(grid) ? "Valid solution " : "Invalid solution");
    }

    public static int[][] readASolution(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for(int i = 0;i < 9;i++)
            for(int j = 0;j < 9;j++)
                grid[i][j] = input.nextInt();

        return grid;
    }

    public static boolean isValid(int[][] grid){
        for(int i = 0 ;i < 9;i++)
            if(!isTo9(grid[i]))
                    return false;

        for(int j = 0 ;j < 9;j++){
             int[] colum = new int[9];
             for(int i = 0 ;i < 9;i++)
                 colum[i] = grid[i][j];

             if(!isTo9(colum))
                 return false;
        }
        for(int i = 0;i < 1;i++){
            for(int j = 0;j < 1;j++){
                int k = 0;
                int[] list = new int[9];
                for(int row = i*3;row < i*3+3;row++)
                    for(int column = j * 3;column < j*3+3;column++){
                        list[k] = grid[row][column];
                        k++;
                    }
                if(!isTo9(list))
                    return false ;
            }
        }
        return true;
    }
    static boolean isTo9(int[] list){
        int[] temp = new int[list.length];
        System.arraycopy(list,0,temp,0,list.length);

        java.util.Arrays.sort(temp);
        for(int i = 0;i < 9;i++)
            if(temp[i] != i+1)
                return false;
        return true;
    }
}
