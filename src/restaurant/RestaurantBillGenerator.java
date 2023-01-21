package restaurant;

import java.util.Scanner;

/*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
      1-Bir restaurantın online sipariş sisteminde hesabı
      yazdıran uygulama tasarlayınız.

      2-Restauranttaki yiyecekler bir listte tutulsun.
        Yiyeceklerin kodu, ismi ve ücreti olsun.

      3-Yiyecek menüsü, sipariş oluşturma/iptal ve hesap
        oluşturma için seçim menüsü gösterilsin.

      4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
        Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                      Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                      Her bir yiyecek siparişi için tutar hesaplansın

        Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
        Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                         toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/
public class RestaurantBillGenerator {

    public static void main(String[] args) {

        start();

    }

    public static void start(){
        DishService dishService = new DishService();
        dishService.fillDishList();
        getSelectionMenu(dishService);


    }
    public  static void getSelectionMenu(DishService dishService){
        Scanner input = new Scanner(System.in);
        int select=-1;

        while (select!=0) {
            System.out.println("----------------------------------------------------");
            System.out.println(" *** Elbistan Restauran Siparis Uygulamasi ***");
            System.out.println("1-Menu\n2-Siparis Girme\n3-Siparis Iptal Etme\n4-Hesap Olusturma\n0-CIKIS\nSeciminiz:");
            select=input.nextInt();
            System.out.println("----------------------------------------------------");
            switch (select){
                case 1:
                    dishService.showDishMenu();
                    break;
                case 2:
                    //Siparis girmesi saglanacak
                    break;
                case 3:
                    //Siparis iptal etmesi saglanacak
                    break;
                case 4:
                    //Hesap olusturulacak
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz");
                    break;
            }
        }
        System.out.println("Iyi Gunler Dileriz...");

    }

}
