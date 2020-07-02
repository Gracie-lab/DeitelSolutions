public class Prime {
    private int divisor,number;
    private boolean isPrime;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }


    public void factors() {
           //for (int number=1; number < 10000; number++) {
               int check = 0;
                for (divisor = 1; divisor <= number; divisor++) {
                    if (number % divisor == 0) {
                        isPrime = false;
                        check++;

                    }
                }
               if (check == 2) {
                   isPrime = true;
                   System.out.println(number);
               }
            }
    }
}