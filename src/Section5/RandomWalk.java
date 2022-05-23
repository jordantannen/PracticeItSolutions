import java.util.*;
public class RandomWalk {
	public void randomWalk(){
	    Random rand = new Random();
	    int position = 0;
	    int maxPosition = 0;
	    
	    System.out.println("position = " + position);
	    
	    while (position != 3 && position != -3){
	        int randInt = rand.nextInt(2);
	        
	        if (randInt == 0)
	            position++;
	        else 
	            position--;
	        
	        if (position > maxPosition)
	                maxPosition = position;
	        
	        System.out.println("position = " + position);
	    }
	    System.out.println("max position = " + maxPosition);
	}
}
