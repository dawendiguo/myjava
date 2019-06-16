import framework.*;
import idcard.*;
import java.util.*;
public class Main{
        public static void main(String[] args){
              Factory factory = new IDCardFactory();
              Product card1 = factory.create("Xiao Ming");
              Product card2 = factory.create("Xiao Hong");
              Product card3 = factory.create("Xiao Gang");
              card1.use();
              card2.use();
              card2.use();
              List owners =((IDCardFactory)factory).getOwners();
              List ids = ((IDCardFactory)factory).getIDs();

              for(int i = 0;i < owners.size();i++)
                      System.out.println("owner:"+owners.get(i)+
                                      "ID: "+ids.get(i));
        }
}
