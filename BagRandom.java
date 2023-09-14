package Curs13Proiect2;

import java.util.ArrayList;
import java.util.Random;

class BagRandom implements IBag {

	private ArrayList<ISurprise> surprises;

	BagRandom() {
		this.surprises = new ArrayList<>();
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.surprises.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while (!bagOfSurprises.isEmpty()) {
			ISurprise nextSurprise = bagOfSurprises.takeOut();
			this.put(nextSurprise);
		}
	}

	@Override
	public ISurprise takeOut() {
		if (!this.surprises.isEmpty()) {
			Random randomGenerator = new Random();
			int nextIndex = randomGenerator.nextInt(surprises.size());
		
			return this.surprises.remove(nextIndex);
		}
		
		return null;
	}

	@Override
	public boolean isEmpty() {
		return this.surprises.isEmpty();
	}

	@Override
	public int size() {
		return this.surprises.size();
	}
}