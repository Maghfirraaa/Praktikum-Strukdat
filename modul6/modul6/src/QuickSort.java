
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class QuickSort {
    
    private int[] arr;
    private int nElemen; 
    
    public QuickSort(int max){ 
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
    
    public void display(){
        for (int i=0; i<nElemen; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    
    public void QuickSort(){
        recQuickSort(0, nElemen - 1);
    }
    
    public void recQuickSort(int batasKiri, int batasKanan){
        if (batasKanan - batasKiri <= 0){
            return;
        } else {
            int pivot = arr[batasKanan];
            int partisi = partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi - 1);
            recQuickSort(partisi + 1, batasKanan);
        }
    }
    
    public int partitionIt(int batasKiri, int batasKanan, int pivot){
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan +1 ;
        while (true){
            while (indexKiri < batasKanan && arr[++indexKiri] < pivot);
            while (indexKanan > batasKiri && arr[--indexKanan] > pivot);
            if (indexKiri >= indexKanan){
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
           
        }
        return indexKiri;
    }
    
    public void swap(int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}


