import java.util.Scanner;

/*
Vücut Kitle İndeksi Hesaplama
Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının
"Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

Formül
Kilo (kg) / Boy(m) * Boy(m)
 */
public class Main {
    public static void main(String[] args) {
        float kilo, boy, vki;
        Scanner yazici = new Scanner(System.in);

        System.out.println("Lutfen boyunuzu girin(metre cinsinden): ");
        boy = yazici.nextFloat();
        System.out.println("Lutfen kilonuzu girin(KG cinsinden): ");
        kilo=yazici.nextFloat();
        vki = (float) (kilo / (boy * boy));

        System.out.println("Vucut kitle indeksiniz: "+vki);

    }
}
