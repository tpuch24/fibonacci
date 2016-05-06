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

	public static String displayNumberIter(long nbIter) {
		long valPrec1 = 1;
		long valPrec2 = 0;
		long value;
		String output = "";

		for (int ind = 0; ind < nbIter; ind++) {
			value = valPrec1 + valPrec2;
			output += " " + value;
			valPrec1 = valPrec2;
			valPrec2 = value;
		}

		return output;
	}
/**
 * Recursive mode
 * 
 * @param nbre     : quantity of Fibonacci numbers
 * @param valprec1 : 2 value before current
 * @param valprec2 : 1 value before current
 * @return
 */
	public static String displayNumberRecurs(long nbre, long valprec1, long valprec2) {
		long value=0;
		String output="";
		if(nbre>0){					// ending condition for recursive call
			value=valprec1+valprec2;
			valprec1=valprec2;
			valprec2=value;
			output+=" " +value+displayNumberRecurs(--nbre, valprec1, valprec2);
		}
		return output;
	}
}

