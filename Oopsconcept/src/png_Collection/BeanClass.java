package png_Collection;

public class BeanClass implements Comparable{
	private String color;
	private String brand;
	private double price;
	public BeanClass(String brand, String color, double price) {
		// TODO Auto-generated constructor stub
	
		this.color=color;
		this.brand=brand;
		this.price=price;
}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getBrand() {
		
		// TODO Auto-generated method stub
		return brand;
	}
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	//String brand;
	//double price;
	public int compareTo(Object o)
	{
	BeanClass bn= (BeanClass) o;
	{
		if(price==bn.price)
		{
			return 0;
		}else if(price>bn.price)
		{
			return 1;
		}else
		{
			return -1;
		}
	}
}
}
