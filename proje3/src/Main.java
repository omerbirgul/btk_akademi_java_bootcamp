import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        egriBul();


    }
    public static int egriBul(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. eğrinin değerlerini girin");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("2. eğrinin değerlerini girin");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        if(x2 - x1 == 0){
            System.out.println("hatalı islem");
            return 0;
        }
        return (y2-y1) / (x2-x1);
    }
}