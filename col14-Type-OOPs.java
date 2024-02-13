
import java.io.*;

//class or object
class Demo {
    int a = 10;
    String b = "vishal";

    void show() {
        System.out.println(a + " " + b);
    }
}

class Test {
    public static void main(String[] args) {
        // Demo d=new Demo(); //obj creation
        // d.show();
        // method 2 for obj created
        Demo d;
        d = new Demo();
        d.show();
    }
}

// Java Program to demonstrate
// Constructor

class Geeks {
    // Constructor
    Geeks() {
        super();
        System.out.println("Constructor Called");
    }

    // main function
    public static void main(String[] args) {
        Geeks geek = new Geeks();
    }
}

// Java Program to create and call a default constructor
class A {
    int a;
    String b;
    Boolean c;

    // creating a default constructor
    // A(){
    // a=20; b="vishal"; c=false;
    // }
    void Disp() {
        System.out.println(a + " " + b + " " + c);
    }

    // main method
    public static void main(String args[]) {
        // calling a default constructor
        A r = new A();
        r.Disp();
    }
}

// parameterized constructor
class B {
    int x;
    String y;

    B(int a, String b) {
        x = a;
        y = b;
    }

    B(int a, int b) {
        System.out.println(a + " " + b);
    }

    void show() {
        System.out.println(x + " " + y);
    }

    public static void main(String[] args) {
        B r = new B(20, "vishal");
        r.show();
        B ref = new B(20, 30);
    }
}

// copy contructor
class Copy {
    int a;
    String b;

    Copy() { // default contructor
        a = 10;
        b = "vishal";
        System.out.println(a + " " + b);
    }

    Copy(Copy ref) {
        a = ref.a;
        b = ref.b;
        System.out.println(a + " " + b);
    }

    public static void main(String[] args) {
        Copy r = new Copy();
        Copy r2 = new Copy(r);
    }
}

// Private Constructor
class C {
    int a;
    double b;
    String c;

    private C() {
        a = 10;
        b = 30.45;
        c = "vishal";
        System.out.println(a + " " + b + " " + c);
    }

    static void show() {

    }
}

class C1 {
    public static void main(String[] args) {
        C r = new C(); // here error because our class is private dont call by another class
    }
}

// inheritance

class Parent {
    int money = 5000000;

    public void driveCar() {
        System.out.println("Driving Mercedes   ");
    }
}

class Child extends Parent { //
    public void play() {
        System.out.println("Playing cricket....");
    }

    public static void main(String[] args) {
        // when we call the child class then both class are call beacuse inheritance
        // we we call the parent class then only parent class is call only not child
        // class
        // Parent r = new Parent();
        Child r1 = new Child();
        r1.driveCar();
        r1.play();
        // r.play(); this is not correct
        System.out.println(r1.money);
    }
}

// type of inheritance
// https://www.geeksforgeeks.org/inheritance-in-java/
// https://www.javatpoint.com/types-of-inheritance-in-java

// Polymorphism(overloding):compile time

class Poly {
    public void addition(int a, int b) { // method
        System.out.println("sum of two number  " + (a + b));
    }

    public void addition(int a, int b, int c) { // method
        System.out.println("sum of 3 number  " + (a + b + c));
    }

    public static void main(String[] args) {
        Poly o = new Poly();
        o.addition(5, 7);
        o.addition(5, 7, 9);
    }
}

class Poly1 {
    public void addition(int a, int b) { // method
        System.out.println("sum of two number  " + (a + b));
    }

    public void addition(String a, int b) { // method
        System.out.println("concatenation of string with Integers  " + (a + b));
    }

    public void addition(int a, String b) { // method
        System.out.println("concatenation of string with Integers  " + (a + b));
    }

    public void addition(int a, int b, int c) { // method
        System.out.println("sum of 3 number  " + (a + b + c));
    }

    public static void main(String[] args) {
        Poly1 o = new Poly1();
        o.addition("hello", 7);
        o.addition(5, 7, 9);
        o.addition(7, "hello");

    }
}

// Polymorphism(overriding(runtime))
class Parent1 {
    int money = 5000000;

    public void driveCar() {
        System.out.println("Driving Mercedes   ");
    }
} 
class Child1 extends Parent {
    @Override //means below method is override method
    public void driveCar() {
        System.out.println("Driving alto  ");
    }

    public void play() {
        System.out.println("Playing cricket....");
    }

    public static void main(String[] args) {
        // when we call the child class then both class are call beacuse inheritance
        // we we call the parent class then only parent class is call only not child
        // class
        Parent1 r = new Parent1(); // r is obj ref
        r.driveCar();
        Child1 r1 = new Child1();
        r1.play();
        r1.driveCar();
        // r.play(); this is not correct
        System.out.println(r1.money);
    }
}

// Encapsulation
// getter and setter are always public
class Account {
    private int balance = 5000; //data hiding

    // Getter method
    public int getbalance() {
        return balance;
    }

    // setter method
    public void setBalance(int amount) { // credit amount or data abstraction
        balance = balance + amount;
    }
}

class Bank {
    public static void main(String[] args) {
        Account a = new Account();
        System.out.println(a.getbalance());
        a.setBalance(500);
        System.out.println(a.getbalance());

    }
}

class Person {
    private String name;
    private int age;
  
    public String getName() { return name; }
  
    public void setName(String name) { this.name = name; }
  
    public int getAge() { return age; }
  
    public void setAge(int age) { this.age = age; }
}
  
class encap {
    public static void main(String[] args)
    {
        Person person = new Person();
        person.setName("John");
        person.setAge(30);
  
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}

// Abstraction
// all abs method need to be defined child class
abstract class Bike { // abstract class
   public abstract void run(); // abstract method

    public void brake() { // concrete method
        System.out.println("break applied...");
    }
}

class Pulsar extends Bike {
    public void run() {
        System.out.println("pulsar is running  ");
    }

    public static void main(String[] args) {
        // Pulsar p=new Pulsar();
        // p.run();
        Bike b = new Pulsar(); // abstraction
        b.run();
        b.brake();
    }
}



// Java program to illustrate the
// concept of Abstraction
abstract class Shape {
    String color;
 
    // these are abstract methods
    abstract double area();
    public abstract String toString();
 
    // abstract class can have the constructor
    public Shape(String color)
    {
        System.out.println("Shape constructor called");
        this.color = color;
    }
 
    // this is a concrete method
    public String getColor() { return color; }
}
class Circle extends Shape {
    double radius;
 
    public Circle(String color, double radius)
    {
 
        // calling Shape constructor
        super(color);
        System.out.println("Circle constructor called");
        this.radius = radius;
    }
 
    @Override double area()
    {
        return Math.PI * Math.pow(radius, 2);
    }
 
    @Override public String toString()
    {
        return "Circle color is " + super.getColor()
            + "and area is : " + area();
    }
}
class Rectangle extends Shape {
 
    double length;
    double width;
 
    public Rectangle(String color, double length,
                     double width)
    {
        // calling Shape constructor
        super(color);
        System.out.println("Rectangle constructor called");
        this.length = length;
        this.width = width;
    }
 
    @Override double area() { return length * width; }
 
    @Override public String toString()
    {
        return "Rectangle color is " + super.getColor()
            + "and area is : " + area();
    }
}
class Test1{
    public static void main(String[] args)
    {
        Shape s1 = new Circle("Red", 2.2);
        Shape s2 = new Rectangle("Yellow", 2, 4);
 
        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}