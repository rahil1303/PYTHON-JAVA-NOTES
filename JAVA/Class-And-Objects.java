public class Dog {
  String name;
  int age;

public Dog(String name, int age) {
  this.name = name;
  this.age = age;
}

public void bark() {
  System.out.println("Woof");
}
}

public class Main  {
  public static void main(Stirng[] args) {
    Dog myDog = new Dog("Buddy", 3);
    myDog.bark();
  }


Class Definition:

The Dog class is defined with two fields (name and age), a constructor to initialize these fields, and a method (bark) to print "Woof!".
Object Creation:

In the Main class, a Dog object named myDog is created with the name "Buddy" and age 3.
Method Invocation:

The bark method is called on myDog, resulting in the output "Woof!".
