//public class Palindrome {
//    public static boolean isPalindrome(String str) {
//        String reversed = new StringBuilder(str).reverse().toString();
//        return str.equalsIgnoreCase(reversed);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isPalindrome("malayalam"));  // true
//    }
//}

//CI Trigger

public class Palindrome {
    public static boolean isPalindrome(String str) {
        String cleanStr = str.replaceAll("\\s+", ""); // remove all whitespaces
        String reversed = new StringBuilder(cleanStr).reverse().toString();
        return cleanStr.equalsIgnoreCase(reversed);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("malayalam"));           // true
        System.out.println(isPalindrome("nurses run"));      // true
    }
}
