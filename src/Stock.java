
public class Stock {
	int productID;
	int quantity;
	int porousQuantity;
	int threshold;
	
	public Stock(int productID, int quantity, int porousQuantity, int threshold)
	{ 
		this.productID=productID;
		this.quantity=quantity;
		this.porousQuantity=porousQuantity;
		this.threshold=threshold;
	}
//	public Stock(int productID, int quantity, int porousQuantity)
//	{
//		this.productID=productID;
//		this.quantity=quantity;
//		this.porousQuantity=porousQuantity;
//	}
	public int getProductID()
	{
		return productID;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public int getPorousQuantity()
	{
		return porousQuantity;
	}
	public int getThreshold()
	{
		return threshold;
	}
	public void setProductID(int productID)
	{
		this.productID = productID;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public void setPorousQuantity(int porousQuantity)
	{
		this.porousQuantity = porousQuantity; //body	
	}
	public void setThreshold(int threshold)
	{
		this.threshold = threshold;
	}
//	public void changeQuantity()
//	{
//		this.quantity = quantity - value;
//	}
	@Override
	 public String toString()
	 {
		return(this.getProductID() +"\t"+
				this.getQuantity() +"\t"+
				this.getPorousQuantity() +"\t"+
				this.getThreshold());
	 }
}
