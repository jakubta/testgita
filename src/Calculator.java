import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        int firstNumber = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        int secondNumber = scanner.nextInt();
        
        int result1 = firstNumber + secondNumber;
        System.out.println("Wynik dodawania liczby pierwszej i drugiej równy jest: " + result1);
        int result2 = firstNumber * secondNumber;
        System.out.println("Wynik mnożenie liczby pierwszej i drugiej równy jest: " +result2);

    }
}
