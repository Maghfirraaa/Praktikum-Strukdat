class Stack {
    private int maxSize;
    private Node[] stackArray;
    private int top;
    
    public Stack(){
        maxSize = 100;
        stackArray = new Node[maxSize];
        top=-1;
    }
    public void push(Node Item){
       stackArray[++top]= Item;
    }
    public boolean isEmpty(){
        return (top == -1); 
    }

    public Node pop() {
        return stackArray[top--];
        }
     
     public Node peek() {
        return stackArray[top];
        }
     
      public boolean isFull() {
        return (top == maxSize - 1);
        }
    }

