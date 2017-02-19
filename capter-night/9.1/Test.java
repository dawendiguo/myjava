public class test{
    public static void main(String[] args){
        String s1 = "wellcome to Java";
        String s2 = s1;
        String s3 = new String("wellcome to Java");
        String s4 = "wellcome to Java";

        System.out.print("s1 == s2 " + s1 == s2 + "\n s2 == s3"+s2 == s3
                +"\n s1.equals(s2)"+ s1.equals(s2)+"\ns2.equals(s3)"+s2.equals(s3)+
                "\ns1.compareTo(s2)"+s1.compareTo(s2)+"\nS2.compareTo(s3)"+s2.compareTo(s3)+
                "\ns1 == s4"+s1 == s4+"\ns1.charAt(0)"+s1.charAt(0)
                );
    }
}
