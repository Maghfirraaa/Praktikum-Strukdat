/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ce;

/**
 *
 * @author HP
 */
public class Recursion {
    
    //iterasi 
    
    public static int triangleIter(int n){
        int result =0;
        for(int i=n; i>0;i--){
            result += i;
            System.out.println(result);
        }
        return result;
    }
    
    public static int triangleRecur(int n){
            if(n==1){
            return 1;
        }else{
            return n + triangleRecur(n-1);
        }
    }
    
     
    public static void main(String[] args) {
        System.out.println("Fungsi Iterasi ;"+triangleIter(5));
        System.out.println("Fungsi Reukursi : "+ triangleRecur(5));
    }
    
}
