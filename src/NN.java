
public class NN {
	int step;
	int productID;
	double x;
	double y;
	boolean status;

public NN(int step,int productID,double x,double y,boolean status)
{
	this.step =step;
	this.productID=productID;
	this.x=x;
	this.y=y;
	this.status=status;
}

public int getStep() {
	return step;
}

public void setStep(int step) {
	this.step = step;
}

public int getProductID() {
	return productID;
}

public void setProductID(int productID) {
	this.productID = productID;
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = x;
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = y;
}

public boolean getStatus() {
	return status;
}

public void setStatus(boolean status) {
	this.status = status;
}
@Override
public String toString()
{
	return(this.getStep() +"\t"+
			this.getProductID() +"\t"+
			this.getX() +"\t"+
			this.getY() +"\t"+
			this.getStatus());
}
}
	
