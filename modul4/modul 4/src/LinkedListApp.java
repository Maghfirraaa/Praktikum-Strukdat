class Link{
    public int Data;
    public Link next;
    
    public Link(int Data){
        this.Data=Data;
    }
    
    public void displayLink(){
        System.out.print(Data +" ");
    }
}

class LinkedList{
    private Link first;
    public LinkedList(){
        first = null;
    }
    
    public boolean isEmpty(){
        return (first == null);
    }
    public void insertFirst(int Data){
        Link newLink = new Link(Data);
        newLink.next= first;
        first = newLink;
    }
    //menambah method insertLast
    public void insertLast(int Data){
        Link newlink = new Link(Data);
        Link last = first;
        while(last.next != null){
            last = last.next;
        }
        last.next=newlink;
    }
    
    public Link deleteFirst(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    //delete last
    public Link deleteLast(int Data){
       Link last =first;
        Link prelast = null;
        Link temp;
        while(last.next!=null){
            prelast = last;
            last = last.next;
        }
        temp = last;
        prelast.next=null;
        return temp;
    }
    public Link find(int key){
        Link current = first;
        while(current.Data != key){
            if(current.next == null){
                return null;
            }else{
                current = current.next;
            }
        }
        return current;
    }
    public Link delete(int key){
        Link current = first;
        Link previous = first;
        while(current.Data != key){
            if(current.next == null){
                return null;
            }else{
                previous = current;
                current = current.next;
            }
        }
        if (current == first){
            first = first.next;
        }else{
            previous.next = current.next;
        }
        return current;
    }
    
    public void displayList(){
        System.out.println("List(first --> last);");
        Link current = first;
        while(current != null){
            current.displayLink();
            current=current.next;
        }
        System.out.println("");
    }
}
public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList theList = new LinkedList();
        
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        theList.insertFirst(88);
        theList.displayList();
        
        while(!theList.isEmpty()){
            Link aLink = theList.deleteFirst();
            System.out.print("Delected");
            aLink.displayLink();
            System.out.println("");
        }
        
        theList.displayList();
        theList.insertFirst(33);
        theList.insertFirst(55);
        theList.insertFirst(77);
        theList.insertFirst(88);
        theList.displayList();
        
        Link f = theList.find(77);
        if(f != null){
            System.out.println("ketemu ... "+f.Data);
        }else{
            System.out.println("Link tidak ditemukan");
        }
        
        Link d= theList.delete(88);
        if(d!=null){
            System.out.println("hapus Link dengan key "+d.Data);
        }else{
            System.out.println("Link tidak ditemukan");
        }
        theList.displayList();
    }
    
}
