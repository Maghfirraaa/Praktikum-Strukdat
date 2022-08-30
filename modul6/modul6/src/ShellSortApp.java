/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ShellSortApp {
    public static void main(String[] args) {
        ShellSort a =  new ShellSort(10);
        
        
//         a.insert(80);
//        a.insert(20);
//        a.insert(70);
//        a.insert(60);
//        a.insert(10);
//        a.insert(40);
//        a.insert(30);
//        a.insert(50);
        a.insert(80);
        a.insert(20);
        a.insert(70);
        a.insert(60);
        a.insert(40);
        a.insert(10);
        a.insert(30);
        a.insert(50);
//      

       
        System.out.println("Array before sorting");
        a.Display();
        System.out.println();

     
        a.ShellSort();

        System.out.println();
        System.out.println("Array after sorting");
        a.Display();
    }
}
