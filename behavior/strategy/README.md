# Strategy

In Strategy pattern, a class behavior or its algorithm can be changed at run time. This type of design pattern comes under behavior pattern.

In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.

## Implementation

<br>

We are going to create a Strategy interface defining an action and concrete strategy classes implementing the Strategy interface. Context is a class which uses a Strategy.

StrategyPatternDemo, our demo class, will use Context and strategy objects to demonstrate change in Context behaviour based on strategy it deploys or uses.

![Strategy UML Diagram](images/strategy-uml.jpg)

<br>

## Advantages & Disadvantages

**Advantages:**

* A family of algorithms can be defined as a class hierarchy and can be used interchangeably to alter application behavior without changing its architecture.
* By encapsulating the algorithm separately, new algorithms complying with the same interface can be easily introduced.
* The application can switch strategies at run-time.
* Strategy enables the clients to choose the required algorithm, without using a “switch” statement or a series of “if-else” statements.
* Data structures used for implementing the algorithm are completely encapsulated in Strategy classes. Therefore, the implementation of an algorithm can be changed without affecting the Context class.

**Disadvantages:**

* The application must be aware of all the strategies to select the right one for the right situation.
* Context and the Strategy classes normally communicate through the interface specified by the abstract Strategy base class. Strategy base class must expose interface for all the required behaviours, which some concrete Strategy classes might not implement.
* In most cases, the application configures the Context with the required Strategy object. Therefore, the application needs to create and maintain two objects in place of one.

<br>

## Usage

<br>

* When the multiple classes differ only in their behaviors.e.g. Servlet API.
* It is used when you need different variations of an algorithm.