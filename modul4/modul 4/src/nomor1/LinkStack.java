/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomor1;

/**
 *
 * @author HP
 */
public class LinkStack {
    public String nama;
    public int id;
    public LinkStack next;
    
    
   public LinkStack(int id, String nama) {
      this.id=id;
      this.nama=nama;
    }
    
   public void displayLink(){
       System.out.println("{"+id+","+nama+"}");   
   }
}
