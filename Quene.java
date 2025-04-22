/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quene;
import java.util.Queue;
import java.util.ArrayDeque;

/**
 *
 * @author lilli
 */
public class Quene {
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>(5);
        
        //check is queue is empty
        if (queue.isEmpty()){
            System.out.println("Queue is empty.");
        } else {
            System.out.println("Queue is not empty.");
        }
        
        
        //add elements
        System.out.println("Adding elements to queue.");
        queue.add(1);
        queue.add(2);
        queue.add(3);
        
        //get size of queue
        System.out.println("Size of queue: "+ queue.size());
        
        //get first element in queue
        System.out.println("First element in queue: "+queue.peek());
        
        //remove element from queue
        System.out.println("Removing from queue: "+ queue.remove());
        
        //get size of queue
        System.out.println("Size of queue: "+ queue.size());
        
    }
    
}
