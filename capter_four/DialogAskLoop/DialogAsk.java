import javax.swing.JOptionPane;

public class DialogAsk{
    public static void main(String[] args){
        int sum=0;
        int option = JOptionPane.YES_OPTION;
        while(option == JOptionPane.YES_OPTION){
            String dateString = JOptionPane.showInputDialog(null,"Ent a Int value :");
            int data = Integer.parseInt(dateString);

            sum+=data;
            option = JOptionPane.showConfirmDialog(null,"continue");
        }
        JOptionPane.showMessageDialog(null,"The sum is "+sum);
    }
}
