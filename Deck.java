import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> cards;
    private Random rnum;

        public Deck(){
            rnum = new Random();
            cards = new ArrayList<Card>(Suit.values().length * Rank.values().length);
            resetDeck();
        }

        public void resetDeck() {
            cards.clear();
            //creating all possible cards
            for (Suit s : Suit.values()) {
                for (Rank r : Rank.values()) {
                    Card c = new Card(s, r);
                    cards.add(c);
                }
            }
        }

        //removes card from the deck
        public Card pullRandom(){
            if(cards.isEmpty())
                return null;

            Card pulled = cards.remove(randInt(0, cards.size() - 1));
            return pulled;
        }

        //leaves card in the deck
        public Card pickRandom(){
            if(cards.isEmpty())
                return null;

            Card picked = cards.get(randInt(0, cards.size() - 1));
            return picked;
        }

        public int randInt(int min, int max) {
            int rand = rnum.nextInt((max - min) + 1) + min;
            return rand;
        }

        public boolean isEmpty(){
            return cards.isEmpty();
        }
}
