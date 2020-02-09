package gift;

public class Snickers extends Candy{

	String SnickersBrand,SnickersType;
	public void setInfo() {
		this.SnickersBrand="Unspecifed";
		this.SnickersType="Unspecifed";
		this.netWeight=0;
		this.calories=0;
		this.price=0;
	}
	public void setInfo(String SnickersBrand,String SnickersType,double netWeight,double calories,double price) {
		this.SnickersBrand=SnickersBrand;
		this.SnickersType=SnickersType;
		this.netWeight=netWeight;
		this.calories=calories;
		this.price=price;
		// TODO Auto-generated method stub	
	}
	

	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Candy Type:"+getCandyType());
		System.out.println("Brand: "+SnickersBrand);
		System.out.println("Snickers Type: "+SnickersType);
		System.out.println("Net Weight: "+netWeight);
		System.out.println("Calories: "+calories);
		System.out.println("Price: "+price);
	}
	
	public double getPrice() {
		return price;
	}
	public double getNetWeight() {
		return netWeight;
	}
	public double getCalories() {
		return calories;
	}

}