import java.util.Date;

public class StockOrder {
	int stockOrderID;
//	int productID;
//	double totalCost;
	int supplierID;
	String status;
//	Date datePlaced;
	
	public StockOrder(int stockOrderID,int supplierID, String status)
	{
		this.stockOrderID=stockOrderID;
		//this.productID=product;
	//	this.totalCost=totalCost;
		this.supplierID=supplierID;
		this.status=status;
	}
	
	public int getStockOrderID()
	{
		return stockOrderID;
	}
//	public int getProductID()
//	{
//		return productID;
//	}
//	public double getTotalCost()
//	{
//		return totalCost;
//	}
	public int getSupplierID()
	{
		return supplierID;
	}
	public String getStatus()
	{
		return status;
	}
//	public Date getdatePlaced()
//	{
//		return datePlaced;
//	}
	public void setStockOrderID(int stockOrderID)
	{
		this.stockOrderID = stockOrderID;
	}
	public void setSupplierID(int supplierID)
	{
		this.supplierID = supplierID;
	}
//	public void setProductID()
//	{
//		this.productID = productID;
//	}
//	public void setTotalCost(double totalCost)
//	{
//		this.totalCost = totalCost;
//	}
	public void setStatus(String status)
	{
		this.status = status;
	}
//	public void setDatePlaced()
//	{
//		this.datePlaced = datePlaced;
//	}
//	

@Override
public String toString()
{
	return(this.getStockOrderID() +"\t"+
			this.getSupplierID()+"\t"+
			this.getStatus());
}
}