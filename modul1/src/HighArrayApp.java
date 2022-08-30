 class HighArray {
    private int[] arr;
    private int nElemen;
    
    public HighArray(int max){
        arr= new int [max];
        nElemen = 0;
    }
//    
public void insert(int value){
// code insert sebelum data diurutkan
   //    arr[nElemen]= value;
   //    nElemen++;
// code insert untuk mengurutkan data
    int posisi = 0;
    for(int i=0; i< nElemen; i++){
        if(value < arr[i]){
            posisi = i;
            break;
        }else{
            posisi = nElemen;
        }
    }
    nElemen++;
    for(int i=nElemen; i> posisi; i--){
        arr[i]= arr[i-1];
    }
    arr[posisi]= value;
    
}
// 2. Tuliskan listing untuk find yang mengimplementasikan binnarySearch
//     pada binary search, range elemen  array dibagi 2 secara berulang
public boolean find(int key){ // nomor 2
    int batasBawah =0;
    int batasAtas =nElemen-1;
    
    boolean diCari = true;
    while(diCari){
        int indexSekarang = (batasBawah+batasAtas)/2;
   
    if(arr[indexSekarang] == key){
        diCari = false;
        return true;
    }else if(batasBawah > batasAtas){
    break;
    }else{
        if(arr[indexSekarang]< key){
            batasBawah = indexSekarang + 1;           
        }else{
            batasAtas = indexSekarang -1;
        }
}
}
    return true;
}
public boolean delete(int value){
    int i;
    for(i=0; i< nElemen; i++){
        if(value == arr[i]){
            break;
        }
    }
    if (i== nElemen){
        return false;
    }else{
        for(int j = i; j< nElemen; j++){
            arr[j] = arr[j+1];
        }
        nElemen--;
        return true;
    }  
 }
public int size(){
    int jumlah =0;
    for(int i=0; i< nElemen; i++){
        jumlah++;
    }
    return jumlah;
}
public void display(){
    for(int i=0; i< nElemen; i++){
        System.out.print( arr[i] +" ");
    }
    System.out.println("");
}
//bubblesort
public void BubbleSort(){
    int batas, i;
    for(batas = nElemen-1; batas>0; batas--){
        for(i=0;i<batas;i++){
            swap(i,i+1);
        }
    }
}

public void swap(int one, int two){
    int temp = arr[one];
    arr [one] = arr[two];
    arr[two] = temp;
}
}
public class HighArrayApp{
    public static void main(String[] args) {
        int maxSize = 100;
        HighArray arr;
        arr = new HighArray(maxSize);
        //1. Tuliskan listing untuk method  untuk menyimpan elemen 
        //array secara berurutan(order)
        arr.insert(15);
        arr.insert(30);
        arr.insert(45);
        arr.insert(53);
        arr.insert(77);
        arr.insert(79);
        arr.insert(81);
        arr.insert(66); // menambahkan angka 66 dan mencari posisi nya 
                        //pada array di atur pada method insert
        arr.display();
        
        int key =15;
        if(arr.find(key)){
            System.out.println(key+" di temukan ");
        }else{
            System.out.println(key +" tidak ditemukan ");
        } 
//        arr.delete(00);
//        arr.delete(80);
//        arr.delete(55);
        
        arr.display();
        System.out.println("jumlah array = " + arr.size());
    }
    
}