
public class FourStar {
	
	String[] fourStarPool;
	int baseRate;
	int pity;
	
	public FourStar() {
		this.fourStarPool = new String[] {"Four1", "Four2", "Four3", "Four4", "Four5", "Four6", "Four7", "Four8", "Four9", "Four10", 
				"Four11", "Four12", "Four13", "Four14", "Four15", "Four16", "Four17", "Four18", "Four19", "Four20"};
		this.baseRate = 949; //Any number between 949 and 1000 (Inclusive) out of 1000.
		this.pity = 0;
	}
	
	public String getRandomFourStar() {
		int randomNumber = (int)(Math.random() * 20);
		
		return this.fourStarPool[randomNumber];
	}
	
	public void setBaseRate(int rate) {
		this.baseRate = rate;
	}
	
	public int getBaseRate() {
		return this.baseRate;
	}
	
	public void incrementPity() {
		this.pity = this.pity + 1;
	}
	
	public int getPity() {
		return this.pity;
	}
	
	public void resetFourStar() {
		this.baseRate = 949;
		this.pity = 0;
	}
}
