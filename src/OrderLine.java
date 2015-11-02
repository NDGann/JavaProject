
public class OrderLine {
	int customerOrderID;
	int productID;
	int quantity;
	int porousQuantity;
	
	public OrderLine(int customerOrderID, int productID, int quantity, int quantityPorous)
	{
		this.customerOrderID = customerOrderID;
		this.productID = productID;
		this.quantity = quantity;
		this.porousQuantity = quantityPorous;
	}
	
	public int getCustomerOrderID()
	{
		return customerOrderID;
	}
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
	public void setCustomerOrderID(int customerOrderID)
	{
		this.customerOrderID = customerOrderID;
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
		this.porousQuantity = porousQuantity;
	}
	@Override
	public String toString()
	{
		return(this.getCustomerOrderID() +"\t"+
				this.getProductID()+"\t"+
				this.getQuantity()+"\t"+
				this.getPorousQuantity());
	}
	
}
