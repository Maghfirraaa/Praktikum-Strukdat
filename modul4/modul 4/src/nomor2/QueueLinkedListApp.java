package nomor2;

/**
 *
 * @author HP
 */
public class QueueLinkedListApp {
    public static void main(String[] args) {
        Queue a = new Queue();
        a.insert(1665100, "Dee");
        a.insert(1665200, "Deaja");
        a.displayQueue();
       
       a.insert(1665300, "Ami");
       a.insert(1665400, "Haya");
       a.insert(1665500, "Yati");
       a.displayQueue();
       
       a.remove();
       a.remove();
       a.displayQueue();
    }
}
