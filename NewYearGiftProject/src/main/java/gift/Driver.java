package gift;

import gift.Candy;
import gift.Chocolate;
import gift.GulabJamun;
import gift.Jalebi;
import gift.Snickers;
import gift.Sweet;

public class Driver {
public static void main(String args[]) {

	Candy candy=new Candy();
	candy.setInfo("Snehith", "Ram", "Snickers");
	candy.getInfo();
	
	System.out.println();
	
	Sweet sweet=new Sweet();
	sweet.setInfo("Snehith", "Vamsi", "GulabJamun");
	sweet.getInfo();
	System.out.println();
	
//Gift -> Candy -> Chocolate
	Chocolate choco =new Chocolate();
	//choco.setInfo(giftedBy, giftedTo, candyType);
	choco.setInfo("Dairy Milk", "Chocolate Bar", 120, 576, 50);
	choco.setCandyType("Chocolate");
	choco.getInfo();
	
	System.out.println();
//Gift -> Candy -> Snickers
	Snickers snickers=new Snickers();
	//Snickers.setInfo(giftedBy, giftedTo);
	snickers.setCandyType("Snickers");
	snickers.setInfo("Canva", "Soft Snickers", 505, 780, 25);
	snickers.getInfo();

	System.out.println();
//Gift -> sweet -> Jalebi
	Jalebi jalebi=new Jalebi();
	jalebi.setSweetType("Dessert");
	jalebi.setInfo("Raam", "Sugar Jalebi", 1000, 1500, 750);
	jalebi.getInfo();
	
	System.out.println();
//Gift -> sweet ->GulabJamun
	GulabJamun GJ=new GulabJamun();
	GJ.setInfo("SweetMagic", "Besan GulabJamun", 150, 756, 10);
	GJ.setSweetType("Starter");
	GJ.getInfo();
	
	
}
}