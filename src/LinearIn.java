import java.util.Arrays;

public class LinearIn {

	public boolean linearIn(int[] outer, int[] inner) {
		  
		  for(int i = 0; i < inner.length; i++){
		    if (Arrays.binarySearch(outer, inner[i]) < 0)
		      return false;
		  }
		  return true;
		}
}
