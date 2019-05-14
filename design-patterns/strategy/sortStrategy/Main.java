public class Main{
        public static void main(String[] args){
                String[] data = {
                        "Dumpty","Bowman","Carroll","Elfland","Alice"
                };

                SortAndShow sap = new SortAndShow(data,new SelectionSorter());
                sap.execute();
        }
}
