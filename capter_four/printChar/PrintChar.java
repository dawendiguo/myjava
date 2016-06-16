public class PrintChar{
    public static void main(String[] args){
        final char n1 = '!';
        final char n2 = '-';
        int count = 0;

        for(char n = '!'; n<=n2;n++){
            System.out.print(n+"    ");
            count++;
            if(count%10==0)
            System.out.println();
        }
    }
}
