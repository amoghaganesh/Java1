class Company
{
double id = 324214;
String name ="TCS" ;
SoftwareEngineer softwareEngineer = new SoftwareEngineer("raju",5,"data analyst",50000);


Company()
{
	
}
public void details()
{
	softwareEngineer.details();
	System.out.println("The company id is :"+id);
	System.out.println("The company name is :"+name);
    System.out.println("The details of SoftwareEngineer is :"+softwareEngineer);
}
}