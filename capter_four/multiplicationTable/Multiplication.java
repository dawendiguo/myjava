public class Multiplication{
    public static void main(String[] args){
        System.out.println("        Multiplication Table        \n");

        for(int i = 1;i < 10;i++){
            for(int j = i;j<10;j++){
                System.out.printf(i+" * "+j+" = %2d",(i * j));
                System.out.printf("  ");
            }
            System.out.println();
        }
    }
}

