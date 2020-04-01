
public class Card {
	String rank;
	String suit;
	int value;

	// Constructor
	Card(String r, String s) {
		rank = r;
		suit = s;
		value = 0;
	}

	/**
	 * This method assigns a value to each Card according to the rules of Blackjack.
	 * This value is saved as a variable of the Card. Aces have a value of 1 by
	 * default (cases where aces have a value of 11 are handled later).
	 */
	public void getValue() {
		if ((rank == "K") || (rank == "10") || (rank == "J") || (rank == "Q")) {
			value = 10;
		} else if (rank == "9") {
			value = 9;
		} else if (rank == "8") {
			value = 8;
		} else if (rank == "7") {
			value = 7;
		} else if (rank == "6") {
			value = 6;
		} else if (rank == "5") {
			value = 5;
		} else if (rank == "4") {
			value = 4;
		} else if (rank == "3") {
			value = 3;
		} else if (rank == "2") {
			value = 2;
		} else if (rank == "A") {
			value = 1;
		} else {
			value = 0;
		}
	}

}
