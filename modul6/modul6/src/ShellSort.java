/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class ShellSort {
    
    private int[] arr;
    private int nElemen; 

   
    
    public ShellSort(int max){ 
        arr = new int[max];
        nElemen = 0; 
    }
    
    public int size(){
        int jumElemen = 0;
        for(int i=0; i<nElemen; i++){
            jumElemen++;
        }
        return jumElemen++;
    }
    
    public void insert(int value){
        arr[nElemen] = value;
        nElemen++;
    }
    
    public void Display(){
        for (int i=0; i<nElemen; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
     
    public void ShellSort(){
        int in, out;
        int temp;
        int h = 1;
        // menambah code looping while knuth sequench
       while(h <= nElemen/3){
           h = (h*3)+1;
       }
       
       while (h > 0) {
            for (out = h;  out < nElemen ; out++) {
                temp = arr[out];
                in = out;
       while(in>h-1 && arr[in-h] >= temp){
           arr[in]= arr[in-h];
           in -= h;
       }
       arr[in] = temp;
       Display();
    }
           // h/=3; // mengubah kode 
          // h/=2;
           h=(h-1)/3;
}
    }
     
}
    
