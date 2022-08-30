/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pendahuluan2;

/**
 *
 * @author Maghfira
 */
public class HashChainApp {
    public static void main(String[] args) {
        
    
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
}
}