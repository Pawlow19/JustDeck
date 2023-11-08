public class Main{
    public static void main(String[] args){
        Deck myDeck = new Deck();
        Card myCard = myDeck.pickRandom();
        System.out.println("Your card is: " + myCard.getRank() + " of " + myCard.getSuit());
    }
}