package comparator;

import java.util.Comparator;

public class RateCompate implements Comparator<Movies> {

	@Override
	public int compare(Movies o1, Movies o2) {
		if(o1.getRating()>o2.getRating()) return 1;
		else if(o1.getRating()<o2.getRating())return -1;
		else return 0;
	}

}
