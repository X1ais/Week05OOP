package com.promineo;

public class Card {
	
	/*
	 * Fields
	 */
	private String name; 
	private String suit;
	private int value;		
	
	public Card() {}
	
	public Card(String name, String suit) {
		this.name = name.toLowerCase();
		this.suit = suit.toLowerCase();
		setValue(name);
	}
	
	/*
	 * Getters and Setters
	 */
	public void setName(String name){
		this.name = name;
		setValue(name);
	}
	
	public String getName() {
		return name;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public String getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}

	/*
	 * Other Public Methods
	 */
	public void describe() {
		System.out.println(name + " of " + suit);
	}
	
	/*
	 * Sets the value of the card based on what the name of the card is (i.e a "two" has a value of '2')
	 */
	private void setValue(String name) {
		switch (name.toLowerCase()) {
			case "two":
				this.value = 2;
				break;
			case "three":
				this.value = 3;
				break;
			case "four":
				this.value = 4;
				break;
			case "five":
				this.value = 5;
				break;
			case "six":
				this.value = 6;
				break;
			case "seven":
				this.value = 7;
				break;
			case "eight":
				this.value = 8;
				break;
			case "nine":
				this.value = 9;
				break;
			case "ten":
				this.value = 10;
				break;
			case "jack":
				this.value = 11;
				break;
			case "queen":
				this.value = 12;
				break;
			case "king":
				this.value = 13;
				break;
			case "ace":
				this.value = 14;
				break;
			default:
				System.out.println("Something went wrong!");
		}
	}
	
	
	

}
