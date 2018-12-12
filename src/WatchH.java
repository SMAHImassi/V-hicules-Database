
public class WatchH extends Watch{
	//Attributs
	private ModCounter hours;
	//Constructeurs
	public WatchH(){
		super();
		hours = new ModCounter(24);
	}
	public WatchH(int h, int m, int s){
		super(m,s);
		hours = new ModCounter(h,24);
	}
	//Getters et Setters
	public ModCounter getHoursCounter(){
		return hours;
	}
	//Méthodes
	public void incrementMinutes(){
		super.minutes.increment();
		if(super.minutes.getValue()==0) hours.increment();
	}
	public void incrementHours(){
		hours.increment();
	}
	public void decrementSecondes(){
		secondes.decrement();
		if(secondes.getValue()==59) decrementMinutes();;
	}
	public void decrementMinutes(){
		super.minutes.decrement();
		if(super.minutes.getValue()==59) hours.decrement();
	}
	public void decrementHours(){
		hours.decrement();
	}
}
