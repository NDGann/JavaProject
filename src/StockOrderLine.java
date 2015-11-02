
public class StockOrderLine {
	int stockOrderID;
	int productID;
	int quantity;
	
	public StockOrderLine(int stockOrderID, int productID, int quantity)
	{
		this.stockOrderID=stockOrderID;
		this.productID=productID;
		this.quantity=quantity;
	}
	public int getStockOrderID()
	{
		return stockOrderID;
	}
	public int getProductID()
	{
		return productID;
	}
//	public int getSupplierID()
//	{
//		return supplierID;
//	}
	public int getQuantity()
	{
		return quantity;
	}
//	public double getCost()
//	{
//		return cost;
//	}
	
	public void setStockOrderID(int stockOrderID)
	{
		this.stockOrderID = stockOrderID;
	}
	public void setProductID(int productID)
	{
		this.productID = productID;
	}
//	public void setSupplierID()
//	{
//		this.supplierID = supplierID;
//	}
	public void setQuantity()
	{
		this.quantity = quantity;
	}
//	public void setCost()
//	{
//		this.cost = cost;
//	}
@Override
public String toString()
{
	return(this.getStockOrderID() +"\t"+
			this.getProductID() +"\t"+
			this.getQuantity());
}
}
