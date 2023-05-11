# Proxy

**Dictionary meaning of proxy:** the authority to represent someone else.

Java proxy design pattern comes under the structural design pattern category. In proxy design pattern we use a surrogate or placeholder to control the access of original object.

**Main advantage of java proxy design pattern is that it provides the protection to the original object from the outside world by providing the controlled access of original object.**

<br>

## Implementation

<br>

**Proxy Design Pattern uses** three components to implement:

**Subject** - the interface which exposes the functionality.

**Real Subject** - the class implements the Subject and provides the concrete implementation of the interface. In this class, we hide behind the Proxy.

**Proxy** - the class implements the Subject so that it can substitute Real Subject objects. It maintains the reference of the Real Subject to the substituted Proxy object so that it can forward a request to the Real Subject whenever needed.

![Proxy Design Pattern Diagram](images/proxy-design-pattern-diagram.jpeg)

<br>

## Advantages & Disadvantages

<br>

**Advantages:**

* **Security:** Proxy provides an additional layer of protection to the original object from the outside world by adding an intermediatory layer between the client and the actual implementations.
* **Better Performance:** By avoiding the creation or duplication of memory-intensive objects and caching frequently accessed objects, proxies can improve the performance of the application.
* **Reliability:** Since the proxy is similar to the actual object and contains the essential information related to the object, the proxy can work in place of actual objects even if the actual service is not ready or is not available.

**Disadvantages:**

* **Complexity:** We have to write repeated code as the proxy is similar to the actual object. Hence, it increases the code complexity.
* **Extra Effort:** To update the application, the developer must concurrently update the proxy object alongside the real object.
* **Ambiguity:** Proxies are meant to act as a substitute for real and heavy objects. If somehow, some clients are able to directly access the real objects instead of proxies, then the application may exhibit disparate behavior.

<br>

 ## Usage

<br>

<pre>
We can do proxy in many ways like:

<li><b>Virtual Proxy</b> - Do lazy loading of memory rich or heavy objects until it is needed.
<li><b>Decorative Proxy</b> - Add extra functionality to the existing objects just like we do in Decorator Design Pattern. 
<li><b>Protective Proxy</b> - Control access to the objects functionality.
<li><b>Debugging Proxy</b> - Add logs that may also be helpful in debugging.
<li><b>Remote Proxy</b> - provides a local representative for a remote object like stub objects in RMI/RPC or CORBA.
<li><b>Smart Proxy</b> - checking the lock on real object while updating, loading persistence object upon the first reference, managing real object reference, etc.
</pre>