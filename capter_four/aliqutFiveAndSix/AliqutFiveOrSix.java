public class AliqutFiveOrSix{
    public static void main(String[] args){
        final int n1 = 5;
        final int n2 = 6;
        boolean flag = false;
        int count = 0;

        for(int i =100;i<=1000;i++){
            if((i%n1==0&&i%n2!=0)||(i%n1!=0&&i%n2==0)){
                System.out.print(i+"    ");
                flag = true;
                count++;
            }
            if(count%10==0&&flag == true){
                System.out.println();
                flag = false;
            }
        }
    }
}
