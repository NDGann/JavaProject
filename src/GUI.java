import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class GUI {
	
	
	
	
//WarehouseOrderManager wom = new WarehouseOrderManager();





	private JFrame mainFrame;
	private JLabel headerLabel;
	private JTextArea statusLabel;
	private JPanel controlPanel;
//	private JTextField item1;

	public GUI(){prepareGUI();}
	
	private void prepareGUI() {
		 mainFrame = new JFrame("Warehouse Order Manager");
		 mainFrame.setSize(800, 640);
		 mainFrame.setLayout(new GridLayout(3, 1));
		 headerLabel = new JLabel("", JLabel.CENTER);
		 //statusLabel = new JLabel("", JLabel.CENTER);
		 statusLabel = new JTextArea();
		 statusLabel.setLineWrap(true);
		 statusLabel.setSize(350, 100);
		 mainFrame.addWindowListener(new WindowAdapter() {
			 
			  public void windowClosing(WindowEvent windowEvent)   
			  {
			   System.exit(0);
			  }
			});
			 controlPanel = new JPanel();
			 controlPanel.setLayout(new FlowLayout());
			 mainFrame.add(headerLabel);
			 mainFrame.add(controlPanel);
			 mainFrame.add(statusLabel);
			 mainFrame.setVisible(true);
			}
	
	void showEvent() {
		headerLabel.setText("Press Button");
		JButton okButton = new JButton("View Customer Orders");
		JButton submitButton = new JButton("View Stock Orders");
		JButton cancelButton = new JButton("View Stock Levels");
//		item1 = new JTextField("Enter option");
//		item1.setEditable(true);
		okButton.setActionCommand("OK");
		submitButton.setActionCommand( "Submit");
		cancelButton.setActionCommand( "Cancel");
		okButton.addActionListener( new BCL());
		submitButton.addActionListener( new BCL());
		cancelButton.addActionListener( new BCL());
		controlPanel.add(okButton);
		controlPanel.add(submitButton);
		controlPanel.add(cancelButton);
		mainFrame.setVisible(true);}	
	
	private class BCL implements ActionListener {
		 @Override
		 public void actionPerformed (ActionEvent ae) {
		  String command = ae.getActionCommand();
		  switch (command) {
		   case "OK": 
			   //statusLabel.setText("OK!");
			   String output = "";
			   ArrayList<CustomerOrder> customerOrders = WarehouseOrderManager.sqlrCustomerOrder();
			   statusLabel.setText("Order ID\tCustomer ID\tStatus\n\n");
			   for(int j = 0; j< customerOrders.size(); j++)
			   {
				   statusLabel.append(String.valueOf(customerOrders.get(j).getCustomerOrderID()) +"\t" + String.valueOf(customerOrders.get(j).getCustomerID()) + "\t" + customerOrders.get(j).getStatus() +"\n");
				   
				   //   statusLabel.setText(String.valueOf(customerOrders.get(j).getCustomerID()));
			//	   statusLabel.setText(customerOrders.get(j).getStatus());
			   }
			 //  for (WarehouseOrderManager d: customerOrders)
				   
//				   for(StockOrder c : arrayStockOrder)
//					{System.out.printf("%s\n",c);}
			 //  statusLabel.setText(customerOrders.get(0).getStatus());
		   break;
		   case "Submit":
			   
			   ArrayList<StockOrder> stockOrders = WarehouseOrderManager.sqlrStockOrder();
			   statusLabel.setText("Order ID\tSupplier ID\tStatus\n\n");
			   for(int j = 0; j< stockOrders.size(); j++)
			   {
				   statusLabel.append(String.valueOf(stockOrders.get(j).getStockOrderID()) +"\t" + String.valueOf(stockOrders.get(j).getSupplierID()) + "\t" + stockOrders.get(j).getStatus() +"\n");
			   }
		   break;
		   case "Cancel":
			   ArrayList<Stock> stocks = WarehouseOrderManager.sqlrStock();
			   statusLabel.setText("Product ID\tQuantity\tPorous\tThreshold\n\n");
			   for(int j = 0; j< stocks.size(); j++)
			   {
				   statusLabel.append(String.valueOf(stocks.get(j).getProductID()) +"\t" + String.valueOf(stocks.get(j).getQuantity()) + "\t" + String.valueOf(stocks.get(j).getPorousQuantity()) +"\t" + String.valueOf(stocks.get(j).getThreshold())+ "\n");
			   }
			   
		   break;
		}}}
}
