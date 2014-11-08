
public class Hero {
	private int HP;
	private double waitTime = 0.25;
	private double timeLastFired;
	private Weapon[] weapons;
	
	
	public Hero(){
		HP = 1000;
	}
	
	public int returnHP(){
		return HP;
	}
	
	
	
}
