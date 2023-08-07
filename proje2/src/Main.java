// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double x = 1.0;
        double y = 0.0;

        if(x > 0) {
            if(y > 0){
                System.out.println("nokta 1. düzlemde");
            } else if (y < 0) {
                System.out.println("nokta 4. düzlemde");
            }else {
                System.out.println("nokta pozitif x ekseni üzerinde");
            }
        } else if (x < 0) {
            if(y > 0) {
                System.out.println("nokta 2. düzlemde");
            } else if (y < 0) {
                System.out.println("nokta 3. düzlemde");
            }else {
                System.out.println("nokta negatif x ekseni üzerinde");
            }
        }
        else if (x == 0 ){
            if(y > 0){
                System.out.println("nokta pozitif y ekseni üzerinde");
            }else if (y < 0){
                System.out.println("nokta negatif y ekseni üzerinde");
            }else {
                System.out.println("nokta orjinde");
            }


        }

    }
}