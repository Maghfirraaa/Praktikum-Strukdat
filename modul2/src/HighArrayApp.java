 class HighArray {
    private int[] arr;
    private int nElemen;
    
    public HighArray(int max){
        arr= new int [max];
        nElemen = 0;
    }
    public void insert(int value){
        arr[nElemen]=value;
        nElemen++;
    }
 
    public boolean find(int key){
        int i;
        for(i=0; i<nElemen;i++){
            if(arr[i] == key){
                break;
            }
        }
        if(i==nElemen){
            return false;
        }else{
            return true;
        }
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
    System.out.println();
  
}
//bubblesort
public void BubbleSort(){
    int batas, i;
    //kecil ke besar 
//    for(batas = nElemen-1; batas>0; batas--){
//        for(i=0;i<batas;i++){
//            if(arr[i]>arr[i+1]){
//            swap(i,i+1); 
//            }
    //method bubllesort secara descending.
   for(batas = nElemen-1; batas>0; batas--){
        for(i=0;i<batas;i++){
            if(arr[i]<arr[i+1]){
            swap(i,i+1); 
            }
          // this.display();
        }
    }
}

public void SelectionSort(){
    int awal, i, min;
    
    for(awal=0; awal<nElemen-1;awal++){
        min=awal;
        for(i=awal+1; i<nElemen;i++){
            if(arr[i] < arr[min]){
                min=i;
            }
        }
        swap(awal,min);
        System.out.print("Jumlah isi elemen = ");
        this.display();
    }
}

public void InsertionSort(){
    int i, curIn;
    
    for(curIn=1; curIn<nElemen;curIn++){
        int temp = arr[curIn];
        
        i=curIn;
        
    while(i>0 && arr[i-1] >= temp){
        arr[i] = arr[i-1];
        this.display();
        i--;
    }
    arr[i]=temp;
    this.display();
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
        //1. Tuliskan listing untuk method  untuk menyimpan elemen array secara berurutan(order)
        arr.insert(53);
        arr.insert(77);
        arr.insert(15);
        arr.insert(30);
        arr.insert(45);
      
        //arr.insert(79);
        //arr.insert(81);
        arr.insert(66); // menambahkan angka 66 dan mencari posisi nya pada array di atur pada method insert

       
//        arr.display();
        
//        int key =15;
//        if(arr.find(key)){
//            System.out.println(key+" di temukan ");
//        }else{
//            System.out.println(key +" tidak ditemukan ");
//        } 
//        arr.delete(00);
//        arr.delete(80);
//        arr.delete(55);
        //arr.BubbleSort();
        //arr.SelectionSort();
        arr.InsertionSort();
        System.out.print("data yang sudah urut = ");
        arr.display();
//      
        System.out.println("jumlah array = " + arr.size());
    }
    
}