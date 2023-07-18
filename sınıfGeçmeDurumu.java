import java.util.Scanner;
public class sınıfGeçmeDurumu {
    public static void main(String[] args) {

        int mat, fizik, kimya, turkce,  muzik;

        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunzu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz :");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Müzik Notunuz Giriniz :");
        muzik = input.nextInt();

        double avarage = (mat + fizik + kimya + turkce + muzik)/5;
        if (avarage <= 60) {
            System.out.println("Sınıfta Kaldınız, Seneye Tekrar Deneyiniz  :( :");

        } else {
            System.out.println("Tebrikler Sınıfı Geçtiniz :) : ");
        }
        System.out.println("Ortalamanız : " + avarage);
    }
}