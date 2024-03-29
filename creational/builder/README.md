# Builder

Builder pattern aims to “Separate the construction of a complex object from its representation so that the same construction process can create different representations.” It is used to construct a complex object step by step and the final step will return the object. The process of constructing an object should be generic so that it can be used to create different representations of the same object.

<br>

## Implementation

<br>

<center>

![Builder Design Pattern UML Diagram](images/builder-uml-diagram.jpeg)

</center>

* **Product –** The product class defines the type of the complex object that is to be generated by the builder pattern.
* **Builder –** This abstract base class defines all of the steps that must be taken in order to correctly create a product. Each step is generally abstract as the actual functionality of the builder is carried out in the concrete subclasses. The GetProduct method is used to return the final product. The builder class is often replaced with a simple interface.
* **ConcreteBuilder –** There may be any number of concrete builder classes inheriting from Builder. These classes contain the functionality to create a particular complex product.
* **Director –** The director-class controls the algorithm that generates the final product object. A director object is instantiated and its Construct method is called. The method includes a parameter to capture the specific concrete builder object that is to be used to generate the product. The director then calls methods of the concrete builder in the correct order to generate the product object. On completion of the process, the GetProduct method of the builder object can be used to return the product.

<br>

## Advantages & Disadvantages

<br>

**Advantages:**

* The parameters to the constructor are reduced and are provided in highly readable method calls.
* Builder design pattern also helps in minimizing the number of parameters in the constructor and thus there is no need to pass in null for optional parameters to the constructor.
* Object is always instantiated in a complete state
* Immutable objects can be built without much complex logic in the object building process.

**Disadvantages:**

* The number of lines of code increases at least to double in builder pattern, but the effort pays off in terms of design flexibility and much more readable code.
* Requires creating a separate ConcreteBuilder for each different type of Product.

<br>


## Usage

<br>

<pre>
<li>Useful when you need to create an object with lots of possible configuration options.
<li>When it’s necessary to use a constructor with a long parameter list or when there’s a long list of constructors with different parameters.
<li>When it’s necessary to build different representations of the same object. That is, when objects of the same class with different characteristics are needed.
</pre>