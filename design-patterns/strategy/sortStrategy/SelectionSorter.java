public class SelectionSorter implements Sorter{
        public void sort(Comparable[] data){
                for(int i = 0;i < data.length;i++){
                          int min = i;  
                        for(int j = i+1;j<data.length;j++){
                                if(data[min].compareTo(data[j]) > 0)
                                        min = j;
                        }
                        Comparable temp = data[i];
                        data[i] = data[min];
                        data[min]=temp;
                }
        }
}
