package nomor1;

/**
 *
 * @author Maghfira
 */
 class stack {
     //deklarasi variable
    private int maxSize;
    private char[] stackArray;
    private int top;
    
    //method constructor
    public stack(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top =-1;
    }
    //method push untuk menambah data pada stack
    public void push(char item){
        stackArray[++top] = item;
    }
    //method pop untuk menghapus data 
    public char pop(){
        return stackArray[top--];
    }
    //method peek untuk menampilkan isi stack pada posisi teratas.
    public char peek(){
        return stackArray[top];
    }
    //method untuk mengecek apakah data stack kosong atau tidak
    public boolean isEmpty(){
        return(top == -1);
    }
    //method untuk mengecek apakah data full atau tidak
    public boolean isFull(){
        return(top == maxSize-1);
    }
}
