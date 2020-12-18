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
	

static int max = 3;
public static String multiConcat (String str, int max)
{
 String result = "";
 for (int i = 1; i <= max; i++)
 result += str;
 return result;
}
//		//8
		
	
		
	String firstName = "Heath";
	String lastName = "Brown";
	String fullName = createFullName( firstName, lastName );
	
	


public static String createFullName(String w , String q) {
	return  q + " " + w;
	}

		//9

public static boolean sumArray(int[] numbers) {
	int sum = 0;
	for (int number : numbers){
		sum += number ;
		
	}if (sum > 100) {
	
	return true;
	}else
	return false;
}
		//10
public static double calculateAverage(double[] numbers) {
	double sum = 0;
	for (double number : numbers) {
		sum += number;
	}
	return sum / numbers.length;
		
}

		//11
	double[] numbers1= {6, 78, 47 };
	double[] numbers2 = {7, 78, 45 };
	public static boolean isGreater(double[] numbers1, double[] numbers2) {
		double x = DoubleStream.of(numbers1).sum();
		double y = DoubleStream.of(numbers2).sum();
		if( (x /numbers1.length) > (y / numbers2.length) ) {
		return true;
		}else  {
		return false;
	}
}
		//12
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		if( isHotOutside && moneyInPocket > 10.50) {
		
		return true;
		}else
		return false;
	}	
		//13
	// This method checks the sum of two arrays than subtracks to see if its above a certain number
	// than checks if two boolean values equal true and then returns a string.
	// I created this method because it has values in it that pertained to my life recently and
	//  the choices I have made.
	public static String areYouEarningEnough(double[] paychecks, double[] bills, boolean moneyForHobbies, boolean funMoney) {
		double v = DoubleStream.of(paychecks).sum();
		double c = DoubleStream.of(bills).sum();
		double leftOverCash =  v - c;
		double m = 187;
		String yy = "Its time for a career change!!";
		String tt = "keep on keeping on";
		if( leftOverCash >= m && moneyForHobbies == true && funMoney == true ) {
			return tt;
		}else

			return yy;
	}
}
