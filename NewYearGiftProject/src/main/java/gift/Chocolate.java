package gift;

public class Chocolate extends Candy{

	String chocoBrand,chocoType;
	public void setInfo() {
		this.chocoBrand="Unspecifed";
		this.chocoType="Unspecifed";
		this.netWeight=0;
		this.calories=0;
		this.price=0;
	}
	public void setInfo(String chocoBrand,String chocoType,double netWeight,double calories,double price) {
		this.chocoBrand=chocoBrand;
		this.chocoType=chocoType;
		this.netWeight=netWeight;
		this.calories=calories;
		this.price=price;
		// TODO Auto-generated method stub	
	}
	

	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Candy Type:"+getCandyType());
		System.out.println("Brand: "+chocoBrand);
		System.out.println("Chocolate Type: "+chocoType);
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
