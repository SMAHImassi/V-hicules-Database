

public class Database {
	
	public Database(GuiControl gc)
	{
		this.gc = gc;
		name = new String[SIZE];
		firstName= new String[SIZE];
		brand = new int[SIZE];
		type = new int[SIZE];
		state = new String[SIZE];
		lastDate = new String[SIZE];
		newDate = new String[SIZE];
		/////////////////////////////
		name[0] = "Inconnu";
		firstName[0]="Inconnu";
		brand[0]=0;
		type[0]=0;
		state[0]="Inconnu";
		lastDate[0]="Inconnu";
		newDate[0]="";
		/////////////////////////////
		name[1] = "Jovanovic";
		firstName[1]="Slavisa";
		brand[1]=1;
		type[1]=1;
		state[1]="OK";
		lastDate[1]="21.11.2016";
		newDate[1]="";
		/////////////////////////////
		name[2] = "Ababou";
		firstName[2]="Mouad";
		brand[2]=1;
		type[2]=2;
		state[2]="OK";
		lastDate[2]="12.01.2012";
		newDate[2]="";
		/////////////////////////////
		name[3] = "Addi";
		firstName[3]="Elias";
		brand[3]=2;
		type[3]=4;
		state[3]="OK";
		lastDate[3]="20.10.2016";
		newDate[3]="";
		/////////////////////////////
		name[4] = "Adem";
		firstName[4]="Bilel";
		brand[4]=2;
		type[4]=3;
		state[4]="OK";
		lastDate[4]="02.07.2011";
		newDate[4]="";
		/////////////////////////////
		name[5] = "Amouchas";
		firstName[5]="Sofiane";
		brand[5]=3;
		type[5]=5;
		state[5]="OK";
		lastDate[5]="07.02.2013";
		newDate[5]="";
		///////////////////////////// 
		name[6] = "Beldi";
		firstName[6]="Mokrane";
		brand[6]=3;
		type[6]=6;
		state[6]="OK";
		lastDate[6]="01.01.2000";
		newDate[6]="";
		/////////////////////////////
		name[7] = "Ben Amara";
		firstName[7]="Lamia";
		brand[7]=4;
		type[7]=7;
		state[7]="OK";
		lastDate[7]="02.07.2011";
		newDate[7]="";
		/////////////////////////////
		name[8] = "Ben Oukhanchouch";
		firstName[8]="Hssain";
		brand[8]=4;
		type[8]=8;
		state[8]="OK";
		lastDate[8]="31.12.2011";
		newDate[8]="";
		/////////////////////////////
		name[9] = "Berret";
		firstName[9]="Mohcine";
		brand[9]=1;
		type[9]=1;
		state[9]="OK";
		lastDate[9]="22.08.2001";
		newDate[9]="";
		/////////////////////////////
		name[10] = "Bulut";
		firstName[10]="Bulent";
		brand[10]=1;
		type[10]=2;
		state[10]="OK";
		lastDate[10]="20.09.2015";
		newDate[10]="";
		/////////////////////////////
		name[11] = "Chapelier";
		firstName[11]="Quentin";
		brand[11]=2;
		type[11]=3;
		state[11]="OK";
		lastDate[11]="03.03.2009";
		newDate[11]="";
		/////////////////////////////
		name[12] = "Daboussi";
		firstName[12]="Hatem";
		brand[12]=3;
		type[12]=6;
		state[12]="OK";
		lastDate[12]="20.10.2010";
		newDate[12]="";
		/////////////////////////////
		name[13] = "Dkhissene";
		firstName[13]="Otmane";
		brand[13]=3;
		type[13]=5;
		state[13]="OK";
		lastDate[13]="02.07.2011";
		newDate[13]="";
		/////////////////////////////
		name[14] = "El Keroudy";
		firstName[14]="Amine";
		brand[14]=3;
		type[14]=6;
		state[14]="OK";
		lastDate[14]="04.04.2014";
		newDate[14]="";
		/////////////////////////////
		name[15] = "El Khotri";
		firstName[15]="Hamid";
		brand[15]=4;
		type[15]=7;
		state[15]="OK";
		lastDate[15]="05.05.2015";
		newDate[15]="";
		/////////////////////////////
		name[16] = "Fati";
		firstName[16]="Mohcine";
		brand[16]=4;
		type[16]=8;
		state[16]="OK";
		lastDate[16]="06.06.2016";
		newDate[16]="";
		/////////////////////////////
		name[17] = "Freyermuth";
		firstName[17]="Hugo";
		brand[17]=1;
		type[17]=1;
		state[17]="OK";
		lastDate[17]="07.07.2014";
		newDate[17]="";
		/////////////////////////////
		name[18] = "Gamzi";
		firstName[18]="Othmane";
		brand[18]=1;
		type[18]=2;
		state[18]="OK";
		lastDate[18]="08.08.2014";
		newDate[18]="";
		/////////////////////////////
		name[19] = "Hafidi";
		firstName[19]="Rachid";
		brand[19]=2;
		type[19]=3;
		state[19]="OK";
		lastDate[19]="09.09.2014";
		newDate[19]="";
		/////////////////////////////
		name[20] = "Hammiche";
		firstName[20]="Boudjema";
		brand[20]=2;
		type[20]=4;
		state[20]="OK";
		lastDate[20]="10.10.2014";
		newDate[20]="";
		/////////////////////////////
		name[21] = "Hnaien";
		firstName[21]="Khaled";
		brand[21]=3;
		type[21]=5;
		state[21]="OK";
		lastDate[21]="11.11.2014";
		newDate[21]="";
		/////////////////////////////
		name[22] = "Kouman";
		firstName[22]="Firmin";
		brand[22]=3;
		type[22]=6;
		state[22]="OK";
		lastDate[22]="12.12.2014";
		newDate[22]="";
		/////////////////////////////
		name[23] = "Lakhlili";
		firstName[23]="Wadiae";
		brand[23]=4;
		type[23]=7;
		state[23]="OK";
		lastDate[23]="01.01.2015";
		newDate[23]="";
		/////////////////////////////
		name[24] = "Liu";
		firstName[24]="Shu";
		brand[24]=4;
		type[24]=8;
		state[24]="OK";
		lastDate[24]="02.02.2015";
		newDate[24]="";
		/////////////////////////////
		name[25] = "Mallouli";
		firstName[25]="Wassim";
		brand[25]=1;
		type[25]=1;
		state[25]="OK";
		lastDate[25]="03.03.2015";
		newDate[25]="";
		/////////////////////////////
		name[26] = "Mbomezomo";
		firstName[26]="Christian";
		brand[26]=1;
		type[26]=2;
		state[26]="OK";
		lastDate[26]="04.04.2015";
		newDate[26]="";
		/////////////////////////////
		name[27] = "Mihoubi";
		firstName[27]="Fella";
		brand[27]=2;
		type[27]=3;
		state[27]="OK";
		lastDate[27]="05.05.2015";
		newDate[27]="";
		/////////////////////////////
		name[28] = "Mir";
		firstName[28]="Ahmed";
		brand[28]=2;
		type[28]=4;
		state[28]="OK";
		lastDate[28]="06.06.2015";
		newDate[28]="";
		/////////////////////////////
		name[29] = "Ochsner";
		firstName[29]="Cedric";
		brand[29]=3;
		type[29]=5;
		state[29]="OK";
		lastDate[29]="07.07.2015";
		newDate[29]="";
		/////////////////////////////
		name[30] = "Rguig";
		firstName[30]="Hamza";
		brand[30]=3;
		type[30]=6;
		state[30]="OK";
		lastDate[30]="08.08.2015";
		newDate[30]="";
		/////////////////////////////
		name[31] = "Roth";
		firstName[31]="Elodie";
		brand[31]=4;
		type[31]=7;
		state[31]="OK";
		lastDate[31]="09.09.2015";
		newDate[31]="";
		/////////////////////////////
		name[32] = "Siebafeu";
		firstName[32]="Fabrice";
		brand[32]=4;
		type[32]=8;
		state[32]="OK";
		lastDate[32]="10.10.2015";
		newDate[32]="";
		/////////////////////////////
		name[33] = "Smahi";
		firstName[33]="Massinissa";
		brand[33]=1;
		type[33]=1;
		state[33]="OK";
		lastDate[33]="11.11.2015";
		newDate[33]="";
		/////////////////////////////
		name[34] = "Tamim";
		firstName[34]="Iatidal";
		brand[34]=1;
		type[34]=2;
		state[34]="OK";
		lastDate[34]="12.12.2015";
		newDate[34]="";
		/////////////////////////////
		name[35] = "Tetik";
		firstName[35]="Gokhan";
		brand[35]=1;
		type[35]=1;
		state[35]="OK";
		lastDate[35]="01.01.2016";
		newDate[35]="";
		/////////////////////////////
		name[36] = "Uwizeye";
		firstName[36]="Benjamin";
		brand[36]=2;
		type[36]=3;
		state[36]="OK";
		lastDate[36]="02.02.2016";
		newDate[36]="";
		/////////////////////////////
		name[37] = "Weibel";
		firstName[37]="Vincent";
		brand[37]=2;
		type[37]=4;
		state[37]="OK";
		lastDate[37]="03.03.2016";
		newDate[37]="";
		/////////////////////////////
		name[38] = "Ye";
		firstName[38]="Junchong";
		brand[38]=3;
		type[38]=5;
		state[38]="OK";
		lastDate[38]="04.04.2016";
		newDate[38]="";
		/////////////////////////////
		name[39] = "Zane";
		firstName[39]="Idir";
		brand[39]=3;
		type[39]=6;
		state[39]="OK";
		lastDate[39]="05.05.2016";
		newDate[39]="";
		/////////////////////////////
		name[40] = "Zou";
		firstName[40]="Ting";
		brand[40]=4;
		type[40]=7;
		state[40]="OK";
		lastDate[40]="06.06.2016";
		newDate[40]="";
		/////////////////////////////
		}
	
	int find (String n, String fn)
	{
		//String str = new String(n);
		System.out.println("Nom cherché: "+ n);
		//System.out.println("Nom cherché taille: "+ str.length());
		System.out.println("Prénom cherché: "+ fn);
		boolean check=false;
		for(int i = 0; i < SIZE;i++)
		{
			System.out.println("i: "+i);
			System.out.println("name["+i+"]: "+name[i]);
			System.out.println("name["+i+"] size: "+name[i].length());
			if(name[i].equals(n))
			{
				index=i;
				System.out.println("Index: "+i);
				if(firstName[index].equals(fn)) check = true;
				System.out.println("Check: "+check);
				//break;
			}
		}
		if(check)
		{
			gc.lastDate.setText(lastDate[index]);
			gc.state.setText(state[index]);
			gc.brand.setSelectedIndex(brand[index]);
			gc.type.setSelectedIndex(type[index]);
			gc.today.setText(newDate[index]);
		}
		else 
		{
			gc.lastDate.setText(lastDate[0]);
			gc.state.setText(state[0]);
			gc.brand.setSelectedIndex(brand[0]);
			gc.type.setSelectedIndex(type[0]);
			gc.today.setText(newDate[0]);
		}
		return index;
	}
	
	
	String price(String str)
	{
		System.out.println(str);
		int h0 = Character.getNumericValue(str.charAt(0));
		int h1 = Character.getNumericValue(str.charAt(1));
		int m0 = Character.getNumericValue(str.charAt(3));
		int m1 = Character.getNumericValue(str.charAt(4));
		int res=(h0*10+h1)*60+(m0*10+m1+1)*1;
		

		return "Prix: "+Integer.toString(res)+" Euro" ;
		
	}
	
	String setDate(String str)
	{
		int index=find(gc.txtNom.getText(), gc.txtPrenom.getText());
		newDate[index]=str;
		gc.today.setText(newDate[index]);
		return str;
		
	}


	private String[] name;
	private String[] firstName;
	private int[] brand;
	private int[] type;
	private String[] lastDate;
	private String[] newDate;
	private String[] state;
	private int index;
	private GuiControl gc;
	final int SIZE = 41;
	
}
