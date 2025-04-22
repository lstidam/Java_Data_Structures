/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stacklinked;

/**
 *
 * @author lilli
 */
public class StackLinked {

    private static class Node{
        int data;
        Node next;
        
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    private Node top;
    private int size;
    
    //constructor
    public StackLinked(){
        this.top = null;
        this.size=0;
    }
    
    //check if stack is empty
    public boolean isEmpty(){
        return size == 0;
    }
    
    //get size of stack
    public int size(){
        return size;
    }
    
    //push element into top of stack 
    public void push(int value){
        Node newNode = new Node(value);
        newNode.next=top;
        top=newNode;
        size++;
    }
    
    //pop element from top of stack, return value
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int temp = top.data;
        top= top.next;
        size--;
        return temp;
    }
    
    //return top element of stack
    public int top(){
        if (isEmpty()){
            System.out.println("Stack is empty.");
            return -1;
        }
        return top.data;
    }
    
    
    public static void main(String[] args) {
        StackLinked myStack = new StackLinked();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("Is stack empty? "+ myStack.isEmpty()); //output should be false
        System.out.println("Size of stack: " + myStack.size()); //output should be 3
        System.out.println("Popping top element. Popped value: "+ myStack.pop()); //output should be 3
        System.out.println("Top element: " + myStack.top()); //output should be 2
    }
    
}
