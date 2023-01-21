package List;

import java.util.Scanner;
import java.util.SortedMap;

public class List05 {
    /*
    Bir tamsayıyı girdi olarak kabul eden ve girdiden büyük olan
    ilk 10 asal sayıyı ekrana yazdıran bir program yazınız.
    Bir dönüş yönteminde sayıların çift olup olmadığını kontrol edin.
    Input : 5
    Output : [7, 11, 13, 17, 19, 23, 29, 31, 37, 41]
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Girdi olarak bir tamsayı al
        System.out.print("Lütfen bir tamsayı girin: ");
        int sayi = sc.nextInt();

        // Asal sayıları bul ve ekrana yazdır
        int sayac = 0;
        int i = sayi + 1;
        while (sayac < 10) {
            if (asal_mi(i)) {
                System.out.print(i+" ");
                sayac++;
            }
            i++;
        }
    }

    // Asal sayıyı bulma fonksiyonu
    public static boolean asal_mi(int n) {
        // Eğer sayı 1 veya 2 ise asaldır
        if (n == 1 || n == 2) {
            return true;
        }
        // 2'den büyük sayılar için döngü oluştur
        for (int i = 2; i < n; i++) {
            // Eğer sayının bir böleni varsa asal değildir
            if (n % i == 0) {
                return false;
            }
        }
        // Eğer döngü tamamlandıysa sayı asaldır
        return true;
    }
}
