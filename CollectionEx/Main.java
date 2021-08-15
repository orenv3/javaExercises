package collectionEx;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		
		Map hs = new HashMap<String,Integer>();
		 
        // Elements are added using add() method
        hs.put("A",1);
        hs.put("B",2);
        hs.put("C",3);
        hs.put("B",4);
        hs.put("D",5);
        hs.put("E",6);
//        hs.forEach(String value : hsm){
//        	
//        };
//        Set k = hs.keySet();
//        Iterator<?> it = k.iterator();
        
        for (Object name : hs.keySet()) {
        	System.out.print(name.toString() + ", ");
//        	System.out.print(it.next().getClass().get.toString());
        	
        }
        System.out.println();
        for (Object name : hs.values()) {
        	System.out.print(name.toString() + ", ");
//        	System.out.print(it.next().getClass().get.toString());
        	
        }
        
        System.out.println();
        
        Map<String,String> gfg = new HashMap<String,String>();
        
        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");
         
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : gfg.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
    
	}

}
