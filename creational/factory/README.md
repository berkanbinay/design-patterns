# Factory

It is a creational design pattern that talks about the creation of an object. The factory design pattern says that define an interface ( A java interface or an abstract class) for creating object and let the subclasses decide which class to instantiate. The factory method in the interface lets a class defers the instantiation to one or more concrete subclasses. Since these design patterns talk about the instantiation of an object and so it comes under the category of creational design pattern. If we notice the name Factory method, that means there is a method which is a factory, and in general, factories are involved with creational stuff and here with this, an object is being created. It is one of the best ways to create an object where object creation logic is hidden from the client.

<br>
<br>

## Implementation

<br>

1. Define a factory method inside an interface. 
2. Let the subclass implements the above factory method and decides which object to create. 
3. In Java, constructors are not polymorphic, **but by allowing subclass to create an object, we are adding polymorphic behavior to the instantiation.** In short, we are trying to achieve Pseudo polymorphism by letting the subclass to decide what to create, and so this Factory method is also called a virtual constructor. 

<br>

Let us try to implement it with a real-time problem and some coding exercises. 

**Problem Statement:** Consider we want to implement a notification service through email, SMS, and push notifications. Let’s try to implement this with the help of the factory method design pattern. First, we will design a UML class diagram for this. 

<br>

<center>

![Factory Design Pattern UML Diagram](images/factory-uml-diagram.png)

</center>

In the above class diagram, we have an interface called **Notification**, and three concrete classes are implementing the Notification interface. A factory class NotificationFactory is created to get a Notification object.

<br>
<br>

## Advantages & Disadvantages

<br>

**Advantages:**

* You avoid tight coupling between the creator and the concrete products.
* Single Responsibility Principle. You can move the product creation code into one place in the program, making the code easier to support.
* Open/Closed Principle. You can introduce new types of products into the program without breaking existing client code.

**Disadvantages:**

* The code may become more complicated since you need to introduce a lot of new subclasses to implement the pattern. The best case scenario is when you’re introducing the pattern into an existing hierarchy of creator classes.

<br>
<br>

## Usage

<pre>
<li>When a class doesn't know what sub-classes will be required to create
<li>When a class wants that its sub-classes specify the objects to be created.
<li>When the parent classes choose the creation of objects to its sub-classes.
</pre>