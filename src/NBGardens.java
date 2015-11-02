	
		//*********************THIS IS FOR POPUPS*************************************
	
			import javax.swing.JOptionPane;
		
		//********************THIS IS FOR INPUTITNG USER AND ARRAY************************

			import java.util.ArrayList;
			import java.util.Scanner;	
		
	public class NBGardens
{	
		//************************** THE START OF THE MAIN **************************************
		
	public static void main(String args[])
		{

		//******************************* ARRAY LIST *********************************************
			ArrayList<CustomerOrder> arrayCustomerOrder = new ArrayList<CustomerOrder>();
			arrayCustomerOrder.add(new CustomerOrder(1,"Gnome",1, "started"));
			arrayCustomerOrder.add(new CustomerOrder(2,"One Direction Gnome",2, "started"));
			arrayCustomerOrder.add(new CustomerOrder(3,"Fishing Gnome", 3, "completed"));
			
		//************************* SETTING A NEW SCANNER AND NEW ARRAY LIST ********************
			
			Scanner input = new Scanner(System.in);	
			ArrayList<String> gnomeList = new ArrayList<String>();			
						
		//************************* CASES WILL ALLOW USER TO MAKE A DECISION ********************
						
			while(true)
			{
			System.out.println("**************************Main Menu*************************\nWhat would you like to do? \n 1 - Orders \n 2 - Warehouse \n ");
			
			int choice = input.nextInt();
		
			switch (choice)
			{
				
		//***************************************************** ARRAY LIST ******************************************************
				case 1:
						System.out.println("\nWhat would you like to do?");
						System.out.println("\n 1 - Check Orders \n 2 - Print Orders \n 3 - Orders that require PorousWare \n 4 - Update Order\n");
						int choice1 = input.nextInt();
						
						
						switch (choice1)
						{
		//*********************************************** CHECK ORDER LIST ******************************************************					
							case 1: 
									System.out.println("You have selected Check Orders \n\n");
									
									System.out.print("\tWould you like to add an order? 1/0");
									
									int choice2 = input.nextInt();
									
									if (choice2 == 1)
									{
										String gnome = input.next();
										int productNumber = 0;
										gnomeList.add(productNumber, gnome);
										productNumber = productNumber++;
										System.out.println(gnome + " has been added to the order database!" + gnomeList + "\n");
										System.out.println("\nWould you like to add another order?\n\n");
										
									}
							break;	
		//************************************************ PRINTING ORDERS ******************************************************				
							case 2:
									System.out.println("If you wish to print orders press 1! if not, press 0\n");
									
										int choice3 = input.nextInt();										
										
										if(choice3 == 1)
										{
											OrderLine printOList = new OrderLine("Nick's Order");
											OrderLine printOList2 = new OrderLine("Jame's Order");
											OrderLine printOList3 = new OrderLine("Lee's Order");
											printOList.printOrdersList();
											printOList2.printOrdersList();
											printOList3.printOrdersList();
										}
							break;
		//***************************************************** POROUS WARE ******************************************************	
							
							case 3:
									System.out.println("You have selected PorousWare");
									
									
							break;
							
							case 4:		
									System.out.println("You have selected Update Order");
							break;
							
							default:
								
							return;

						}
				break;
		//************************************************** END OF CASE 1 *****************************************************	
				
				case 2: 
						System.out.println("\n What would you like to do?\n");
						System.out.println(" 1 - Select An Order \n 2 - Update Inventory System \n 3 - Remove Product From Sale \n 4 - Stock Delivery \n 5 - Product Location \n 6 - Porous Ware Required List \n");
						int choice2a = input.nextInt();
						
						
						switch (choice2a)
						{
						case 1:
								System.out.println("Which order would you like to select?\n");
								
						break;
						
						case 2:
								System.out.println("Which stock levels would you like to ammend?\n");
							
						break;
						
						case 3:
								System.out.println("What product would you like to remove from sale?\n");
						break;
						
						case 4:
								System.out.println("What items have been delivered?\n");
						break;
						
						case 5:
								System.out.println("Which item would you like to locate?\n");
						break;
							
						case 6:
								System.out.println("The items below show which orders require PorousWare:\n");
						break;
							
						default:
							
						break;
						
						}
				
					
				
				break;
		//************************************************* END OF CASE 2 ******************************************************
				
				default:
					
				return;
		//************************************************ END OF DEFAULT CASE *************************************************
			}
	}
}
}
	
	//************************************************************* THE END ****************************************************
		
	/*	CustomerOrder order1 = new CustomerOrder();
		order1.setOrderID(1);
		System.out.println(order1.getOrderID());
		order1.setOrderStatus("complete");
	
		//error due to order1ID being set and not used
		int order1ID = order1.getOrderID();
		*/