
public class Watch {
	//Attributs
	protected ModCounter minutes, secondes;
	//Constructeurs
	public Watch(){
		minutes=new ModCounter();
		secondes=new ModCounter();
		System.out.println("Default constructor!");
	}
	public Watch(int min, int sec){
		minutes=new ModCounter(min,60);
		secondes=new ModCounter(sec,60);
		System.out.println("Constructor with min and sec parameters!");
	}
	//Getters et Setters
	public ModCounter getMinutesCounter(){
		return minutes;
	}
	public ModCounter getSecondesCounter(){
		return secondes;
	}
	//Méthodes
	public void incrementSecondes(){
		secondes.increment();
		if(secondes.getValue()==0) incrementMinutes();
	}
	public void incrementMinutes(){
		minutes.increment();
	}
}