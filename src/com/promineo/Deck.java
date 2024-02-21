package com.promineo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	Random rand = new Random();
	List<Card> cards = new ArrayList<>();
	
	public Deck() {}
	
	public Deck(List<Card> cards) {
		this.cards = cards;
	}
	
	public void addCard(Card card) {
		cards.add(card);
	}
	
	public void describe() {
		for (Card c : cards) {
			c.describe();
		}
	}
	
	public void shuffle() {
		List<Card> newDeck = new ArrayList<>();
		
		while (cards.size() > 0) {
			int i = rand.nextInt(cards.size());
			newDeck.add(cards.get(i));
			cards.remove(i);
		}
		cards = newDeck;
	}

}
