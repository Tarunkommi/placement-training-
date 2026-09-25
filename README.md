# Complete Java Guide: From Basics to OOP & Collections

A structured quick-reference guide covering Java fundamentals, Object-Oriented Programming (OOP), Exception Handling, and the Java Collections Framework. Each concept includes **theory**, **simple syntax**, and a **minimal working code example**.

---

## Table of Contents
1. [Introduction to Java](#1-introduction-to-java)
   - [Key Features of Java (Java Buzzwords)](#11-key-features-of-java-java-buzzwords)
   - [Java Architecture: JDK vs JRE vs JVM](#12-java-architecture-jdk-vs-jre-vs-jvm)
   - [Basic Program Structure](#13-basic-program-structure)
2. [Data Types & Variables](#2-data-types--variables)
3. [Operators & Type Casting](#3-operators--type-casting)
4. [Control Flow Statements](#4-control-flow-statements)
5. [Arrays & Strings](#5-arrays--strings)
6. [Object-Oriented Programming (OOP)](#6-object-oriented-programming-oop)
   - [Classes and Objects](#61-classes-and-objects)
   - [Constructors & this Keyword](#62-constructors--this-keyword)
   - [The 4 Pillars of OOP](#63-the-4-pillars-of-oop)
     - [1. Encapsulation](#pillar-1-encapsulation)
     - [2. Inheritance](#pillar-2-inheritance)
     - [3. Polymorphism](#pillar-3-polymorphism)
     - [4. Abstraction](#pillar-4-abstraction)
   - [Key Keywords: static & final](#64-key-keywords-static--final)
7. [Exception Handling](#7-exception-handling)
8. [Java Collections Framework](#8-java-collections-framework)
   - [List (ArrayList, LinkedList)](#81-list-interface)
   - [Set (HashSet, TreeSet)](#82-set-interface)
   - [Queue (PriorityQueue, ArrayDeque)](#83-queue-interface)
   - [Map (HashMap, TreeMap)](#84-map-interface)
   - [Iterating Collections](#85-iterating-over-collections)

---

## 1. Introduction to Java

### 1.1 Key Features of Java (Java Buzzwords)
Java was designed by James Gosling at Sun Microsystems (now Oracle) with key principles known as the **Java Buzzwords**:

1. **Simple**: Clean syntax derived from C/C++, with confusing and prone-to-error concepts removed (e.g., explicit pointers, operator overloading, multiple inheritance through classes).
2. **Object-Oriented**: Everything in Java is treated as an object containing state and behavior. Follows core OOP principles: Encapsulation, Inheritance, Polymorphism, and Abstraction.
3. **Platform Independent**: Java achieves **"Write Once, Run Anywhere" (WORA)**. Source code (`.java`) is compiled into platform-neutral Bytecode (`.class`), which runs on any operating system equipped with a Java Virtual Machine (JVM).
4. **Architectural-Neutral & Portable**: Bytecode is independent of processor architecture. Primitive types have fixed sizes across all platforms (e.g., `int` is always 4 bytes on 32-bit and 64-bit systems).
5. **Robust**: Emphasizes reliability through strong compile-time and runtime type checking, automatic Garbage Collection (GC) for memory management, and built-in Exception Handling.
6. **Secure**: Programs run inside a secure virtual machine sandbox. Java eliminates raw pointer access and includes a Bytecode Verifier and Security Manager to prevent unauthorized memory access.
7. **High Performance**: Employs a **Just-In-Time (JIT) Compiler** inside the JVM that compiles frequently executed bytecode instructions directly into native machine code at runtime.
8. **Multi-Threaded**: Built-in multi-threading support enables concurrent task execution (e.g., handling UI interactions and background downloads simultaneously).
9. **Distributed**: Designed for internet-enabled environments, offering native APIs for TCP/IP networking, RMI (Remote Method Invocation), and HTTP handling.
10. **Dynamic**: Can dynamically load classes on demand at runtime and adapt to evolving environments without recompiling the entire system.

### 1.2 Java Architecture: JDK vs JRE vs JVM

```
┌─────────────────────────────────────────────────────────────┐
│ JDK (Java Development Kit)                                  │
│  - Development Tools (javac, java, javadoc, debugger, etc.) │
│ ┌─────────────────────────────────────────────────────────┐ │
│ │ JRE (Java Runtime Environment)                          │ │
│ │  - Core Class Libraries + Supporting Files             │ │
│ │ ┌─────────────────────────────────────────────────────┐ │ │
│ │ │ JVM (Java Virtual Machine)                          │ │ │
│ │ │  - ClassLoader, Bytecode Verifier, Execution Engine │ │ │
│ │ │  - Just-In-Time (JIT) Compiler, Garbage Collector   │ │ │
│ │ └─────────────────────────────────────────────────────┘ │ │
│ └─────────────────────────────────────────────────────────┘ │
└─────────────────────────────────────────────────────────────┘
```

- **JVM (Java Virtual Machine)**: The abstract engine that loads, verifies, and executes bytecode.
- **JRE (Java Runtime Environment)**: Provides the minimum environment needed to *run* compiled Java programs (JVM + standard libraries).
- **JDK (Java Development Kit)**: Full developer toolkit needed to *write and compile* Java programs (JRE + compiler tools like `javac`).

### 1.3 Basic Program Structure
```java
public class HelloWorld {
    // Execution starts at main method
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

---

## 2. Data Types & Variables

### Theory
Java is statically typed. Data types are split into:
1. **Primitive**: `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`.
2. **Non-Primitive (Reference)**: `String`, `Arrays`, `Classes`, `Interfaces`.

### Syntax & Example
```java
public class DataTypesExample {
    public static void main(String[] args) {
        int age = 21;
        double salary = 45000.50;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Bhanu";

        System.out.println(name + " | Age: " + age + " | Grade: " + grade);
    }
}
```

---

## 3. Operators & Type Casting

### Theory
- **Operators**: Arithmetic (`+`, `-`, `*`, `/`, `%`), Relational (`==`, `!=`, `>`, `<`), Logical (`&&`, `||`, `!`), Assignment (`=`, `+=`).
- **Implicit Casting (Widening)**: Smaller type to larger type (e.g., `int` to `double`). Automatic.
- **Explicit Casting (Narrowing)**: Larger type to smaller type (e.g., `double` to `int`). Requires `(type)`.

### Syntax & Example
```java
public class CastingExample {
    public static void main(String[] args) {
        // Widening (Implicit)
        int num = 10;
        double d = num;

        // Narrowing (Explicit)
        double price = 99.99;
        int roundedPrice = (int) price; // becomes 99

        System.out.println("Double: " + d + ", Rounded: " + roundedPrice);
    }
}
```

---

## 4. Control Flow Statements

### 4.1 If-Else & Switch
```java
public class DecisionMaking {
    public static void main(String[] args) {
        int marks = 75;

        // If-Else
        if (marks >= 80) {
            System.out.println("Distinction");
        } else if (marks >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Switch
        int day = 2;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other day"); break;
        }
    }
}
```

### 4.2 Loops (for, while, do-while)
```java
public class LoopsExample {
    public static void main(String[] args) {
        // For Loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("For Count: " + i);
        }

        // While Loop
        int w = 1;
        while (w <= 2) {
            System.out.println("While Count: " + w);
            w++;
        }

        // Do-While Loop (runs at least once)
        int d = 1;
        do {
            System.out.println("Do-While Count: " + d);
            d++;
        } while (d <= 1);
    }
}
```

---

## 5. Arrays & Strings

### 5.1 Arrays
Fixed size, homogeneous elements stored in contiguous memory.
```java
public class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40};

        // Accessing and modifying
        numbers[1] = 25;

        // Iterating
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
```

### 5.2 String, StringBuilder, StringBuffer
- `String`: Immutable (cannot be changed after creation).
- `StringBuilder`: Mutable, fast, not thread-safe.
- `StringBuffer`: Mutable, thread-safe (synchronized).

```java
public class StringExample {
    public static void main(String[] args) {
        String str = "Hello";
        str = str + " World"; // creates a new String in memory

        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming"); // modifies existing buffer

        System.out.println(str);
        System.out.println(sb.toString());
    }
}
```

---

## 6. Object-Oriented Programming (OOP)

OOP models software design around data (objects) and methods, focusing on reusability, modularity, and maintainability.

### 6.1 Classes and Objects
- **Class**: Blueprint / template.
- **Object**: Instance of a class.

```java
class Car {
    String brand;
    int speed;

    void drive() {
        System.out.println(brand + " is driving at " + speed + " km/h");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.speed = 80;
        myCar.drive();
    }
}
```

---

### 6.2 Constructors & `this` Keyword
A constructor initializes objects when created. `this` refers to the current object.

```java
class Student {
    String name;
    int rollNo;

    // Parameterized Constructor
    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name);
    }
}
```

---

### 6.3 The 4 Pillars of OOP

```
                   ┌─────────────────────────────────┐
                   │        4 Pillars of OOP         │
                   └─────────────────────────────────┘
                      │          │          │        │
          ┌───────────┘          │          │        └────────────┐
          ▼                      ▼          ▼                     ▼
    Encapsulation           Inheritance   Polymorphism        Abstraction
(Data Hiding + Getters)     (Reusability) (Many Forms)     (Hiding Complexity)
```

---

#### Pillar 1: Encapsulation
- **Concept**: Wrapping code and data into a single unit; hiding variables using `private` and exposing them through `public` getters and setters.

```java
class BankAccount {
    private double balance; // Data Hiding

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.deposit(500);
        System.out.println("Balance: Rs." + acc.getBalance());
    }
}
```

---

#### Pillar 2: Inheritance
- **Concept**: Mechanism where one class acquires the properties and behaviors of a parent class (`extends` keyword).

```java
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks: Woof woof!");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Inherited method
        dog.bark(); // Subclass method
    }
}
```

---

#### Pillar 3: Polymorphism
- **Concept**: Ability of an action or method to take many forms.
  1. **Compile-time Polymorphism (Method Overloading)**: Same method name, different parameters.
  2. **Runtime Polymorphism (Method Overriding)**: Subclass provides a specific implementation of a parent class method.

```java
class Calculator {
    // Method Overloading (Compile-time)
    int add(int a, int b) { return a + b; }
    double add(double a, double b) { return a + b; }
}

class Shape {
    // Method to be overridden
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    // Method Overriding (Runtime)
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Overloading: " + calc.add(5, 10));

        Shape s = new Circle(); // Upcasting
        s.draw(); // Calls Circle's draw() dynamically
    }
}
```

---

#### Pillar 4: Abstraction
- **Concept**: Hiding internal implementation details and displaying only essential features to the user.
- Implemented using:
  1. **Abstract Classes**: Can have abstract and concrete methods.
  2. **Interfaces**: Fully abstract contracts (`default`/`static` allowed in Java 8+).

```java
// Using Interface
interface Vehicle {
    void start(); // abstract method
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike starts with a kick or self-start.");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
        Vehicle v = new Bike();
        v.start();
    }
}
```

---

### 6.4 Key Keywords: `static` & `final`

- `static`: Belongs to the class rather than an object instance (shared across instances).
- `final`:
  - `final variable`: Constant (cannot be reassigned).
  - `final method`: Cannot be overridden.
  - `final class`: Cannot be inherited.

```java
class College {
    static String collegeName = "ABC University"; // Shared
    final int collegeCode = 101; // Constant

    static void displayInfo() {
        System.out.println("College: " + collegeName);
    }
}
```

---

## 7. Exception Handling

### Theory
Prevents normal program flow from breaking due to runtime errors.
- `try`: Code that might throw an exception.
- `catch`: Handles the exception.
- `finally`: Always executes (cleanup code).
- `throw`: Explicitly throw an exception.
- `throws`: Declares exceptions a method might throw.

```java
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero!");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
```

---

## 8. Java Collections Framework

The Collections Framework provides pre-built data structures and algorithms in `java.util.*`.

```
                  ┌─────────────────┐
                  │   Collection    │ (Interface)
                  └────────┬────────┘
             ┌─────────────┼─────────────┐
             ▼             ▼             ▼
          ┌──────┐      ┌─────┐      ┌───────┐
          │ List │      │ Set │      │ Queue │
          └──┬───┘      └──┬──┘      └───┬───┘
             │             │             │
        ┌────┴───┐    ┌────┴───┐    ┌────┴───┐
        ▼        ▼    ▼        ▼    ▼        ▼
    ArrayList  LinkedList  HashSet TreeSet PriorityQueue ArrayDeque

                 ┌─────────────┐
                 │     Map     │ (Separate Interface)
                 └──────┬──────┘
                   ┌────┴────┐
                   ▼         ▼
                HashMap   TreeMap
```

---

### 8.1 List Interface
- **Characteristics**: Ordered, allows duplicates, positional indexing.
- `ArrayList`: Fast random access (backed by dynamic array).
- `LinkedList`: Fast insertions/deletions (doubly linked list).

```java
import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();

        // Add
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Apple"); // duplicate allowed

        // Access
        System.out.println("First item: " + fruits.get(0));

        // Size & Print
        System.out.println("All fruits: " + fruits);
    }
}
```

---

### 8.2 Set Interface
- **Characteristics**: Unique elements only (no duplicates).
- `HashSet`: Unordered, O(1) performance using hashing.
- `TreeSet`: Sorted in ascending order, O(log n) using Red-Black Tree.

```java
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(40);
        set.add(10);
        set.add(40); // Ignored: duplicates not allowed

        System.out.println("HashSet: " + set);

        Set<Integer> sortedSet = new TreeSet<>(set);
        System.out.println("TreeSet (Sorted): " + sortedSet);
    }
}
```

---

### 8.3 Queue Interface
- **Characteristics**: First-In, First-Out (FIFO) or priority ordering.
- `PriorityQueue`: Elements ordered by natural priority or comparator.
- `ArrayDeque`: Double-ended queue (faster than `Stack` and `LinkedList`).

```java
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> line = new LinkedList<>();

        line.offer("First");
        line.offer("Second");

        System.out.println("Polled (Removed): " + line.poll()); // First
        System.out.println("Peeked (Next): " + line.peek());    // Second
    }
}
```

---

### 8.4 Map Interface
- **Characteristics**: Key-Value pairs; keys are unique, values can be duplicated.
- `HashMap`: Fast lookups O(1), unordered.
- `TreeMap`: Keys sorted in natural ascending order.

```java
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> studentMarks = new HashMap<>();

        // Put Key-Value pairs
        studentMarks.put("Surya", 85);
        studentMarks.put("Akash", 92);
        studentMarks.put("Surya", 95); // Updates value for key "Surya"

        // Access by Key
        System.out.println("Akash's Marks: " + studentMarks.get("Akash"));

        // Check key existence
        if (studentMarks.containsKey("Surya")) {
            System.out.println("Surya exists!");
        }
    }
}
```

---

### 8.5 Iterating Over Collections

#### 1. Enhanced For-Loop
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
for (String name : names) {
    System.out.println(name);
}
```

#### 2. Iterator (Safe for removal while looping)
```java
Iterator<String> it = names.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

#### 3. Map Iteration (Entry Set)
```java
for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
    System.out.println(entry.getKey() + " -> " + entry.getValue());
}
```

---

## Summary Cheat Sheet

| Category | Key Concepts | Best Practice / When to Use |
| :--- | :--- | :--- |
| **Encapsulation** | `private` variables, getters/setters | Protect state and maintain data integrity |
| **Inheritance** | `extends`, `super`, IS-A relationship | Code reuse across shared behaviors |
| **Polymorphism** | Overloading (compile-time), Overriding (runtime) | Write extensible, pluggable code |
| **Abstraction** | `abstract class`, `interface` | Define contracts without exposing internals |
| **ArrayList** | Indexed, resizable array | When frequent reading / searching by index is needed |
| **LinkedList** | Doubly linked nodes | When frequent insertions / deletions in the middle are needed |
| **HashSet** | Hash table, unique items | When duplicate elimination and fast lookup O(1) are required |
| **TreeSet** | Red-Black Tree, sorted unique items | When unique items need to remain continuously sorted |
| **HashMap** | Key-Value pairs | High-performance key-based lookups and dictionary structures |
