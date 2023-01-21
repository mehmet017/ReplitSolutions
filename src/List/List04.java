package List;

import java.util.ArrayList;
import java.util.List;

public class List04 {
    /*
    Girdi olarak verilen listedeki isimlerden 'a' harflerini silen bir program yazınız.
    INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
    OUTPUT : [Veli,Omer]
     */
    public static void main(String[] args) {
        List<String> stList=new ArrayList<>();
        stList.add("Ali");
        stList.add("Veli");
        stList.add("Ayse");
        stList.add("Fatma");
        stList.add("Omer");

        List<String> newList=new ArrayList<>();

        for (String w:stList) {
            if (!w.toLowerCase().contains("a")){
                newList.add(w);
            }

        }
        System.out.println(newList);

    }

}
