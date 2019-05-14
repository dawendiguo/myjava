import java.io.*;
import java.util.Properties;

public class FileProperties extends Properties implements FileIO{
        private Properties prop = new Properties();

        public FileProperties(){

        }

        public void readFromFile(String filename)throws IOException{
                prop.load(new FileInputStream(filename));
        }

        public void writeToFile(String filename)throws IOException{
                prop.store(new FileOutputStream(filename),"written by FileProperties");
        }

        public void setValue(String key,String value){
                prop.setProperty(key,value);
        }

        public String getValue(String key){
                return prop.getProperty(key);
        }
}
