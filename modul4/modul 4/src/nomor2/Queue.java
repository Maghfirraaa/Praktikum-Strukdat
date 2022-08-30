package nomor2;
class Queue{
   private LinkQueue front, rear;
   
   public Queue(){
       this.front=null;
       this.rear=null;
   }
   
   public void insert(int nim, String nm){
   LinkQueue temp= new LinkQueue(nim,nm);
   if(this.rear==null){
       this.front=temp;
       this.rear=temp;
       return;
   }
   this.rear.next = temp;
   this.rear=temp;
   }
  
   public void remove(){
       if(this.front == null)
       return;
       LinkQueue temp = this.front;
       this.front=this.front.next;
 
       if(this.front == null)
           this.rear = null;
   }
   public void displayQueue(){   
       System.out.println("Queue(front --> rear)");
       LinkQueue current = front;
       while(current != null){
           current.displayLink();
           current = current.next;
       }
       System.out.println("");
        }
   
  
   }


