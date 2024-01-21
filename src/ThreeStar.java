
public class ThreeStar {
	
	String[] threeStarPool;
	int baseRate;
	int pity;
	
	public ThreeStar() {
		this.threeStarPool = new String[] {"Three1", "Three2", "Three3", "Three4", "Three5", "Three6", "Three7", "Three8", "Three9", "Three10"};
		this.baseRate = 7; //any number between 7 and 948 (Inclusive) out of 1000.
	}
	
	public String getRandomThreeStar() {
		int randomNumber = (int)(Math.random() * 10);
		
		return this.threeStarPool[randomNumber];
	}
	
	public void setBaseRate(int rate) {
		this.baseRate = rate;
	}
	
	public int getBaseRate() {
		return this.baseRate;
	}
	
	public void resetThreeStar() {
		this.baseRate = 7;
	}
}
