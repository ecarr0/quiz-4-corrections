import java.util.Scanner;
import java.lang.Math;

public class problemsixteen {
	public static void main(String[]args) {
		System.out.println("Inches: ");
		Scanner in = new Scanner(System.in);
		double input = in.nextDouble();
		System.out.println(new problemsixteen().inches(input));
		in.close();
	}
	public String inches(double inches) {
		int miles = 0;
		int yards = 0;
		int feet = 0;
		while(inches > 63360) {
			miles++;
			inches -= 63360;
		}
		while(inches > 36) {
			yards++;
			inches -= 36;
		}
		while(inches > 12) {
			feet++;
			inches -= 12;
		}
		inches = Math.floor(inches);
		String response = miles + " miles, " + yards + " yards, " + feet + " feet, and " + inches + " inches.";
		return response;
	}
}