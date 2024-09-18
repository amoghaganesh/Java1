package com.xworkz.inheritance;

public class PersonRunner {

    public static void main(String[] args) {
        // 3.1 Create 5 copies of Person
        Person person1 = new Person("Amogha Ganesh T M", "amoghaganesh2002@gmail.com", 22, "6361607266");
        Person person2 = new Person("Manoj", "manojkumar2000@gmail.com", 26, "934823525234");
        Person person3 = new Person("Manjunath", "manjunath43@gmail.com", 28, "987654321");
        Person person4 = new Person("Upendra", "upendra007@gmail.com", 25, "65849320432");
        Person person5 = new Person("Venky", "venky420@gmail.com", 35, "83923402435");

        // 3.2 Create an array of Person and add all 5 copies to the array
        Person[] persons = {person1, person2, person3, person4, person5};

        // 3.3 Use forEach loop to print all details of Person
        for (Person person : persons) {
            person.display();
        }
    }
}
