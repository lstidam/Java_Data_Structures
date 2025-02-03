/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlelinkedlist;

/**
 *
 * @author lilli
 */

//Node Class
class Node{
    int data;
    Node next;
    
    //constructor
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    
    //methods
    public int getElement(){ return data;}
    public Node getNext(){return next;}
    public void setNext(Node n){next = n;}
}


//main class for list
public class SingleLinkedList<E> {
    Node head = null; 
    Node tail = null; 
    int size = 0; 
    public SingleLinkedList(){}
    
    //methods
    public int size(){return size;}
    public boolean isEmpty(){return size ==0;}
    
    //create a new node
    public Node createNode(int data){
        return new Node(data);
    }
    
    //create new list
    public SingleLinkedList createList(){
        return new SingleLinkedList();
    }
    
    //add node to end (only takes one parameter, contents of node)
    public void addNode(int data){
        Node newNode = createNode(data);
        if (isEmpty())
            head = newNode;
        else
            tail.setNext(newNode);
        tail = newNode;
        size++;
    }
    
    //add node to given location (takes two parameters, node contents that you would like to create the new node after and contents)
    public void addNodeAfter(int dataFind, int data){
        Node newNode = createNode(data);
        Node checkData = head;
        while (checkData != null){ 
            if (checkData.getElement() == dataFind){
                newNode.setNext(checkData.getNext());
                checkData.setNext(newNode);
                if (newNode.getNext()==null){tail = newNode;}
                size++;
                return;
            }
           
            checkData = checkData.getNext();
   
        }
        System.out.println("Node with contents "+ dataFind+ " can not be found.");
    }
    
    //add node to begining 
    public void addFirst(int data){
        Node temp = head;
        head = createNode(data);
        head.setNext(temp);
        if (size == 0)
            tail = head;
        size++;
    }
    
    //delete node with specified value
    public Node deleteNode(int data){
        if(isEmpty()){System.out.println("List is empty.");}
        if (head.getElement() == data){
            Node deleted = head;
            head = head.getNext();
            if(head == null){tail = null;}
            size --;
            return deleted;
        }
        Node current = head;
        while(current.getNext() != null){
            if (current.getNext().getElement() == data){
                current.setNext(current.getNext().getNext());
                if (current.getNext() == null){
                    tail = current;
                }
                size--;
                return current;
            }
            current = current.getNext();
        }
        System.out.println("Can not find node with value "+ data);
        return null;
    }
    
    //print the linked list
    public void printList() {
        if (isEmpty()) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.getElement() + ", ");
            current = current.getNext();
        }
        System.out.println("end");
    }
    
    public static void main(String[] args) {
        
        //create a linked list
        SingleLinkedList list = new SingleLinkedList(); 
        //create a node
        Node myNode = list.createNode(1);
        list.addNode(myNode.getElement());
        list.addNode(2);
        list.addNode(4);
        list.addNode(5);

        System.out.println("Linked List after adding nodes:");
        list.printList();

        // Add node after node with value 2
        list.addNodeAfter(2,3);
        System.out.println("after adding 3 after node with value 2:");
        list.printList();

        // Add node to the beginning
        list.addFirst(0);
        System.out.println("after adding 0 to the beginning:");
        list.printList();
        
        // Delete a node
        list.deleteNode(4);
        System.out.println("after deleting node with value 4:");
        list.printList();
    }
    
}
