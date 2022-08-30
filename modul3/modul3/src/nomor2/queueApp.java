package nomor2;
/**
 * @author Maghfira
 */
public class queueApp {
    public static void main(String[] args) {
            queue a = new queue(4);
        System.out.println(">> beberapa mulai mengantri");
        a.insert("Andi");
        a.insert("Ahmad");
        a.insert("Satrio");
        a.insert("Afrizal");
        a.insert("Sukran");
        a.insert("Mahmud");
        System.out.println(" ");
        
        System.out.println(">> Isi antrian");
        a.display();
        
        System.out.println("\n\n>> satu per satu keluar antrian");
        
        while(!a.isEmpty()){
        System.out.println(a.remove()+ " Keluar antrian");
        a.display();
            System.out.println("\n");
        }
        System.out.println("\nAntrian kosong");
        System.out.println(a.size()+" person");
        a.display();
        
        System.out.println(" ");
    }
}
