import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.print("Harmonik sayıyı giriniz:");
        int harmonikSayi=input.nextInt();
        double toplam=0;

        for (int i=1; i<=harmonikSayi; i++){
            toplam+=(1.0/i);
        }
        System.out.println("Harmonik serisi:"+toplam);

    }
}