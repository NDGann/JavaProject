
public class Traveller {
	for(NN c : arrayNN)
	{System.out.printf("%s\n",c);}
	double low =  Math.pow((Math.pow(arrayNN.get(0).getX(),2)+(Math.pow(arrayNN.get(0).getY(),2))),0.5);
	double count1=0;
	int count = 0; //used with arrayNN.size to get the upper limit on the size of the nearest neighbour route
	double oldX = 0; //stores X coordinates from the product position that is accepted as the shortest
	double oldY = 0; //stores Y coordinates from the product position that is accepted as the shortest
	
	while (count < arrayNN.size)
	{
		arrayNN2.add(new NN(1,1,1,1,false));
		
		for(int i; i < arrayNN.size(); i++)
		{
			if (arrayNN.get(i).getStatus() == false)
			{
				if(Math.pow((Math.pow(arrayNN.get(i).getX()-oldX,2)+(Math.pow(arrayNN.get(count).getY()-oldY,2))),0.5) < low) //NEED TO MINUS PREVIOUS COORDINATE IF I HAVENT ALREADY DONE
				{
					
					arrayNN2.get(i).setStep(count+1);
					//int NNID = arrayOrderLine.get(j).getProductID(); //retrieve orderID from order line
					//arrayOrderLine.get(j).getProductID(); //retrieve orderID from order line
					//will be running down some element of the array, this index will always have the right product id attached to it, so retrieve from there, if not index, use step as will also be correct
					//int NNID= arrayNN.get(index);
					int NNID = arrayNN.get(count).getProductID();
					arrayNN2.get(i).setProductID(NNID);
					
					//how do i assign the right product id? using p would be right on the first run but then it would
					arrayNN2.get(i).setX(arrayProduct.get(NNID -1).getLocationX()); //retrieve x location from product
					arrayNN2.get(i).setY(arrayProduct.get(NNID -1).getLocationY());
					//set new counting variable?
					
					//make another array containing final order?
					//set something to true to remove element?
				}
				
				arrayNN.get(i).setStatus(false);
			}
			
		}	
		
		count++;
	}
	System.
		
		
		
		
		
		
		
		
	
	
	for (int k = 0; k<arrayNN.size();k++)
	{
//	while (count < arrayNN.size())
//		{
		int p=0; //what is p?
			arrayNN2.add(new NN(1,1,1,1,false));
			if (arrayNN2.get(count).getStatus() == false)
			{
				
			for()
			if(Math.pow((Math.pow(arrayNN.get(count).getX()-oldX,2)+(Math.pow(arrayNN.get(count).getY()-oldY,2))),0.5) < low) //NEED TO MINUS PREVIOUS COORDINATE IF I HAVENT ALREADY DONE
			{
				
				arrayNN2.get(count).setStep(count+1);
				//int NNID = arrayOrderLine.get(j).getProductID(); //retrieve orderID from order line
				//arrayOrderLine.get(j).getProductID(); //retrieve orderID from order line
				//will be running down some element of the array, this index will always have the right product id attached to it, so retrieve from there, if not index, use step as will also be correct
				//int NNID= arrayNN.get(index);
				
				arrayNN2.get(count).setProductID(arrayNN.get(p).getProductID()); //how do i assign the right product id? using p would be right on the first run but then it would
				arrayNN2.get(count).setX(arrayProduct.get(NNID -1).getLocationX()); //retrieve x location from product
				arrayNN2.get(count).setY(arrayProduct.get(NNID -1).getLocationY());
				//set new counting variable?
				
				//make another array containing final order?
				//set something to true to remove element?
			}
			//reset variable?
			oldX = arrayNN.get(count).getX(); //sets the X values for the coordinate of the accepted route
			oldY = arrayNN.get(count).getY(); //sets the Y values for the coordinate of the accepted route
			// set the status = true
		}
		arrayNN.get(count).setStatus(true); //sets the row on arrayNN to true so that it is not used in the next loop
		count++;
		}
}















while (count < arrayNN.size())
{
	arrayNN2.add(new NN(1,1,1,1,false));
	

		if (arrayNN.get(i).getStatus() == false) //ignores elements that have already been set as best routes
		{
			for(i=0 ; i < arrayNN.size(); i++)
			{
				if(Math.pow((Math.pow(arrayNN.get(i).getX()-oldX,2)+(Math.pow(arrayNN.get(count).getY()-oldY,2))),0.5) < low)
				{
				
					arrayNN2.get(i).setStep(count+1); //generates a step number for arrayNN2
					int NNID = arrayNN.get(i).getProductID(); // get product ID from the arrayNN
					arrayNN2.get(count).setProductID(NNID);
				
					//how do i assign the right product id? using p would be right on the first run but then it would
					arrayNN2.get(count).setX(arrayProduct.get(NNID -1).getLocationX()); //retrieve x location from product
					arrayNN2.get(count).setY(arrayProduct.get(NNID -1).getLocationY());
					low = Math.pow((Math.pow(arrayNN.get(i).getX()-oldX,2)+(Math.pow(arrayNN.get(i).getY()-oldY,2))),0.5);
					coordinate = i; // stores i value of the index that was the best route
				}
			

			}
			oldX = arrayNN.get(coordinate).getX(); //sets the X values for the coordinate of the best route
			oldY = arrayNN.get(coordinate).getY(); //sets the Y values for the coordinate of the best route
			if( i > arrayNN.size())
			{i=arrayNN.size();}
					
			arrayNN.get(coordinate).setStatus(true); //sets true so that for function removes arrayNN row that was the best route so that it isn't included in next pass
		}	
	
	count++;
}