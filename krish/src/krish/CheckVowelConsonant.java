//8.Write a program to input any alphabet and check whether it is vowel or consonant
package krish;
import java.util.Scanner;

public class CheckVowelConsonant {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an alphabet: ");
        char alphabet = scanner.next().charAt(0);

        if (alphabet == 'a' || alphabet == 'e' || alphabet == 'i' || alphabet == 'o' || alphabet == 'u') {
            System.out.println(alphabet + " is a vowel.");
        } else {
            System.out.println(alphabet + " is a consonant.");
        }
    }
}