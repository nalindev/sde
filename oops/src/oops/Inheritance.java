package oops;
/*
 * Inheritance - it is a mechanism in which one object acquires all the properties and
 * behaviour of it's parent object.
 * 
 *  In java inheritance are of 4 types -
 *  1. single inheritance - when a class inherits another class
 *  2. Multilevel inheritance - when there is a chain of inheritance
 *  3. Hierarchical inheritance - when two or more classes inherits a single class
 *	4. Hybrid inheritance - A hybrid inheritance is a combination of more then one type of inheritance.  	 
 *  
 *  Note - Multiple Inheritance are not supported in java through classes. we can use Interface for that.
 */

//single inheritance
class Employee {
	float salary = 40000;
}

class Programmer extends Employee {
	int bonus = 10000;
}

//multilevel inheritance
class Company extends Programmer {
	String Company = "Virtusa";
}

//Hierarchical Inheritance
class Animal {
	void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("barking....");
	}
}
class Cat extends Animal {
	void meow() {
		System.out.println("meowww......");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Programmer obj = new Programmer();
		System.out.println(obj.salary + " " + obj.bonus);
		
		Company c = new Company();
		System.out.println(c.Company + " " + c.salary + " " + c.bonus);
	}

}
