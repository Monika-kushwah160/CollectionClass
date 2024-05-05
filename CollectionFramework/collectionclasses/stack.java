

package com.mycompany.collectionclasses;

import java.util.*;
public class stack 
{

    public static void main(String[] args) 
    {
        
        Stack<String> s= new Stack<>();
        s.push("deepika");
        s.push("monika");
        s.push("sneha");
        s.push("pragya");
        s.push("kajal");
        s.push("madhuri");
        System.out.println(s);
        s.pop();
        System.out.println(s);
        System.out.println(s.empty());
        System.out.println(s.peek());
        System.out.println(  s.search("deepika"));
        
    }
}
