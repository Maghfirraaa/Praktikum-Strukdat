/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class nomor1 {
    public static void main(String[] args) {
        System.out.println("2^10 = "+pangkatRec(2,10));
        System.out.println("3^5 = "+pangkatRec(3,5));
        System.out.println("3^16 = "+pangkatRec(3,16));
    }
    
    public static int pangkatRec(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        else {
            return base * pangkatRec(base, exponent - 1);
        }
    }
}
//      3^5
//      3(3^4)
//    3.3(3^3)
//      9(3^3)
//    3.9(3^2)
//     27(3^2)
//   3.27(3^1)
//     81(3^1)
//     243.1
//    