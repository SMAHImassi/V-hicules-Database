
public class Counter implements IntCounter{
	//Attributs
	private int value;
	//Constructeurs
	public Counter(){
		value = 0;
		System.out.println("Default constructor of Counter class!");
	}
	public Counter(int val){
		value=val;
		System.out.println("Constructor with parameters!");
	}
	//Getters et Setters
	public int getValue(){return value;}
	public void setValue(int val){
		value=val;
	}
	//Méthodes
	public void increment(){value++;}
	public void decrement(){value--;}
}