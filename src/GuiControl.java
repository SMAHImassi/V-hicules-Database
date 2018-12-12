import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.omg.CORBA.PRIVATE_MEMBER;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.management.loading.PrivateClassLoader;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.function.Predicate;
import java.awt.event.ActionEvent;

public class GuiControl extends JFrame {

	private JPanel contentPane;
	public Database data;
	protected Database db; 
	private WatchTimerLabel wtl;
	String pr;
	String dt;
	JTextField txtNom;
	JTextField txtPrenom;
    JTextField today;
	JLabel lblNewLabel_2;
	JCheckBox chckbxNewCheckBox_4;
	JCheckBox chckbxNewCheckBox_3;
	JCheckBox chckbxNewCheckBox_2;
	JCheckBox chckbxNewCheckBox_1;
	JCheckBox chckbxNewCheckBox;
	JLabel state;
	JLabel lastDate;
	JLabel lblNewLabel_3;
	JButton btnTrouver;
	JButton btnNewButton;
	JButton btnNewButton_1;
	JComboBox brand;
	JComboBox type;
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiControl frame = new GuiControl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */


	public GuiControl() {
		setTitle("controle technique");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setToolTipText("brand");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	
		db=new Database(this);
		
		
		txtNom = new JTextField();
		txtNom.setBounds(10, 11, 86, 20);
		contentPane.add(txtNom);
		txtNom.setColumns(10);
		
		txtPrenom = new JTextField();
		txtPrenom.setBounds(10, 42, 86, 20);
		contentPane.add(txtPrenom);
		txtPrenom.setColumns(10);
		
		today = new JTextField();
		today.setBounds(296, 42, 86, 20);
		contentPane.add(today);
		today.setColumns(10);
		
		state = new JLabel("Etat");
		state.setBounds(296, 14, 46, 14);
		contentPane.add(state);
		
		lastDate = new JLabel("Derni\u00E8re r\u00E9vision");
		lastDate.setBounds(296, 28, 94, 14);
		contentPane.add(lastDate);
		
		lblNewLabel_2 = new JLabel("Temps");
		lblNewLabel_2.setBounds(296, 187, 109, 14);
		contentPane.add(lblNewLabel_2);
		
		
		lblNewLabel_3 = new JLabel("Prix");
		lblNewLabel_3.setBounds(296, 224, 109, 14);
		contentPane.add(lblNewLabel_3);
		
		btnTrouver = new JButton("Trouver");
		
		btnTrouver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev0) {
				if (ev0.getSource() == btnTrouver){
					db.find(txtNom.getText(), txtPrenom.getText());}
				if (db.find(txtNom.getText(), txtPrenom.getText()) == 0) {
					btnNewButton.setEnabled(false);
					chckbxNewCheckBox.setEnabled(false);
					chckbxNewCheckBox_1.setEnabled(false);
					chckbxNewCheckBox_2.setEnabled(false);
					chckbxNewCheckBox_3.setEnabled(false);
					chckbxNewCheckBox_4.setEnabled(false);
				
				}
				else {
					btnNewButton.setEnabled(true);
				}
			
			}
		});
		btnTrouver.setBounds(10, 73, 89, 23);
		contentPane.add(btnTrouver);
		
		btnNewButton = new JButton("Start");
		btnNewButton.setEnabled(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev1) {
		
					wtl.restartTimer();
					
					lblNewLabel_3.setText("Prix:");
					
					chckbxNewCheckBox.setEnabled(true);
					chckbxNewCheckBox_1.setEnabled(true);
					chckbxNewCheckBox_2.setEnabled(true);
					chckbxNewCheckBox_3.setEnabled(true);
					chckbxNewCheckBox_4.setEnabled(true);
					
					chckbxNewCheckBox.setSelected(false);
					chckbxNewCheckBox_1.setSelected(false);
					chckbxNewCheckBox_2.setSelected(false);
					chckbxNewCheckBox_3.setSelected(false);
					chckbxNewCheckBox_4.setSelected(false);
					
					
				
					 
				}
			}
		);
		btnNewButton.setBounds(296, 73, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Terminer");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ev2) {
				
				if (chckbxNewCheckBox_4.isSelected() && chckbxNewCheckBox.isSelected() && chckbxNewCheckBox_1.isSelected() && chckbxNewCheckBox_2.isSelected() && chckbxNewCheckBox_3.isSelected()){
					wtl.stopTimer();
					}	
				
					dt=db.setDate(today.getText());
					lastDate.setText(dt);
					pr=db.price(lblNewLabel_2.getText()); 
					lblNewLabel_3.setText(pr);
			
				if (ev2.getSource() == btnNewButton_1){
					chckbxNewCheckBox.setEnabled(false);
					chckbxNewCheckBox_1.setEnabled(false);
					chckbxNewCheckBox_2.setEnabled(false);
					chckbxNewCheckBox_3.setEnabled(false);
					chckbxNewCheckBox_4.setEnabled(false);
					
					
	
				}
				
			}
		});
		btnNewButton_1.setBounds(141, 228, 89, 23);
		contentPane.add(btnNewButton_1);
		
		brand = new JComboBox();
		brand.setToolTipText("");
		brand.setModel(new DefaultComboBoxModel(new String[] {"", "Peugeot", "BMW", "Renault", "Mercedes"}));
		brand.setBounds(156, 11, 74, 20);
		contentPane.add(brand);
		
		type = new JComboBox();
		type.setModel(new DefaultComboBoxModel(new String[] {"", "308", "508", "320", "520", "Megane", "Captur", "C200", "E200"}));
		type.setBounds(156, 42, 61, 20);
		contentPane.add(type);
		
		chckbxNewCheckBox = new JCheckBox("Equipement");
		chckbxNewCheckBox.setBounds(141, 198, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		chckbxNewCheckBox.setEnabled(false);
		
		chckbxNewCheckBox_1 = new JCheckBox("Signalisation");
		chckbxNewCheckBox_1.setBounds(141, 172, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		chckbxNewCheckBox_1.setEnabled(false);
		
		chckbxNewCheckBox_2 = new JCheckBox("Pollution");
		chckbxNewCheckBox_2.setBounds(141, 146, 97, 23);
		contentPane.add(chckbxNewCheckBox_2);
		chckbxNewCheckBox_2.setEnabled(false);
		
	    chckbxNewCheckBox_3 = new JCheckBox("Moteur");
		chckbxNewCheckBox_3.setBounds(141, 120, 97, 23);
		contentPane.add(chckbxNewCheckBox_3);
		chckbxNewCheckBox_3.setEnabled(false);
		
		chckbxNewCheckBox_4 = new JCheckBox("Freins");
		chckbxNewCheckBox_4.setBounds(141, 100, 97, 23);
		contentPane.add(chckbxNewCheckBox_4);
		chckbxNewCheckBox_4.setEnabled(false);
		
		wtl=new WatchTimerLabel(lblNewLabel_2);
		
	}
}
