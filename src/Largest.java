import java.util.Scanner;
public class Largest {
    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        int counter = 0, temp = 0, largest = 0, num = 0;
        while(counter<=10){
            System.out.println("Enter number");
            num = input.nextInt();
            counter++;
            if(num > temp){
                temp = num;
                largest = num;
            }
        }
        System.out.println(largest);
    }
}
