import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Deck {
	//1. b. ii. Created and array list of Card
	ArrayList<Card> cards = new ArrayList<>();
	// created list of suit
	List<String> suits = Arrays.asList("Clubs", "Diamonds", "Hearts", "Spades");
	//Adding suit to the card class and populating deck with 52 cards.
	public Deck () {
		for ( int x = 2; x <= 14; x++ ) {
			for ( String suit: suits ) {
				cards.add( new Card( x , suit ) );
			}
		}
	}
	//1. b. ii. 1 Shuffle method 
	public void shuffle() {
		Collections.shuffle( cards );
	}
	//1. b. ii. 2 Draw method
	public Card draw() {
		return cards.remove( 0 );
		
	}
}
