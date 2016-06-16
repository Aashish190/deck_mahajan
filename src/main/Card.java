package main;

public class Card implements Comparable<Card>{
	
	private String suit;
	private String value; 
	   
	public Card() {
	}

	public Card(String s, String v) {
		this.suit = s;
		this.value  = v;
	}

	public String getSuit() {
		return suit;
	}

	public String getValue() {
		return value;
	}

	@Override
	public int compareTo(Card o) {
		// TODO Auto-generated method stub//
		Deck d = new Deck();
		if(d.suit.indexOf(this.getSuit()) == d.suit.indexOf(o.getSuit())){
			if(d.value.indexOf(this.getValue()) < d.value.indexOf(o.getValue())){
				return -1;
			}else{
				return 1;
			}
		}else if (d.suit.indexOf(this.getSuit()) < d.suit.indexOf(o.getSuit())){
			return -1;
		}else{
			return 1;
		}
	}
}
