package gift;

public class Sweet implements Gift{
	private String giftedBy,giftedTo,sweetType;
	double netWeight,calories,price;
	
	public void setInfo(){
		giftedBy="Unknown";
		giftedTo="Unknown";
		sweetType="Unspecidfed";
	}
	
	public void setInfo(String giftedBy,String giftedTo) {
		this.giftedBy=giftedBy;
		this.giftedTo=giftedTo;
		this.sweetType="Unspecidfed";
	}
	
	public void setInfo(String giftedBy,String giftedTo,String sweetType) {
		this.giftedBy=giftedBy;
		this.giftedTo=giftedTo;
		this.setSweetType(sweetType);
	}
	

	public void setSweetType(String sweetType) {
		this.sweetType = sweetType;
	}
	
	public void getInfo() {
		System.out.println("Its an "+sweetType+", It's gifted by "+giftedBy+" to "+giftedTo);
	}
	
	public String getSweetType() {
		return sweetType;
	}
	
}