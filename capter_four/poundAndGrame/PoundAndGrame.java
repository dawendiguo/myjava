public class PoundAndGrame{
    public static void main(String[] args){
        System.out.println("kilogrames"+"   "+"pound"+"     "+"pound"+"     "+"kilograms");
        for(int kgrame = 1,pound = 20;kgrame < 200;kgrame+=2,pound+=5){
            System.out.println(kgrame+"     "+kgrame*2.2+"      "+pound+"       "+pound/2.2);
        }
    }
}
