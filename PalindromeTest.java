package excercise;
import java.util.Stack;
import java.util.Scanner;
class PalindromeTest {
    public static void main(String[] args) {

        System.out.print("Enter a word of your choice:");
        Scanner in=new Scanner(System.in);
        String newString = in.nextLine();
        Stack newStack = new Stack();

        for (int i = 0; i < newString.length(); i++) {
            newStack.push(newString.charAt(i));
        }
        String reverse = "";

        while (!newStack.isEmpty()) {
            reverse = reverse+newStack.pop();
        }

        if (newString.equals(reverse))
            System.out.println("The input word is a palindrome.");
        else
            System.out.println("The input word is not a palindrome.");

    }

}