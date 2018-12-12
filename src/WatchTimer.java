
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
public class WatchTimer implements ActionListener {
	private WatchH w;
	private Timer t;
	// Default constructor
	public WatchTimer(){
		w=new WatchH(0,0,0);
		t=new Timer(10,this);
		System.out.println("Default constructor of the class " +
				"WatchTimer created!");
	}
	// Constructor with parameters
	public WatchTimer(int hr, int min, int sec, int period){
		w=new WatchH(hr,min,sec);
		t=new Timer(period,this);
		System.out.println("Constructor of the class WatchTimer" +
				" with parameters min, sec and period " +
				"has been created!");
	}
	public Timer getTimer()
	{
		return t;
	}
	public void actionPerformed(ActionEvent e) {
		w.incrementSecondes();
		System.out.println("Timer called!");
	}
	public void startTimer(){
		t.start();
		System.out.println("Timer started!");
	}
	public void stopTimer(){
		t.stop();
		System.out.println("Timer stoped!");
	}
	
	public void restartTimer()
	{
		w.getHoursCounter().setValue(0);
		w.getMinutesCounter().setValue(0);
		w.getSecondesCounter().setValue(0);
		t.start();
	}
	public WatchH getWatch(){
		return w;
	}
}
