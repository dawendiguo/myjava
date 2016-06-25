import java.util.Scanner;

public class DecimalToHexConversion{
    public static  void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer number: ");
        int number = input.nextInt();
        System.out.println("The integer "+ number +" chang to HexDecimal is "+ hex(number));
    }
    public static String hex(int number){
        String hex = "";

        while(number != 0){
            int hexValue = number % 16;
            number /= 16;
            hex = tohexChar(hexValue) + hex;
        }

        return hex;
    }

    public static char tohexChar(int number){
        if(number <= 9&& number >=0)
            return (char)(number+'0');
        else
            return (char)(number+'A'-10);
    }
}
