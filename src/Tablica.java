public class Tablica {

    public static void main(String[] args) {
        String[] imiona = new String[3];
        imiona[0] = "Bartek";
        imiona[1] = "Basia";
        imiona[2] = "Michal";

        System.out.println(imiona[0]);
        System.out.println(imiona[1]);
        System.out.println(imiona[2]);

        // dla int możemy sobie od razu przypisac wartości
        int[] lottoNumbers = new int[]{1, 2, 3, 4, 5, 6};

        System.out.println(lottoNumbers[0]);
        System.out.println(lottoNumbers[1]);
        System.out.println(lottoNumbers[5]);

        System.out.println(lottoNumbers.length);  //wyprintuje długość tablicy

        for (int i = 0; i < imiona.length; i++){  // pętla for na wypisanie wszystkich elementów
            System.out.println(imiona[i]);
        }

        for (int i = 0; i < lottoNumbers.length; i++){
            System.out.println(lottoNumbers[i]);
        }
    }
}
