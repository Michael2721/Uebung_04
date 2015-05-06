/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung_4;

/**
 *
 * @author Michael
 */
public class Aufgabe_01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //OrdnungNlogN(100);
        //OrdnungN3p5n2(100);
       
        OrdnungNN(2);
        
    }
    
    public static void OrdnungNN(long n)
    {
        for (int i = 0; i < NN(n); i++) {
            System.out.println(i);
        }
    }
    
    
    public static long NN ( long n)
    {
        if(n==1)
        {
            return 10;
        }else
        {
            return 10 * NN(n-1);
        }
    }
    
    
    public static void OrdnungN3p5n2 ( int n)
    {
        int zahl = 0;
        for (int i = 0; i < (n*n*n); i++) {
            System.out.println(i);
            zahl++;
        }
        for (int i = 0; i < (5*n*n); i++) {
            System.out.println(i);
            zahl++;
        }
        System.out.println("Durchläufe : " + zahl);
    }
    
    
    public void OrdnungN (int n)
    {
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
    
    public void OrdnungN2 (int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(i + " äußere " + j + "innere");
                
            }
            
        }
    }
    
  
    
    public static void OrdnungNlogN (int n)
    {
        
        double logn = (double) n;
        int nlogn = ((int) ((logn)*( Math.log(logn))));
        
        for (int i = 0; i < nlogn; i++) {
            System.out.println(i);
            
        }
    }
    
    
    
}
