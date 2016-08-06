public class StatisticChar{
    public static void main(String[] args){
        char[] chars = createArray();

        System.out.println("The lowercase letters are : ");
        displayArray(chars);

        int[] counts = countLetters(chars);

        System.out.println();
        System.out.println("The occurrences of each letter are:");
        displayCounts(counts);
        System.out.println();
    }

    public static char[] createArray(){
        char[] chars = new char[100];

        for(int i=0;i<100;i++)
            chars[i]=(char)('a'+(Math.random()*('z'-'a'+1)));
        return chars;
    }

    public static void displayArray(char[] chars){
        for(int i = 0;i<chars.length;i++){
            if((i+1)%20==0)
                System.out.println(chars[i]);
            else
                System.out.print(chars[i] +" ");
        }
    }

    public static int[] countLetters(char[] chars){
        int[] counts = new int[26];

        for(int i=0;i<chars.length;i++){
            counts[chars[i]-'a']++;
        }

        return counts;
    }

    public static void displayCounts(int[] chars){
        for(int i=0;i<chars.length;i++){
            if((i+1)%10==0)
                System.out.println(chars[i]+ ":" + (char)(i+'a')+" ");
            else
                System.out.print(chars[i]+":"+(char)(i+'a')+" ");
        }
    }
}
