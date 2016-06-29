public class RandomChar{
    public static char getChar(char ch1,char ch2){
        char ch = (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
        return ch;
    }
    public static char getLowercase(){
        return getChar('a','z');
    }
    public static char getUppercase(){
        return getChar('A','Z');
    }
    public static char getDigitCharacter(){
        return getChar('0','9');
    }
    public static char getRandomCharacter(){
        return getChar('\u0000','\uFFFF');
    }
}

