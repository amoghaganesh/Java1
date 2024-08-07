class Country
{
String name = "India";
String continent = "Asia";
State state = new State();
Country()
{
	
}
public void details()
{
	state.details();
	System.out.println("The country name is :"+name);
	System.out.println("The country's continent is :"+continent);
	System.out.println("The details of State is :"+state);

}
}