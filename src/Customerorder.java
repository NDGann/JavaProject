import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class CustomerOrder {
	int customerOrderID;
	int customerID;
	String status;
//	boolean checkedOut;
//	Date datePlaced;
	
	public CustomerOrder(int customerOrderID, int customerID, String status)
	{
		this.customerOrderID = customerOrderID;
		this.customerID = customerID;
		//this.datePlaced= datePlaced;
		this.status=status;
	//	this.checkedOut=checkedOut;
	}
	int iD;
	int idStock;
	int deficit;
	Scanner input = new Scanner(System.in);
	final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	final String DB_URL = "jdbc:mysql://localhost/nbdatabase";
	final String USER = "root";
	final String PASS = "NETbuilder";

		
  			
	public void customerOrderSQL(){	
		Connection conn = null;
		Statement stmt = null;
			try{
	      //STEP 2: Register JDBC driver
	      Class.forName("com.mysql.jdbc.Driver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL, USER, PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating database...");
	      stmt = conn.createStatement();
			 }catch(SQLException se){
			      //Handle errors for JDBC
			      se.printStackTrace();
			 }catch(Exception e){
			      //Handle errors for Class.forName
			      e.printStackTrace();
			 }
		
		ResultSet resultsCustomerOrder;
		ArrayList<CustomerOrder> arrayCustomerOrder = new ArrayList<CustomerOrder>(); //create empty array
		try {
			String sqlCustomerOrder = "SELECT customer_order_id,customer_id,status FROM customerorder"; //SELECT variable1,variable2 FROM tablename in MySQL
			resultsCustomerOrder = stmt.executeQuery(sqlCustomerOrder);
			while (resultsCustomerOrder.next()) {
				 int customerOrderID = resultsCustomerOrder.getInt("customer_order_id"); //variabletype variable = nameofresultset.gettypeofvariable(variable name in MySQL)
				 int customerID = resultsCustomerOrder.getInt("customer_id");
				 String customerOrderIDstring = Integer.toString(customerOrderID);
				 //coidLabel.setText(customerOrderIDstring);
				 String status = resultsCustomerOrder.getString("status");
				 CustomerOrder customerOrder = new CustomerOrder(customerOrderID,customerID, status); //packages the variables in each row so that they can be input into array
				 arrayCustomerOrder.add(customerOrder); //inputs the variables into the array
				}
				resultsCustomerOrder.close();
			} 
		catch (SQLException e) 
		{e.printStackTrace();}
	  	}
//	public CustomerOrder()
//	{
//		checkedOut = false;
//		status = "New Order";
//	}
//	public Date getDatePlaced()
//	{
//		return datePlaced;
//	}
//	public void setDatePlaced()
//	{
//		this.datePlaced = datePlaced;
//	}
	public int getCustomerOrderID()
	{
		return customerOrderID;
	}
	public int getCustomerID()
	{
		return customerID;
	}
	public String getStatus()
	{
		return status;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	public void setCustomerOrderID()
	{
		this.customerOrderID=customerOrderID;
	}
	public void setCustomerID()
	{
		this.customerID=customerID;
	}
//	public boolean getCheckedOut()
//	{
//		return checkedOut;
//	}
//	public void setCheckedOut(boolean checkedOut)
//	{
//		this.checkedOut = checkedOut;
//	}
//	public void changeCheckedOut()
//	{
//		if(checkedOut == true){
//			this.checkedOut = false;		
//		} else {
//			checkedOut = true;
//		}
//	}
		
	
@Override
 public String toString()
 {
	return(this.getCustomerOrderID() +"\t"+
			this.getCustomerID() +"\t"+ 
		//	this.getDatePlaced() +"\t" +
			this.getStatus());
		//	this.getCheckedOut();
		
 }


}
