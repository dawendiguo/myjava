import java.util.Scanner;

public class DecToHex{
    public static char tochar(int i){
        switch(i){
            case  10:
               return 'A';
            case 11:
               return 'B';
            case 12:
               return 'C';
            case 13:
               return 'D';
            case 14:
               return 'E';
            case 15:
               return 'F';
        default:
                return '*';
    }
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please input a Dec number:");
        int number = input.nextInt();
        int numberCopy = number;
        char[] hexString = new char[50];
        int len = 0 ;
        while(numberCopy!=0){
            if(numberCopy%16>9)
                hexString[len]=tochar(numberCopy%16);
            else
                hexString[len]=(char)(numberCopy%16+'0');
            len++;
            numberCopy /= 16;
        }
            System.out.print("The Dec "+number+" chang to Hex is: ");
        for(int i = len-1;i>=0;i--)
            System.out.print(hexString[i]);
    }
}


