import java.util.Scanner;

public class SaveMoney{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Save Every month :");
        double monthSave = input.nextDouble();
        System.out.print("The year rate: %\b\b");
        double yearRate = input.nextDouble();
        System.out.print("The month :");
        int month = input.nextInt();

        double sum = 0;
        for(int i = 0;i<month;i++){
            sum = (sum + monthSave)*(1+yearRate/12/100);
        }
        System.out.println("you have "+sum +" money now");
    }
}

