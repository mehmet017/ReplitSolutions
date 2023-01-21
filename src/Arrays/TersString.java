package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TersString {
    /*Bir String değişkeni cümlesi verildiğinde, her sözcüğü almak için kod yazın ve tersine ters çevrilmiş String'e atayın.
    Test Data:
    sentence -> "Java is fun"
    reversed **-> "**fun is Java**"**/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen String bir ifade giriniz...");
        String sentence = input.nextLine();
        String []sentenceArr=sentence.split(" ");
        String reversed = "";

        for (int i= sentenceArr.length-1;i>=0;i--){
            reversed+=sentenceArr[i]+" ";
        }
        reversed=reversed.trim();
        System.out.println(reversed);

    }

}
