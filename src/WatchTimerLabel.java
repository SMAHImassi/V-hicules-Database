
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

public class WatchTimerLabel extends WatchTimer{
	public WatchTimerLabel(JLabel f)
	{
		super();
		lab=f;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		super.actionPerformed(e);
		int hr= getWatch().getHoursCounter().getValue();
		int min= getWatch().getMinutesCounter().getValue();
		int sec= getWatch().getSecondesCounter().getValue();
		String str=(hr<10?"0"+hr:hr)+":"+(min<10?"0"+min:min)+":"+(sec<10?"0"+sec:sec);
		lab.setText(str);
	}
	
	protected JLabel lab;

}
