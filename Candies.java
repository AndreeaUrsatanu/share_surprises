package Curs13Proiect2;

import java.util.Random;

class Candies implements ISurprise {

	private static final String[] types = { "chocolate", "jelly", "fruits", "vanilla" };
	private int num; 
	private String type;
	private static Random randomGenerator = new Random();

	public Candies(int num, String type) {
		this.num = num;
		this.type = type;
	}
	
	public Candies() {
		
	}

	@Override
	public void enjoy() {
		System.out.println("You received "  + this.num + " " + this.type + " candies.");
	}

	@Override
	public String toString() {
		return "[Candies] number = " + this.num + ", type = " + this.type;
	}

	public static Candies generate() {
		int randomTypeIndex = Candies.randomGenerator.nextInt(Candies.types.length);
		int randomNum = Candies.randomGenerator.nextInt();
		
		return new Candies(randomNum, Candies.types[randomTypeIndex]);
	}
}
