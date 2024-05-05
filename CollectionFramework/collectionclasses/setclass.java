
package com.mycompany.collectionclasses;
import java.util.*;
public class setclass 
{
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(4);
        set.add(5);
        set.add(2);
        set.add(7);
        set.add(8);
        set.add(9);
        set.add(10);
        System.out.println(set);
//        set.removeAll(set);
//        System.out.println(set);
        System.out.println(set.size());
//       set.clear();
//        System.out.println(set);
        
        System.out.println(set.contains(4));
        
        
    }
    
}
