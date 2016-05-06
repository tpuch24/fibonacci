/**
 * Class DisplayFiboIter mode
 * 
 * display the N first Fibonacci numbers with iterative & recursive
 * 
 * @author Thierry
 *
 */
public class DisplayFiboIter {

	/**
	 * Iterative mode
	 * 
	 * @param nbIter 
	 * @return
	 */
	
	public static String displayNumberIter(int nbIter){
		int valPrec1=1;
		int valPrec2=0;
		int value;
		String output="";
		
		for(int ind=0; ind<nbIter; ind++)
		{		
			value=valPrec1+valPrec2;
			output += " "+value;
			valPrec1=valPrec2;
			valPrec2=value;
		}
		
		return output;
	}
}

