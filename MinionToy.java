package Curs13Proiect2;

import java.util.Random;

class MinionToy implements ISurprise {

	private static final String[] names = { "Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim" };
	private String name;
	private static Random randomGenerator = new Random();

	public MinionToy(String name) {
		this.name = name;
	}
	
	public MinionToy() {
		
	} 

	@Override
	public void enjoy() {
		System.out.println("You got a minion named " + this.name + "!");
	}

	@Override
	public String toString() {
		return "[Minion] name = " + this.name;
	}

	public static MinionToy generate() {
		int randomTypeIndex = MinionToy.randomGenerator.nextInt(MinionToy.names.length);
		
		return new MinionToy(MinionToy.names[randomTypeIndex]);
	}
}
