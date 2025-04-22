/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package map4;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author lilli
 */
public class Map4 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        
        //check if map is empty
        if (map.isEmpty()){
            System.out.println("Map is empty.");
        } else {
            System.out.println("Map is not empty.");
        }
        
        //add to map
        System.out.println("Adding to map.");
        map.put(1,"A");
        map.put(2, "B");
        map.put(3, "C");
        
        //get size of map
        System.out.println("Size of map: "+map.size());
        
        //get value of key 1
        System.out.println("Value associated with key '1': "+map.get(1));
        
        //remove entry with key 3
        System.out.println("Removing entry with key '3': "+map.remove(3));
        
        //replace value of key 3
        System.out.println("Replacing value of entry with key '1' with value 'D': " + map.put(1,"D"));
        System.out.println("Value associated with key '1': "+map.get(1));
        
        
        
        
    }
    
}
