/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

import java.util.Scanner;

/**
 *
 * @author Maghfira
 */
public class HeapSortApp {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        int size, a;
        System.out.print("Masukkan banyak item : ");
        size = input.nextInt();
        Heap b = new Heap(size);
        
        for(a=0;a<size;a++){
            int random =(int)(Math.random()*100);
            b.insertAt(a, random);
        }
        
      
        System.out.println("Data random sebelum diurutkan : ");
        b.displayHeap();
     
        System.out.println("Data setelah diurutkan: : ");
        b.HeapSort();
        b.displayArray();
        System.out.println("");
        
//     
        
    }
}
