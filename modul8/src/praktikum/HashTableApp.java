package praktikum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Maghfira
 */
public class HashTableApp {
     public static void main(String[] args) throws IOException {
       // HashTable a = new HashTable(15);
        HashTable theHash = new HashTable(15);
        int value ;

       while(true){
           System.out.print("Pilih antara show,insert, find,delete :");
           int choice=getChar();
           switch(choice){
               case 's':
                   theHash.displayTable();
                   break;
               case 'i':
                   System.out.print("Masukkan nilai untuk ditambahkan :");
                   value=getInt();
                   theHash.insert(value);
                   break;
                   
               case 'f':
                   System.out.print("Masukkan nilai untuk dicari: ");
                   value=getInt();
                   Data found=theHash.find(value);
                   if (found != null) {
                       System.out.print("Nilai :"  ); //Data Ditemukan
                       found.displayData();
                       System.out.println("");
                   }else{
                       System.out.println("Nilai :"+value+" tidak ditemukan");
                   }
               break;
               case 'd':
                    System.out.print("Masukan Value untuk dihapus: ");
                    value = getInt();
                    Data Delete = theHash.delete(value);
                    if (Delete != null){
                        System.out.println("Nilai : "+ value + " berhasil dihapus");
                        System.out.println("");
                    } else {
                        System.out.println("Nilai : "+value + " tidak dihapus");
                    }
                break;
           }
       }
    }
    public static String getString() throws IOException{
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String s=br.readLine();
        return s;
    }
    public static char getChar() throws IOException{
        String s=getString();
        return s.charAt(0);
    }
    
    public static int getInt() throws IOException{
        String s=getString();
        return Integer.parseInt(s);
    }
}
