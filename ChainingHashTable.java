/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chaininghashtable;
import java.util.LinkedList;
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
public class ChainingHashTable {
    private LinkedList<WordHolder>[] table;
    
    public ChainingHashTable(){
        table = new LinkedList[26];
        for (int i = 0; i< 26; i++){
            table[i]=new LinkedList<>();
        }
    }
    
    private int hash(String word){
        char firstChar = word.charAt(0);
        return (Character.toLowerCase(firstChar)- 'a') % 26;
    }
    
    public void insert(String word){
        int index = hash(word);
        LinkedList<WordHolder> chain = table[index];
        
        for (WordHolder storedWord : chain){
            if (storedWord.word.equals(word)){
                storedWord.count++;
                return;
            }
        }
        
        chain.add(new WordHolder(word));
    }
    
    public void display(){
        for (LinkedList<WordHolder> chain : table){
            for (WordHolder storedWord:chain){
                System.out.println(storedWord.word+ " : "+storedWord.count);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        
        ChainingHashTable hashTable = new ChainingHashTable();
        
        for (String word: words){
            hashTable.insert(word);
        }
        
        System.out.println("Word : Number of times word was found in text");
        hashTable.display();
    }
    
}
