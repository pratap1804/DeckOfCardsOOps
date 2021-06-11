package com.playingCards;

import java.util.*;

public class Cards {
	
	private String rank;
	private String suit;
	
	public Cards(String rank, String suit) {
		this.rank = rank;
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}
	
	public static List<String> getLegalRanks(){
		return Arrays.asList("2","3","4","5","6","7","8","9","Jack","Queen","King","Ace");
	}
	
	public void setRank(String rank){
		List<String> legalRanks = getLegalRanks(); 
		rank = rank.toLowerCase();
		
		if(legalRanks.contains(rank))
		this.rank = rank;
		else 
			throw new IllegalArgumentException("Legal Ranks Are:" + legalRanks);
	}

	public String getSuit() {
		return suit;
	}

	public static List<String> getLegalSuits(){
		return Arrays.asList("Hearts", "Diamonds", "Spades", "Club");
	}
	
	public void setSuit(String suit) {
		List<String> legalSuits = getLegalSuits();
		suit = suit.toLowerCase();
		
		if(legalSuits.contains(suit))
		this.suit = suit;
	else
		throws new IllegalArgumentException("Legal Suits Are: "+ legalSuits);
	
	}
	
	public String toString() {
		return String.format("%s of %s", rank, suit);
	}
	
}