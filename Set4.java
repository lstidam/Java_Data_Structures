/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package set4;
import java.util.Set;
import java.util.HashSet;

/**
 *
 * @author lilli
 */
public class Set4 {
    public static void main(String[] args) {
        Set<Integer> setA = new HashSet<>();
        Set<Integer> setB = new HashSet<>();
        
        //check if set is empty
        if (setA.isEmpty()){
            System.out.println("Set A is empty.");
        }else {
            System.out.println("Set A is not empty.");
        }
        
        //add to set
        System.out.println("Adding to set A and B.");
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setB.add(3);
        setB.add(4);
        setB.add(5);
        
        //get size of set
        System.out.println("Size of set A: "+setA.size());
        System.out.println("Size of set B: " + setB.size());
        
        //check if 1 is an element of set 
        System.out.println("1 is an element of set A? : "+ setA.contains(1));
        
        //remove 2 from set
        System.out.println("Removing 2 from set A: "+ setA.remove(2));
        System.out.println("Size of set A: "+setA.size());
        
        //add all of set B to set A
        System.out.println("Adding set B to set A.");
        setA.addAll(setB);
        System.out.println("Size of set A: "+setA.size());
        
        //remove all elements in set B from set A
        System.out.println("Removing all elements of set B from set A.");
        setA.removeAll(setB);
        System.out.println("Size of set A: "+ setA.size());
       
        
        
    
    
    }
   
    
}
