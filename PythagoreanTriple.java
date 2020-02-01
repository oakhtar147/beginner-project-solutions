import java.util.Scanner;

public class PythagoreanTriple {

	public static void main(String[] args) {
		
		while (true) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the magnitude of first side of traingle: ");
		int firstSide = input.nextInt();
		
		System.out.print("Enter the magnitude of second side of traingle: ");
		int secondSide = input.nextInt();
		
		System.out.print("Enter the magnitude of third side of traingle: ");
		int thirdSide = input.nextInt();
		
		if (Math.pow(firstSide, 2) == Math.pow(secondSide, 2) + Math.pow(thirdSide, 2))
			System.out.println("These are sides of a right-angled triangle.");
		
		else if (Math.pow(secondSide, 2) == Math.pow(firstSide, 2) + Math.pow(thirdSide, 2))
			System.out.println("These are sides of a right-angled triangle.");
		
		else if (Math.pow(thirdSide, 2) == Math.pow(firstSide, 2) + Math.pow(secondSide, 2))
			System.out.println("These are sides of a right-angled triangle.");
		
		else {System.out.println("These sides do not make a right-angled triangle");}
		
		System.out.println();
		
		}
	
	}

}
