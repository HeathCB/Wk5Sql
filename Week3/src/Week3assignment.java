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
		//1b	
		ages[7] = 104;
		System.out.println( difference );
		//1c
	int sum = 0;
	for (int x : ages) 
				sum +=x ;
		System.out.println(sum / ages.length);
		//2
	String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
	int[] nameLengths = {names[0].length(), names[1].length(), names[2].length(), names[3].length(), names[4].length(),names[5].length()};
	for (int i1 = 0; i1 < names.length; i1++) {	
		System.out.println( names[i1] + nameLengths[i1] );
	}
		//2a
	int h = 0;
	do {
		System.out.println(IntStream.of(nameLengths).sum());
		h++;
	}while ( h > nameLengths.length);
		

		//2b
	String concat = String.join(" ", names);
	do {
		System.out.println(concat);
		h++;
	}while ( h > nameLengths.length);
	// 3
	// names.length
	// ALL OF MY METHODS ARE IN PRACTICE.JAVA


}
}