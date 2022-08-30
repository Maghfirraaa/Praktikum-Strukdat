import java.util.Scanner;

public class menara {
    
    private static void doMenara(int cakram, char asal, char bantu, char tujuan){
        if(cakram == 1){
            System.out.println("Pindahkan cakram 1 dari tiang "+asal+" ke tiang "+ tujuan);
            return;
        }
        doMenara(cakram - 1, asal, tujuan, bantu);
         
        System.out.println("Pindahkan cakram "+cakram+" dari tiang "+asal+" ke tiang "+tujuan);
        doMenara(cakram -1, bantu, asal, tujuan);
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah cakram: ");
        int cakram = in.nextInt();
        doMenara(cakram, 'A', 'B', 'C');
    }
}