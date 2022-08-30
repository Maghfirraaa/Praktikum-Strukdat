package nomor2;
/**
 * @author Maghfira
 */
public class queue {
    private int maxSize;
    private String[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public queue(int size) {// method constructor
        this.maxSize = size;
        queArray = new String[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }
    public void insert(String nama) { //menambahkan data
        if (!isFull()) {
            queArray [++rear] = nama;
            System.out.println(nama + " masuk antrian");
            nItems++;
        }else{
            System.out.println("maaf "+ nama + ", antrian masih penuh");
    }
    }
    public String remove() {// untuk menghapus atau mengeluarkan data 
        String temp = queArray[front];
        queArray[front]= "Kosong";
        front++;
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;

    }

    public String peekFront() {//untuk melihat data pada antrian paling depan
        return queArray[front];
    }

    public boolean isEmpty() { // untuk memeriksa apakah data kosong atau tidak
        return (nItems == 0);
    }

    public boolean isFull() { // untuk mengetahui antrian penuh atau tidak
        return (nItems == maxSize);
    }

    public int size() { //mengetahui panjang data 
        return nItems;
    }
    // untuk menampilkan antrian
    public void display(){
        int temp = this.front;
        for(int i=0; i<maxSize; i++){
            System.out.print(queArray[front++]+ ", ");
            if(front == maxSize){
                front = 0;
            }
        }
        front = temp;
    }
}


    


