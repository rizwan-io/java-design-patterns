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

## 02-Memento-Pattern
It is a part of behavioural design pattern. Memento Pattern is used to implement UNDO mechanism.
When we want to save the state of the object and also restore it.

### Problem:
Suppose we have a class called `Editor` with a field `String content`. Now, we want to implement 
an undo mechanism on the `Editor` class.

### Solutions:
Solution 1:   
Use a field called prevContent that would store the previous state of the `content` field. The problem with this approach is that we can only undo once.

Solution 2:  
Use a list of prevContents. The problem with this approach is that if we add another field called name then we need to create
another list of prevName and this behaviour will keep growing on if we are adding a new field.
Hence this solution is not extensible. (not designed to allow the addition of new capabilities and functionality)

Solution 3:  
We can use an extra class called `EditorState` that is purely responsible for storing the state of editor at the given time. 
Now in our `Editor` class instead of storing list of the fields we store a list of `EditorState`.  
But this would violate an important OOP principle called "Single Responsibility Principle". As `Editor` class is responsible for
2 things: one is to behave as an editor and other is state management. We need to take the state management responsibility 
outside the `Editor` class.
> Single Responsibility Principle: Every class should have a single responsibility.

Solution 3: (Memento Pattern)  
We create another class called `History` that would be responsible for state management. `History` class will contain the 
list of `EditorState` and `push(state) & pop()` method to push & pop an editorState.  
In `Editor` class 2 new methods would be introduced, One is `createState()` this would create an `editorState` object based on the 
current contents of the `editor` object and will return it. Another method will be ``restore(editorState)`` this will restore the contents to prevContent.  
Refer: [memento-code](src/main/java/memento)  

This pattern is called memento pattern. In the original GoF book the classes have been renamed.
* Editor becomes Originator
* EditorState becomes Memento
* History becomes Caretaker

<img alt="UML_Memento.png" src="src/main/resources/static/imgs/UML_Memento.png" width="500"/>

