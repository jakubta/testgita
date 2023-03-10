public class AutoTest {

    public static void main(String[] args) {

        Auto mercedes = new Auto();
        mercedes.marka = "Mercedes";
        mercedes.model = "klasa S";
        mercedes.rok = 2021;
        mercedes.przebieg = 1000;

        mercedes.jedz();
        mercedes.hamuj();
        mercedes.info();

        Auto audi = new Auto();
        audi.marka = "Audi";
        audi.model = "A5";
        audi.rok = 2020;
        audi.przebieg = 2100;

        audi.jedz();
        audi.hamuj();
        audi.info();

        Auto noName = new Auto();

        noName.jedz();   //dla typow obiektowych domyslana wartosc bedzie null, dla typow prostych np. int bedzie 0
        noName.hamuj();
        noName.info();

    }
}
