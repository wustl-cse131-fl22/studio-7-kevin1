package studio7;

public class die {
	private int sideNumber;
	private int result;

	public die(int sideNumber) {
		super();
		this.sideNumber = sideNumber;
		result = (int) ((Math.random()*sideNumber)+1);
	}
	
}
