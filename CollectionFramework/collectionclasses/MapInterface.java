
package com.mycompany.collectionclasses;

import java.util.*;
public class MapInterface 
{
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        map.put(101, "neha");
         map.put(102, "vaishu");
          map.put(103, "mammu");
           map.put(104, "bhumi");
            map.put(105, "muskan");
             map.put(106, "palak");
              map.put(107, "naina");
               map.put(108, "radhika");
              System.out.println(map);
//              {101=neha, 102=vaishu, 103=mammu, 104=bhumi, 105=muskan, 106=palak, 107=naina, 108=radhika}
map.remove(103);
        System.out.println(map);
        System.out.println(map.containsKey(104));
        System.out.println(map.containsValue("vaishu"));
        System.out.println(map.containsKey(103));
        System.out.println(map.containsValue("naina"));
    }
    
}
