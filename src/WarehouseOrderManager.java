import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;


public class WarehouseOrderManager {

	Scanner input;
	ArrayList<StockOrder> arrayStockOrder;
	ArrayList<CustomerOrder> arrayCustomerOrder;
	ArrayList<OrderLine> arrayOrderLine;
	ArrayList<Product> arrayProduct;
	ArrayList<Stock> arrayStock;
	ArrayList<StockOrderLine> arrayStockOrderLine;
	int iD;
	int idStock;
	int deficit;
	private static Connection conn = null;
	private static Statement stmt = null;
	
	public WarehouseOrderManager() {
		GUI sD = new GUI();
		sD.showEvent();
		run();
	}
	
	private void run() {
		input = new Scanner(System.in);
		final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		final String DB_URL = "jdbc:mysql://10.50.15.26:3306/nbdatabase";
		final String USER = "root";
		final String PASS = "NETbuilder";
	
//				Connection conn = null;
//				Statement stmt = null;
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
		
//		arrayProduct = new ArrayList<Product>();
//		arrayProduct.add(new Product(1,"Apple",1,1));
//		arrayProduct.add(new Product(2,"Banana",1,2));
//		arrayProduct.add(new Product(3,"Coconut",1,3));
//		arrayProduct.add(new Product(4,"Date",3,1));
//		arrayProduct.add(new Product(5,"Elder",3,2));
//		arrayProduct.add(new Product(6,"Fig",3,3));
//		arrayProduct.add(new Product(7,"Grape",5,1));
//		arrayProduct.add(new Product(8,"Huckle",5,2));
//		arrayProduct.add(new Product(9,"Juniper",5,3));
//		arrayProduct.add(new Product(10,"Kiwi",5,4));
//		
//		arrayOrderLine = new ArrayList<OrderLine>();
//		arrayOrderLine.add(new OrderLine(1001,2,1,0));
//		arrayOrderLine.add(new OrderLine(1001,3,1,1));
//		arrayOrderLine.add(new OrderLine(1002,5,1,5));
//		arrayOrderLine.add(new OrderLine(1002,6,2,0));
//		arrayOrderLine.add(new OrderLine(1002,7,1,3));
//		arrayOrderLine.add(new OrderLine(1003,10,5,3));
//		arrayOrderLine.add(new OrderLine(1004,9,4,0));
//		arrayOrderLine.add(new OrderLine(1004,8,0,1));
//		arrayOrderLine.add(new OrderLine(1005,6,3,5));
//		arrayOrderLine.add(new OrderLine(1005,6,2,0));
//		arrayOrderLine.add(new OrderLine(1005,7,1,3));
//		arrayOrderLine.add(new OrderLine(1005,2,1,0));
//		arrayOrderLine.add(new OrderLine(1006,7,1,0));
//		arrayOrderLine.add(new OrderLine(1006,6,0,6));
//		arrayOrderLine.add(new OrderLine(1006,8,2,5));
//		arrayOrderLine.add(new OrderLine(1006,3,5,0));
//		arrayOrderLine.add(new OrderLine(1006,7,0,3));
//		
//		arrayStock = new ArrayList<Stock>();
//		arrayStock.add(new Stock(1,52,51,50));
//		arrayStock.add(new Stock(2,51,52,50));
//		arrayStock.add(new Stock(3,54,53,50));
//		arrayStock.add(new Stock(4,55,54,50));
//		arrayStock.add(new Stock(5,56,45,50));
//		arrayStock.add(new Stock(6,57,56,50));
//		arrayStock.add(new Stock(7,58,57,50));
//		arrayStock.add(new Stock(8,59,58,50));
//		arrayStock.add(new Stock(9,50,59,50));
//		arrayStock.add(new Stock(10,50,45,50));
//		
//		arrayStockOrder = new ArrayList<StockOrder>(); //need to change stock order status which adds the stock....maybe confirm all the products in the stock orderline first
//		arrayStockOrder.add(new StockOrder(2001,1,"Complete"));
//		arrayStockOrder.add(new StockOrder(2002,2,"Complete"));
//		arrayStockOrder.add(new StockOrder(2003,3,"Complete"));
//		arrayStockOrder.add(new StockOrder(2004,1,"Processing"));
//		arrayStockOrder.add(new StockOrder(2005,2,"Processing"));
//		arrayStockOrder.add(new StockOrder(2006,3,"Inbound"));
//		arrayStockOrder.add(new StockOrder(2007,2,"Inbound"));
//
//		arrayStockOrderLine = new ArrayList<StockOrderLine>();
//		arrayStockOrderLine.add(new StockOrderLine(2001,1,50));
//		arrayStockOrderLine.add(new StockOrderLine(2001,2,30));
//		arrayStockOrderLine.add(new StockOrderLine(2001,4,40));
//		arrayStockOrderLine.add(new StockOrderLine(2001,6,60));
//		arrayStockOrderLine.add(new StockOrderLine(2001,8,50));
//		arrayStockOrderLine.add(new StockOrderLine(2001,9,35));	
//		arrayStockOrderLine.add(new StockOrderLine(2002,3,45));
//		arrayStockOrderLine.add(new StockOrderLine(2002,7,44));
//		arrayStockOrderLine.add(new StockOrderLine(2002,5,60));
//		arrayStockOrderLine.add(new StockOrderLine(2003,10,75));
//		arrayStockOrderLine.add(new StockOrderLine(2003,6,66));
//		arrayStockOrderLine.add(new StockOrderLine(2004,5,50));
//		arrayStockOrderLine.add(new StockOrderLine(2004,7,55));	
//		arrayStockOrderLine.add(new StockOrderLine(2004,1,51));
//		arrayStockOrderLine.add(new StockOrderLine(2005,4,51));
//		arrayStockOrderLine.add(new StockOrderLine(2005,2,57));
//		arrayStockOrderLine.add(new StockOrderLine(2005,4,40));
//		arrayStockOrderLine.add(new StockOrderLine(2006,6,60));
//		arrayStockOrderLine.add(new StockOrderLine(2006,8,50));
//		arrayStockOrderLine.add(new StockOrderLine(2007,5,35));	
//		arrayStockOrderLine.add(new StockOrderLine(2007,3,50));
//		
//		arrayCustomerOrder = new ArrayList<CustomerOrder>();
//		arrayCustomerOrder.add(new CustomerOrder(1001,1,"Complete"));
//		arrayCustomerOrder.add(new CustomerOrder(1002,2,"Processing"));
//		arrayCustomerOrder.add(new CustomerOrder(1003,3,"New"));
//		arrayCustomerOrder.add(new CustomerOrder(1004,4,"New"));
//		arrayCustomerOrder.add(new CustomerOrder(1005,5,"New"));
//		arrayCustomerOrder.add(new CustomerOrder(1006,6,"New"));
	  			
	  	
//	  	ResultSet resultsCustomerOrder;
//	  	ArrayList<CustomerOrder> arrayCustomerOrder = new ArrayList<CustomerOrder>(); //create empty array
//	  	try {
//	  		String sqlCustomerOrder = "SELECT customer_order_id,customer_id,status FROM customerorder"; //SELECT variable1,variable2 FROM tablename in MySQL
//	  		resultsCustomerOrder = stmt.executeQuery(sqlCustomerOrder);
//	  		while (resultsCustomerOrder.next()) 
//	  			{
//	  			 int customerOrderID = resultsCustomerOrder.getInt("customer_order_id"); //variabletype variable = nameofresultset.gettypeofvariable(variable name in MySQL)
//	  			 int customerID = resultsCustomerOrder.getInt("customer_id");
//	  			 // String customerOrderIDstring = Integer.toString(customerOrderID);
//	  			 // coidLabel.setText(customerOrderIDstring);
//	  			 String status = resultsCustomerOrder.getString("status");
//	  			 CustomerOrder customerOrder = new CustomerOrder(customerOrderID,customerID, status); //packages the variables in each row so that they can be input into array
//	  			 arrayCustomerOrder.add(customerOrder); //inputs the variables into the array
//	  			}
//	  		resultsCustomerOrder.close();
//	  		} 
//	  	catch (SQLException e) 
//	  	{e.printStackTrace();}
	  	
	  	
	  		  	
	  	
	  	
//		ResultSet resultsOrderLine;
//		arrayOrderLine = new ArrayList<OrderLine>();
//		try {
//			String sqlOrderLine = "SELECT customer_order_id,product_id,quantity,quantity_porous FROM orderline";
//			resultsOrderLine = stmt.executeQuery(sqlOrderLine);
//			while (resultsOrderLine.next())
//				{
//				int customerOrderID = resultsOrderLine.getInt("customer_order_id");
//				int productID = resultsOrderLine.getInt("product_id");
//				int quantity = resultsOrderLine.getInt("quantity");
//				int porousQuantity = resultsOrderLine.getInt("quantity_porous");
//				OrderLine orderLine = new OrderLine(customerOrderID,productID,quantity,porousQuantity);
//				arrayOrderLine.add(orderLine);
//				}
//			resultsOrderLine.close();
//			}
//		catch (SQLException e) 
//		{e.printStackTrace();}

		ResultSet resultsProduct;
		arrayProduct = new ArrayList<Product>();
		try {
			String sqlProduct = "SELECT product_id,name,location_x,location_y FROM product";
			resultsProduct = stmt.executeQuery(sqlProduct);
			while (resultsProduct.next())
				{
				int productID = resultsProduct.getInt("product_id");
				String name = resultsProduct.getString("name");
				int locationX = resultsProduct.getInt("location_x");
				int locationY = resultsProduct.getInt("location_y");
				Product product = new Product(productID,name,locationX,locationY);
				arrayProduct.add(product);
				}
			resultsProduct.close();
			}
		catch (SQLException e) 
		{e.printStackTrace();}
		
//		ResultSet resultsStock;
//		arrayStock = new ArrayList<Stock>();
//		try {
//			String sqlStock = "SELECT product_id,quantity, porous_quantity, threshold FROM stock";
//			resultsStock = stmt.executeQuery(sqlStock);
//			while (resultsStock.next())
//				{
//				int productID = resultsStock.getInt("product_id");
//				int quantity = resultsStock.getInt("quantity");
//				int porousQuantity = resultsStock.getInt("porous_quantity");
//				int threshold = resultsStock.getInt("threshold");
//				Stock stock = new Stock(productID,quantity,porousQuantity,threshold);
//				arrayStock.add(stock);
//				}
//			resultsStock.close();
//			}
//		catch (SQLException e) 
//		{e.printStackTrace();}
		
//		ResultSet resultsStockOrder;
//		arrayStockOrder = new ArrayList<StockOrder>();
//		try {
//			String sqlStockOrder = "SELECT stock_order_id,supplier_id,status FROM stockorder";
//			resultsStockOrder = stmt.executeQuery(sqlStockOrder);
//			while (resultsStockOrder.next())
//				{
//				int stockOrderID = resultsStockOrder.getInt("stock_order_id");
//				int supplierID = resultsStockOrder.getInt("supplier_id");
//				String status = resultsStockOrder.getString("status");
//				StockOrder stockOrder = new StockOrder(stockOrderID,supplierID,status);
//				arrayStockOrder.add(stockOrder);
//				}
//			resultsStockOrder.close();
//			}
//		catch (SQLException e) 
//		{e.printStackTrace();}
		
		ResultSet resultsStockOrderLine;
		arrayStockOrderLine = new ArrayList<StockOrderLine>();
		try {
			String sqlStockOrderLine = "SELECT stock_order_id,product_id,quantity FROM stockorderline";
			resultsStockOrderLine = stmt.executeQuery(sqlStockOrderLine);
			while (resultsStockOrderLine.next())
				{
				int stockOrderID = resultsStockOrderLine.getInt("stock_order_id");
				int productID = resultsStockOrderLine.getInt("product_id");
				int quantity = resultsStockOrderLine.getInt("quantity");
				StockOrderLine stockOrderLine = new StockOrderLine(stockOrderID,productID,quantity);
				arrayStockOrderLine.add(stockOrderLine);
				}
			resultsStockOrderLine.close();
			}
		catch (SQLException e) 
		{e.printStackTrace();}
		
		new Main(); //allows main to be used for menus

		while(true)
		{
//			JFrame frame;
//			JPanel panel;
//			JLabel coidLabel;
//			frame = new JFrame();
//			panel = new JPanel();
//			coidLabel = new JLabel("Customer Order ID");
//			frame.add(panel);
//			panel.add(coidLabel);
//			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			frame.pack();
//			frame.setLocationRelativeTo(null);
//			frame.setVisible(true);
//	        frame.setSize(640, 480);
		
			int choice1 = printMainMenu();
			
		switch (choice1)
		{
		case 1:
			int choice16 = printCustomerSubMenu();
			switch (choice16)
			{
			case 1:
				printCustomerOrders();
			break;
			case 2:
				printChangeCustomerOrderStatus();
			break;
			case 3:
				printCustomerOrderRoute();	
			break;
			}
			break;
		case 2:	
			int choice17 = printStockOrderSubMenu();
		switch (choice17)
		{
			case 1:
				printStockOrder();
			break;
			case 2:
				printChangeStockOrder();
			break;
			}
		break;
		case 3:
			int choice18 = printStockSubMenu();
			switch(choice18)
			{
			case 1:
				printProductDetails();
			break;
			case 2:
				printStockLevels();
			break;
			case 3:
				printPorousNeeded();
			break;
			case 4:
				printChangeStockLevels();
			break;
			}
			break;
			}
		}		
	}	
	
	public static ArrayList<CustomerOrder> sqlrCustomerOrder(){
	ResultSet resultsCustomerOrder;
  	ArrayList<CustomerOrder> arrayCustomerOrder = new ArrayList<CustomerOrder>(); //create empty array
  	try {
  		String sqlCustomerOrder = "SELECT customer_order_id,customer_id,status FROM customerorder"; //SELECT variable1,variable2 FROM tablename in MySQL
  		resultsCustomerOrder = stmt.executeQuery(sqlCustomerOrder);
  		while (resultsCustomerOrder.next()) 
  			{
  			 int customerOrderID = resultsCustomerOrder.getInt("customer_order_id"); //variabletype variable = nameofresultset.gettypeofvariable(variable name in MySQL)
  			 int customerID = resultsCustomerOrder.getInt("customer_id");
  			 // String customerOrderIDstring = Integer.toString(customerOrderID);
  			 // coidLabel.setText(customerOrderIDstring);
  			 String status = resultsCustomerOrder.getString("status");
  			 CustomerOrder customerOrder = new CustomerOrder(customerOrderID,customerID, status); //packages the variables in each row so that they can be input into array
  			 arrayCustomerOrder.add(customerOrder); //inputs the variables into the array
  			}
  		resultsCustomerOrder.close();
  		} 
  	catch (SQLException e) 
  	{e.printStackTrace();}
  	
  		return arrayCustomerOrder;
	}
	
	public static ArrayList<OrderLine> sqlrOrderLine(){
	ResultSet resultsOrderLine;
	ArrayList<OrderLine> arrayOrderLine = new ArrayList<OrderLine>();
	try {
		String sqlOrderLine = "SELECT customer_order_id,product_id,quantity,quantity_porous FROM orderline";
		resultsOrderLine = stmt.executeQuery(sqlOrderLine);
		while (resultsOrderLine.next())
			{
			int customerOrderID = resultsOrderLine.getInt("customer_order_id");
			int productID = resultsOrderLine.getInt("product_id");
			int quantity = resultsOrderLine.getInt("quantity");
			int porousQuantity = resultsOrderLine.getInt("quantity_porous");
			OrderLine orderLine = new OrderLine(customerOrderID,productID,quantity,porousQuantity);
			arrayOrderLine.add(orderLine);
			}
		resultsOrderLine.close();
		}
	catch (SQLException e) 
	{e.printStackTrace();}
	return arrayOrderLine;
	}
	
	public static ArrayList<StockOrder> sqlrStockOrder(){
	ResultSet resultsStockOrder;
	ArrayList<StockOrder> arrayStockOrder = new ArrayList<StockOrder>();
	try {
		String sqlStockOrder = "SELECT stock_order_id,supplier_id,status FROM stockorder";
		resultsStockOrder = stmt.executeQuery(sqlStockOrder);
		while (resultsStockOrder.next())
			{
			int stockOrderID = resultsStockOrder.getInt("stock_order_id");
			int supplierID = resultsStockOrder.getInt("supplier_id");
			String status = resultsStockOrder.getString("status");
			StockOrder stockOrder = new StockOrder(stockOrderID,supplierID,status);
			arrayStockOrder.add(stockOrder);
			}
		resultsStockOrder.close();
		}
	catch (SQLException e) 
	{e.printStackTrace();}
		return arrayStockOrder;
	}
  
	public static ArrayList<Stock> sqlrStock(){
	ResultSet resultsStock;
	ArrayList<Stock> arrayStock = new ArrayList<Stock>();
	try {
		String sqlStock = "SELECT product_id, quantity, porous_quantity, threshold FROM stock";
		resultsStock = stmt.executeQuery(sqlStock);
		while (resultsStock.next())
			{
			int productID = resultsStock.getInt("product_id");
			int quantity = resultsStock.getInt("quantity");
			int porousQuantity = resultsStock.getInt("porous_quantity");
			int threshold = resultsStock.getInt("threshold");
			Stock stock = new Stock(productID,quantity,porousQuantity,threshold);
			arrayStock.add(stock);
			}
		resultsStock.close();
		}
	catch (SQLException e) 
	{e.printStackTrace();}
		return arrayStock;
	}
	
	private int printMainMenu() {
		System.out.println();
		System.out.println("NB Gardens IMS\n");
		System.out.println("Please select one of the following options:");
		System.out.println("1. Customer Orders");
		System.out.println("2. Stock Orders");
		System.out.println("3. Stock levels");
		return input.nextInt();
	}
	
	private int printCustomerSubMenu(){
		System.out.println("1. View current customer orders");
		System.out.println("2. Change order status");
		System.out.println("3. Generate picking route");
		return input.nextInt();
	}
	
	private void printCustomerOrders()
	{
	ArrayList<OrderLine> arrayOrderLine = sqlrOrderLine();
	ArrayList<CustomerOrder> arrayCustomerOrder = sqlrCustomerOrder();
	System.out.println("Current customer orders:\n\nOrd ID\tCust ID\tstatus\n===========================");
	for(CustomerOrder c : arrayCustomerOrder)
	{System.out.printf("%s\n",c);}
	System.out.println("\nView order number in detail?\n1. Yes\n2. No");
	int choice2 = input.nextInt();
	if (choice2 == 1) //View order details if user inputs 1
	{
		System.out.println("Input order number");
		int choice3 = input.nextInt();
		System.out.printf("OrdID\tProdID\tQuant\tQuant Porous");
		System.out.println();
		System.out.println("=============================================");	
		for(int j = 0; j< arrayOrderLine.size(); j++) //cycles through arrayOrderLine
			{
			if(arrayOrderLine.get(j).getCustomerOrderID() == choice3) //if it finds data in OrderLine = to choice3, will print lines
			{System.out.printf("%s\n", arrayOrderLine.get(j));}
			}
	}
	}
	
	private void printChangeCustomerOrderStatus()
	{
	ArrayList<CustomerOrder> arrayCustomerOrder = sqlrCustomerOrder();
	
	System.out.println("Current customer orders:");
	System.out.println();
	System.out.println("ID\tstatus");
	System.out.println("==============="); 
	for(CustomerOrder c : arrayCustomerOrder)
	{System.out.printf("%s\n",c);}
	System.out.println();
	System.out.println("Change order status?");
	System.out.println("1.Yes");
	System.out.println("2.No");
	int choice4 = input.nextInt();
	if (choice4 == 1)
		{
		System.out.println("Input order ID:");
		int choice5 = input.nextInt(); //Input OrderID
		
		for(int j = 0; j< arrayCustomerOrder.size(); j++) //Cycle though Order ID
			{
			if(arrayCustomerOrder.get(j).getCustomerOrderID() == choice5) //If OrderID=User input then change status.
				{
				System.out.println("Set new status:\n1.Complete\n2.Processing\n3.Quit");
				int choice6 = input.nextInt();
				if (choice6 == 1) //if order status already complete then print message
					{
					if(arrayCustomerOrder.get(j).getStatus() == "Complete")  // || signifies an or statement
					{ System.out.println("Order is already Complete");}
					else if(arrayCustomerOrder.get(j).getStatus() == "Processing")
						{
						arrayCustomerOrder.get(j).setStatus("Complete");
						iD = arrayCustomerOrder.get(j).getCustomerOrderID(); //Remembers customer ID taken from CustomerOrder
						System.out.println("Order Number " + iD + " is set to Complete");
						}
					else if(arrayCustomerOrder.get(j).getStatus() == "New")
					{System.out.println("Order cannot be set to Complete without first processing it");}
					}
				else if (choice6 == 2)
					{
					if(arrayCustomerOrder.get(j).getStatus() == "Complete")// For the jth element of customer order array will check if status == complete
					{System.out.println("Order is already complete");}
					else if(arrayCustomerOrder.get(j).getStatus() == "Processing")
					{System.out.println("Order is already being processed");}
					else
						{
						arrayCustomerOrder.get(j).setStatus("Processing");
						iD = arrayCustomerOrder.get(j).getCustomerOrderID();
						for(int k = 0; k< arrayOrderLine.size(); k++)
							{
							// Original stock - Stock in order
							// Stockarray(Index responding to the ProductsID that is present in OrderLine).setNEWquantity(Original quantity - Quantity in order)
							// -1 because the index for product will go to 10, this is outside the index range for Stock which ranges from 0 to 9
							if(arrayOrderLine.get(k).getCustomerOrderID() == iD)
								{
								arrayStock.get(arrayOrderLine.get(k).getProductID()-1).setQuantity(arrayStock.get(arrayOrderLine.get(k).getProductID()-1).getQuantity()-arrayOrderLine.get(k).getQuantity());
								arrayStock.get(arrayOrderLine.get(k).getProductID()-1).setPorousQuantity(arrayStock.get(arrayOrderLine.get(k).getProductID()-1).getPorousQuantity()-arrayOrderLine.get(k).getPorousQuantity());
								}
							}
						}
					}
				else
				{break;}
				}
			}
		}
	}
	
	private void printCustomerOrderRoute(){
		sqlrCustomerOrder();
	System.out.println("Current customer orders:");
	System.out.println();
	System.out.println("Ord ID\tCust ID\tstatus");
	System.out.println("==============="); 
	for(CustomerOrder c : arrayCustomerOrder)
	{System.out.printf("%s\n",c);}
	System.out.println("Input order ID:");
	int choice15 = input.nextInt();
	ArrayList<NN> arrayNN = new ArrayList<NN>();
	ArrayList<NN> arrayNN2 = new ArrayList<NN>();
	int m=1;
	for (int j = 0; j< arrayOrderLine.size(); j++)
	{
		if(arrayOrderLine.get(j).getCustomerOrderID() == choice15) //get jth element if equal to input THEN..
			//create new array list containing only products for a specific CustomerOrderID
		{
			arrayNN.add(new NN(m,arrayOrderLine.get(j).getProductID(),arrayProduct.get(arrayOrderLine.get(j).getProductID()-1).getLocationX(),arrayProduct.get(arrayOrderLine.get(j).getProductID()-1).getLocationY(),false));
			m++;
		}
	}
		
	// now have a new array with (step,productid,x,y,false)
	System.out.println("Customer Order "+ choice15);	
	for(NN c : arrayNN)
	{System.out.printf("%s\n",c);}
	System.out.println("\nRevised route:\n");
	//double low =  Math.pow((Math.pow(arrayNN.get(0).getX(),2)+(Math.pow(arrayNN.get(0).getY(),2))),0.5);
	int count = 0; //used with arrayNN.size to get the upper limit on the size of the nearest neighbour route
	double oldX = 0; //stores X coordinates from the product position that is accepted as the shortest
	double oldY = 0; //stores Y coordinates from the product position that is accepted as the shortest
	int coordinate = 0;
	int q = 0;
	while (count < arrayNN.size())
	{
		double low = 1000;
		arrayNN2.add(new NN(1,1,1,1,false));
		for(int i=0 ; i < arrayNN.size(); i++)
		{
			if (arrayNN.get(i).getStatus() == false) //ignores elements that have already been set as best routes
			{
					if(Math.pow((Math.pow(arrayNN.get(i).getX()-oldX,2)+(Math.pow(arrayNN.get(count).getY()-oldY,2))),0.5) < low)
					{
						arrayNN2.get(count).setStep(count+1); //generates a step number for arrayNN2
						int NNID = arrayNN.get(i).getProductID(); // get product ID from the arrayNN
						arrayNN2.get(count).setProductID(NNID); //sets product ID equal to value from arrayNN
						arrayNN2.get(count).setX(arrayProduct.get(NNID -1).getLocationX()); // retrieve x location from product table
						arrayNN2.get(count).setY(arrayProduct.get(NNID -1).getLocationY()); // retrieve Y location from product table
						low = Math.pow((Math.pow(arrayNN.get(i).getX()-oldX,2)+(Math.pow(arrayNN.get(i).getY()-oldY,2))),0.5); 
						//low represents the current shortest distance from location of last pass. it is replaced with a lower distance if a better route is found
						coordinate = i; // stores i value of the index that was the best route
					//	System.out.println(arrayNN2.get(coordinate));		
					}
					if(q == (arrayNN.size() - (count) )) //this ensures the values for oldX and oldY are only changed when all the rows of the array have been seen.
														   //the count+1 is to ensure as the array rows are changed from false to true they are not included in the array size
					{
						oldX = arrayNN.get(coordinate).getX(); //sets the X values for the coordinate of the best route
						oldY = arrayNN.get(coordinate).getY(); //sets the Y values for the coordinate of the best route
						arrayNN.get(coordinate).setStatus(true); //sets true so that for function removes arrayNN row that was the best route so that it isn't included in next pass
					}
					q++;
				}			
			}	
		q=0;
		count++;	
		}
	for(NN d : arrayNN2)
	{System.out.printf("%s\n",d);}
	}
	
	private int printStockOrderSubMenu()
	{
		System.out.println("1. Stock orders");
		System.out.println("2. Change stock order status");
		return input.nextInt();
	}
	
	private void printStockOrder(){
		sqlrStockOrder();
		System.out.println("ID\tCost\tStatus");
		for(StockOrder c : arrayStockOrder)
		{System.out.printf("%s\n",c);}
		System.out.println();
		System.out.println("View order details?\n1.Yes\n2.No");
		int choice10 = input.nextInt();
		if(choice10 == 1);
		{System.out.println("Enter Stock Order ID:");
		int choice11 = input.nextInt();
		System.out.println("ID\tProd ID\tQuantity\n======================");
			{for(int f=0;f<arrayStockOrderLine.size();f++)
				{
				if(arrayStockOrderLine.get(f).getStockOrderID() == choice11)
					{System.out.printf("%s\n",arrayStockOrderLine.get(f));}
				}
			}
		}
	}
	
	private void printChangeStockOrder(){
		sqlrStockOrder();
		System.out.println("Current Stock Orders:");
		System.out.println();
		System.out.println("ID\tSupp ID\tStatus");
		System.out.println("==============="); 
		for(StockOrder c : arrayStockOrder)
			{System.out.printf("%s\n",c);}
		System.out.println();
		System.out.println("Change order status?");
		System.out.println("1.Yes");
		System.out.println("2.No");
		int choice12 = input.nextInt();
		if (choice12 == 1)
			{
			System.out.println("Input Stock Order ID:");
			int choice13 = input.nextInt(); //Input OrderID
			
			for(int j = 0; j< arrayCustomerOrder.size(); j++) //Cycle though Order ID
			{
					if(arrayStockOrder.get(j).getStockOrderID() == choice13) //If OrderID=User input then change status.
							{
						System.out.println("Set new status:");
						System.out.println("1. Complete");
						System.out.println("2. Processing");
						System.out.println("3. Quit");
							int choice14 = input.nextInt();
							if (choice14 == 1)
								{
									if(arrayStockOrder.get(j).getStatus() == "Complete")  // || signifies an or statement
										{ System.out.println("Order is already processed");}
											else if(arrayStockOrder.get(j).getStatus() == "Processing")
												{
													arrayStockOrder.get(j).setStatus("Complete");
													idStock = arrayStockOrder.get(j).getStockOrderID(); //Remembers customer ID taken from CustomerOrder
													System.out.println("Order Number " + idStock + " is set to Complete");
									}
									else if(arrayStockOrder.get(j).getStatus() == "Inbound")
									{System.out.println("Order cannot be changed to Complete without first processing");}
								}
							else if (choice14 == 2)
							{
								if(arrayStockOrder.get(j).getStatus() == "Complete")// For the jth element of customer order array will check if status == complete
								{System.out.println("Order is already complete");}
								else if(arrayStockOrder.get(j).getStatus() == "Processing")
								{System.out.println("Order is already being processed");}
								else
								{
									
									arrayStockOrder.get(j).setStatus("Processing");
									idStock = arrayStockOrder.get(j).getStockOrderID();
									for(int k = 0; k< arrayStockOrderLine.size(); k++)
									{
										if(arrayStockOrderLine.get(k).getStockOrderID() == idStock)
											{arrayStock.get(arrayStockOrderLine.get(k).getProductID()-1).setQuantity(arrayStock.get(arrayStockOrderLine.get(k).getProductID()-1).getQuantity()+arrayStockOrderLine.get(k).getQuantity());}
									}
								}
							}
							else
							{break;}
							}
			}
			}
	}
	
	private int printStockSubMenu(){
	System.out.println("1. View product details");
	System.out.println("2. View stock levels");
	System.out.println("3. Check Porousware levels");
	System.out.println("4. Change stock levels");
	return input.nextInt();
	}
	
	private void printProductDetails(){
	System.out.println("Current Product details:\n\nID\tname\tx loc\ty loc\n==================================");
	for(Product c : arrayProduct)
	{System.out.printf("%s\n",c);}
	System.out.println();		
	}
	
	private void printStockLevels(){
	System.out.println("Current stock levels:\n\nID\tQuant\tPorous\tThreshold\n======================================");
	for(Stock c : arrayStock)
	{System.out.printf("%s\n",c);}
	System.out.println();
	}
	
	private void printPorousNeeded(){
		for(int i=0;i<arrayStock.size();i++)
		{
			if(arrayStock.get(i).getPorousQuantity() < arrayStock.get(i).getThreshold())
			{
				deficit = arrayStock.get(i).getThreshold() - arrayStock.get(i).getPorousQuantity();
				System.out.println("Product " +arrayStock.get(i).getProductID() +" needs Porousware to be applied "+ deficit +" more times.");
			}	
		}
	}
	
	private void printChangeStockLevels(){
		System.out.println("ID\tQuant\tPorous\tThreshold");
		for(Stock c : arrayStock)
			{	System.out.printf("%s\n",c);	}
		System.out.println("Enter Product ID you wish to modify:"); //need to include option for porousware as well
		int choice7 = input.nextInt();
		for( int i = 0; i < arrayStock.size(); i++)
			{
			if(choice7 == arrayStock.get(i).getProductID())
				{
				System.out.println("Stock type to modify: \n1.Standard\n2.Porous");
				int choice9 = input.nextInt();
				System.out.println("Enter amount of stock to remove:");
				int choice8 = input.nextInt();
				if (choice9 == 1)
				{	
				arrayStock.get(i).setQuantity(arrayStock.get(i).getQuantity()-choice8);
				if (arrayStock.get(i).getQuantity()<0)
				{arrayStock.get(i).setQuantity(0);}
				System.out.println("Product ID " + arrayStock.get(i).getProductID() +" has been reduced by " + choice8 + " to " + arrayStock.get(i).getQuantity());
				}	
				if (choice9 == 2)
				{
				arrayStock.get(i).setPorousQuantity(arrayStock.get(i).getPorousQuantity()-choice8);
				if (arrayStock.get(i).getPorousQuantity()<0)
				{arrayStock.get(i).setPorousQuantity(0);}
				System.out.println("Product ID " + arrayStock.get(i).getProductID() +" has been reduced by " + choice8 + " to " + arrayStock.get(i).getPorousQuantity());
				}
				}
			}
	}
		   // public JButton button1;
		//    public JMenuBar menuBar;
		//	public JToolBar toolBar;
		//		
		//		
		//	public Main()
		//		{
		//			this.setSize(640,480);
		//			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//			this.setTitle("NIMS");
		//			this.setVisible(true);
		//			this.setLocationRelativeTo(null);
		//			
		//			menuBar = new JMenuBar();
		//			
		//			
		//			
		//			JPanel panel1 = new JPanel();
		//			JLabel label1 = new JLabel("New Inventory Management System");
		//			panel1.add(label1);
		//			this.add(panel1);
		//			JButton button1 = new JButton("Numpty");
		//			panel1.add(button1);
		//			this.add(panel1);
		//			
		//		}
}
