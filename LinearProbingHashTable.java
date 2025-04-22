/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package linearprobinghashtable;
import java.util.Scanner;

/**
 *
 * @author lilli
 */
class WordHolder{
    String word;
    int count;
    
    WordHolder(String word){
        this.word = word;
        this.count = 1;
    }
}

public class LinearProbingHashTable {
    private static final int SIZE = 1000;
    private WordHolder[] table;
    
    public LinearProbingHashTable(){
        table = new WordHolder[SIZE];
    }
    
    private int hash(String word){
        char firstChar = word.charAt(0);
        return (Character.toLowerCase(firstChar)-'a' % SIZE);
    }
    
    public void insert(String word){
        int index = hash(word);
        int originIndex = index;
        
        while(table[index] != null){
            if(table[index].word.equals(word)){
                table[index].count++;
                return;
            }
            index = (index+1)%SIZE;
            if (index==originIndex){
                System.out.println("Hash table is full.");
                return;
            }
        }
        table[index] = new WordHolder(word);
    }
    
    public void display(){
        for (WordHolder storedWord: table){
            if (storedWord != null){
                System.out.println(storedWord.word + " : "+ storedWord.count);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        
        LinearProbingHashTable hashTable = new LinearProbingHashTable();
        
        for (String word: words){
            hashTable.insert(word);
        }
        
        System.out.println("Word : Number of time word appears in text");
        hashTable.display();
    }
    
}
