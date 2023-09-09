# Flyweight

This pattern is used to reduce the memory footprint. It can also improve performance in applications where object instantiation is expensive.

Simply put, the flyweight pattern is based on a factory which recycles created objects by storing them after creation. Each time an object is requested, the factory looks up the object in order to check if it’s already been created. If it has, the existing object is returned – otherwise, a new one is created, stored and then returned.

The flyweight object’s state is made up of an invariant component shared with other similar objects (**intrinsic**) and a variant component which can be manipulated by the client code (**extrinsic**).

**It’s very important that the flyweight objects are immutable: any operation on the state must be performed by the factory.**

<br>

## Implementation

<br>

The main elements of the pattern are:

* An interface which defines the operations that the client code can perform on the flyweight object
* One or more concrete implementations of our interface
* A factory to handle objects instantiation and caching

<br>

![Flyweight Design Pattern UML Diagrarm](images/flyweight_pattern_uml_diagram.jpg)

<br>

## Advantages & Disadvantages

<br>

**Advantages:**

* Reduce memory consumption of heavy objects that can be controlled identically.
* Reduce the total number of “complete but similar objects” in the system.
* Provide a centralized mechanism to control the states of many “virtual” objects.

**Disadvantages:**

* We need to take the time to configure these flyweights. The design time and skills can be overhead, initially.
* To create flyweights, we extract a common template class from the existing objects. This additional layer of programming can be tricky and sometimes hard to debug and maintain.
* The flyweight pattern is often combined with singleton factory implementation and to guard the singularity, additional cost is required.

<br>

## Usage

<br>

<pre>
    <li>The number of Objects to be created by application should be huge.
    <li>The object creation is heavy on memory and it can be time consuming too.
    <li>The object properties can be divided into intrinsic and extrinsic properties, extrinsic properties of an Object should be defined by the client program.

</pre>