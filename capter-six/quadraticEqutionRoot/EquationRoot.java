import java.util.Scanner;
public class EquationRoot{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] eqn =new double[3];
        System.out.print("Enter equation value:(a,b,c)");
        for(int i = 0 ;i < 3;i++)
            eqn[i]=input.nextDouble();
        double[] roots = new double[2];
        int rootNumber = solveQuadratic(eqn,roots);
        if(rootNumber == 0)
            System.out.println("Sorry but the quadratic eqution hava not roots!");
        else if(rootNumber == 1)
            System.out.println("The quadratic equation hava one root :"+roots[0]);
        else
            System.out.println("The quadratic equation hava two roots :"+roots[0]+"and "+roots[1]);
    }
    public static int solveQuadratic (double[] eqn,double roots[]){
        if(eqn[1]*eqn[1]-4*eqn[0]*eqn[2]<0)
            return 0;
        else if(eqn[1]*eqn[1]-4*eqn[0]*eqn[2] == 0){
            roots[1]=roots[0] = eqn[1]/((-1)*eqn[0]*2);
            return 1;
        }
        else {
            double index = eqn[1]*eqn[1]-4*eqn[0]*eqn[2];
            roots[0] = (-eqn[1]+Math.sqrt(index))/(2*eqn[0]);
            roots[1] = (-eqn[1]-Math.sqrt(index))/(2*eqn[0]);
            return 2;
        }
    }
}
