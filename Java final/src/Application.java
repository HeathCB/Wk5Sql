
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//2 create a class App with a main method.
	//3 Instantiate a deck and two players .
	// Call the shuffle method on the deck.
	Deck deck = new Deck();
	deck.shuffle();
	Player heath = new Player( "Heath" );
	Player tyler = new Player( "Tyler" );
	//4 Using a for loop iterate 52 times calling the Draw method on each player. 
	for( int x = 0; x < 52; x++) {
		if ( x % 2 == 0 ) {
			heath.draw( deck );
			tyler.draw( deck );
		}
	}
	// 5 Using a for loop to iterate 26 times calling the flip method for each player.
	for( int y = 0; y < 26; y++) {
		Card playerOneCard = heath.flip();
		Card playerTwoCard = tyler.flip();
		
		
	//5a Compare the value of each card returned by the two players flip methods and incrementing the score accordingly.	
		if ( playerOneCard.getValue() > playerTwoCard.getValue() ) {
			heath.incrementScore();
		}else if ( playerOneCard.getValue() < playerTwoCard.getValue() ) {
			tyler.incrementScore();
		} 
	}
	
	//6 After the loop compare the final score from each player.
	//7 print the final score of each player or draw depending on score.
	if ( heath.getScore() > tyler.getScore() ) {
		System.out.println( "Heath is the winner!!!!" );
		System.out.println( "Heath won with a score of " + " " + heath.getScore() );
	}else if ( heath.getScore() < tyler.getScore() ) {
		System.out.println( "Tyler is the winner!!!!" );
		System.out.println( "Tyler won with a score of " + " " + tyler.getScore() );
	}else {
		System.out.println( "Its a draw!!!!" );
		System.out.println( "Heaths score:" + " " + heath.getScore() );
		System.out.println( "Tylers score:" + " " + tyler.getScore() );
	}
	}

}
