public class Ucgen {
    int yukseklik = 5;
    int tabanAlani = 10;

     static int ucgenCevre(int birinciKenar, int ikinciKenar, int tabanAlani){
        return birinciKenar + ikinciKenar + tabanAlani;
    }

    int ucgenAlan(){
         return tabanAlani * yukseklik / 2;
    }
}
