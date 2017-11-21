
public class Main {

	public static void main(String[] args) {
		// creating object
		DeckOfCards myDeckOfCards = new DeckOfCards();

		// to shuffle in order
		myDeckOfCards.shuffle();

		// print the cards
		for (int i = 0; i < 52; i++) {
			// 4place for cards
			System.out.println("Card " + (i + 1) + ": " + myDeckOfCards.dealOneCard());
		}

	}

}
