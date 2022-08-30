/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pendahuluan1;

/**
 *
 * @author Maghfira
 */
public class Node {
    private int data;
    
    public Node(int key){
            data=key;
    }
    
    public int getKey(){
        return data;
    }
    
    public void setKey(int id){
        data=id;
    }
}
