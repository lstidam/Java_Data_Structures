/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack4;
import java.util.Stack;

/**
 *
 * @author lilli
 */
public class Stack4 { 
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        //see if stack is empty 
        if (stack.isEmpty()){
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
        
        //push element into stack
        System.out.println("Pushing into stack.");
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        //check size of stack
        System.out.println("Size of stack: "+ stack.size());
        
        //look at top element 
        System.out.println("Top element of stack: "+stack.peek());
        
        //pop element 
        System.out.println("Popped element: "+ stack.pop());
        
        //check size of stack
        System.out.println("Size of stack: "+ stack.size());
        
    }
    
}
