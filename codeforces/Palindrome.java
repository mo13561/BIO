import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word you wish to determine is a palindrome:");
        String protoPalindrome = scanner.nextLine().trim();
        ArrayList<Character> reversedWord = new ArrayList<Character>();
        for (int i = protoPalindrome.length() - 1; i >= 0; i--) {
            reversedWord.add(protoPalindrome.charAt(i));
        }
        boolean isPalindrome = true;
        for (int i = 0; i < reversedWord.size(); i++) {
            if (reversedWord.get(i) == protoPalindrome.charAt(i)) {
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("Your word is a palindrome");
        } else {
            System.out.println("Your word is not a palindrome");
        }
    }
}
