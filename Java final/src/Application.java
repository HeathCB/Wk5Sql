
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//2 create a class App with a main method
	//3 Instantiate a deck and two players 
	// Call the shuffle method on the deck
	Deck deck = new Deck();
	deck.shuffle();
	Player playerOne = new Player( "Heath" );
	Player playerTwo = new Player( "Tyler" );
	//4 Using a for loop iterate 52 times calling the Draw method on each player  
	for( int x = 0; x < 52; x++) {
		if ( x % 2 == 0 ) {
			playerOne.draw( deck );
			playerTwo.draw( deck );
		}
	}
	// 5 Using a for loop to iterate 26 times calling the flip method for each player.
	for( int y = 0; y < 26; y++) {
		Card playerOneCard = playerOne.flip();
		Card playerTwoCard = playerTwo.flip();
		
	//5a Compare the value of each card returned by the two players flip methods and incrementing the score accordingly.	
		if ( playerOneCard.getValue() > playerTwoCard.getValue() ) {
			playerOne.incrementScore();
		}else if ( playerOneCard.getValue() < playerTwoCard.getValue() ) {
			playerTwo.incrementScore();
		} 
	}

	//6 After the loop compare the final score from each player.
	//7 print the final score of each player or draw depending on score.
	if ( playerOne.getScore() > playerTwo.getScore() ) {
		System.out.println( "Player 1 is the winner!!!!" );
		System.out.println( "Player 1 won with a score of " + " " + playerOne.getScore() );
	}else if ( playerOne.getScore() < playerTwo.getScore() ) {
		System.out.println( "Player 2 is the winner!!!!" );
		System.out.println( "Player 2 won with a score of " + " " + playerTwo.getScore() );
	}else {
		System.out.println( "Its a draw!!!!" );
		System.out.println( "Player 1 score:" + " " + playerOne.getScore() );
		System.out.println( "Player 2 score:" + " " + playerTwo.getScore() );
	}
	}

}
