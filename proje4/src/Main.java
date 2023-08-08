public class Main {
    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println("Diktortgen Çevre: " +dikdortgen.cevre() );
        System.out.println(" Diktortgen Alan: " + dikdortgen.alan(10,5) );


        Ucgen ucgen = new Ucgen();
        System.out.println("Ucgen Cevre: " + ucgen.ucgenCevre(7,7,7));
        System.out.println("Ucgen Alan:" + ucgen.ucgenAlan());
    }

}