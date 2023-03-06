import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę");
        int Number = scanner.nextInt();

        do {
            System.out.println("Moja wartość to: " + Number + " i jestem mniejsza niż 20");
            Number++;
        } while (Number < 20);
    }
}
