public class LoopTable {
    public static void main(String... args){
        int counter = 1;
        System.out.print("N    N*10   N*100   N*1000");

        while(counter <= 5){
            System.out.println();
            System.out.print(counter+ "    ");
            System.out.print(counter*10+ "    ");
            System.out.print(counter*100+ "    ");
            System.out.print(counter*1000+ "    ");
            counter++;
        }
    }
}
