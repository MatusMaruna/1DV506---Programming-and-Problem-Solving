package mm223fj_assign3;

import mm223fj_assign3.Deck.*;

public class Card{
    private final Suit suit;
    private final Rank rank;
    
    public Card(Suit suit, Rank rank){
         this.suit=suit;
         this.rank=rank;
    }
    public Suit getSuit() {
        return suit;
    }

    public Rank getRank() {
        return rank;
    }

    public String toString() {
        return rank +" Of " +suit;
    }

}
