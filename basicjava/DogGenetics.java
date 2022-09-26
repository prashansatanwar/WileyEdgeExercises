package basicjava;
import java.util.*;

public class DogGenetics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is your dog's name? ");
		String name = sc.nextLine();
		
		Random r = new Random();
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i = 0; i<5; i++) {
			arr[i] = r.nextInt(5);
			sum+=arr[i];
		}
		
		int total = 0;
		for(int i = 0; i<4; i++) {
			float d = ((float)arr[i]/(float)sum)*100;
			arr[i] = Math.round(d);
			total+=arr[i];
		}
		arr[4]=100-total;

		
		System.out.println(name+" is:");
		
		String[] breed = {"St. Bernard","Chihuahua","Dramatic RedNosed Asian Pug","Common Cur","King Doberman"};
		
		for(int i = 0; i<5; i++) {
			System.out.println(arr[i]+" "+breed[i]);
		}
		
		System.out.println("Wow, that's QUITE the dog!");
		
	}

}
