
public class Test {
	public static void main(String[]args)
	{
		ArrayList<String> products = new ArrayList<String>();
	    products = new ArrayList<ProductLine>();
	    products.add(new ProductLine("A0001", 10.90, 9.90, 100, "N/A"));
	    products.add(new ProductLine("B0010", 12.00, 7.50, 125, "5"));
	    products.add(new ProductLine("C0100", 3.00, 2.30, 1000, "16"));
	    products.add(new ItemisedProductLine("D1000", 2600, 2490, 2, Arrays.asList("a b d", "e f g h", "i j k l"))));
	    products.add(new ProductLine("E0001", 699, 509, 3, Arrays.asList(new serialNumbers("CCCC333333"),new serialNumbers("DDDD444444"), new serialNumber("AAAA222222"))));
	}

}