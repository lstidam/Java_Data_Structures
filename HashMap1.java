/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hashmap1;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author lilli
 */
public class HashMap1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();
        String[] words = text.split(" ");
        
        HashMap<String, Integer> count = new HashMap<>();
        
        for (String word: words){
            if (count.containsKey(word)){
                count.put(word, count.get(word)+1);
            }else{
                count.put(word, 1);
            }
        }
        System.out.println("Word : Number of time word appears in text");
        for (String key: count.keySet()){
            System.out.println(key+ " : "+count.get(key));
        }
    }
    
}
