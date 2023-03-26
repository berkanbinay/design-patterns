# Adapter

This pattern is easy to understand as the real world is full of adapters.   For example consider a USB to Ethernet adapter. We need this when we have an Ethernet interface on one end and USB on the other. Since they are incompatible with each other. we use an adapter that converts one to other. This example is pretty analogous to Object Oriented Adapters. In design, adapters are used when we have a class (Client) expecting some type of object and we have an object (Adaptee) offering the same features but exposing a different interface.

<br>

## Implementation

<br>

1. The client makes a request to the adapter by calling a method on it using the target interface.
2. The adapter translates that request on the adaptee using the adaptee interface.
3. Client receive the results of the call and is unaware of adapter’s presence.

<br>

**Definition:** The adapter pattern convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatible interfaces.

<br>

![Adapter Design Pattern UML Diagrarm](images/adapter-design-patttern-uml-diagram.jpeg)

The client sees only the target interface and not the adapter. The adapter implements the target interface. Adapter delegates all requests to Adaptee.

<br>

## Advantages & Disadvantages

<br>

**Advantages:**

* Helps achieve reusability and flexibility.
* Client class is not complicated by having to use a different interface and can use polymorphism to swap between different implementations of adapters.

**Disadvantages:**

* All requests are forwarded, so there is a slight increase in the overhead.
* Sometimes many adaptations are required along an adapter chain to reach the type which is required.

<br>

 ## Usage

<br>

<pre>
<li>When an object needs to utilize an existing class with an incompatible interface.
<li>When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
<li>When you want to create a reusable class that cooperates with classes which don't have compatible interfaces.
<li>It’s very often used in systems based on some legacy code. In such cases, Adapters make legacy code work with modern classes.
</pre>