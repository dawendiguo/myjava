import java.io.*;

public class Main{
        public static void main(String[] argc){
                FileIO f = new FileProperties();
                try{
                        f.readFromFile("file.txt");
                        f.setValue("year","2004");
                        f.setValue("month","4");
                        f.setValue("day","21");
                        f.writeToFile("newFile.txt");
                }catch(IOException e){
                        e.printStackTrace();
                }
        }
}
