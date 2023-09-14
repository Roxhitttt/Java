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

![image](https://user-images.githubusercontent.com/62470301/216401277-8efeb543-30b0-409a-81c0-334b46843fb3.png)

What happens at runtime?

![image](https://user-images.githubusercontent.com/62470301/216402472-3ce695d7-4721-4cae-9d76-b47965ff700c.png)

Classloader: It is the subsystem of JVM that is used to load class files.  
Bytecode Verifier: Checks the code fragments for illegal code that can violate access rights to objects.  
Interpreter: Read bytecode stream then execute the instructions.

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
https://github.com/Roxhitttt/Java/blob/554b334d1f97be4aabcc1cdedc5f2c13de2edae2/Jdk/Types_of_Variables.jav
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
  
  
  
2. Arithmetic Operator -  

 Example :  
 https://github.com/Roxhitttt/Java/blob/e8cbbb77cf304ea6d30f59cb4cc275eae0308678/Jdk/Arithmatics_operators.java
 
- Shift Operator - 
- Relational Operator - 
- Bitwise Operator - 
- Logical Operator - 
- Ternary Operator  - 
- Assignment Operator - 
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

<details><summary>Methods</summary>  
<p>

#### Methods

There are 4 types of Methods

Methods are also called as Functions

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

<details><summary>If Statement</summary>  
<p>

#### If Statement 

If Example : 
https://github.com/Roxhitttt/Java/blob/06a28125106494ff3fe8a3d45f1ed20ec482a440/Jdk/Operators/demoif.java

Practicle no 1: Given num is even or odd  
https://github.com/Roxhitttt/Java/blob/f9211539fd873253cb279446086e0a65c7633078/Jdk/Operators/if1.java

Practiicle no 2: check wether given num is positive no or negative no.  
https://github.com/Roxhitttt/Java/blob/f9211539fd873253cb279446086e0a65c7633078/Jdk/Operators/if2.java

Practicle no 3: Check given character is consonent or vowel.  
https://github.com/Roxhitttt/Java/blob/f9211539fd873253cb279446086e0a65c7633078/Jdk/Operators/if3.java

 Practicle no 4: Nested If else : Find greater between 3 numbers using nested if else.  
 https://github.com/Roxhitttt/Java/blob/61e54ae8316180062b57e092f9c00cb4f43d1503/Jdk/Operators/ifnestedifelse.java
 
 Practice no 5: Company having criteria for selection given below:  
criteria 1: Applicant must have BE completed or Diploma with 7 year Experiance.  
 criteria 2: If BE is completed must have 60% or BE without 60% must have 3 years experiance.  
 criteria 3: if Diploman with 7 year experiance must have work in quality department.
 
</p>
</details>

__________________________________________________________________________________

<details><summary>Do While loop </summary>  
<p>

#### Do While loop  

Example 1: Print 1 to 10 numbers using Do while loop  
https://github.com/Roxhitttt/Java/blob/9598a64dd92d508e147b608cbc3dd6a4d4c19f23/Jdk/Operators/dowhile.java

Example 2: Menu Driven program using Do while loop and Switch case  
https://github.com/Roxhitttt/Java/blob/9598a64dd92d508e147b608cbc3dd6a4d4c19f23/Jdk/Operators/menudreven.java

</p>
</details>

__________________________________________________________________________________

<details><summary>Switch Case </summary>  
<p>

#### Switch Case  

Example 1: Menu Driven program using Do while loop and Switch case methods  
https://github.com/Roxhitttt/Java/blob/9598a64dd92d508e147b608cbc3dd6a4d4c19f23/Jdk/Operators/menudreven2.java

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

<details><summary> Class & Objects </summary>  
<p>

#### Class & Objects

Example 1: 
https://github.com/Roxhitttt/Java/blob/82ae8c3507c4bd444a4207a844990de58a0a5237/Jdk/Class%20and%20Objects/classexample.java

Example 2:
https://github.com/Roxhitttt/Java/blob/82ae8c3507c4bd444a4207a844990de58a0a5237/Jdk/Class%20and%20Objects/classexample2.java

</p>
</details>

__________________________________________________________________________________

<details><summary>If Statement</summary>  
<p>

#### If Statement 


</p>
</details>

__________________________________________________________________________________
