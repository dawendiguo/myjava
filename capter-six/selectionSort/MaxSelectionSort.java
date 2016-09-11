public class MaxSelectionSort{
    public static void maxSelectionSort(double[] number){
        for(int i = number.length-1;i >= 1;i--){
            double maxNumber = number[i];
            int maxIndex = i;
            for(int j = i-1;j >= 0 ;j--){
                if(number[j]>maxNumber){
                    maxNumber = number[j];
                    maxIndex = j;
                }
            }
            if(maxIndex != i){
                number[maxIndex]=number[i];
                number[i]=maxNumber;
            }
        }
    }
}
