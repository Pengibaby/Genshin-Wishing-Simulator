
public class FiveStar {
	
	String[] fiveStarPool;
	int baseRate;
	int pity;
	boolean fiftyFifty = true;
	
	public FiveStar() {
		this.fiveStarPool = new String[] {"FiveLimited", "Five1", "Five2", "Five3", "Five4", "Five5"};
		this.baseRate = 6; //any number between 1 and 6 (inclusive) out of 1000.
		this.pity = 0;
	}
	
	public String getLimitedFiveStar() {
		return this.fiveStarPool[0];
	}
	
	public String getRandomStandardFiveStar() {
		int randomNumber = 1 + (int)(Math.random() * 5);
		
		return this.fiveStarPool[randomNumber];
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
	
	public boolean atFiftyFifty() {
		return this.fiftyFifty;
	}
	
	public void setFiftyFifty(boolean value) {
		this.fiftyFifty = value;
	}
	
	public void resetFiveStar() {
		this.baseRate = 6;
		this.pity = 0;
	}
}
