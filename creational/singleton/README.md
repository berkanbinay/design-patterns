# Singleton

Singleton pattern is one of the simplest design patterns in Java. This type of design pattern comes under creational pattern as this pattern provides one of the best ways to create an object.

This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.

<br>
<br>

## Implementation

<br>

To implement a singleton pattern, we have different approaches, but all of them have the following common concepts.

* Private constructor to restrict instantiation of the class from other classes.
* Private static variable of the same class that is the only instance of the class.
* Public static method that returns the instance of the class, this is the global access point for the outer world to get the instance of the singleton class.

<center>

![Singleton Design Pattern UML Diagram](images/singleton_uml.jpeg)

</center>

<br>
<br>

## Advantages & Disadvantages

<br>

**Advantages:**

 * You can be sure that a class has only a single instance.
 * You gain a global access point to that instance.
 * The singleton object is initialized only when it’s requested for the first time.
 * Saves memory because object is not created at each request. Only single instance is reused again and again.

 **Disadvantages:**

 * Violates the Single Responsibility Principle. The pattern solves two problems at the time.
 * The Singleton pattern can mask bad design, for instance, when the components of the program know too much about each other.
 * The pattern requires special treatment in a multithreaded environment so that multiple threads won’t create a singleton object several times.
 * It may be difficult to unit test the client code of the Singleton because many test frameworks rely on inheritance when producing mock objects. Since the constructor of the singleton class is private and overriding static methods is impossible in most languages, you will need to think of a creative way to mock the singleton. Or just don’t write the tests. Or don’t use the Singleton pattern.

 <br>
 <br>

 ## Usage

<br>

```
Singleton pattern is mostly used in multi-threaded and database applications. It is used in logging, caching, thread pools configuration settings etc.
```