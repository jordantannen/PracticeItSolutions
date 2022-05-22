
public class ShowHailstone {
	public void showHailstone(int n){
	    System.out.print("sequence for " + n + ": " + n);
	    
	    while (n != 1){
	        if (n % 2 != 0){
	            n = 3 * n + 1;
	            System.out.print(", " + n);
	        }
	        else{
	            n /= 2;
	            System.out.print(", " + n);
	        }
	    }
	}
}
