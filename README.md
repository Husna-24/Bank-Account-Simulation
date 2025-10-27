# Bank-Account-Simulation

Overview :

This project simulates basic bank operations such as deposits, withdrawals, interest calculation, and transaction tracking using Java Object-Oriented Programming (OOP) concepts.

The simulation models real-world banking behavior with multiple account types — Savings and Checking — demonstrating classes, inheritance, method overriding, and encapsulation.

Objectives :

Implement a simple, class-based bank system.

Demonstrate OOP principles: Classes, Inheritance, Encapsulation, Polymorphism, and Method Overriding.

Maintain transaction history for each account.

Simulate real-world scenarios of deposits and withdrawals.

Tools used :

Language: Java

IDE: Visual Studio Code (VS Code)

Execution: Terminal 

Project Structure :

BankSimulation/
│
├── BankAccountSimulation.java   
├── Account.java          
├── SavingsAccount.java   
├── CheckingAccount.java  
├── Transaction.java      
└── README.md             

Features :

 - Deposit and Withdraw — Safely add or remove funds from accounts.
 - Transaction History — Automatically logs each operation with timestamps.
 - Interest Calculation — Savings accounts earn interest.
 - Overdraft Support — Checking accounts can withdraw beyond balance (up to a limit).
 - OOP Principles — Uses inheritance and method overriding to create realistic behaviors.


How to Run :
1. Compile the Java File
javac BankAccountSimulation.java

2. Run the Program
java BankAccountSimulation

Interview Questions :

1. What is inheritance in Java?

Inheritance is an OOP concept where one class (child or subclass) acquires the properties and behaviors (fields and methods) of another class (parent or superclass).
It promotes code reusability and helps in building hierarchical relationships.

Example:

class Animal {
    void eat() { System.out.println("Eating"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Barking"); }
}

Here, Dog inherits eat() from Animal.

2️. Why use the this keyword?

The this keyword refers to the current object of the class.

Common uses:

To refer to current class variables.
To invoke current class methods or constructors.
To pass the current object as an argument.

Example:

class Student {
    String name;
    Student(String name) {
        this.name = name; 
    }
}

3️. What is method overriding vs overloading?

Feature	                                  Overloading	                                 Overriding
Definition	    Same method name, different parameters (within same class)	      Same method name & parameters in child class
Occurs in                     	Compile-time	                                            Runtime
Return type	            Can differ (if not same method signature)	                Must be same or covariant
Purpose	                     Increases method flexibility	                   Customizes behavior for subclass

Example:

// Overloading
void show(int a) {}
void show(String b) {}

// Overriding
class A { void display() {} }
class B extends A { void display() { /* new behavior */ } }

4️. What is object instantiation?

Object instantiation is the process of creating an actual instance of a class using the new keyword.
An object occupies memory and can access class members.

Example:

Car car1 = new Car();

5️. Explain single vs multiple inheritance.
Single Inheritance - A class inherits from one superclass.Ex: class B extends A {}
Multiple Inheritance - A class inherits from multiple classes.	Java supports it via interfaces.

Example (Using Interfaces):

interface A { void show(); }
interface B { void display(); }

class C implements A, B {
    public void show() {}
    public void display() {}
}

6️. What is encapsulation?

Encapsulation is the process of binding data and methods that operate on that data within one unit (class).
It hides internal implementation details and provides controlled access via getters and setters.

Example:

class Account {
    private double balance;

    public void deposit(double amount) { balance += amount; }
    public double getBalance() { return balance; }
}

Here, balance is protected from direct access — a key benefit of encapsulation.

7️. What is constructor overloading?

Constructor overloading means defining multiple constructors in the same class with different parameter lists.
It allows objects to be initialized in different ways.

Example:

class Student {
    Student() { }
    Student(String name) { }
    Student(String name, int age) { 
    }
}

8️. Can we override static methods?

No, Static methods belong to the class, not the object.
They can be hidden (if redefined in a subclass) but not overridden.

Example:

class Parent {
    static void show() {
    System.out.println("Parent"); 
    }
}

class Child extends Parent {
    static void show()
    {
    System.out.println("Child");
    } 
}

9️. What is runtime polymorphism?

Runtime polymorphism  occurs when a method call is resolved at runtime instead of compile-time.
It is achieved through method overriding and upcasting.

Example:

class Animal { 
void sound() {
System.out.println("Animal sound");
}
}
class Dog extends Animal { 
void sound() {
System.out.println("Bark");
}
}
Animal a = new Dog();
a.sound(); 

10. Difference between class and object
Feature	                          Class                    	Object
Definition	 Blueprint or template for creating objects	  Instance of a class
Memory	              Does not occupy memory	              Occupies memory
Example	                   class Car {}	                    Car myCar = new Car();
Purpose	        Defines structure & behavior	             Represents actual data or entity

