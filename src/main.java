import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        /*
        Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)

Çıktısı
Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
Lütfen kilonuzu giriniz : 105
Vücut Kitle İndeksiniz : 35.49215792320173
         */
        Scanner kitle = new Scanner(System.in);
        double boy,kilo,sonuc;
        System.out.print("Lutfen boyunuzu (metre cinsinde) giriniz: ");
        boy = kitle.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz: ");
        kilo = kitle.nextDouble();
        sonuc = kilo/(boy*boy);
        System.out.println("Vucut Kitle Indeksiniz : "+ sonuc);



    }
}
