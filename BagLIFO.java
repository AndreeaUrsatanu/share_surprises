package Curs13Proiect2;

import java.util.ArrayList;

class BagLIFO implements IBag {

	private ArrayList<ISurprise> surprises;

	BagLIFO() {
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
			return this.surprises.remove(surprises.size() - 1);
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
