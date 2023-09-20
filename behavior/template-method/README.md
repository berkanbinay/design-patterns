# Template Method

**Template Method** is a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

<br>

## Implementation

<br>

1. Analyze the target algorithm to see whether you can break it into steps. Consider which steps are common to all subclasses and which ones will always be unique.

2. Create the abstract base class and declare the template method and a set of abstract methods representing the algorithm’s steps. Outline the algorithm’s structure in the template method by executing corresponding steps. Consider making the template method final to prevent subclasses from overriding it.

3. It’s okay if all the steps end up being abstract. However, some steps might benefit from having a default implementation. Subclasses don’t have to implement those methods.

4. Think of adding hooks between the crucial steps of the algorithm.

5. For each variation of the algorithm, create a new concrete subclass. It must implement all of the abstract steps, but may also override some of the optional ones.

<br>

![Template Method UML Diagram](images/template-pattern-uml.jpeg)

<br>

## Advantages & Disadvantages

<br>

**Advantages:**

* A major benefit of the template method pattern is that it promotes software reusability. This design pattern also supports efficient programming. A subclass only needs to implement methods that are unique to its operation.

* Additionally, an application that uses the template method pattern is more secure, as external classes cannot alter its operation structure.

**Disadvantage:**

* At times, it might be difficult to debug as well as comprehend the flow sequence in the Template method pattern design. There might be cases where the programmer might find themselves applying a function that should not be implemented or you might not implement a given abstract method at all. The programmer is responsible for documentation as well as stringent error handling.

* It might be a difficult task to maintain the template framework since any kind of modifications in the lower or higher level might conflict with the implementation.

<br>

## Usage

<br>

* Use the Template Method pattern when you want to let clients extend only particular steps of an algorithm, but not the whole algorithm or its structure.

* Use the pattern when you have several classes that contain almost identical algorithms with some minor differences. As a result, you might need to modify all classes when the algorithm changes.