//Zmienne - Zarezerwowane miejsce w pamięci z określonym typem danych
public class Zmienne {

    String name = "Kuba";

    public static void main(String[] args) {
       /* int firstNumber, secondNumber, result;
        firstNumber = 1;
        secondNumber = 2;
        result = firstNumber + secondNumber; inny sposób na definiowanie zmienncych, drugi poniżej*/

        String name = "Kuba";
        int firstNumber = 1;
        int secondNumber = 2;
        int result = firstNumber + secondNumber;

        name = "Kasia";  // nadpisujemy tutaj zmienna name
        System.out.println(name);
        System.out.println(result);
    }
}
