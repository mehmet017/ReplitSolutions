package List;

import java.util.Arrays;
import java.util.Scanner;

public class List03 {
    /*
    Kullanıcıdan bir cümle alın. Kullanıcıdan gelen cümleyi parametre
    olarak kabul edin, Array kullanarak cümleyi ters çevirin ve ana
    metoda sonucu String olarak döndüren bir Metot yazın.
    Not: Büyük ve küçük harfler, boşluklar ve özel karakterler değiştirilmeyecektir.
    Input : It is very nice to write code.
    Output : .edoc etirw ot ecin yrev si tI
     */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir cumle giriniz...");
        String str= input.nextLine();
        reserveStr(str);
    }
    public static String reserveStr(String s){


        String reserveSt="";
        String[] arr=s.split("");
        for (int i=arr.length-1;i>=0;i--) {
            reserveSt+=arr[i];
        }
        System.out.println(reserveSt);
        return reserveSt;
    }

}
