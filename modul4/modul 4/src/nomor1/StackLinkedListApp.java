package nomor1;

public class StackLinkedListApp {
    public static void main(String[] args) {
        Stack stack = new Stack();
        
        stack.push(1, "VCD");
        stack.push(2, "TV");
        
        stack.displayStack();
        
       stack.push(3, "Kulkas");
       stack.push(4, "PC");
       stack.push(5, "rice cooker");
       stack.push(6, "dispender");
       stack.displayStack();
       
       stack.pop();//untuk menghapus
       stack.pop();
       stack.displayStack();
    
    }
}
