public class podzielnePrzezTrzy {

    public static void main(String[] args) {
       // wypisywanie wszystkich liczb podzielnych przez 3 do 100
        int number = 100;
        for (int i=1; i<=number; i++ ) {
            if (i%3==0) {
                System.out.println(i);
            }
        }
    }
}
