package com.playingCards;

import java.util.*;

public class DeckOfCards {

	private ArrayList<Cards> deck;

	public DeckOfCards(ArrayList<Cards> deck) {
		this.deck=deck;
	}
	
 public DeckOfCards() {
	 List<String> suit = Cards.getLegalSuits();
	 List<String> rank =  Cards.getLegalRanks();
	 
	 deck = new ArrayList<>();
	 
	 for(String suits: suit) {
		 for(String ranks : rank) 
			 deck.add(new Cards(rank , suit));
	 }
 }
	
}
