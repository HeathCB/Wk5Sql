import java.util.ArrayList;

public class Player {
	//1. c. i. 1. creating hand a list of Card
	ArrayList<Card> hand = new ArrayList<Card>();
	//1. c. i. 2 & 3. Creating score value and name field for the player class
	private int score;
	String name;
	
	//Score values getters and setters
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	//creating a player with the score set to zero	
	public Player(String newName) {
		name = newName;
		score = 0;
	}
	// 1. c. ii. 1. creating the describe method prints out info about the player and calls the describe method for each card in the hand list.
	public void describe() {
		for ( Card card : hand ) {
			card.describeCard();
			System.out.println ( name );
		}
	}
	//1. c. ii. 2 flip returns the top card of the hand
	public Card flip() {
		return hand.remove( 0 );
	}
	//1. c. ii 3 takes the Deck as an arguement and call the draw method on the deck adding th returned card to the hand field.
	public void draw( Deck deck ) {
		hand.add( deck.draw() );
	}
	//1. c. ii. 4 Increment score adds 1 to the players score field
	public void incrementScore() {
		score++;
	}
}
