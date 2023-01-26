# Observer

Observer pattern is used when there is one-to-many relationship between objects such as if one object is modified, its depenedent objects are to be notified automatically. Observer pattern falls under behavioral pattern category.

<br>
<br>

## Implementation

<br>

Observer pattern uses three actor classes. Subject, Observer and Client. Subject is an object having methods to attach and detach observers to a client object. We have created an abstract class Observer and a concrete class Subject that is extending class Observer.

![Observer UML Diagram](images/observer-uml.jpeg)

<br>
<br>

## Advantages & Disadvantages

<br>

**Advantages:**

* Subject only knows that observer implement Observer interface.Nothing more.
* There is no need to modify Subject to add or remove observers.
* We can reuse subject and observer classes independently of each other.

<br>

**Disadvantages:**

* Memory leaks caused by Lapsed listener problem because of explicit register and unregistering of observers.

<br>
<br>

## Usage

<br>

* It is heavily used in GUI toolkits and event listener. In java the button(subject) and onClickListener(observer) are modelled with observer pattern.
* Social media, RSS feeds, email subscription in which you have the option to follow or subscribe and you receive latest notification.
* All users of an app on play store gets notified if there is an update.
* When the change of a state in one object must be reflected in another object without keeping the objects tight coupled.
* When the framework we writes and needs to be enhanced in future with new observers with minimal chamges
