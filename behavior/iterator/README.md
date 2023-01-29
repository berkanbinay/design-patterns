# Iterator

Iterator pattern is very commonly used design pattern in Java and .Net programming environment. This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.

<br>
<br>

---

<br>

## Implementation

We're going to create a Iterator interface which narrates navigation method and a Container interface which retruns the iterator . Concrete classes implementing the Container interface will be responsible to implement Iterator interface and use it

IteratorPatternDemo, our demo class will use NamesRepository, a concrete class implementation to print a Names stored as a collection in NamesRepository.

<br>

<center>

![Iterator UML Diagram](images/iterator-uml.jpeg)

</center>

<br>
<br>

## Advantages & Disadvantages

<br>

**Advantages:**

* It supports variations in the traversal of a collection.
* It simplifies the interface to the collection.

**Disadvantages:**

* One overlooked disadvantage to the iterator pattern is that it’s read-only. You can’t change a collection while traversing it with an iterator.
* Iterator is overkill for small applications.

<br>
<br>

## Usage

<br>

* When you want to access a collection of objects without exposing its internal representation.
* When there are multiple traversals of objects need to be supported in the collection.