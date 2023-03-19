# Prototype

Prototype allows us to hide the complexity of making new instances from the client. The concept is to copy an existing object rather than creating a new instance from scratch, something that may include costly operations. The existing object acts as a prototype and contains the state of the object. The newly copied object may change same properties only if required. This approach saves costly resources and time, especially when object creation is a heavy process.
<br>
The prototype pattern is a creational design pattern. Prototype patterns are required, when object creation is time consuming, and costly operation, so we create objects with the existing object itself. One of the best available ways to create an object from existing objects is the **clone() method.** Clone is the simplest approach to implement a prototype pattern. However, it is your call to decide how to copy existing object based on your business model.

<br>

## Implementation

<center>

![Prototype Design Pattern UML Diagram](images/prototype-uml-diagram.png)

</center>

**Prototype Design Participants**

1. **Prototype:** This is the prototype of an actual object.
2. **Prototype registry:** This is used as a registry service to have all prototypes accessible using simple string parameters.
3. **Client:** Client will be responsible for using registry service to access prototype instances.

<br>

## Advantages & Disadvantages

<br>

**Advantages:**
 

* **Adding and removing products at run-time –** Prototypes let you incorporate a new concrete product class into a system simply by registering a prototypical instance with the client. That’s a bit more flexible than other creational patterns, because a client can install and remove prototypes at run-time.
 
* **Specifying new objects by varying values –** Highly dynamic systems let you define new behavior through object composition by specifying values for an object’s variables and not by defining new classes. 
 
* **Specifying new objects by varying structure –** Many applications build objects from parts and subparts. For convenience, such applications often let you instantiate complex, user-defined structures to use a specific subcircuit again and again. 
 
* **Reduced subclassing –** Factory Method often produces a hierarchy of Creator classes that parallels the product class hierarchy. The Prototype pattern lets you clone a prototype instead of asking a factory method to make a new object. Hence you don’t need a Creator class hierarchy at all. 
 
**Disadvantages:**

* Overkill for a project that uses very few objects and/or does not have an underlying emphasis on the extension of prototype chains. 
 
* It also hides concrete product classes from the client

* Each subclass of Prototype must implement the clone() operation which may be difficult, when the classes under consideration already exist. Also implementing clone() can be difficult when their internals include objects that don’t support copying or have circular references.

<br>

## Usage

<br>

When a system should be independent of how its products are created, composed, and represented and 
<br>
When the classes to instantiate are specified at run-time. 

<pre>
<li>By dynamic loading or To avoid building a class hierarchy of factories that parallels the class hierarchy of products or
<li>When instances of a class can have one of only a few different combinations of state. It may be more convenient to install a corresponding number of prototypes and clone them rather than instantiating the class manually, each time with the appropriate state.
</pre>