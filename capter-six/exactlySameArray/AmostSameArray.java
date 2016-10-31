import java.util.Scanner;

public class AmostSameArray{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list1:");
        int array1number = input.nextInt();
        int[]  array1= new int[array1number];
        for(int i = 0 ;i < array1number;i++)
            array1[i]= input.nextInt();
        System.out.print("Enter list2:");
        int array2number = input.nextInt();
        int[] array2 = new int[array2number];
        for(int i = 0;i < array2number;i++)
            array2[i] = input.nextInt();
        if(equal(array1,array2))
            System.out.println("Two lists are Strictly identical");
        else
            System.out.println("Two lists are not strictly identical");
    }
    public static boolean equal(int[] array1,int[] array2){
        if(array1.length != array2.length)
            return false;
        else{
            if(!contain(array1,array2)||!contain(array2,array1))
                return false;
        }
        return true;
    }

    public static boolean contain(int[] array1,int[] array2){
        boolean re = true;
        for(int i = 0 ;i < array1.length;i++){
            for(int j = 0 ;j < array2.length;j++){
                if(array1[i] == array2[j]){
                    re = true;
                    break;
                }
                else {
                    re = false;
                    continue;
                }
            }
            if(re == false)
                break;
            else
                continue;
    }
    return re;
    }
}

