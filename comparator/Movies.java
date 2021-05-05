package comparator;

public class Movies implements Comparable<Movies>{
	
	    private double rating;
	    private String name;
	    private int year;
	 
	 
	    // Constructor
	    public Movies(String nm, double rt, int yr)
	    {
	        this.name = nm;
	        this.rating = rt;
	        this.year = yr;
	    }
	 
	    // Getter methods for accessing private data
	    public double getRating() { return rating; }
	    public String getName()   {  return name; }
	    public int getYear()      {  return year;  }

		@Override
		public int compareTo(Movies o) {
			return this.year - o.year;
		}

	
}
