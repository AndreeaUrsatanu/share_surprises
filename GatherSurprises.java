package Curs13Proiect2;

import java.util.Random;

final class GatherSurprises {

	private static Random randomGenerator = new Random();

	private GatherSurprises() {
	}

	public static ISurprise[] gather(int n) {
		ISurprise[] surprises = new ISurprise[n];
		
		for (int i = 0; i < n; i++) {
			surprises[i] = generate();
		}
		
		return surprises;
	}

	public static ISurprise gather() {
		return generate();
	}
	
	private static ISurprise generate() { 
		int randomTypeOfSurprise = GatherSurprises.randomGenerator.nextInt(3);
		
		switch (randomTypeOfSurprise) {
			case 0:
				return new FortuneCookie();
			case 1:
				return new Candies();
			case 2:
				return new MinionToy();
			default:
				return null;
		}
	}
}
