
public class Product {
	int productID;
	String name;
//	int[] location = new int[2];
	int locationX;
	int locationY;
	
	public Product(int productID, String name, int locationX, int locationY) //constructor
	{
		this.productID = productID;
		this.name = name;
		this.locationX = locationX;
		this.locationY = locationY;
		//this.location[2] = location[2]; // the location array doesn't work if i try and add a new product in main. will switch to using x+y for the moment and change back
	}
//	public String toString()
//	{
//		return name;
//	}
	public int getProductID()
	{
		return productID;
	}
	public String getName()
	{
		return name;
	}
//	public int[] getLocation()
//	{
//		return location;
//	}
	
//	public void setlocation(int[] location)
//	{
//		this.location = location;
//	}
	public int getLocationX()
	{
		return locationX;
	}
	public int getLocationY()
	{
		return locationY;
	}
	
	public void setProductID(int productID)
	{
		this.productID = productID;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setLocationX(int locationX)
	{
		this.locationX=locationX;
	}
	public void setLocationY(int locationY)
	{
		this.locationY=locationY;
	}
	
//	@Override
//	public String toString()
//	{
//		return String.format("%s\t%f",this.productID,this.name,this.locationX,this.locationY);
//	}
	  @Override
	   public String toString() {
	        return (this.getProductID()+"\t"+
	                this.getName() +"\t"+
	                this.getLocationX() +"\t"+
	                this.getLocationY());
	   }
}

