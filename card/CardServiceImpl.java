package com.jse.card;

public class CardServiceImpl implements CardService {

	private Card[] cards;
	private int count;

	public CardServiceImpl() {
		cards = new Card[3];
		count = 0;
	}

	@Override
	public int count() {
		return count;
	}

	@Override
	public void add(Card card) {
		cards[count] = card;
		count++;
	}

	@Override
	public Card[] list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Card detail(Card card) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Card card) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Card card) {
		// TODO Auto-generated method stub

	}

	@Override
	public String PrintCard() {
		// TODO Auto-generated method stub
		return null;
	}

}
