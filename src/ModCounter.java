
public class ModCounter extends Counter{
	//Attributs
	private int modulo;
	//Constructeurs
	public ModCounter(){
		super();
		modulo=60;
		System.out.println("Default constructor of ModCounter class");
	}
	public ModCounter(int mod){
		super();
		modulo=mod;
		System.out.println("Constructor of ModCounter class with modulo parameter!");
	}
	public ModCounter(int val, int mod){
		super(val);
		modulo=mod;
		System.out.println("Constructor of ModCounter class " +
				"with modulo and value parameters!");
	}
	//Méthodes
	public void increment(){
		if(super.getValue()==modulo-1)super.setValue(0);
		else super.increment();
	}
	public void decrement(){
		if(super.getValue()==0)super.setValue(modulo-1);
		else super.decrement();
	}
}