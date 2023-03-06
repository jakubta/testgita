import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int Number1 = scanner.nextInt();

        while (Number1<20) {
            System.out.println("Moja wartość to: " + Number1 + " i jestem mniejszy niż 20");
            Number1++;
        }

    }
}
