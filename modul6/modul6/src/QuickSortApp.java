/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class QuickSortApp {
    public static void main(String[] args) {
        //int maxSize = 16;
        QuickSort a = new QuickSort(10);
        
      
        
//        a.insert(20);
//        a.insert(70);
//        a.insert(80);
//        a.insert(60);
//        a.insert(10);
//        a.insert(40);
//        a.insert(30);
//        a.insert(50);
//        
        a.insert(80);
        a.insert(20);
        a.insert(70);
        a.insert(60);
        a.insert(40);
        a.insert(10);
        a.insert(30);
        a.insert(50);

//        a.insert(80);
//        a.insert(20);
//        a.insert(70);
//        a.insert(60);
//        a.insert(10);
//        a.insert(40);
//        a.insert(30);
//        a.insert(50);
        //System.out.println("Jumlah data = " + a.size());
        System.out.println("Sebelum di urutkan " );
        a.display();
        
        System.out.println("QuickSort " );
        a.QuickSort();
        
        System.out.println("\nSetelah di urutkan ");
        a.display();
    }
    }

