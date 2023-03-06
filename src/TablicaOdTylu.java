public class TablicaOdTylu {

    public static void main(String[] args) {
        int[] Number = new int[] {1,3,5,7,0};

        for (int i=0; i<Number.length/2; i++) {
            int temp = Number[i];
            Number[i] = Number[Number.length -1 -i];
            Number[Number.length -1 -i] = temp;
            System.out.println("iteracja numer "+ i);  //debugowanie, można usunąć jeśli nie potrzeba debugować
        }
        for (int i=0; i<Number.length; i++) {
            System.out.println(Number[i]);
        }
    }
}
