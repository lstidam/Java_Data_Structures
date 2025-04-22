/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package list4;
import java.util.List;
import java.util.LinkedList;
/**
 *
 * @author lilli
 */
public class List4 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        
        //check if list is empty
        if (list.isEmpty()){
            System.out.println("List is empty.");
        } else {
            System.out.println("List is not empty.");
        }
        
        //add elements to lists
        System.out.println("Adding elements");
        list.add(1);
        list.add(2);
        list.add(0,3);
        
        //get size of list
        System.out.println("Size of list: "+list.size());
        
        //get first element in list 
        System.out.println("First element in list: "+list.get(0));
        
        //replace first element in list
        System.out.println("Replacing first element in list.");
        list.set(0,4);
        System.out.println("First element in list: "+list.get(0));
        
        //remove second element in list 
        System.out.println("Removing element at index 1: "+list.remove(1));
        
        //get size of list
        System.out.println("Size of list: "+list.size());
        
        
    }
    
}
