import java.util.stream.DoubleStream;

public class practice {
	
	
	 //This is all my methods for week 3 coding assignment
	// below are the variables and the Sys.outs of all my methods


public static void main(String[] args) {
	double[] numbers1= {6, 78, 47 };
	double[] numbers2 = {7, 78, 45 };
	int[] number = {45, 7, 78};
	double[] numbers = {78, 47, 6};
	boolean isHotOutside = false;
	double moneyInPocket = 11.50;
	int max = 3;
	String str = "Peekaboo";
	double[] paychecks = { 833.50, 567.09 };
	double[] bills = { 67, 101, 58.67, 35, 67.02, 72.88, 27.63, 465, 40, 57.43 , 257 };
	boolean moneyForHobbies = false;
	boolean funMoney = false;
	String firstName = "Heath";
	String lastName = "Brown";
	String fullName = createFullName(firstName, lastName);
	System.out.println(multiConcat( str, max));
	System.out.println( fullName);
	System.out.println(sumArray( number ));
	System.out.println(calculateAverage( numbers));
	System.out.println(isGreater(numbers1, numbers2));
	System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
	
	System.out.println(areYouEarningEnough( paychecks, bills, moneyForHobbies, funMoney));
}
//7
public static String multiConcat (String str, int max)
{
 String result = "";
 for (int i = 1; i <= max; i++)
 result += str;
 return result;
}
//8
public static String createFullName(String w , String q) {
	String fullName = q + " " + w;
	return  fullName;
	}
//9
public static boolean sumArray(int[] number) {
	int sum = 0;
	for (int s : number){
		sum += s ;
		
	}if (sum > 100) {
	
	return true;
	}else
	return false;
}
//10
public static double calculateAverage(double[] numbers) {
	double sum = 0;
	for (double x : numbers) {
		sum += x;
	}
	return sum / numbers.length;
		
}
//11
public static boolean isGreater (double[] numbers1, double[] numbers2) {
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
	
	//This method decides if you are earning enough money by taking the amount of multiple arrays and subtracting them then seeing how much you have left over. Than it checks to 
	// see if its over a certain amount than checks two boolean values and returns two strings. The variables in this method are closely connected to things that have been on my mind
	// it seemed sort of relatable and easy for me to design a method around.

}

}
