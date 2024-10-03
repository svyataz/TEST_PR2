public class Strings {
    public static void main(String[] args) {
        String str = "Aasdfasdfsdaf_sddfsafsdFsd5334fsefsddf_fsfsdsdff_fsdfFsdfFFF";
        System.out.println(palindrome(str));
        System.out.println(counter(str, "f"));
        System.out.println(isAlpha(str));
        System.out.println(isDigit(str));
        System.out.println(splitting(str));
    }

    public static Boolean palindrome(String str){
        String buff = new StringBuilder(str.substring(str.length() / 2, str.length())).reverse().toString();
        if(str.substring(0, str.length() / 2).equals(buff)) {
            return true;
        }
        return false;
    }

    public static int counter(String str, String x){
        return str.length() - str.replace(x, " ").length();
    }

    public static boolean isAlpha(String str) {
        char[] chars = str.toCharArray();
        for (char i : chars) {
            if(Character.isLetter(i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDigit(String str) {
        char[] chars = str.toCharArray();
        for (char i : chars) {
            if(Character.isDigit(i)) {
                return true;
            }
        }
        return false;
    }

    public static String splitting(String str){
        String buff = "";
        for ( char i :  str.toCharArray()){
            if (i == Character.toUpperCase(i) && !buff.isEmpty() && Character.isLetter(i)) {
                buff += " ";
            }
            buff += i;
        }
        return buff;
    }
}
