class SoftwareEngineer
{
String name;
double experience;
String designation;
double salary;

SoftwareEngineer(String name,double experience,String designation,double salary)
{
	this.name = name;
	this.experience = experience;
	this.designation = designation;
	this.salary = salary;
}
public void details()
{
	System.out.println("The name of the SoftwareEngineer :"+name);
	System.out.println("The experience of the SoftwareEngineer :"+experience);
	System.out.println("The designation of the SoftwareEngineer :"+designation);
	System.out.println("The salary of the SoftwareEngineer :"+salary);

}
}