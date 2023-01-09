package StringBuilder;

import java.util.Scanner;

public class StringBuilder01 {
    /*
    Bir cümleyi parametre olarak kabul eden, StringBuilder kullanarak
    cümleyi tersine çeviren bir java programı yazın. ve cümlenin palindrom
    olup olmadığını kontrol eder (büyük/küçük harf duyarlılığı olmadan)
    Eg : input : I love Java
    Output: "Reversed sentence : avaJ evol I .
    It is not a palindrome
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Bir cumle giriniz...");
        String str=input.nextLine();
        palindrome(str);
    }


    public static String palindrome(String str){



        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        System.out.println("sb = " + sb);
        String str2=sb.toString();

        if (str.equals(str2)){
            System.out.println("Palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }



        return str;
    }
}
