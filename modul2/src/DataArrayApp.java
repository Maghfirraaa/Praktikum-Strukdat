/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class DataArrayApp {
       public static void main(String[] args) {
            int maxSize = 100;
            DataArray arr;
            arr = new DataArray(maxSize);
            arr.insert(16650200, "Jundi", "Malang");
            arr.insert(16650210, "Ahmad", "Sidoarjo");
            arr.insert(16650250, "Raja","Ambon");
            arr.insert(16650260, "Helmi", "Madura");
            arr.insert(16650220, "Ismail", "Banyuwangi");
            arr.insert(16650230, "Sofi", "Semarang");
            arr.insert(16650270, "Agung", "Madiun");
            arr.insert(16650280, "Arina", "Malang");
            arr.insert(16650240, "Dinda", "Bandung");
           
            System.out.println("Data mahasiswa sebelum diurutkan");
            arr.displayArray();
           
            arr.BubbleSort();
           // arr.SelectionSort();
            System.out.println("1. Sorting Mahasiswa by NIM");
            arr.displayArray();
            
            arr.InsertionSortbyName();
            System.out.println("2. Sorting Mahasiswa by Name");
            arr.displayArray();
}
}
