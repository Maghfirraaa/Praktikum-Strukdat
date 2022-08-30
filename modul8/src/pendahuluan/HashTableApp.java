/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendahuluan;

/**
 *
 * @author Maghfira
 */
public class HashTableApp {
    public static void main(String[] args) {
       // HashTable a = new HashTable(15);
        HashTable theHash = new HashTable(15);
        
        System.out.println("Data sebelum penambahan");
        theHash.insert(3);
        theHash.insert(7);
        theHash.insert(10);
        theHash.insert(14);
        theHash.insert(15);
        theHash.insert(18);
        theHash.insert(20);
        theHash.insert(35);
        theHash.insert(45);
        theHash.insert(65);
        
        theHash.displayTable();
        
        System.out.println("Data setelah penambahan");
        theHash.insert(13);
        theHash.insert(28);
        theHash.insert(39);
        theHash.insert(40);
        theHash.insert(60);
        
        theHash.displayTable();
        theHash.find(18);
        theHash.delete(35);
        theHash.displayTable();
    }
}
