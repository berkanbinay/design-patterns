# Command Design Pattern

Command pattern is a data driven design pattern and falls under behavioral pattern category. A request is wrapped under an object as command and passed to invoker object. Invoker object looks for the appropriate object which can handle this command and passes the command to the corresponding object which executes the command.

## Implementation
---
We have created an interface Order which is acting as a command. We have created a Stock class which acts as a request. We have concrete command classes BuyStock and SellStock implementing Order interface which will do actual command processing. A class Broker is created which acts as an invoker object. It can take and place orders.

Broker object uses command pattern to identify which object will execute which command based on the type of command. CommandPatternDemo, our demo class, will use Broker class to demonstrate command pattern.

<br>

![Commmand Pattern UMl Diagram](images/command_pattern_uml_diagram.jpg)

<br>

## Advantages & Disadvantages

---

**Advantages:** 

* Makes our code extensible as we can add new commands without changing existing code.
* Reduces coupling between the invoker and receiver of a command.

**Disadvantages:**

* Increase in the number of classes for each individual command


<br>

## Usage

---

<br>

* When you need parameterize objects according to an action perform.
* When you need to create and execute requests at different times.
*   When you need to support rollback, logging or transaction functionality.