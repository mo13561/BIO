import java.util.*;
public class CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the plaintext");
        String plaintext = scanner.nextLine();
        System.out.println("Enter the cipher shift");
        int shift = scanner.nextInt();
        ArrayList<Character> cipherArray = new ArrayList<>();
        for (int i = 0; i < plaintext.length(); i++) {
            int j = plaintext.charAt(i) + shift;
            if (j > 122) {
                j = 96 + (j-122);
            } else if (j < 97) {
                j = 123 - (97 - j);
            }
            char newChar = (char) j;
            if (plaintext.charAt(i) == ' ') {
                newChar = ' ';
            }
            cipherArray.add(newChar);
        }
        for (Character ch: cipherArray) {
            System.out.print(ch);
        }
    }
}
