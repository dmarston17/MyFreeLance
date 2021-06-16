
public class Apartment {

	String bedrooms;
	String bathrooms;
	String color;
	int age;
	
	// Creating a constructor to hold all the attributes of the class
	public Apartment(int age, String bedrooms,
	String bathrooms,
	String color
	) {
		
		this.age = age;
		this.bathrooms = bathrooms;
		this.bedrooms = bedrooms;
		this.color = color;
	}


	public String getBedrooms() {
		return bedrooms;
	}

	public String getBathrooms() {
		return bathrooms;
	}

	public String getColor() {
		return color;
	}


	public int getAge() {
		return age;
	}
	
	//@Override
	public String toString() {
		return ("Hello, this albanycorners apartmentment has" + ", " + this.getAge() + 
	"" + this.getBathrooms() + " " 
	+ "Bathrooms" + " " +  this.getBedrooms() + " " + "Bedrooms"+ " " +
	"and the color is" + this.getColor());
	}


	public static void main(String[] args) {
		Apartment albanyCorners = new Apartment (5, "four",  " ", " " +  "blue");
		System.out.println(albanyCorners.toString());
		

	}

}

