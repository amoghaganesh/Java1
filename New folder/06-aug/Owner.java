class Owner
{
String name;
double age;
String gender;

Owner()
{
	System.out.println("Created owner with zero parameters");
}
Owner(String name,double age,String gender)
{
	this.name = name;
	this.age = age;
	this.gender = gender;
		System.out.println("Created owner with String,double,String parameters");

}
public void details()
{
	System.out.println("The owner name is :"+name);
	System.out.println("The owner age is :"+age);
	System.out.println("The owner gender is :"+gender);

}
}