package Curs13Proiect2;

class BagFactory implements IBagFactory {

	private static BagFactory instance = new BagFactory();

	private BagFactory() {
	}

	public static BagFactory getInstance() {
		return BagFactory.instance;
	}

	@Override
	public IBag makeBag(String type) {
		if (type.equals("RANDOM")) {
			return new BagRandom();
		} 
		
		if (type.equals("FIFO")) {
			return new BagFIFO();
		}
		
		if (type.equals("LIFO")) {
			return new BagLIFO();
		}
		
		return null;
	}
}
