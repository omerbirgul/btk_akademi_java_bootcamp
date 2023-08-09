import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci öğrenci adı girin:");
        String ogrenci1ad = scanner.next();
        System.out.println("Birinci öğrenci cinsiyet girin:");
        char ogrenci1cins = scanner.next().charAt(0);
        System.out.println("Birinci öğrenci yas girin:");
        int ogrenci1yas = scanner.nextInt();
        System.out.println("Birinci öğrenci ogrenci mi?:");
        boolean ogrenci1Mi = scanner.nextBoolean();

        System.out.println("Ikinci öğrenci adı girin:");
        String ogrenci2ad = scanner.next();
        System.out.println("Ikinci öğrenci cinsiyet girin:");
        char ogrenci2cins = scanner.next().charAt(0);
        System.out.println("Ikinci öğrenci yas girin:");
        int ogrenci2yas = scanner.nextInt();
        System.out.println("Ikinci öğrenci ogrenci mi?:");
        boolean ogrenci2Mi = scanner.nextBoolean();

        ArrayList<Ogrenci> ogrenciListesi = new ArrayList<>();


        Ogrenci[] ogrenciDizisi = new Ogrenci[2];
        ogrenciDizisi[0] = new Ogrenci(ogrenci1ad, ogrenci1cins,ogrenci1yas,ogrenci1Mi);
        ogrenciDizisi[1] = new Ogrenci(ogrenci2ad,ogrenci2cins,ogrenci2yas,ogrenci2Mi);

        for( Ogrenci ogrenci: ogrenciDizisi){
            ogrenciListesi.add(ogrenci);
            System.out.println("Ogrenci ismi: " +ogrenci.isim + " Yas: " + ogrenci.yas + " Cinsiyet: "+ogrenci.cinsiyet +" Ogrenci mi? " + ogrenci.ogrenciMi );
        }




    }
}