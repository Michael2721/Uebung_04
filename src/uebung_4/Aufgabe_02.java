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
public class Aufgabe_02 {
    
    
    public static void main(String[] args)
    {
        double[] arr = new double[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=0.25*i;
            System.out.println(arr[i]);
        }
        System.out.println(minimum(arr));
    }
    
    
    public static double minimum(double[] array) //Ordnung = Array.lenght
    {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min>array[i])
            {
                min = array[i];
            }
        }
        return min;
     
    }
    
    
    
}
