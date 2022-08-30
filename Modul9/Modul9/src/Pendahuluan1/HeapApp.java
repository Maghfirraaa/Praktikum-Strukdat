/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendahuluan1;

/**
 *
 * @author Maghfira
 */
public class HeapApp {
    public static void main(String[] args) {
        Heap heap = new Heap(35);
        
        heap.insert(3);
        heap.insert(7);
        heap.insert(10);
        heap.insert(13);
        heap.insert(14);
        heap.insert(15);
        heap.insert(18);
        heap.insert(20);
        heap.insert(28 );
        heap.insert(35);
        heap.insert(45);
        heap.insert(65);
        heap.insert(30);
       
        
//        heap.displayArray();
//        heap.trickleUp(12);
//        heap.remove();
//        heap.trickleDown(12);
        heap.change(11, 31);
        heap.displayHeap();
    }
}
