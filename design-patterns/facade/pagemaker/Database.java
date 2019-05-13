package pagemaker;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database{
        private Database(){     //防止外部new出Database的实例，所以是private

        }
      
        //database is a file not a real database
        public static Properties getProperties(String dbname){    
          String filename = dbname+".txt";
          Properties prop = new Properties();
          try{
                  prop.load(new FileInputStream(filename));
          }catch(IOException e){
                  System.out.println("Warning: "+filename+" is not found.");
          }
          return prop;
        }
}
