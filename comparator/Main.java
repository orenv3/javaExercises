package comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		
		 ArrayList<Movies> list = new ArrayList<Movies>();
	        list.add(new Movies("Force Awakens", 8.3, 2015));
	        list.add(new Movies("Star Wars", 8.7, 1977));
	        list.add(new Movies("Empire Strikes Back", 8.8, 1980));
	        list.add(new Movies("Return of the Jedi", 8.4, 1983));
	 
	        System.out.println("Movies befor sorting : ");
	        for (Movies movie: list)
	        {
	            System.out.println(movie.getName() + " " +
	                               movie.getRating() + " " +
	                               movie.getYear());
	        }
	     
	        System.out.println("");
	        System.out.println("Movies after sorting : ");
	        Collections.sort(list);
	        for (Movies movie: list)
	        {
	        	System.out.println(movie.getName() + " " +
	        			movie.getRating() + " " +
	        			movie.getYear());
	        }
	        
	        System.out.println("");
	        System.out.println("Movies after rate sorting : ");
	        Collections.sort(list, new RateCompate());
	        for (Movies movie: list)
	        {
	        	System.out.println(movie.getName() + " " +
	        			movie.getRating() + " " +
	        			movie.getYear());
	        }
	
	}

}
