/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doubledlinkedlist;

/**
 *
 * @author lilli
 **/







public class DoubledLinkedList {
    //Node class
    static class Node{
        int data;
        Node next;
        Node prev;
        
        public Node(int data){
            this.data = data;
            this.next= null;
            this.prev = null;
        }
        //methods
        public int getElement(){ return data;}
        public Node getNext(){return next;}
        public void setNext(Node n){next = n;}
        
    }
    
    static class DoubledLinkedListClass{
        Node head;
        Node tail;
        int size;
        
        public DoubledLinkedListClass(){
            head= null;
            tail=null; 
            size= 0;
        }
        //methods
        public Boolean isEmpty(){return size == 0;}
        public int size(){return size;}
        
        //create node
        public Node createNode(int data){
            return new Node(data);
        }      
        
        
        //add node to end of list
        public void addNode(int data){
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }
        
        public void addNodeAfter(int find, int data){
            Node newNode = new Node(data);
            Node checkData = head;
            if(isEmpty()){
                head= newNode;
                tail=newNode;
                size++;
            } else {
                while(checkData != null){
                    if (checkData.getElement()==find){
                        newNode.next = checkData.next;
                        newNode.prev = checkData;
                        checkData.next = newNode;
                        newNode.next.prev = newNode;
                        if (newNode.next == null){tail = newNode;}
                        size++;
                        return;
                    }
                    checkData = checkData.next;
                }
                System.out.println("Node with element "+ data+ " can not be found.");
            }
           
        }
        //add node before
        public void addNodeBefore(int find, int data) {
            Node newNode = new Node(data);
            Node checkData = head;

      
            while (checkData != null) {
                if (checkData.getElement() == find) {
                    if (checkData == head) {
                        newNode.next = head;  
                        head.prev = newNode;  
                        head = newNode;       
                    } else{
                        checkData.prev.next = newNode;
                        newNode.next=checkData;
                        newNode.prev =checkData.prev;
                        checkData.prev = newNode;
                    }
                    size++;
                    return; 
                }
                checkData = checkData.next; 
            }

      
            System.out.println("Node with element " + find + " cannot be found.");
        }

        //delete node
        public Node deleteNode(int data){
            if(isEmpty()){System.out.println("List is empty.");}
            Node current = head;
            while (current.next != null){
                if (current.getElement() == data){
                    Node deleted = current;
                    if (current == head){
                        head = head.next;
                        if (head == null){tail = null;}
                        head.prev = null;
                    }else if (current == tail){
                        tail = tail.prev;
                        tail.next = null;
                    }else {
                        current.prev.next=current.next;
                        current.next.prev = current.prev;
                
                    }
                    size--;
                    return deleted;
                }
                current = current.next;
            }
            System.out.println("Can not find node with value " + data);
            return null;   
        }
        
        public void printList() {
            Node current = head;
            if (current == null) {
                System.out.println("List is empty.");
                return;
            }

            while (current != null) {
                System.out.print(current.getElement() + ", ");
                current = current.next;
            }
            System.out.println("end");
        }
     
    }
    
    
    
  
    public static void main(String[] args) {
        
        //create list
        DoubledLinkedListClass list = new DoubledLinkedListClass();
        
        //create node
        Node myNode = list.createNode(1);
        

        // add nodes to list
        list.addNode(myNode.getElement());
        list.addNode(3);
        list.addNode(4);
        
        //print list
        list.printList();
        
        //add node before 3
        list.addNodeBefore(3, 2);
        list.printList();
        
        //add node after 3
        list.addNodeAfter(3, 9);
        list.printList();
        
        //delete 9
        list.deleteNode(9);
        list.printList();
    }
    
    
}
