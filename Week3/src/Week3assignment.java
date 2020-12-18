import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Week3assignment {


	public static void main(String[] args) {
//		//1
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int lengthOfAges = ages.length;
		int difference = Math.abs(ages[ lengthOfAges - lengthOfAges ] - ages[ lengthOfAges -1]);
			System.out.println( difference );
		
//		//1b
		ages[7] = 104;
			System.out.println( difference );
		
//		//1c
		int sum = 0;
		for (int x : ages) 
			sum +=x ;
			System.out.println(sum / ages.length);

//		
//		
//		
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		//2a
		
		
		for(int i = 0; i < names.length; i++) {
			System.out.println( names[i].length() );
//		
		
		//2b
		for(String t : names) {
			String joinedarray = String.join("," , t);
			System.out.println(joinedarray);
		
		}

		//3:
		// names.length will tell you the amount of elements in any array
		// Than you can use names[x] to access the last element of an array
		// x would equal the last number in the index of an array
		//4:
		// names[0] or whatever your array is named than 
		// [0] will always be the first element in any array
		//5:
		int[] nameLengths = {names[0].length(), names[1].length(), names[2].length(), names[3].length(), names[4].length(),names[5].length()};
		for (int i1 = 0; i1 < names.length; i1++) {
//			
		System.out.println( names[i1] + nameLengths[i1] );
		}		
//		//6
		int h = 0;
		do {
			System.out.println(IntStream.of(nameLengths).sum());
			h++;
		}while ( h > nameLengths.length);
//		//7
	}

	}
	// ALL OF MY METHODS ARE IN PRACTICE.JAVA


}
