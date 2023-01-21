package List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class List01 {
    /*
        Kullanıcıdan girdi olarak bir String alan
        ve bu String de meydana gelen maksimum karakteri bulan
        bir Java programı yazın. (Büyük/küçük harf duyarlılığını dikkate almayın)
        input : Learning java is easy
        output: maximum occurring character is : a
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("String bir ifade giriniz...");
        String [] str=input.nextLine().split("");
        List<String> strList=new ArrayList<>();

        for (String w:str){
            strList.add(w);
        }
        int counter=0;
        int outerCount=0;
        String s="";
        for (String w:str) {
            counter=0;
            for (String k:strList) {
                if (w.equals(k)){
                    counter++;
                }

            }
            if (counter>outerCount){
                outerCount=counter;
                s=w;
            }
        }

        System.out.println("maximum occurring character is : " + s);

    }
}
