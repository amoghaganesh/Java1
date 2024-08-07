class Hotel
{
String name = "A1 bilal";
Owner owner = new Owner("rakesh",23,"male");
Hotel()
{
	System.out.println("created hotel with zero parameters");
	
}
public void details()
{
	owner.details();
	System.out.println("The hotel name is :"+name);
	System.out.println("The owner details is :"+owner);
	
	
	
}
}