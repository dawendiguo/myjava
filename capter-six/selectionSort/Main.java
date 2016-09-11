public class Main{
	public static void main(String[] args){
		double[] list = {1.2,3.4,2,4,6,5,0.2,6,98,15,45,23};
		for(int i = 0;i < list.length;i++){
			System.out.printf("%.2f ",list[i]);
		}
		MaxSelectionSort.maxSelectionSort(list);
        System.out.println();
		for(int i = 0;i < list.length;i++){
			System.out.printf("%.2f ",list[i]);
		}
        System.out.println();
	}
}
