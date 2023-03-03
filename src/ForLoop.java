public class ForLoop {

    public static void main(String[] args) {

        int number = 15;
        // i specjalna zmienna sterująca
        for (int i = 0; i < number; i=i+1) {
            //wewnątrz pętli for można dodać np. if i sprawdzic czy dana liba jest podzielna przez 5
            if (i%5==0) {
                System.out.println(i);
            }
        }
        for (int j=0; j<number;j++) {
            System.out.println("Będę robił pracę domową");
        }
    }
}
