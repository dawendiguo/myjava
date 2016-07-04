public class CircleSinAndCos{
    public static void main(String[] args){
        System.out.print("angle             Sin           Cos\n");
        for(int i = 0;i<= 360;i+=10)
            System.out.printf("%d\t\t%.4f\t\t%.4f\n",i,Math.sin(i*2*Math.PI/360),Math.cos(i*2*Math.PI/360));
    }
}
