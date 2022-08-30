package nomor2;

class LinkQueue {

    public LinkQueue next;
    public int nim;
    public String nama;
   
    
    public LinkQueue(int nim, String nm) {
        this.nim=nim;
        this.nama=nm;
    }
    public void displayLink() {
        System.out.println("\t"+nim+" "+nama);
    }
}
