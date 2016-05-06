/**
 * Test class for DisplayFibonacci
 */
import java.util.Scanner;

public class TestDriveFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez le nombre d'iteration:");
		int continu=input.nextInt();
		//Iterative mode
		System.out.println("Iterative:");
		System.out.println(DisplayFiboIter.displayNumberIter(continu));
		System.out.println("recursive:");
		System.out.println(DisplayFiboIter.displayNumberRecurs(continu,1,0));
	}

}
