package lamdaLearning;

public class orders {

	int id;
	int price;
	String status;
	public orders(int id, int price, String status) {
		//super();
		this.id = id;
		this.price = price;
		this.status = status;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	public void display() {
		System.out.println(+this.id+"  "+this.price+"   "+this.status);
	}
	
	interface checking{
		public void check(orders obj);
	}
	
	
	
}
