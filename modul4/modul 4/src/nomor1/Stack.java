package nomor1;
class Stack {
    private LinkStack top;
    
    public Stack(){
        this.top=null;
    }
    public void push(int id, String nm){
       LinkStack temp = new LinkStack(id,nm);
       temp.next=top;
       top = temp;
    }
    public boolean isEmpty(){
        return top == null; 
    }

    public void pop() {
        if(top == null){
             System.out.println("Data habis");
        return;
        }
        top = top.next;
    }

    public void displayStack() {
        System.out.println("Stack(top --> bottom)");
        if(top == null){
            System.out.print("Data kosong");
        }else{
            LinkStack temp = top;
            while(temp!=null){
                temp.displayLink();
                temp= temp.next;
            }
            System.out.println("");
        }
    }
    
   
}
 