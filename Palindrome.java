import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        String exitword = "";
        Scanner in = new Scanner(System.in);
        do {
            System.out.print("Input word: ");
            String word = in.nextLine();
                if (isPalindrome(word)) {
                    System.out.println(word + " is a palindrome");
                    System.out.println("New word? yes/exit");
                    exitword = in.nextLine();
                } else {
                    System.out.println(word + " isn't a palindrome");
                    System.out.println("New word? yes/exit");
                    exitword = in.nextLine();
                }
        } while (exitword.equals("yes"));
        in.close();
    }
    public static String reverse(String reverseString) {
        String rev = "";

        for (int i = reverseString.length() - 1; i >= 0; i--) {
            rev = rev + reverseString.charAt(i);
        }

        return rev;
    }
    public static boolean isPalindrome(String s) {
        String rev = reverse(s);
        if (rev.equals(s)) {
            return true;
        } else {
            return false;
        }
    }
} 