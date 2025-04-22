/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayqueue;

/**
 *
 * @author lilli
 */
public class ArrayQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    //constructor
    public ArrayQueue(int capacity){
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    //check if queue is empty 
    public boolean isEmpty(){
        return size == 0;
    }
    
    //get size of queue
    public int size(){
        return size;
    }
    
    //get first element in queue
    public int first(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front];
    }
    
    

    //add int to queue
    public void enqueue(int object){
        if (size == capacity){
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear +1 )% capacity;
        queue[rear]= object;
        size++;
    }
    
    //remove int from queue
    public int dequeue(){
        if (isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = queue[front];
        front = (front + 1)% capacity;
        size --;
        return temp;
    }
    
    
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("First element: "+queue.first());
        System.out.println("Size of queue: "+queue.size());
        System.out.println("Dequeued: "+queue.dequeue());
        System.out.println("Size of queue: "+queue.size());
        System.out.println("First element: "+queue.first());
        System.out.println("Is queue empty? "+queue.isEmpty());
    }
    
}
