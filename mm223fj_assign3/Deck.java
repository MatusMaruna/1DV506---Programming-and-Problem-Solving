package mm223fj_assign3;

import java.util.Random;

public class Deck {
private Card cards[];
private int count; 
private Suit suits[]; 
private Rank ranks[];
public enum Suit{ 
	CLUB, DIAMOND,SPADE,HEART} 
public enum Rank{ 
	ACE,TWO,THREE,FOUR,FIVE,SIX,SEVEN,EIGHT,NINE,TEN,JACK,QUEEN,KING}

public Deck(){ 
cards = new Card[52];
count = 0;  
suits = Suit.values();
ranks = Rank.values();
for (int i = 0; i <4; i++){  // number of suits
	for(int u = 0; u <13; u++){ //number of ranks
		cards[count++] = new Card(suits[i],ranks[u]); // create the new cards
	}
}
}
public void shuffle(){ 
	Random shuffle = new Random(); 
	if(count == 52){ 
	for(int i = 0; i <52; i++){ 
		int x = shuffle.nextInt(count); 
		int y = shuffle.nextInt(count); 
		
		Card temp = cards[x]; 
		cards[x] = cards[y]; 
		cards[y] = temp; 
	}
	}else{ 
		System.err.println("You need to have 52 cards in the deck use deckReset"); // return an error if there is less than 52 cards in the deck 
	}
}

public void deal(){ 
	System.out.println(cards[--count]); 
}
public void deal(int x){  // how many cards to deal 
	for(int i = 0; i<x; i++){ 
		System.out.println(cards[--count]);
	}
}
public void resetDeck(){ 
	count = 52; 
}
public int getDeckSize() { 
	return count; 
}
 
}

