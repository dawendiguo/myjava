public class Main{
        public static void main(String[] args){
                Display b1 = new StringDisplay("Hello,world");
                Display b2 = new SideBorder(b1,'#');
                Display b3 = new FullBorder(b2);

                b1.show();
                b2.show();
                b3.show();
                Display b4 = 
                              new SideBorder(
                                              new FullBorder (
                                                      new FullBorder(
                                                              new SideBorder(
                                                                      new FullBorder(
                                                                              new StringDisplay("Hellow,World")
                                                                              )
                                                                      ,'*'
                                                                    )
                                                              )
                                                      )
                                              ,'/');
                b4.show();
        Display b5 =
                new SideBorder(
                                new UpDownBorder(
                                        new FullBorder(
                                                new StringDisplay("Hello,World")
                                                )
                                        ,'=')
                                ,'|');
        b5.show();
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Hello,morning");
        md.add("Hello,afterning");
        md.add("Hello,night");
        Display b6 =
                new SideBorder(
                                new UpDownBorder(
                                        new FullBorder(
                                                md
                                                )
                                        ,'=')
                                ,'|');

        b6.show();

        MultiStringDisplay  me = (MultiStringDisplay)md.clone();
        me.remove("Hello,night");
        Display b7 =
                new SideBorder(
                                new UpDownBorder(
                                        new FullBorder(
                                                me
                                                )
                                        ,'=')
                                ,'|');

        b7.show();
        md.remove("Hello,night");
        Display b8 =
                new SideBorder(
                                new UpDownBorder(
                                        new FullBorder(
                                                md
                                                )
                                        ,'=')
                                ,'|');

        b8.show();
        }
}
