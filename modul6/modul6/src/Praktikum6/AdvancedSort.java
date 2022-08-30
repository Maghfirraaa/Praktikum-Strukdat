package Praktikum6;
/**
 *
 * @author Maghfira
 */
public class AdvancedSort {
        private Mahasiswa[] mhs;
        private int nElemen ;
    
    public AdvancedSort(int max){
        mhs = new Mahasiswa[max];
        nElemen = 0;
    }
    
    public void insert(long nim, String nama, String asal){
        mhs[nElemen] = new Mahasiswa(nim, nama, asal);
        nElemen++;
    }
     //MergeSort
     public void mergeSort(){
        Mahasiswa[] workSpace=new Mahasiswa[nElemen];
        recMergeSort(workSpace,0,nElemen-1);
        
    }
    public void recMergeSort(Mahasiswa[] workSpace,int lowerBound, int upperBound){
        if (lowerBound==upperBound) {
            return;
        }else{
            int mid=(lowerBound+upperBound)/2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid+1, upperBound);
            merge(workSpace,lowerBound,mid+1,upperBound);
        }
    }
    public void merge(Mahasiswa[] workSpace, int lowIndex,int highIndex,int upperBound){
        int j=0;
        int lowerBound=lowIndex;
        int mid=highIndex-1;
        int nItem=upperBound-lowerBound + 1;
        
        while (lowIndex <= mid && highIndex <=upperBound) {            
            if (mhs[lowIndex].getNama().compareToIgnoreCase(mhs[highIndex].getNama())<0) {
                workSpace[j++]= mhs[lowIndex++];
            }else{
                workSpace[j++]=mhs[highIndex++];
            }
        }
        while (lowIndex <= mid) {            
            workSpace[j++]=mhs[lowIndex++];
        }
        while (highIndex <= upperBound) {            
            workSpace[j++]=mhs[highIndex++];
        }
        for ( j = 0; j < nItem; j++) {
            mhs[lowerBound + j]=workSpace[j];
        }
    }
    public void ShellSort(){
        int in, out;
        Mahasiswa temp;
        int h = nElemen/2;
       while (h > 0) {
            for (out = h;  out < nElemen ; out++) {
                temp = mhs[out];
                in = out;
       while(in>h-1 && mhs[in-h].getNim() >= temp.getNim()){
           mhs[in]= mhs[in-h];
           in -= h;
       }
       mhs[in] = temp;      
    }
     h/=2;
}
    }
       //QuickSort 
       public void QuickSort(){
        recQuickSort(0, nElemen - 1);
    }
    
    public void recQuickSort(int batasKiri, int batasKanan){
        Mahasiswa temp;
        if (batasKanan - batasKiri <= 0){
            return;
        }else{
            Mahasiswa pivot=mhs[batasKanan];
            int partisi=partitionIt(batasKiri, batasKanan, pivot);
            recQuickSort(batasKiri, partisi-1);
            recQuickSort(partisi+1, batasKanan);
        }
    }
    
    public int partitionIt(int batasKiri, int batasKanan, Mahasiswa pivot){
        int indexKiri = batasKiri - 1;
        int indexKanan = batasKanan;
        while (true){
            while (indexKiri < batasKanan && mhs[++indexKiri].getNama().compareToIgnoreCase(pivot.getNama()) < 0);
            while (indexKanan > batasKiri && mhs[--indexKanan].getNama().compareToIgnoreCase(pivot.getNama()) > 0);
            if (indexKiri >= indexKanan){
                break;
            } else {
                swap(indexKiri, indexKanan);
            }
            
        }
         swap(indexKiri, batasKanan);
        return indexKiri;
    }
    
    public void swap(int one, int two){
        Mahasiswa temp = mhs[one];
        mhs[one] = mhs[two];
        mhs[two] = temp;
    }
     public void display(){
        for (int i=0; i<nElemen; i++){
            mhs[i].displayMhs();
        }
        System.out.println("");
    }
    }

