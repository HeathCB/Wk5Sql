
public class loop{
	public static void main(String[] args) {
//	int x = 0;
//	while ( x <= 100) {
//		System.out.println( x );
//		x = x + 1 + 1;
//	}
//	
//	int x = 100;
//	while ( x >= 0 ) {
//		
//		System.out.println( x );
//		x = x - 3;
//	}	
	


	for ( int x = 1; x <= 100; x = x + 2) {
		System.out.println( x );
	}

	for ( int x = 0; x <= 100; x++) {
		if ((( x % 3 ) ==0 ) && (( x % 5 ) ==0 ))
			System.out.println( "Hello World" );
		else if (( x % 5) == 0 )
			System.out.println( "World" );
		else if (( x % 3) == 0 )
			System.out.println( "Hello" );
		else
			System.out.println( x );
	}
}
}
