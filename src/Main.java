//import java.awt.FlowLayout;
//import java.awt.GridLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;

//import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JPanel;


public class Main extends JFrame{
//	JFrame frame;
//		JPanel panel;
//		static JLabel coidLabel;
//	public Main(){
//		   frame = new JFrame();
//           panel = new JPanel();
//           coidLabel = new JLabel("Customer Order ID");
//           panel.add(comp, constraints);
//           frame.add(panel);
//           panel.add(coidLabel);
//           frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//           frame.pack();
//           frame.setLocationRelativeTo(null);
//           frame.setVisible(true);
//           frame.setSize(640, 480);
//	}
//		 private JFrame mainFrame;
//		 private JLabel headerLabel;
//		 private JLabel statusLabel;
//		 private JPanel controlPanel;
//
//		public Main(){prepareGUI();}
		
//		private void prepareGUI() {
//			 mainFrame = new JFrame("Warehouse Order Manager");
//			 mainFrame.setSize(800, 600);
//			 mainFrame.setLayout(new GridLayout(3, 1));
//			 headerLabel = new JLabel("", JLabel.CENTER);
//			 statusLabel = new JLabel("", JLabel.CENTER);
//			 statusLabel.setSize(350, 100);
//			 mainFrame.addWindowListener(new WindowAdapter() {
//				 
//				  public void windowClosing(WindowEvent windowEvent)   
//				  {
//				   System.exit(0);
//				  }
//				});
//				 controlPanel = new JPanel();
//				 controlPanel.setLayout(new FlowLayout());
//				 mainFrame.add(headerLabel);
//				 mainFrame.add(controlPanel);
//				 mainFrame.add(statusLabel);
//				 mainFrame.setVisible(true);
//				}
		
//		private void showEvent() {
//			headerLabel.setText("Press Button");
//			JButton okButton = new JButton("OK");
//			JButton submitButton = new JButton("Submit");
//			JButton cancelButton = new JButton("Cancel");
//			okButton.setActionCommand("OK");
//			submitButton.setActionCommand( "Submit");
//			cancelButton.setActionCommand( "Cancel");
//			okButton.addActionListener( new BCL());
//			submitButton.addActionListener( new BCL());
//			cancelButton.addActionListener( new BCL());
//			controlPanel.add(okButton);
//			controlPanel.add(submitButton);
//			controlPanel.add(cancelButton);
//			mainFrame.setVisible(true);}	
		
	public static void main(String[] args)
	{
		WarehouseOrderManager wom = new WarehouseOrderManager();
		
	}	
	
//	private class BCL implements ActionListener {
//		 @Override
//		 public void actionPerformed (ActionEvent ae) {
//		  String command = ae.getActionCommand();
//		  switch (command) {
//		   case "OK": statusLabel.setText("OK!");
//		   break;
//		   case "Submit": statusLabel.setText("Submitted!");
//		   break;
//		   case "Cancel": statusLabel.setText("Cancel not possible");
//		   break;
//		}}}
}