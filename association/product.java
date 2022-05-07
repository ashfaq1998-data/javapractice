class Product{
	protected int quantity;
	protected float unitPrice;
	
	public Product(int quantity, float unitPrice){
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}
}

class Fan extends Product{
	protected float deliveryPrice;
	protected float totalPrice;
	
	public Fan(float unitPrice, int quantity, float deliveryPrice){
		super(quantity, unitPrice);
		this.deliveryPrice = deliveryPrice;
	}

	public void calculateTotal(){
		this.totalPrice = (unitPrice * quantity) + deliveryPrice;
	}

	public void showTotal(){
		System.out.println(totalPrice);
	}
}

class HelloWorld {
    public static void main(String[] args) {
        Fan F = new Fan(100.6f, 4, 200.8f);
	
	F.calculateTotal();
	F.showTotal();
	
    }
}