package praktikum;

/**
 *
 * @author Maghfira
 */
public class HashTable {
     private Data[] hashArray;
     private int size;
     private int nomor;
     private int x;
     
     public HashTable(int size) {
        this.size = size;
        hashArray = new Data[size];
    }
     
     public void displayTable(){
        System.out.println("Table: ");
        for (int j=0  ; j<size; j++){
            if (hashArray[j] != null){
                System.out.println(" | " +j+ "\t | " +hashArray[j].getKey()+ " |");
            } else {
                System.out.println(" | " +j+ "\t | -- |");
            }
        }
        System.out.println("");
    }
    
    public int hashFunc(int key){
        return key % size;
    }
    
   public void insert(int data){
        Data item=new Data(data);
        int key=item.getKey();
        x=hashFunc(key);
        int hashVal=x;
        nomor=0;
        while(hashArray[hashVal] != null){
            nomor++;
            hashVal = (x+nomor*nomor)%size;
        }
        hashArray[hashVal]=item;
    }
     
     public Data delete(int key){
        int hashVal = hashFunc(key);
        while (hashArray[hashVal] != null){
            if (hashArray[hashVal].getKey() == key){
                Data temp = hashArray[hashVal];
                hashArray[hashVal] = null;
                return temp;
            }
            nomor++;
            hashVal =(x+nomor*nomor)%size;
    }
        return null;
    }
     
     public Data find(int key){
        int hashVal = hashFunc(key);
        x= hashFunc(key);
        nomor=0;
        while (hashArray[hashVal] != null){
            if (hashArray[hashVal].getKey() == key){
                 System.out.println( "Key ditemukan pada index ke- : " +hashVal);
                return hashArray[hashVal];
            }
            nomor++;
            hashVal =(x+nomor*nomor)%size;
        }
        return null;
    }
}

