public class Strings {

    public static Boolean palindrome(String str){
        String buff = new StringBuilder(str.substring((int)Math.ceil(str.length() / 2.0), str.length())).reverse().toString();
        if(str.substring(0, str.length() / 2).equals(buff)) {
            return true;
        }
        return false;
    }

    public static int counter(String str, String x){
        return str.length() - str.replace(x, "").length();
    }

    public static boolean isAlpha(String str) {
        char[] chars = str.toCharArray();
        for (char i : chars) {
            if(!Character.isLetter(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDigit(String str) {
        char[] chars = str.toCharArray();
        for (char i : chars) {
            if(!Character.isDigit(i)) {
                return false;
            }
        }
        return true;
    }

    public static String splitting(String str){
        String buff = "";
        for ( char i :  str.toCharArray()){
            if (i == Character.toUpperCase(i) && !buff.isEmpty() && Character.isLetter(i)) {
                buff += " ";
            }
            if (i == '_') i = ' ';
            buff += i;
        }
        return buff;
    }
}
