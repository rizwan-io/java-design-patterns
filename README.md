# Design Patterns
> The goal of using design pattern is to design reusable and extensible object-oriented software.

### What is Design Pattern?
Design patterns are elegant solution to repeating problem in software design. 
This repo will cover 23 Design patterns that were originally documented in the book named "Elements of Reusable object-oriented software" by Gang Of Four.

The GoF pattern include 23 design patterns that are divided into 3 categories:
1. Creational - Deals with different ways to create an object.
2. Structural - Deals with relationship between objects.
3. Behavioural - Deals with communication between these objects.


## 01-Essentials
Before learning design patterns it is important to learn the pre-requisite
* **Coupling:** The level of dependencies between the class and its helper class is known as coupling.
* **Interfaces:** It is a contract that specifies the capabilities that a class should provide. Interfaces can help us build loosely coupled application.

### 4 Principles of OOPs:
1. **Encapsulation**: Encapsulating the data and the behaviour of the class.
2. **Abstraction**: Reduce complexity by hiding unnecessary details.
3. **Inheritance**: Child class should inherit the behaviour of parent class.
4. **Polymorphism**: Ability of an object to take many different forms.

### Unified Modelling Language:
It is graphical representation of how we represent our classes and their communication.  
Below is the representation of the following class.
<img alt="UML.png" src="src/main/resources/static/imgs/UML.png" width="600"/>  
The minus `-` sign means that the field is private & The plus `+` sign represents that the field is public. In this repo it is assumed that all our variables are private and methods are public.

Below is the representation of an inheritance relationship:
<img alt="InheritanceUML.png" src="src/main/resources/static/imgs/InheritanceUML.png" width="600"/>

Below is the representation of composition relationship (The shape class is composed of size class):  
<img alt="CompositionUML.png" src="src/main/resources/static/imgs/CompositionUML.png" width="600"/>

Below is the representation of a dependency relationship. Denoted by dashed line:
<img alt="DependencyUML.png" src="src/main/resources/static/imgs/DependencyUML.png" width="600"/>



