import javax.swing.JOptionPane;

public class Celstofhr{
public static void main(String[] args){
String cel = JOptionPane.showInputDialog(null,"Enter the celsius degree","degree",JOptionPane.QUESTION_MESSAGE);
double celdegree = Double.parseDouble(cel);
double fhr =  (9.0/5) * celdegree +32;
String output = "The fhrdegree is " + fhr;

JOptionPane.showMessageDialog( null , output);
}
}
