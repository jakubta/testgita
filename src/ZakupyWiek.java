import java.util.Scanner;

public class ZakupyWiek {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj wiek");
        int firstNumber = scanner.nextInt();
        if (firstNumber < 18 && firstNumber >=0) {
            System.out.println("Niestety nie możesz kupic alkoholu");
        } else if (firstNumber < 0){
            System.out.println("Podałeś wartość ujemną, wiek nie może być wartością ujemną");
        } else {
            System.out.println("Zapraszamy do zakupów");
        }
    }

}
