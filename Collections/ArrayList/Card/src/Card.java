import java.util.ArrayList;
import java.util.Objects;

public class Card implements Comparable<Card> {
    String suit;
    String value;

    public Card(String kSuit, String kValue){
        this.suit = kSuit;
        this.value = kValue;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(suit, card.suit) && Objects.equals(value, card.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }

    @Override
    public int compareTo(Card o) {
        return 0;
    }


    public static void main(String[] args) {

    }
}
