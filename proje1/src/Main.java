import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Dersin Adını Girin:");
        String dersinAdi = scanner.nextLine();
        System.out.println("Vize Notunu Girin:");
        int vizeNotu = scanner.nextInt();
        System.out.println("Final Notunu Girin:");
        int finalNotu = scanner.nextInt();


        int ortalama = (vizeNotu*40 /100) + (finalNotu*60/100);

        System .out.println("Dersin Adı:"+ dersinAdi );
        System.out.println("Ortalama: " + ortalama);





        }


}

