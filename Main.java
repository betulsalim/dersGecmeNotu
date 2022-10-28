import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int mat,fizik,turkce,kimya,muzik;
        float toplam,derNotu;

        Scanner input = new Scanner(System.in);

        System.out.println("Sırasıyla matematik , fizik , türkçe , kimya ve müzik motlarını giriniz:  ");
        mat = input.nextInt();
        fizik = input.nextInt();
        turkce = input.nextInt();
        kimya = input.nextInt();
        muzik = input.nextInt();
        if(mat>100 || mat<0) {
            System.out.println("Geçersiz sayı girdiniz.");
        }
            if (fizik > 100 || fizik < 0) {
                System.out.println("Geçersiz sayı girdiniz.");
            }
            if (muzik > 100 || muzik < 0) {
                System.out.println("Geçersiz sayı girdiniz.");
            }
            if (turkce > 100 || turkce < 0) {
                System.out.println("Geçersiz sayı girdiniz.");
            }
            if (kimya > 100 || kimya < 0) {
                System.out.println("Geçersiz sayı girdiniz.");
            } else {


                toplam = mat + fizik + turkce + muzik + kimya;
                derNotu = toplam / 5;
                if (derNotu >= 55) {
                    System.out.println("Sınıfı geçtiniz: "+derNotu);
                } else {
                    System.out.println("Geçemediniz.: "+derNotu);
                }
            }
        
    }
}
