public class Main{
    public static void main(String[] args){
        final int NUMBER_OF_CHAR = 175;
        final int CHAR_PER_LINE = 25;

        for(int i = 0 ;i < NUMBER_OF_CHAR;i++){
            char ch = RandomChar.getLowercase();
            if( (i+1)%CHAR_PER_LINE==0)
                System.out.println(ch);
            else
                System.out.print(ch);
        }
        System.out.println();
    }
}
