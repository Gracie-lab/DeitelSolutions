public class Palindrome {
    private int number, originalNum, reverseCount = 0, remainder;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getOriginalNum() {
        return originalNum;
    }

    public void setOriginalNum(int originalNum) {
        this.originalNum = originalNum;
    }


    public void checkPalindrome(){
        for( ; number>0; number /= 10) {
            remainder = number % 10;
            reverseCount = (reverseCount * 10) + remainder;
        }
            if (originalNum == reverseCount)
            System.out.println(originalNum+ " is palindrome.");
        else
            System.out.println(originalNum+ " is not palindrome.");
    }


}
