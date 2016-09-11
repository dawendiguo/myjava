public class EightQueen{
    public static void main(String[] args){
    int[] queen = {0,1,2,3,4,5,6,7};
    for(int i = 0;i < 8;i++){
        int index = (int)(Math.random()*8);
        int temp = queen[i];
        queen[i] = queen[index];
        queen[index] = temp;
    }
    for(int i = 0;i < 8;i++){
        int j = 0;
        while(j<8){
            if(queen[i]!= j)
                System.out.print(" |");
            else
                System.out.print("Q|");
            j++;
        }
        System.out.println();
    }
}
}
