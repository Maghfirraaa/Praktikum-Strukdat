package nomor1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @author HP
 */
public class AppPembalik {
    public static void main(String[] args) throws IOException {
        
//        System.out.println("===Jawaban nomor 1 a===");
//        String input="kasur";
//        pembalik balikKata=new pembalik(input);
//        String output = balikKata.BalikKata();
//        System.out.println(">>katanya...");
//        System.out.println("\t"+input);
//        System.out.println(">>dibalik jadi...");
//        System.out.println("\t"+output);
       System.out.println("===Jawaban nomor 1 b"); 
       for(int i=0;i<10;i++){
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
         System.out.print("Masukkan Kata : ");
         String input=a.readLine();
         
        String output;
        pembalik balikKata=new pembalik(input);
        output = balikKata.BalikKata();
         System.out.println ("Kebalikan : " + output);
}   
    }
}

