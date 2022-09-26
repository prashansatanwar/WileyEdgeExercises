package basicjava;
import java.util.*;

public class HealthyHearts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your age? ");
		int age = sc.nextInt();
		
		int heartRate = 220-age;
		System.out.println("Your maximum heart rate should be "+heartRate+" beats per minute");
		
		int min = (int) Math.round(0.5*heartRate);
		int max = (int) Math.round(0.85*heartRate);
		
		System.out.println("Your target HR Zone is "+min+" - "+max+" beats per minute");
	}

}
