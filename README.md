# Java
Here I will write Notes on Java and Codes of Java

#### Our core Java programming tutorial is designed for students and working professionals. Java is an object-oriented, class-based, concurrent, secured and general-purpose computer-programming language.
Java was developed by James Gosling at Sun Microsystem in the year 1995.

Platform: Any hardware or software environment in which a program runs, is known as a platform. Since Java has a runtime environment (JRE) and API, it is called a platform.

#### Types of Java Applications

1) Standalone Application  
Standalone applications are also known as desktop applications or window-based applications. Examples of standalone application are Media player, antivirus, etc.

2) Web Application  
An application that runs on the server side and creates a dynamic page is called a web application.

3) Enterprise Application  
An application that is distributed in nature, such as banking applications, etc. is called an enterprise application. It has advantages like high-level security, load balancing, and clustering.

4) Mobile Application  
An application which is created for mobile devices is called a mobile application. Currently, Android and Java ME are used for creating mobile applications.
A generel purpose programming language moade for developers to write one run anywhere i.e, compiled jave code can run on all platform.
__________________________________________________________________________________

#### History of Java
 Java was developed by James Gosling, who is known as the father of Java, in 1995.  
 Java is an island in Indonesia where the first coffee was produced (called Java coffee). It is a kind of espresso bean. Java name was chosen by James Gosling while having a cup of coffee nearby his office.

__________________________________________________________________________________

<details><summary>Features of Java</summary>  
<p>
 #### Features of Java  
A list of the most important features of the Java language is given below.  
1.Simple - Java syntax is based on C++. Java has removed explicit pointers, operator overloading, etc.

2.Object-Oriented - Java is an object-oriented programming language. Everything in Java is an object. Object-oriented means we organize our software as a combination of different types of objects that incorporate both data and behavior.  
Object-oriented programming (OOPs) is a methodology that simplifies software development and maintenance by providing some rules.  
Basic concepts of OOPs are:  

1.Object - An entity that has state and behavior is known as an object e.g., chair, bike, marker, pen, table, car, etc. It can be physical or logical (tangible and intangible). An object has three characteristics:  
State: Represents the data (value) of an object.  
Behavior - Represents the behavior of an object such as diposits,withdraw, etc.  
Identity - It is used internally by the JVM to identify each object uniquely.  
For Example, Pen is an object. Its name is Reynolds; color is white, known as its state. It is used to write, so writing is its behavior.  
An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

2.Class - A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical. A class in Java can contain: Fields, Methods, Constructors, Blocks, Nested class and interface.

3.Inheritance - Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).  
The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class.  
The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.  
In the terminology of Java, a class which is inherited is called a parent or superclass, and the new class is called child or subclass.  
Example of Inheritance:-  
![image](https://user-images.githubusercontent.com/62470301/216395966-bba3935f-6a8d-4225-b5a0-5e20652cbddb.png)  
Types of inheritance in java  
![image](https://user-images.githubusercontent.com/62470301/216396288-38b08720-9e69-4bca-b1f8-5fc67e3c8c32.png)
![image](https://user-images.githubusercontent.com/62470301/216396460-e7496ba7-4324-4b4a-b521-acf5fffb095c.png)

4.Polymorphism - Polymorphism in Java is a concept by which we can perform a single action in different ways. Polymorphism is derived from 2 Greek words: poly and morphs. The word "poly" means many and "morphs" means forms. So polymorphism means many forms.  
There are two types of polymorphism in Java: compile-time polymorphism and runtime polymorphism. We can perform polymorphism in java by method overloading and method overriding.  
If you overload a static method in Java, it is the example of compile time polymorphism. Here, we will focus on runtime polymorphism in java.  
Runtime Polymorphism in Java  
Runtime polymorphism or Dynamic Method Dispatch is a process in which a call to an overridden method is resolved at runtime rather than compile-time.

5.Abstraction - Abstraction is a process of hiding the implementation details and showing only functionality to the user.  
Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message. You don't know the internal processing about the message delivery.  
Abstraction lets you focus on what the object does instead of how it does it.  
A class which is declared as abstract is known as an abstract class. It can have abstract and non-abstract methods. It needs to be extended and its method implemented. It cannot be instantiated.

6.Encapsulation - Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.
![image](https://user-images.githubusercontent.com/62470301/216398306-7d9772ad-5754-43d8-9634-a56375d95f57.png)  

We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.  
By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.  
It provides you the control over the data.  
It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.  

3.Portable - Java is portable because it facilitates you to carry the Java bytecode to any platform. It doesn't require any implementation.

4.Platform independent - Java is a write once, run anywhere language.  
There are two types of platforms software-based and hardware-based. Java provides a software-based platform.  
1.Runtime Environment  
2.API(Application Programming Interface)

5.Secured - Java is best known for its security. With Java, we can develop virus-free systems. Java is secured because:  
No explicit pointer  
Java Programs run inside a virtual machine sandbox  
Classloader  
Bytecode Verifier  
Security Manager

6.Robust  
7.Architecture neutral  
8.Interpreted  
9.High Performance  
10.Multithreaded  
11.Distributed  
12.Dynamic
 
</p>
</details>

__________________________________________________________________________________

#### C++ vs Java

Only read the given points from below link:  
Platform-independent, Mainly used for, Multiple inheritance, Operator Overloading, Pointers, Compiler and Interpreter, Call by Value and Call by reference, Structure and Union, Hardware.

https://www.javatpoint.com/cpp-vs-java

__________________________________________________________________________________

<details><summary>First Java Program | Hello World Example</summary>  
<p>
 #### First Java Program | Hello World Example

Set path of the jdk/bin directory.  
```
class Simple{  
    public static void main(String args[]){  
     System.out.println("Hello Java");  
    }  
}  
```

Save the above file as Simple.java.

To compile:  
javac Simple.java  
To execute:  
java Simple

Compilation Flow:
When we compile Java program using javac tool, the Java compiler converts the source code into byte code.

![image](https://user-images.githubusercontent.com/62470301/216401277-8efeb543-30b0-409a-81c0-334b46843fb3.png)

What happens at runtime?

![image](https://user-images.githubusercontent.com/62470301/216402472-3ce695d7-4721-4cae-9d76-b47965ff700c.png)

Classloader: It is the subsystem of JVM that is used to load class files.  
Bytecode Verifier: Checks the code fragments for illegal code that can violate access rights to objects.  
Interpreter: Read bytecode stream then execute the instructions.

- Q) Can you save a Java source file by another name than the class name?
-> Yes, if the class is not public. It is explained in the figure given below:

 ![image](https://github.com/Roxhitttt/Java/assets/62470301/dc8d2612-fe44-4bd8-8e05-ead7d8a7b6ce)

- Parameters used in First Java Program

class keyword is used to declare a class in Java.  
public keyword is an access modifier that represents visibility. It means it is visible to all.  
static is a keyword. If we declare any method as static, it is known as the static method. The core advantage of the static method is that there is no need to create an object to invoke the static method. The main() method is executed by the JVM, so it doesn't require creating an object to invoke the main() method. So, it saves memory.  
void is the return type of the method. It means it doesn't return any value.  
main represents the starting point of the program.  
String[] args or String args[] is used for command line argument.  
System.out.println() is used to print statement. Here, System is a class, out is an object of the PrintStream class, println() is a method of the PrintStream class.  

Example: First basic program of Java.
https://github.com/Roxhitttt/Java/blob/5c9b8d217fe2b61aa8e35400577cd862e1d3f3a4/Jdk/firstjava.java
 
</p>
</details>

__________________________________________________________________________________

#### How to set path in java

https://www.javatpoint.com/how-to-set-path-in-java

__________________________________________________________________________________

#### JRE

JRE is an acronym for Java Runtime Environment. It is also written as Java RTE. The Java Runtime Environment is a set of software tools which are used for developing Java applications. It is used to provide the runtime environment. It is the implementation of JVM. It physically exists. It contains a set of libraries + other files that JVM uses at runtime.

The implementation of JVM is also actively released by other companies besides Sun Micro Systems.  
![image](https://user-images.githubusercontent.com/62470301/216404844-c6be38de-bbe2-4e00-a434-a6fe5ee718c0.png)


__________________________________________________________________________________

#### JDK

JDK is an acronym for Java Development Kit. The Java Development Kit (JDK) is a software development environment which is used to develop Java applications and applets. It physically exists. It contains JRE + development tools.  

The JDK contains a private Java Virtual Machine (JVM) and a few other resources such as an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), etc. to complete the development of a Java Application.

![image](https://user-images.githubusercontent.com/62470301/216405502-62a7428a-0e3a-4b85-ab54-073c99e5c7b5.png)

__________________________________________________________________________________

#### JVM (Java Virtual Machine) Architecture 

JVM (Java Virtual Machine) is an abstract machine. It is a specification that provides runtime environment in which java bytecode can be executed.  
JVMs are available for many hardware and software platforms (i.e. JVM is platform dependent).

The JVM performs following operation: Loads code, Verifies code, Executes code, Provides runtime environment.

## JVM Architecture - This is also very important - https://www.javatpoint.com/jvm-java-virtual-machine

__________________________________________________________________________________

<details><summary>Java Variables</summary>  
<p>
 #### Java Variables

![image](https://user-images.githubusercontent.com/62470301/216408305-068b8d8c-87b2-420e-b5dc-a7fc276bb7c9.png)

Types of Variables:

here are three types of variables in Java: 

1) Local Variable:  
A variable declared inside the body of the method is called local variable. You can use this variable only within that method and the other methods in the class aren't even aware that the variable exists. A local variable cannot be defined with "static" keyword.

2) Instance Variable:
A variable declared inside the class but outside the body of the method, is called an instance variable. It is not declared as static.

3) Static variable:
A variable that is declared as static is called a static variable. It cannot be local. You can create a single copy of the static variable and share it among all the instances of the class. Memory allocation for static variables happens only once when the class is loaded in the memory.

Example: 
[Jdk/Basic/Types_of_Variables.java](https://github.com/Roxhitttt/Java/blob/bfa6ac5a4c24f996dbdbc81a8e0077698442ed61/Jdk/Basic/Types_of_Variables.java)

</p>
</details>

__________________________________________________________________________________

#### Data Types in Java

![image](https://user-images.githubusercontent.com/62470301/216961775-934c23c2-2188-4c36-a6bc-c9343e762bda.png)

Example of Primitive Data Types in one link:
https://github.com/Roxhitttt/Java/blob/1290c46e9cf0a3e668f7de09c733396c40871ca0/Jdk/demodatatype.java

__________________________________________________________________________________

#### Unicode System

Unicode is a universal international standard character encoding that is capable of representing most of the world's written languages.

In unicode, character holds 2 byte, so java also uses 2 byte for characters.

lowest value:\u0000

highest value:\uFFFF
__________________________________________________________________________________

<details><summary>Operators in Java</summary>  
<p>
 #### Operators in Java 

There are many types of operators in Java which are given below:

1. Unary Operator - The Java unary operators require only one operand  
  incrementing/decrementing a value by one  
  negating an expression  
  inverting the value of a boolean
  
  postfix - expr++ expr--  
  prefix - ++expr --expr +expr -expr ~ !
  
  Example :  
  https://github.com/Roxhitttt/Java/blob/e7999a8b5af85a81df67c12b53b72e10e2cb5549/Jdk/unaryoperator.java
  
  
  
2. Arithmetic Operator -  Java arithmetic operators are used to perform addition, subtraction, multiplication, and division. They act as basic mathematical operations.

 Example :  
 https://github.com/Roxhitttt/Java/blob/e8cbbb77cf304ea6d30f59cb4cc275eae0308678/Jdk/Arithmatics_operators.java

3. Assignment Operator - Java assignment operator is one of the most common operators. It is used to assign the value on its right to the operand on its left.

Example : 
https://github.com/Roxhitttt/Java/blob/4c8adc74aaf9a2cfeea84c0d6ba245f1e7c7538f/Jdk/Operators/Assignmentoperator.java

4. Bitwise Operator && Logical Operator -
- The logical && operator doesn't check the second condition if the first condition is false. It checks the second condition only if the first one is true.
- The bitwise & operator always checks both conditions whether first condition is true or false.

- The logical || operator doesn't check the second condition if the first condition is true. It checks the second condition only if the first one is false.
- The bitwise | operator always checks both conditions whether first condition is true or false.

Example : 
https://github.com/Roxhitttt/Java/blob/4c8adc74aaf9a2cfeea84c0d6ba245f1e7c7538f/Jdk/Operators/bitwise.java

Example1 : 
https://github.com/Roxhitttt/Java/blob/4c8adc74aaf9a2cfeea84c0d6ba245f1e7c7538f/Jdk/Operators/logicaloperator.java

Example2 : 
https://github.com/Roxhitttt/Java/blob/4c8adc74aaf9a2cfeea84c0d6ba245f1e7c7538f/Jdk/Operators/bitwise_logical.java

Example3 : 
https://github.com/Roxhitttt/Java/blob/4c8adc74aaf9a2cfeea84c0d6ba245f1e7c7538f/Jdk/Operators/logicaloperatorproject.java
 
5. Relational Operator -

Example : 
https://github.com/Roxhitttt/Java/blob/4c8adc74aaf9a2cfeea84c0d6ba245f1e7c7538f/Jdk/Operators/Relational_operator.java

7. Ternary Operator  - Java Ternary operator is used as one line replacement for if-then-else statement and used a lot in Java programming. It is the only conditional operator which takes three operands.

Example : 
https://github.com/Roxhitttt/Java/blob/4c8adc74aaf9a2cfeea84c0d6ba245f1e7c7538f/Jdk/Operators/ternaryoperator.java

</p>
</details>

__________________________________________________________________________________

<details><summary>Scanner class</summary>  
<p>

 #### Scanner class 

Scanner class is used for taking input from user, To use the Scanner class, create an object of the class and use any of the available methods found in the Scanner class documentation. There are various method provide by scanner class given below: 

the nextLine() method, which is used to read Strings  
nextBoolean()	Reads a boolean value from the user  
nextByte()	Reads a byte value from the user  
nextDouble()	Reads a double value from the user  
nextFloat()	Reads a float value from the user  
nextInt()	Reads a int value from the user  
nextLine()	Reads a String value from the user  
nextLong()	Reads a long value from the user  
nextShort()	Reads a short value from the user

Example of Scanner Class to take inputs from the user: 
https://github.com/Roxhitttt/Java/blob/6a27e407fb9e7b1a2c839b95a8d529aae79a754a/Jdk/logical_operator.java

Example 1 - Task 1 :
https://github.com/Roxhitttt/Java/blob/d851030aecc2a7744a8f5eecfcad13909cdacd39/Jdk/task1.java
 
</p>
</details>

__________________________________________________________________________________

<details><summary>Java OOPs Concepts And Class & Objects </summary>  
<p>
- Object-Oriented Programming is a paradigm that provides many concepts, such as inheritance, data binding, polymorphism, etc. The popular object-oriented languages are Java, C#, PHP, Python, C++, etc.

- The main aim of object-oriented programming is to implement real-world entities, for example, object, classes, abstraction, inheritance, polymorphism, etc.

#### OOPs (Object-Oriented Programming System) : 
Object means a real-world entity such as a pen, chair, table, computer, watch, etc. Object-Oriented Programming is a methodology or paradigm to design a program using classes and objects. It simplifies software development and maintenance by providing some concepts:
![image](https://github.com/Roxhitttt/Java/assets/62470301/a9e291b7-34e1-48b2-bde1-75454b20a438)

- Object : For example, a chair, pen, table, keyboard, bike, etc. It can be physical or logical. An Object can be defined as an instance of a class. An object contains an address and takes up some space in memory. Objects can communicate without knowing the details of each other's data or code.

An object has three characteristics: 
![image](https://github.com/Roxhitttt/Java/assets/62470301/fe637253-4218-47d0-a2f6-10a6fcff4351)
For Example, Pen is an object. Its name is Reynolds; color is white, known as its state. It is used to write, so writing is its behavior.

An object is an instance of a class. A class is a template or blueprint from which objects are created. So, an object is the instance(result) of a class.

Object Definitions: An object is a real-world entity., An object is a runtime entity., The object is an entity which has state and behavior, The object is an instance of a class.

- Class : Collection of objects is called class. It is a logical entity. A class can also be defined as a blueprint from which you can create an individual object. Class doesn't consume any space.

A class is a group of objects which have common properties. It is a template or blueprint from which objects are created. It is a logical entity. It can't be physical. 

A class in Java can contain: Fields, Methods, Constructors, Blocks, Nested class and interface.


  
- Inheritance : When one object acquires all the properties and behaviors of a parent object, it is known as inheritance. It provides code reusability. It is used to achieve runtime polymorphism.
- Polymorphism : + If one task is performed in different ways, it is known as polymorphism. For example: to convince the customer differently, to draw something, for example, shape, triangle, rectangle, etc. In Java, we use method overloading and method overriding to achieve polymorphism.
- Abstraction : Hiding internal details and showing functionality is known as abstraction. For example phone call, we don't know the internal processing. In Java, we use abstract class and interface to achieve abstraction.
- Encapsulation : Binding (or wrapping) code and data together into a single unit are known as encapsulation. For example, a capsule, it is wrapped with different medicines. A java class is the example of encapsulation. Java bean is the fully encapsulated class because all the data members are private here.
![image](https://github.com/Roxhitttt/Java/assets/62470301/893c770d-f92b-4195-8c1b-22e9ac2d1bd0)

Apart from these concepts, there are some other terms which are used in Object-Oriented design: Try understanding this concepts whenever you want
Coupling, Cohesion, Association, Aggregation, Composition

Example : 
https://github.com/Roxhitttt/Java/blob/1a838a75eb62aa9f544f5dbc7d0bc157daaf0a45/Jdk/Class%20and%20Objects/object_class_ex.java

Example1 :
https://github.com/Roxhitttt/Java/blob/77b1da81e98b2c92db1c37a8c1a7d63e28c90063/Jdk/Class%20and%20Objects/classexample.java

Example2 :
https://github.com/Roxhitttt/Java/blob/77b1da81e98b2c92db1c37a8c1a7d63e28c90063/Jdk/Class%20and%20Objects/classexample2.java

</p>
</details>

__________________________________________________________________________________

<details><summary>Methods</summary>  
<p>

#### Methods
the method in Java is a collection of instructions that performs a specific task. It provides the reusability of code. We can also easily modify code using methods.

- What is a method in Java? : ->
A method is a block of code or collection of statements or a set of code grouped together to perform a certain task or operation. It is used to achieve the reusability of code. We write a method once and use it many times. We do not require to write code again and again.

- Method Declaration : The method declaration provides information about method attributes, such as visibility, return-type, name, and arguments.
![image](https://github.com/Roxhitttt/Java/assets/62470301/b60d5d2b-a819-47bd-9ee9-6cc819b95b63)

- Access Specifier: Access specifier or modifier is the access type of the method. It specifies the visibility of the method. Java provides four types of access specifier :

- Public: The method is accessible by all classes when we use public specifier in our application.
- Private: When we use a private access specifier, the method is accessible only in the classes in which it is defined.
- Protected: When we use protected access specifier, the method is accessible within the same package or subclasses in a different package.
- Default: When we do not use any access specifier in the method declaration, Java uses default access specifier by default. It is visible only from the same package only.

It is also possible that a method has the same name as another method name in the same class, it is known as method overloading.

There are 2 types of Methods : Methods are also called as Functions

- Predefined Method : The method that is already defined in the Java class libraries is known as predefined methods. It is also known as the standard library method or built-in method. We can directly use these methods just by calling them in the program at any point. Some pre-defined methods are length(), equals(), compareTo(), sqrt(), etc.

Example : 
https://github.com/Roxhitttt/Java/blob/a5e4222ec604150935ea30d89ce7593506450213/Jdk/Methods%20and%20Functions/predefined_method.java

In the above example, we have used three predefined methods main(), print(), and max(). We have used these methods directly without declaration because they are predefined. The max() method is a method of the Math class that returns the greater of two numbers.

- User-defined Method : The method written by the user or programmer is known as a user-defined method.

- Static Method : A method that has static keyword is known as static method. The main advantage of a static method is that we can call it without creating an object. It can access static data members and also change the value of it. It is used to create an instance method. It is invoked by using the class name.

Example : 
https://github.com/Roxhitttt/Java/blob/08c51446626ad005f84f9b02e1e856e1161df024/Jdk/Methods%20and%20Functions/static_method.java

- Instance Method : The method of the class is known as an instance method. It is a non-static method defined in the class. Before calling or invoking the instance method, it is necessary to create an object of its class. Let's see an example of an instance method.

Example : 
https://github.com/Roxhitttt/Java/blob/36ef7c60eba4acdbc40dc2ebcc023c9033dd425e/Jdk/Methods%20and%20Functions/instance_methods.java
 
1. Method without argument without return value: 
https://github.com/Roxhitttt/Java/blob/ac57dd26e574a6e153f9a5fb8a10db375577688e/Jdk/Functions/Function1.java

2. Method with argument but without return value:
https://github.com/Roxhitttt/Java/blob/ac57dd26e574a6e153f9a5fb8a10db375577688e/Jdk/Functions/Function2a.java
https://github.com/Roxhitttt/Java/blob/ac57dd26e574a6e153f9a5fb8a10db375577688e/Jdk/Functions/Function2b.java

3. Method with argument with return value:
https://github.com/Roxhitttt/Java/blob/ac57dd26e574a6e153f9a5fb8a10db375577688e/Jdk/Functions/Function4.java

4. Method without argument with return value:
 https://github.com/Roxhitttt/Java/blob/df69d28b5294958ce32308e31477d08cf204108b/Jdk/Functions/Function5.java

</p>
</details>

__________________________________________________________________________________

<details><summary>Contructor</summary>  
<p>
In Java, a constructor is a block of codes similar to the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory. It is a special type of method which is used to initialize the object. 

It calls a default constructor if there is no constructor available in the class. In such case, Java compiler provides a default constructor by default.

Note: It is called constructor because it constructs the values at the time of object creation. It is not necessary to write a constructor for a class. It is because java compiler creates a default constructor if your class doesn't have any.

- Rules to create constructor :
1. Constructor name must be the same as its class name
2. A Constructor must have no explicit return type
3. A Java constructor cannot be abstract, static, final, and synchronized

Note: We can use access modifiers while declaring a constructor. It controls the object creation. In other words, we can have private, protected, public or default constructor in Java.

- There are two types of constructors in Java:
1. no-arg constructor : A constructor is called "Default Constructor" when it doesn't have any parameter.

Example : 
https://github.com/Roxhitttt/Java/blob/873f0c5a4970988390d5a5cc557ebfcc28d35211/Jdk/Contructor/defaultcontractor.java

2. parameterized constructor : A constructor which has a specific number of parameters is called a parameterized constructor.

- Why use the parameterized constructor? : ->  The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also.

- In Java, a constructor is just like a method but without return type. It can also be overloaded like Java methods.

Constructor overloading in Java is a technique of having more than one constructor with different parameter lists. They are arranged in a way that each constructor performs a different task. They are differentiated by the compiler by the number of parameters in the list and their types.

Example1 : 
https://github.com/Roxhitttt/Java/blob/873f0c5a4970988390d5a5cc557ebfcc28d35211/Jdk/Contructor/para_contructor.java

Example2 : 
https://github.com/Roxhitttt/Java/blob/873f0c5a4970988390d5a5cc557ebfcc28d35211/Jdk/Contructor/Student.java

3. Java Copy Constructor : There is no copy constructor in Java. However, we can copy the values from one object to another like copy constructor in C++.

There are many ways to copy the values of one object into another in Java. They are:
1. By constructor
2. By assigning the values of one object into another
3. By clone() method of Object class

Example1: By constructor and By assigning the values of one object into another
https://github.com/Roxhitttt/Java/blob/98c11587e641214cf8b6b2775da6a31635ba1801/Jdk/Contructor/copycontruct_bycontruct.java

Example2: Without constructor and By assigning the values of one object into another
https://github.com/Roxhitttt/Java/blob/98c11587e641214cf8b6b2775da6a31635ba1801/Jdk/Contructor/copycontruct_withoutcontruct.java

</p>
</details>

__________________________________________________________________________________

<details><summary>control flow statements</summary>  
<p>
 
#### Java provides three types of control flow statements.

## Decision Making statements
1. if statements
2. switch statement
## Loop statements
1. do while loop
2. while loop
3. for loop
4. for-each loop
## Jump statements
1. break statement
2. continue statement

#### If Statement :

If-else-if ladder: The if-else-if statement contains the if-statement followed by multiple else-if statements.

![image](https://github.com/Roxhitttt/Java/assets/62470301/8255d3ff-0942-4d59-8d2c-d765b0ae298e)

<details><summary>Code of If-else-if ladder</summary>  
<p>
 
if(condition 1) {    
statement 1; //executes when condition 1 is true   
}  
else if(condition 2) {  
statement 2; //executes when condition 2 is true   
}  
else {  
statement 2; //executes when all the conditions are false   
}  
 
</p>
</details>


If Example : 
https://github.com/Roxhitttt/Java/blob/06a28125106494ff3fe8a3d45f1ed20ec482a440/Jdk/Operators/demoif.java

Practicle no 1: Given num is even or odd  
https://github.com/Roxhitttt/Java/blob/f9211539fd873253cb279446086e0a65c7633078/Jdk/Operators/if1.java

Practiicle no 2: check wether given num is positive no or negative no.  
https://github.com/Roxhitttt/Java/blob/f9211539fd873253cb279446086e0a65c7633078/Jdk/Operators/if2.java

Practicle no 3: Check given character is consonent or vowel.  
https://github.com/Roxhitttt/Java/blob/f9211539fd873253cb279446086e0a65c7633078/Jdk/Operators/if3.java

Nested If Else : 

Practicle no 4: Nested If else : Find greater between 3 numbers using nested if else.  
https://github.com/Roxhitttt/Java/blob/61e54ae8316180062b57e092f9c00cb4f43d1503/Jdk/Operators/ifnestedifelse.java
 
Practice no 5: Company having criteria for selection given below:  
criteria 1: Applicant must have BE completed or Diploma with 7 year Experiance.  
criteria 2: If BE is completed must have 60% or BE without 60% must have 3 years experiance.  
criteria 3: if Diploman with 7 year experiance must have work in quality department.

#### Switch Case :

Example 1: Menu Driven program using Do while loop and Switch case methods  
https://github.com/Roxhitttt/Java/blob/fa06e5cb5fc63900c245ca8f898f66a7f0763ba1/Jdk/Control%20Statements%2C%20if%2Cfor%2Cwhile%20and%20all/menudreven.java

Example 2: 
https://github.com/Roxhitttt/Java/blob/fa06e5cb5fc63900c245ca8f898f66a7f0763ba1/Jdk/Control%20Statements%2C%20if%2Cfor%2Cwhile%20and%20all/menudreven2.java

![image](https://github.com/Roxhitttt/Java/assets/62470301/c2912ce2-0a5b-4d73-abc9-7c1b3a1edf06)

#### For loop :
It enables us to initialize the loop variable, check the condition, and increment/decrement in a single line of code. 

![image](https://github.com/Roxhitttt/Java/assets/62470301/9ad8fc6f-9b92-49ff-a4aa-1f86c9ad7e9e)

Example1 : 
https://github.com/Roxhitttt/Java/blob/fa06e5cb5fc63900c245ca8f898f66a7f0763ba1/Jdk/Control%20Statements%2C%20if%2Cfor%2Cwhile%20and%20all/Forloop.java

Example2 : 
https://github.com/Roxhitttt/Java/blob/fa06e5cb5fc63900c245ca8f898f66a7f0763ba1/Jdk/Control%20Statements%2C%20if%2Cfor%2Cwhile%20and%20all/Forloop2.java

Example3 : 
https://github.com/Roxhitttt/Java/blob/fa06e5cb5fc63900c245ca8f898f66a7f0763ba1/Jdk/Control%20Statements%2C%20if%2Cfor%2Cwhile%20and%20all/nestedfor.java

#### While Loop : 
The while loop is also used to iterate over the number of statements multiple times.  If the condition is true, then the loop body will be executed; otherwise, the statements after the loop will be executed.

![image](https://github.com/Roxhitttt/Java/assets/62470301/0262b1c1-57fe-46a0-a703-e3d504d43a0c)

Example1:
https://github.com/Roxhitttt/Java/blob/fa06e5cb5fc63900c245ca8f898f66a7f0763ba1/Jdk/Control%20Statements%2C%20if%2Cfor%2Cwhile%20and%20all/whileloop.java

Example2:
https://github.com/Roxhitttt/Java/blob/fa06e5cb5fc63900c245ca8f898f66a7f0763ba1/Jdk/Control%20Statements%2C%20if%2Cfor%2Cwhile%20and%20all/while2.java

Example3:
https://github.com/Roxhitttt/Java/blob/fa06e5cb5fc63900c245ca8f898f66a7f0763ba1/Jdk/Control%20Statements%2C%20if%2Cfor%2Cwhile%20and%20all/while3.java

#### Do While loop : 
The do-while loop checks the condition at the end of the loop after executing the loop statements. When the number of iteration is not known and we have to execute the loop at least once, we can use do-while loop.

![image](https://github.com/Roxhitttt/Java/assets/62470301/df814023-d908-4ee6-9434-b4ed4e659b30)

Example : 
https://github.com/Roxhitttt/Java/blob/fa06e5cb5fc63900c245ca8f898f66a7f0763ba1/Jdk/Control%20Statements%2C%20if%2Cfor%2Cwhile%20and%20all/dowhile.java

Example 2: Menu Driven program using Do while loop and Switch case  
https://github.com/Roxhitttt/Java/blob/9598a64dd92d508e147b608cbc3dd6a4d4c19f23/Jdk/Operators/menudreven.java
 
</p>
</details>

__________________________________________________________________________________

<details><summary>Inheritance </summary>  
<p>
Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system).

The idea behind inheritance in Java is that you can create new classes that are built upon existing classes. When you inherit from an existing class, you can reuse methods and fields of the parent class. Moreover, you can add new methods and fields in your current class also.

Inheritance represents the IS-A relationship which is also known as a parent-child relationship.

The extends keyword indicates that you are making a new class that derives from an existing class. The meaning of "extends" is to increase the functionality.

In the terminology of Java, a class which is inherited is called a parent or superclass, and the new class is called child or subclass.

Java Inheritance Example
![image](https://github.com/Roxhitttt/Java/assets/62470301/94862363-df45-4ff2-93b4-db6319b2c1f3)

As displayed in the above figure, Programmer is the subclass and Employee is the superclass. The relationship between the two classes is Programmer IS-A Employee. It means that Programmer is a type of Employee.

Example : 
https://github.com/Roxhitttt/Java/blob/c0150bb9d1e235382bba41062f1b3775d6d177ab/Jdk/inheritance/demoinheritance.java

Example2 : 
https://github.com/Roxhitttt/Java/blob/61c174c729502e3ee598b54f25af46c43aff70b5/Jdk/inheritance/anodemoinheritance.java

### Types of inheritance in java : 
On the basis of class, there can be three types of inheritance in java: single, multilevel and hierarchical.

In java programming, multiple and hybrid inheritance is supported through interface only. We will learn about interfaces later.

![image](https://github.com/Roxhitttt/Java/assets/62470301/58b06ca6-835a-4e52-a158-4528f560e857)

Note: Multiple inheritance is not supported in Java through class.

When one class inherits multiple classes, it is known as multiple inheritance. For Example:

![image](https://github.com/Roxhitttt/Java/assets/62470301/e95efc6f-49b0-4f32-80ed-5aceed6e8f1d)

Multilevel inheritance and Super :

### Super Keyword in Java
The super keyword in Java is a reference variable which is used to refer immediate parent class object. 

Whenever you create the instance of subclass, an instance of parent class is created implicitly which is referred by super reference variable.

Usage of Java super Keyword: 
1. super can be used to refer immediate parent class instance variable.
2. super can be used to invoke immediate parent class method.
3. super() can be used to invoke immediate parent class constructor.



Example 1 : 
https://github.com/Roxhitttt/Java/blob/c0150bb9d1e235382bba41062f1b3775d6d177ab/Jdk/inheritance/super_and_multilevel_inher/inhe_contr_super_ex.java

Example 2 :
https://github.com/Roxhitttt/Java/blob/c0150bb9d1e235382bba41062f1b3775d6d177ab/Jdk/inheritance/super_and_multilevel_inher/multi_level.java

Hierarchical Inheritance Example : When two or more classes inherits a single class, it is known as hierarchical inheritance. In the example given below, Dog and Cat classes inherits the Animal class, so there is hierarchical inheritance.

Example : 
https://github.com/Roxhitttt/Java/blob/8aa96ae2a76bdcf9c07e04b344b4c193f324e211/Jdk/inheritance/hirarchical.java

</p>
</details>

__________________________________________________________________________________

<details><summary>Array</summary>  
<p>

#### Array 

Array are used to store multiple values in a single variable instead of declaring seperate variable for each value. 

Syntax of declaration of array:
```
datatype [] arrayname=new datatype[size]; 
float[] b=new float[10];

&

datatype [] arrayname={values, values, values};
int[] a={10,20,30,40};

```
Example 1: printing 4 array elements and 5 array elements from user and from computer using array and for loop:  
https://github.com/Roxhitttt/Java/blob/9598a64dd92d508e147b608cbc3dd6a4d4c19f23/Jdk/Operators/arraydemo.java

Example 2: Searching array elements:
 https://github.com/Roxhitttt/Java/blob/700f7f084eba10695d0315222720a670c1cf8b3f/Jdk/Operators/arraydemo2.java

</p>
</details>

__________________________________________________________________________________

<details><summary>Remaining from javatpoint</summary>  
<p>
 
1. Static Keyword
2. This keyword
3. Java Programs -
[https://www.javatpoint.com/java-programs](https://www.javatpoint.com/java-programs)


</p>
</details>

__________________________________________________________________________________
