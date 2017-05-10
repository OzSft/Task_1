
public abstract class Mashine implements Run, Comparable<Mashine>{
	final double MAX_SPEED = 250;
	final double MIN_SPEED = 0;
	final int MIN_PASSENGER = 0;
	final int MAX_PASSENGER = 30;
	String name;
	int currentSpeed;
	
	Mashine(String name, int currentSpeed){
		this.name = name;
		this.currentSpeed = currentSpeed; 
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}

	@Override
	public int compareTo(Mashine o) {
		int compareSpeed = ((Mashine)o).getSpeed();
		return this.currentSpeed - compareSpeed;
	}

	@Override
	public int getSpeed() {
		return currentSpeed;
	}
	
}
