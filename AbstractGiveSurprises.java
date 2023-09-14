package Curs13Proiect2;

import java.util.concurrent.TimeUnit;

abstract class AbstractGiveSurprises {

	private IBag bag;
	private int waitTime;

	public AbstractGiveSurprises(String type, int waitTime) {
		IBagFactory bagFactory = BagFactory.getInstance();
		this.bag = bagFactory.makeBag(type);
		this.waitTime = waitTime;
	}

	public void put(ISurprise newSurprise) {
		this.bag.put(newSurprise);
	}

	public void put(IBag surprises) {
		this.bag.put(surprises);
	}

	public void give() {
		if (!isEmpty()) {
			ISurprise surprise = bag.takeOut();
			surprise.enjoy();
			giveWithPassion();
		}
	}

	public void giveAll() {
		while (!isEmpty()) {
			give();
			wait(waitTime);
		}
	}

	public boolean isEmpty() {
		return bag.isEmpty();
	}

	abstract void giveWithPassion();

	private void wait(int waitTime) {
		try {
			TimeUnit.SECONDS.sleep(waitTime); // number of seconds to sleep
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
