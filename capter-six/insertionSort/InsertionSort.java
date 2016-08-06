public class InsertionSort{
	public static void main(String[] args){
		double[] list = {1.2,12 ,434,45,5.6,45,0.2,34,1121212,56,4.6,7777};
		insertionSort(list);
		for(int i = 0;i < list.length;i++)
			System.out.printf("%.2f ",list[i]);
	}

	public static void insertionSort(double[] list){
		for(int i = 1;i < list.length;i++){
			double currentElement = list[i];
			int k ;
			for(k = i-1; k>= 0&&list[k] > currentElement;k--){
				list[k+1]=list[k];
			}

			list [k+1] = currentElement;
		}
	}
}

