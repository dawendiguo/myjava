package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker{
        private PageMaker(){      //same as Database class, can't create with new keyword

        }

        // make welcome page
        public static void makeWelcomePage(String mailAddr,String filename){
                try{
                        Properties mailProp = Database.getProperties("maildata");
                        String username = mailProp.getProperty(mailAddr);
                        HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
                        writer.title("Welcome to " + username + "'s Page");
                        writer.paragraph(username + "欢迎来到" + username + "主页");
                        writer.mailto(mailAddr,username);
                        writer.close();
                        System.out.println(filename + " is created for " + mailAddr + " (" + username + ")");
                }catch(IOException e){
                        e.printStackTrace();
                }
        }
}
