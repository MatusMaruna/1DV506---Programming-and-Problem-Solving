package mm223fj_assign3;

public class PlayCardsMain {
public static void main(String []args){  
	Deck deck=new Deck();
    deck.shuffle(); 
    deck.deal(); 
    System.out.println("Number of cards left: "+deck.getDeckSize()); 
    deck.deal(); 
    System.out.println("Number of cards left: "+deck.getDeckSize());
    deck.resetDeck(); 
    deck.shuffle(); 
    System.out.println("Number of cards left: "+deck.getDeckSize()); 
    deck.deal(52);
}
}
