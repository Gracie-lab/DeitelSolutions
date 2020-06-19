import java.util.Scanner;

public class PalindromeTest {
    public static void main(String... args){
        Palindrome check = new Palindrome();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 digit number");
        int number = input.nextInt();
        int originalNum = number;
        if(number < 10000 || number > 100000){
            System.out.println("Please enter a 5 digit number");
            number = input.nextInt();
            originalNum = number;
        }

        check.getNumber();
            check.setNumber(number);

            check.setOriginalNum(originalNum);
            check.getOriginalNum();








       check.checkPalindrome();

    }
}
