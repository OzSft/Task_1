
public abstract class Mashine implements Run{
	final double MAX_SPEED = 250;
	final double MIN_SPEED = 1;
	final int MIN_PASSENGER = 1;
	final int MAX_PASSENGER = 30;
	String name;
	double currentSpeed;
	
	Mashine(String name, double currentSpeed){
		this.name = name;
		this.currentSpeed = currentSpeed; 
	}
	
	public void printName(){
		System.out.println(name);
	}
}
