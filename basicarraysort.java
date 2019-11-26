import java.util.Arrays;

public class basicarraysort {

	public static void main(String[] args) {
		double[]numbers = {88,47,90,50,77,83,92,96,62,79};
		int lowest;
		String PrintedNumbers;
		
		for(int x = 0; x < numbers.length; x++) {
			for(int y = x; y < numbers.length; y++) {
				if(numbers[x] > numbers[y]) {
					lowest = (int)numbers[x];
					numbers[x] = numbers[y];
					numbers[y] = lowest;
				}
			}
		}
		PrintedNumbers = Arrays.toString(numbers);
		System.out.println(PrintedNumbers);

	}

}
