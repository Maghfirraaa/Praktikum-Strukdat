package nomor1;
/**
 * @author Maghfira
 */
public class pembalik {
    // deklarasi variable dan pemberian modifier
    private String input;
    private String output;
    
    //method constructor
    public  pembalik(String a) {
         input = a;
    }
    //method BalikKata
    public String BalikKata(){
        int stackSize = input.length();// inisialisasi variabel stackSize
        stack theStack = new stack(stackSize);//membuat objek theStack
        
        for( int i=0; i< input.length();i++){//looping for
         char isi = input.charAt(i); // untuk membaca tiap karakter input
         theStack.push(isi);//untuk menyimpan karakter ke variable isi
        }
         output = "";//inisialisasi output sama dengan kosong
         while(!theStack.isEmpty()){//looping while dg kondisi negasi theStack dg memanggil method isEmpty
            output += theStack.pop();//menjumlahkan output dengan objek theStack dg memanggil method pop untuk
                                     //mengeluarkan kaata dari belakang
    }
        return output;//mengembalikan ke variabel output
    }
    
}
    
