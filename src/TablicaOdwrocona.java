public class TablicaOdwrocona {
   //Wypisywanie tablicy od tyłu
    public static void main(String[] args) {

        int[] Numer= new int[] {1,3,5,7,0};

        for (int i = Numer.length - 1; i < Numer.length && i>=0; i--) {
            System.out.println(Numer[i]);
        }
    }
}
