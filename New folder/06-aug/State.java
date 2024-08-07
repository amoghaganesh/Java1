class State
{
String name = "Karnataka";
String language = "Kannada";
	CapitalCity capitalCity = new CapitalCity("Banglore",1000000l);
State()
{
	
}	
public void details()
{
	capitalCity.details();
	System.out.println("The name of the state is :"+name);
	System.out.println("The language of the state is :"+language);
	System.out.println("The details of capitalCity is :"+capitalCity);


}
}