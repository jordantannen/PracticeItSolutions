import java.util.*; 
public class RollSix {
	public void rollSix(){
	    Random rand = new Random();
	    int randNum = rand.nextInt(6) + 1;
	    int count = 1;
	    
	    System.out.println("Rolled: " + randNum);
	    
	    while (randNum != 6){
	        randNum = rand.nextInt(6) + 1;
	        System.out.println("Rolled: " + randNum);
	        count++;
	    }
	    
	    System.out.println("You got a six in " + count + " turns!");
	}
}
