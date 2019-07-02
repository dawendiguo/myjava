public class Main{
        public static void main(String[] args){
                  try{
                System.out.println("Making root entries : .......");
                Directory rootDir = new Directory("root");
                Directory binDir = new Directory("bin");
                Directory usrDir = new Directory("usr");
                Directory tmpDir = new Directory("tmp");

                rootDir.add(binDir);
                rootDir.add(tmpDir);
                rootDir.add(usrDir);
                binDir.add(new File("vi",10000));
                binDir.add(new File("latex",20000));

                rootDir.printList("/");
                  }
                  catch(FileTreatmentException e){
                          e.printStackTrace();
                  }
        }
}
