
package com.mycompany.collectionclasses;

import java.util.*;
public class CollectionsMethod 
{
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("ajay");
        al.add("pooja");
        al.add("minku");
        al.add("sneha");
        al.add("payal");
        al.add("vaishu");
        Collections.addAll(al,"deepika","naina","jyoti");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        int index = Collections.binarySearch(al, "pooja");
        System.out.println(index);
//        Collections.fill(al,"monika");
//        System.out.println(al);
        al.add("ajay");
        al.add("ajay");
        System.out.println(Collections.frequency(al, "ajay"));
        System.out.println(Collections.max(al));
        System.out.println(Collections.min(al));
        Collections.reverse(al);
        System.out.println(al);
        Collections.rotate(al,2);
        System.out.println(al);
        Collections.swap(al, 2, 5);
        System.out.println(al);
        
        
    }
    
}
