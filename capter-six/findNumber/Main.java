public class Main{
    public static void main(String[] args){
        int[] list = {2,4,7,10,11,45,50,59,60,66,66,69,70,79};

        int i = BinarySearch.binarySearch(list,2);
        int j = BinarySearch.binarySearch(list,11);
        int k = BinarySearch.binarySearch(list,12);
        int l = BinarySearch.binarySearch(list,1);
        int m = BinarySearch.binarySearch(list,3);
        System.out.println("i:"+i+"j:"+j+"k:"+k+"l:"+l+"m:"+m);
    }
}

