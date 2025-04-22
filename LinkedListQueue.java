/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linkedlistqueue;

/**
 *
 * @author lilli
 */
public class LinkedListQueue {
    private static class Node{
        int data;
        Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    private Node front;
    private Node rear;
    private int size;
    
    //constructor
    public LinkedListQueue(){
        this.front = null;
        this.rear = null;
        this.size = 0;
    }
    
    //get size
    public int size(){
        return size;
    }
    
    //check if empty
    public boolean isEmpty(){
        return size == 0;
    }
    
    //return first element
    public int first(){
        if (isEmpty()){
            System.out.println("Queue is empty.");
            return -1;
        }
        return front.data;
    }

    //add Node to queue
    public void enqueue(int object){
        Node newNode = new Node(object);
        if (rear == null){
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }
    
    //remove Node from queue
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = front.data;
        front = front.next;
        if (front == null){
            rear = null;
        }
        size--;
        return temp;
    }
    
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("First element: "+queue.first());
        System.out.println("Size of queue: "+ queue.size());
        System.out.println("Dequeued: "+queue.dequeue());
        System.out.println("First element: "+ queue.first());
        System.out.println("Size of queue: "+queue.size());
        System.out.println("Is queue empty? "+ queue.isEmpty());
    }
    
}
