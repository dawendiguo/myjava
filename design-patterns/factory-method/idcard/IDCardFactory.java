package idcard;

import framework.*;
import java.util.*;

public class IDCardFactory extends Factory{
        private List owners = new ArrayList();
        private List ids = new ArrayList();

        protected Product createProduct(String owner){
                return new IDCard(owner);
        }

        protected void registerProduct(Product product){
                owners.add(((IDCard)product).getOwner());
                ids.add(((IDCard)product).getId());
        }
        public List getOwners(){
              return owners;
        }

        public List getIDs(){
                return ids;
        }
}
