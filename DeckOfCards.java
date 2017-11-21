import java.util.Random;

public class DeckOfCards {

	// creating card objects
	private Cards deck[];
	// card to be used next
	private int cardPlayed;
	// bcs number cards cant be changed
	private final int nmbOfCards = 52;
	// generating number randomly
	private Random randomNumber;

	// constructors without initializing variables
	public DeckOfCards() {
		String faces[] = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
		String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

		// array of cards object
		deck = new Cards[nmbOfCards];
		// start from 0
		cardPlayed = 0;
		// creating random generator
		randomNumber = new Random();

		// populating card objects
		for (int count = 0; count < deck.length; count++) {
			deck[count] = new Cards(faces[count % 13], suits[count / 13]);
		}
	}

	// to shuffle decks and does not return anything
	public void shuffle() {
		// after shuffling start deck0
		cardPlayed = 0;
		// swap cards after picking one
		for (int firstCard = 0; firstCard < deck.length; firstCard++) {
			// select a random number
			int secondCard = randomNumber.nextInt(nmbOfCards);
			// swap it
			swap(firstCard, secondCard);
		}
	}

	private void swap(int firstCard, int secondCard) {
		Cards temp = deck[firstCard];
		deck[firstCard] = deck[secondCard];
		deck[secondCard] = temp;
	}

	// deal cards
	public Cards dealOneCard() {
		if (cardPlayed < deck.length)
			// adding card to the array of cards
			return deck[cardPlayed++];

		// if no more cards
		else
			return null;
	}
}
