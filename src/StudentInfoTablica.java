import java.util.Scanner;

public class StudentInfoTablica {

    public static void main(String[] args) {

        Student Andrzej = new Student();
        Andrzej.imie = "Andrzej";
        Andrzej.nazwisko = "Pilecki";
        Andrzej.nick = "andpil";
        Andrzej.email = "andrzej.pilecki@student.com";
        Andrzej.numerIndeksu = 171459;

        Student Jan = new Student();
        Jan.imie = "Jan";
        Jan.nazwisko = "Tarka";
        Jan.nick = "jantar";
        Jan.email = "jan.tarka@student.com";
        Jan.numerIndeksu = 171460;

        Student Tomasz = new Student();
        Tomasz.imie = "Tomasz";
        Tomasz.nazwisko = "Krol";
        Tomasz.nick = "tomkro";
        Tomasz.email = "tomasz.krol@student.com";
        Tomasz.numerIndeksu = 171461;

        Student[] studenci = new Student[3];  //dla tablicy studenci typ danych w tym przypadku zamiast Stringa to Student czyli nasza klasa
        studenci[0] = Andrzej;
        studenci[1] = Jan;
        studenci[2] = Tomasz;

        for (int i=0; i< studenci.length; i++){

            studenci[i].przedstawSie();
            studenci[i].zalogujSie();
            studenci[i].podajNumerIndeksu();
            studenci[i].podajEmail();

        }
    }
}
