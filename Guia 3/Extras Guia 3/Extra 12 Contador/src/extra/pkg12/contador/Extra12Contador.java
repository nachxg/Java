/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra.pkg12.contador;

public class Extra12Contador {

    public static void main(String[] args) {
        
        String c1,c2,c3;
        
        for (int i = 0; i < 10; i++) { 
            
            if (i==3) {
                c1 = "E";
            } else { c1 = Integer.toString(i); }
            
            for (int j = 0; j < 10; j++) { 
               
                if (j==3) {
                c2 = "E";
                } else { c2 = Integer.toString(j); }
                
                for (int k = 0; k < 10; k++) { 
                    
                    if (k==3) {
                    c3 = "E";
                    } else { c3 = Integer.toString(k); }
                    
                    System.out.println(c1 + " " + c2 + " " + c3);
                }
            }
        }
        
        
    }
    
}
