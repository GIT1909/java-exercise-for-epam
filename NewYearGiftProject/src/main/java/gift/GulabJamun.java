package gift;

public class GulabJamun extends Sweet{

	String GulabJamunBrand,GulabJamunType;
	public void setInfo() {
		this.GulabJamunBrand="Unspecifed";
		this.GulabJamunType="Unspecifed";
		this.netWeight=0;
		this.calories=0;
		this.price=0;
	}
	public void setInfo(String GulabJamunBrand,String GulabJamunType,double netWeight,double calories,double price) {
		this.GulabJamunBrand=GulabJamunBrand;
		this.GulabJamunType=GulabJamunType;
		this.netWeight=netWeight;
		this.calories=calories;
		this.price=price;
		// TODO Auto-generated method stub	
	}
	

	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Sweet Type:"+getSweetType());
		System.out.println("GulabJamun Brand: "+GulabJamunBrand);
		System.out.println("GulabJamun Type: "+GulabJamunType);
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
