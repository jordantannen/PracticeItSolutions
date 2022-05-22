
public class Sign {
	public String sign(int x, int y){
	    if (x * y < 0)
	        return "Negative";
	    else if (x * y > 0)
	        return "Positive";
	    else
	        return "Zero";
	}
}
