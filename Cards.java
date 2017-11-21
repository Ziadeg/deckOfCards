//class for playing card in deck
public class Cards {

	// private bcs we only use it in this class
	private String face;
	private String suit;

	// initializing cards face and suit by creating 2 constructors
	public Cards(String cardFace, String cardSuit) {
		// face of the card
		face = cardFace;
		// suit of the card
		suit = cardSuit;
	}

	// retruning string representation
	public String toString() {
		return face + " " + "of" + " " + suit;
	}
}
