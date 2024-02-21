package com.promineo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Deck {

	private Random rand = new Random();
	private List<Card> cards = new ArrayList<>();
	private String[] suits = {"spades", "diamonds", "clubs", "hearts"};
	private String[] names = {"two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "jack", "queen", "king", "ace"};
	
	public Deck() {
		for (String suit : suits) {
			for (String n : names) {
				cards.add(new Card(n, suit));
			}		
		}
	}
	
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
	
	public List<Card> draw() {
		int handSize = 5;
		List<Card> hand = new ArrayList<>();
		
		for (int i = 0; i < handSize; i++) {
			hand.add(cards.get(i));
			cards.remove(i);
		}
		return hand;
	}
	public List<Card> draw(int handSize) {
		List<Card> hand = new ArrayList<>();
		
		for (int i = 0; i < handSize; i++) {
			hand.add(cards.get(i));
			cards.remove(i);
		}
		return hand;
	}

}
