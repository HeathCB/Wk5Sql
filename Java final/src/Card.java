
public class Card {
	
	//1 Create the the Card class
	//1 a. i. Create the fields for the Card class
	private String name;
	private int value;
	// creating a card and adding inputs to value
	//  and adding suit to name
	public Card( int values, String suit ) {
		value = values;
		switch ( values ) {
		case 2: name = "Two";
			break;
		case 3: name = "Three";
			break;
		case 4: name = "Four";
			break;
		case 5: name = "Five";
			break;
		case 6: name = "Six";
			break;
		case 7: name = "Seven";
			break;
		case 8: name = "Eight";
			break;
		case 9: name = "Nine";
			break;
		case 10: name = "Ten";
			break;
		case 11: name = "Jack";
			break;
		case 12: name = "Queen";
			break;
		case 13: name = "King";
			break;
		case 14: name = "Ace";
			break;
		}
		name += " of " + suit;
	}
	//1 a. ii. 2. Make a describe method that prints out information about a card.
	public void describeCard() {
		System.out.println( name + " " + value );
	}

	//1 a. ii. 1. Make getters and setter for you value and name.
	public String getName() {
		return name;
	}


	public void setName( String name ) {
		this.name = name;
	}


	public int getValue() {
		return value;
	}


	public void setValue(int value) {
		this.value = value;
	}
	
}
