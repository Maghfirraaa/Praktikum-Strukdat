package Praktikum6;
public class AdvancedSortApp {
    public static void main(String[] args) {
            int maxSize = 100;
            AdvancedSort arr;
            arr = new AdvancedSort(maxSize);
            
            arr.insert(16650200, "Jundi"    , "Malang");
            arr.insert(16650210, "Ahmad"    , "Sidoarjo");
            arr.insert(16650250, "Raja"     ,"Ambon");
            arr.insert(16650260, "Helmi"    , "Madura");
            arr.insert(16650220, "Ismail"   , "Banyuwangi");
            arr.insert(16650230, "Sofi"     , "Semarang");
            arr.insert(16650270, "Agung"    , "Madiun");
            arr.insert(16650280, "Arina"    , "Malang");
            arr.insert(16650240, "Dinda"    , "Bandung");
           
            System.out.println("Data Mahasiswa Sebelum diurutkan ");
            arr.display();
            
            // Pengurutan berdasarkan nama dg mergesort
             System.out.println("Merge Sort untuk pengurutan berdasarkan Nama  :");
            arr.mergeSort();
            arr.display();
            
            // Pengurutan berdasarkan NIM dg shellsort
            System.out.println("Shell Sort untuk pengurutan berdasarkan NIM : ");
            arr.ShellSort();
            arr.display();
            
            //Pengurutan berdasarkan nama dg Quicksort
             System.out.println("QuickSort untuk pengurutan berdasarkan Nama");
            arr.QuickSort();
            arr.display();
}           
}
