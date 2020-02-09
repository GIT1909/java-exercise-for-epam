package gift;

import gift.Gift;

public class Candy implements Gift{
	private String giftedBy,giftedTo,candyType;
	double netWeight,calories,price;
	
	public void setInfo(){
		giftedBy="Unknown";
		giftedTo="Unknown";
		candyType="Unspecidfed";
	}
	
	public void setInfo(String giftedBy,String giftedTo) {
		this.giftedBy=giftedBy;
		this.giftedTo=giftedTo;
		this.candyType="Unspecidfed";
	}
	
	public void setInfo(String giftedBy,String giftedTo,String candyType) {
		this.giftedBy=giftedBy;
		this.giftedTo=giftedTo;
		this.setCandyType(candyType);
	}
	

	public void setCandyType(String candyType) {
		this.candyType = candyType;
	}
	
	public void getInfo() {
		System.out.println("Its an "+candyType+", It's gifted by "+giftedBy+" to "+giftedTo);
	}
	
	public String getCandyType() {
		return candyType;
	}
	
}
