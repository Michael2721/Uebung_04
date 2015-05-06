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



public class Aufgabe_03 {
    static class Node
    {
        int val;
        Node next;
        Node(int v)
        {
            val = v;
            next = null;
        }
    }
    
     static Node insertAtBegin(Node root, int value) //O(1)
     {
         Node vorroot = new Node(value);
         vorroot.next = root;
         
         return vorroot;         
     }
    
     public static void main(String[] args)
     {
         Node root = new Node(1);
         root.next = new Node(2);
         root = insertAtBegin(root,0);
         append(root,3);
         append(root,5);
         //delete(root,2);
         root = insertOrdered(root,4);
         Print(root);
         
     }
    
     
     
     static Node insertOrdered(Node root, int value)
     {
         Node newN = new Node(value);
         newN.next = root;
         
         
         if(root.val >= value)
         {
             return insertAtBegin(root,value);
         }else if(root.next.val <= value)
         {
             
             root.next = newN;
             
             return root;
            
         }else
         {
             insertOrdered(root.next.next,value);
             return root;
         }
     }
     
     static void Print(Node root)
     {
         
         System.out.println(root.val);
         if(root.next ==null)
         {
             System.out.println("liste fertig");
         }else
         {
             Print(root.next);
         }
         
     }
     
     static Node append(Node root, int value) //O(n)
     {
         Node nachroot = new Node(value);
         if(root.next == null)
         {
             root.next = nachroot;
             return root;
         }else
         {
             return append(root.next,value);
         }
     }
     
     
     
     static Node delete(Node root, int value)
     {
         if(root.next.val == value)
         {
             root.next = root.next.next;
             return root;
         } else 
         {
             return delete(root.next,value);
         }
     }
     
    
}
