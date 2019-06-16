package idcard;
import framework.Product;

public class IDCard extends Product{

        private String owner;
        private static int id = 0;

        IDCard(String owner){
        System.out.println("make "+ owner +"'s ID card .");
        this.owner = owner;
        id++;
        }

        public void use(){
                System.out.println("useing " + owner +" ID card!");
        }

        public String getOwner(){
        return owner;
        }

        public int getId(){
        return id;
        }
}
