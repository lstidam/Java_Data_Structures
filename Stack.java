/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author lilli
 */
public class Stack {

    private int[] arr;
    private int top;
    private int capacity;
    
    //constructor 
    public Stack(int size){
        arr = new int[size];
        capacity= size;
        top = -1;
    }
    
    //return size
    public int size(){
        return top + 1;
    }
    
    //check if stack is empty
    public boolean isEmpty(){
        return size() == 0;
    }
    
    //push new value into stack
    public void push(int value){
        if (top == capacity -1){
            System.out.println("Array Stack is full");
            return;
        }
        arr[++top]= value;
    }
    
    //pop top out of stack, return value
    public int pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        int temp = arr[top];
        top = top-1;
        return temp;
    }
    
    //get top of stack
    public int top(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    
    public static void main(String[] args) {
        Stack myStack = new Stack(5);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println("Is stack empty? "+ myStack.isEmpty()); //output should be false
        System.out.println("Size of stack: " + myStack.size()); //output should be 3
        System.out.println("Popping top element. Popped value: "+ myStack.pop()); //output should be 3
        System.out.println("Top element: " + myStack.top()); //output should be 2
        
    }
    
}
