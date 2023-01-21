package Arrays;

import java.util.Scanner;

public class FindArray {
    /*
    yazılan değerin array içerisinde arayan Java Kodu yazınız.
    Array: [1551,1223,1443,1267,1789,1023,2020]
    Aranan Değer:2020
    Beklenen Çıktı:**True**
    Aranan Değer:2010
    Beklenen Çıktı :**False**
     */
    public static void main(String[] args) {

    int[] arr={1551,1223,1443,1267,1789,1023,2020};

    Scanner input =new Scanner(System.in);
    System.out.println("Aradiginiz Array'i giriniz...");
    int searchNum= input.nextInt();
    boolean isHave = false;
        for (int w:arr) {
            if (w==searchNum){
                isHave=true;
                break;
            }
        }
        System.out.println(isHave);

    }



}
