import java.util.Scanner;
public class EarningCalc {
    public static void main (String... args){
        Scanner input =  new Scanner(System.in);
        double sales = 0.0;
        double wages = 200.00;
        double total = 0.0;
        System.out.println("Enter any negative number to end data entry");
        while(sales >= 0){
            System.out.println("Enter sales");
            sales = input.nextDouble();
            total += sales;
        }
        double salary = ((total/100)*9)+wages;
        System.out.printf("Your earning for this week is %f dollars", salary );

    }
}