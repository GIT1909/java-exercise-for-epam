package gift;

public class Jalebi extends Sweet{
	
	String JalebiBrand,JalebiType;
	public void setInfo() {
		this.JalebiBrand="Unspecifed";
		this.JalebiType="Unspecifed";
		this.netWeight=0;
		this.calories=0;
		this.price=0;
	}
	public void setInfo(String JalebiBrand,String JalebiType,double netWeight,double calories,double price) {
		this.JalebiBrand=JalebiBrand;
		this.JalebiType=JalebiType;
		this.netWeight=netWeight;
		this.calories=calories;
		this.price=price;
		// TODO Auto-generated method stub	
	}
	public void getInfo() {
		// TODO Auto-generated method stub
		//super.getInfo();
		System.out.println("Sweet Type:"+getSweetType());
		System.out.println("Jalebi Brand: "+JalebiBrand);
		System.out.println("Jalebi Type: "+JalebiType);
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

