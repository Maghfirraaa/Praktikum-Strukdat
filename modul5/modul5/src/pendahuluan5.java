/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class pendahuluan5 {
   
    private int arr[];
    private int nElemen;

    public pendahuluan5(int size) {
        arr = new int[size];
        nElemen = 0;
    }

    public void insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public void display() {
        for (int i = 0; i < nElemen ; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");
    }

    public void mergeSort() {
        int[] workspace = new int[nElemen];
        recMergeSort(workspace, 0, nElemen - 1);
    }

    public void recMergeSort(int[] workspace, int lowerBound, int upperBound) {
        if (lowerBound == upperBound) {
            return;
        } else {
            int mid = (lowerBound + upperBound) / 2;

            recMergeSort(workspace, lowerBound, mid);

            recMergeSort(workspace, mid + 1, upperBound);

            merge(workspace, lowerBound,  mid + 1, upperBound);
        }
    }

    public void merge(int[] workspace, int lowIndex, int hightIndex, int upperBound) {
        int j = 0;
        int lowerBound = lowIndex;
        int mid = hightIndex - 1;
        int nItem = upperBound - lowerBound + 1;

        while (lowIndex <= mid && hightIndex <= upperBound) {
            if (arr[lowIndex] < arr[hightIndex]) {
                workspace[j++] = arr[lowIndex++];
            } else {
                workspace[j++] = arr[hightIndex++];
            }
        }

        while (lowIndex <= mid) {
            workspace[j++] = arr[lowIndex++];
        }

        while (hightIndex <= upperBound) {
            workspace[j++] = arr[hightIndex++];
        }

        for (j = 0; j < nItem; j++) {
            arr[lowerBound + j] = workspace[j];
        }
    }

    public static void main(String[] args) {
        System.out.println("Merge sort :");
        pendahuluan5 test = new pendahuluan5(100);

        // masukkan data
        test.insert(29);
        test.insert(40);
        test.insert(75);
        test.insert(105);
        
        test.insert(2);
        test.insert(13);
        test.insert(47);
        test.insert(62);
        test.insert(84);
        test.insert(95);

        // sebelum di gabung
        System.out.print("Sebelum di gabung : ");
        test.display();

        // proses menggabungkan
        test.mergeSort();

        // setelah di gabung
        System.out.print("Setelah di gabung : ");
        test.display();

    }
}
