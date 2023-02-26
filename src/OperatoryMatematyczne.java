//Operatory matematyczne umożliwiają wykonanie podstawowych operacji matematycznych
public class OperatoryMatematyczne {

    public static void main(String[] args) {
        int firstNumber = 4;
        int secondNumber = 6;
        float thirdNumber = 4.0F;

        int addition = firstNumber + secondNumber; // 10
        int subtraction = firstNumber - secondNumber; // -2
        int multiplication = firstNumber * secondNumber; // 24
        float division = thirdNumber/secondNumber; //0,66 , jeśli damy int z firstNumber to wyjdzie zero bo int to liczba stała
        int mod = secondNumber%firstNumber; // 4 mieści się w 6 1, 2

        System.out.println("wynik dodawania " + addition);  // w tym przypadku typ danych int addition zostanie przekonwertowany do Stringa i zostanie pokazany jako ciąg znaków
        System.out.println ("wynik odejmowania " + subtraction);
        System.out.println("Dzielenie " + division);  // wyszło 0, dostaliśmy liczbę całkowitą
        System.out.println("Mnożenie " + multiplication);
        System.out.println ("Modulo " + mod);

        firstNumber+=secondNumber; // firstNumber = firstNumber + secondNumber  --> firstNumber po tym będzie nadpisany
        System.out.println("Po dodaniu " + firstNumber); //10
        firstNumber-=secondNumber; // firstNumber - secondNumber
        System.out.println("po odejmowaniu " + firstNumber);  // 10 -6 = 4
        firstNumber*=secondNumber; //firstNumber * secondNumber
        System.out.println("po mnożeniu " + firstNumber); //24
        firstNumber/=secondNumber; //firstNumber / secondNumber
        System.out.println("po dzieleniu " + firstNumber); // 4
        firstNumber%=secondNumber; //firstNumber % secondNumber
        System.out.println("po modulo " + firstNumber); //4


    }
}
