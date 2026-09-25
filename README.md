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
   - [List Interface Overview](#81-list-interface-overview)
   - [ArrayList in Java](#82-arraylist-in-java)
   - [LinkedList in Java](#83-linkedlist-in-java)
   - [Set (HashSet, TreeSet)](#84-set-interface)
   - [Queue (PriorityQueue, ArrayDeque)](#85-queue-interface)
   - [Map (HashMap, TreeMap)](#86-map-interface)
   - [Iterating Collections](#87-iterating-over-collections)

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

### 8.1 List Interface Overview
- **Characteristics**: Ordered collection (maintains insertion order), permits duplicate elements, positional access via zero-based indexing.
- **Common Implementations**: `ArrayList` (dynamic array), `LinkedList` (doubly-linked list), `Vector` (synchronized dynamic array).

---

### 8.2 ArrayList in Java

#### 1. What is an ArrayList?
An `ArrayList` is a resizable, dynamic array implementation of the `List` interface found in `java.util`. Unlike standard Java arrays which have a fixed size, an `ArrayList` grows and shrinks automatically as elements are added or removed.

#### 2. Key Characteristics
- **Dynamic Resizing**: Automatically expands capacity when full.
- **Ordered**: Preserves the order in which elements are inserted.
- **Allows Duplicates & Null**: Can store multiple identical elements and `null` values.
- **Indexed Access (Random Access)**: Provides fast $O(1)$ access time via `get(index)` because elements are stored in contiguous memory.
- **Not Synchronized**: By default, it is not thread-safe (faster for single-threaded usage). For thread safety, use `Collections.synchronizedList(new ArrayList<>())` or `CopyOnWriteArrayList`.

#### 3. Internal Working: How ArrayList Grows
- **Default Initial Capacity**: `10`
- **Growth Formula**: When the internal array becomes full, Java creates a new larger array and copies the elements over:
  $$\text{New Capacity} = \text{Old Capacity} + (\text{Old Capacity} \gg 1) \approx 1.5 \times \text{Old Capacity}$$
- **Time Complexities**:
  - `get(index)`: $O(1)$ (Constant time)
  - `add(element)` (at the end): $O(1)$ amortized
  - `add(index, element)`: $O(n)$ (requires shifting elements to the right)
  - `remove(index)`: $O(n)$ (requires shifting elements to the left)
  - `contains(element)`: $O(n)$ (linear search)

#### 4. Array vs. ArrayList

| Feature | Standard Array (`T[]`) | `ArrayList<T>` |
| :--- | :--- | :--- |
| **Size** | Fixed length upon creation | Dynamic (grows/shrinks automatically) |
| **Data Types** | Stores primitives (`int`) and Objects | Stores Objects only (uses wrapper classes like `Integer`) |
| **Size Property** | `.length` (attribute) | `.size()` (method) |
| **Adding Elements** | `arr[index] = value;` | `list.add(value);` or `list.add(index, value);` |
| **Performance** | Slightly faster (less memory overhead) | Highly flexible with rich built-in utility methods |
| **Generics Support**| No (invariant) | Yes (type-safe via `<T>`) |

#### 5. Common ArrayList Methods

| Method | Syntax | Description |
| :--- | :--- | :--- |
| `add(E e)` | `list.add("Apple");` | Appends element to end |
| `add(int index, E e)` | `list.add(1, "Mango");` | Inserts element at specified index |
| `get(int index)` | `list.get(0);` | Returns element at index |
| `set(int index, E e)` | `list.set(2, "Orange");` | Replaces element at index |
| `remove(int index)` | `list.remove(1);` | Removes element at index |
| `remove(Object o)` | `list.remove("Apple");` | Removes first occurrence of object |
| `contains(Object o)` | `list.contains("Mango");` | Checks if element exists (`true`/`false`) |
| `size()` | `list.size();` | Returns number of elements |
| `isEmpty()` | `list.isEmpty();` | Checks if list has 0 elements |
| `clear()` | `list.clear();` | Removes all elements |
| `Collections.sort(list)`| `Collections.sort(list);` | Sorts list in natural ascending order |

#### 6. Complete Working Example
```java
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // 1. Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add(1, "Orange"); // Insert at index 1

        System.out.println("List: " + fruits); // [Apple, Orange, Banana, Mango]

        // 2. Accessing & Updating
        System.out.println("Item at index 2: " + fruits.get(2)); // Banana
        fruits.set(2, "Pineapple"); // Replace index 2

        // 3. Removing
        fruits.remove("Apple"); // Remove by value
        fruits.remove(0);       // Remove by index (removes Orange)

        // 4. Searching & Size
        System.out.println("Contains Mango? " + fruits.contains("Mango"));
        System.out.println("Size: " + fruits.size());

        // 5. Sorting
        Collections.sort(fruits);
        System.out.println("Sorted: " + fruits);

        // 6. Iterating
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // 7. Clearing
        fruits.clear();
        System.out.println("Is Empty: " + fruits.isEmpty());
    }
}
```

---

### 8.3 LinkedList in Java

#### 1. What is a LinkedList?
A `LinkedList` is a linear data structure where elements are not stored in contiguous memory locations. Instead, each element is stored inside a distinct **Node** object that maintains references (pointers) to adjacent nodes.

In Java's Collections Framework (`java.util.LinkedList`), it is implemented as a **Doubly Linked List**. In addition to implementing the `List` interface, it also implements `Deque` (Double Ended Queue) and `Queue`, making it versatile enough to be used as a general list, a FIFO queue, or a LIFO stack.

#### 2. Types of Linked Lists

```
1. Singly Linked List:
   [Head] ──> [Data | Next] ──> [Data | Next] ──> [Data | null]

2. Doubly Linked List (Java's java.util.LinkedList):
   null <── [Prev | Data | Next] <═══> [Prev | Data | Next] ──> null
                 ▲                                   ▲
               [First]                             [Last]

3. Circular Linked List:
   ┌──> [Data | Next] ──> [Data | Next] ──> [Data | Next] ──┐
   └────────────────────────────────────────────────────────┘
```

- **Singly Linked List**: Traversal in forward direction only. Each node has one pointer to `next`.
- **Doubly Linked List**: Bidirectional traversal. Each node holds references to both `next` and `prev`.
- **Circular Linked List**: The last node links back to the first node, forming a closed loop without `null`.

#### 3. Internal Working: Node Architecture in Java
Java's `java.util.LinkedList` manages elements via a private static inner class:

```java
private static class Node<E> {
    E item;        // Actual element stored
    Node<E> next;  // Pointer to the next node
    Node<E> prev;  // Pointer to the previous node

    Node(Node<E> prev, E element, Node<E> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }
}
```

The `LinkedList` class maintains two head/tail pointers:
- `transient Node<E> first;` (points to the first node)
- `transient Node<E> last;` (points to the last node)

> **Optimization Note for `get(index)`**:
> Although LinkedList does not support index-based memory calculation, Java optimizes indexed traversal by checking if the index is in the first half or second half of the list:
> ```java
> if (index < (size >> 1)) // Traverse forwards from 'first'
> else                     // Traverse backwards from 'last'
> ```
> This halves the average search distance, but worst-case time complexity remains $O(n)$.

#### 4. Key Characteristics
- **Dynamic Allocation**: Elements can be added or removed without reallocating arrays or copying existing elements.
- **Dual Interface Implementation**: Implements `List<E>`, `Deque<E>`, and `Queue<E>`.
- **Memory Overhead**: Each node incurs extra memory overhead to store two references (`prev` and `next`) alongside the object data.
- **Cache Inefficient**: Unlike arrays where elements are stored contiguously in memory (cache-friendly), linked nodes are scattered across heap memory, leading to cache misses during traversal.
- **Not Synchronized**: Like `ArrayList`, it is not thread-safe by default. Use `Collections.synchronizedList(new LinkedList<>())` for concurrent access.

#### 5. Time Complexity Analysis

| Operation | Best Case | Worst / Average Case | Explanation |
| :--- | :--- | :--- | :--- |
| `addFirst(E)` / `addLast(E)` | $O(1)$ | $O(1)$ | Direct pointer update at `first` or `last` |
| `removeFirst()` / `removeLast()` | $O(1)$ | $O(1)$ | Direct pointer unlink at ends |
| `add(index, E)` | $O(1)$ (at ends) | $O(n)$ | Requires traversing to index first, then $O(1)$ pointer insertion |
| `remove(index)` | $O(1)$ (at ends) | $O(n)$ | Traverses to index ($O(n)$), then updates pointers ($O(1)$) |
| `get(index)` / `set(index)` | $O(1)$ (at ends) | $O(n)$ | Linear traversal required (no index-based address arithmetic) |
| `contains(Object)` | $O(1)$ (head) | $O(n)$ | Linear scan through nodes |

#### 6. ArrayList vs. LinkedList

| Feature | `ArrayList<E>` | `LinkedList<E>` |
| :--- | :--- | :--- |
| **Underlying Data Structure** | Resizable dynamic array | Doubly linked list |
| **Memory Layout** | Contiguous memory blocks | Scattered heap memory connected by pointers |
| **Random Access (`get(i)`)** | **$O(1)$ (Instant)** | **$O(n)$ (Slow traversal)** |
| **Insertion / Deletion at Ends** | $O(1)$ amortized (end) / $O(n)$ (front) | **$O(1)$ at both head and tail** |
| **Insertion / Deletion in Middle**| $O(n)$ due to element shifting | $O(n)$ traversal + $O(1)$ pointer update |
| **Memory Overhead** | Low (only elements; minor unused capacity) | High (stores data + 2 pointers per node) |
| **CPU Cache Locality** | Excellent (spatial locality) | Poor (pointer chasing causes cache misses) |
| **Interfaces Implemented** | `List`, `RandomAccess`, `Cloneable` | `List`, `Deque`, `Queue`, `Cloneable` |
| **Best Used When** | Frequent reads, lookups, appending to end | Frequent insertions/deletions at ends, Queues/Stacks |

#### 7. Common LinkedList Methods

| Category | Method | Syntax | Description |
| :--- | :--- | :--- | :--- |
| **List Operations** | `add(E e)` | `list.add("Java");` | Appends element to end |
| | `add(int index, E e)` | `list.add(1, "Python");` | Inserts element at index |
| | `get(int index)` | `list.get(0);` | Retrieves element at index |
| | `set(int index, E e)` | `list.set(0, "C++");` | Replaces element at index |
| | `remove(int index)` | `list.remove(2);` | Removes element at index |
| **Deque / End Ops** | `addFirst(E e)` | `list.addFirst("Start");` | Inserts at the head |
| | `addLast(E e)` | `list.addLast("End");` | Appends to the tail |
| | `getFirst()` | `list.getFirst();` | Returns head element (throws exception if empty) |
| | `getLast()` | `list.getLast();` | Returns tail element (throws exception if empty) |
| | `removeFirst()` | `list.removeFirst();` | Removes and returns head |
| | `removeLast()` | `list.removeLast();` | Removes and returns tail |
| **Queue Operations** | `offer(E e)` | `list.offer("Task");` | Adds to end (returns `false` if failed) |
| | `poll()` | `list.poll();` | Retrieves and removes head (`null` if empty) |
| | `peek()` | `list.peek();` | Retrieves head without removing (`null` if empty) |
| **Stack Operations** | `push(E e)` | `list.push("Item");` | Pushes element onto top of stack (head) |
| | `pop()` | `list.pop();` | Pops element from top of stack (head) |

#### 8. Complete Working Example (Java LinkedList)
```java
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> languages = new LinkedList<>();

        // 1. Standard List additions
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        // 2. Deque Operations (Adding at ends)
        languages.addFirst("HTML");   // Added at beginning
        languages.addLast("Rust");     // Added at end
        System.out.println("Initial List: " + languages);
        // Output: [HTML, Java, Python, C++, Rust]

        // 3. Accessing First and Last elements
        System.out.println("First element: " + languages.getFirst()); // HTML
        System.out.println("Last element: " + languages.getLast());   // Rust

        // 4. Removing elements from ends
        languages.removeFirst(); // Removes HTML
        languages.removeLast();  // Removes Rust
        System.out.println("After removing ends: " + languages);
        // Output: [Java, Python, C++]

        // 5. Using LinkedList as a Queue (FIFO)
        LinkedList<String> queue = new LinkedList<>();
        queue.offer("Customer 1");
        queue.offer("Customer 2");
        System.out.println("Queue Peek: " + queue.peek());      // Customer 1
        System.out.println("Served: " + queue.poll());          // Customer 1
        System.out.println("Remaining Queue: " + queue);        // [Customer 2]

        // 6. Using LinkedList as a Stack (LIFO)
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack Pop: " + stack.pop());        // 30
        System.out.println("Stack Top: " + stack.peek());       // 20

        // 7. Iterating through LinkedList
        System.out.print("Iteration: ");
        for (String lang : languages) {
            System.out.print(lang + " -> ");
        }
        System.out.println("null");
    }
}
```

#### 9. Interview Special: Custom Singly Linked List Implementation
In technical placement interviews, you are often asked to implement a Linked List from scratch without using `java.util.LinkedList`.

```java
// Custom Node definition
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Custom Singly Linked List
public class CustomLinkedList {
    private Node head;

    // Insert at beginning: O(1)
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end: O(n)
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Delete first occurrence of a value: O(n)
    public void delete(int key) {
        if (head == null) return;

        // If head contains the key
        if (head.data == key) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        }
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CustomLinkedList sll = new CustomLinkedList();
        sll.insertAtEnd(10);
        sll.insertAtEnd(20);
        sll.insertAtHead(5);
        sll.display(); // 5 -> 10 -> 20 -> null

        sll.delete(10);
        sll.display(); // 5 -> 20 -> null
    }
}
```

#### 10. Deep Dive: Doubly Linked List (DLL)

##### What is a Doubly Linked List?
A **Doubly Linked List** is a two-way chained data structure where each node stores two references:
1. `prev` &mdash; A pointer to the previous node in the sequence.
2. `next` &mdash; A pointer to the next node in the sequence.

```
                    ┌─────────────────────────── Doubly Node ───────────────────────────┐
                    │  [ prev: Pointer ]  │  [ data: Value ]  │  [ next: Pointer ]     │
                    └───────────────────────────────────────────────────────────────────┘

      head                                                                        tail
        │                                                                           │
        ▼                                                                           ▼
     ┌─────┐           ┌────────────────┐           ┌────────────────┐           ┌─────┐
null │     │ <───────> │ prev│data│next │ <───────> │ prev│data│next │ <───────> │     │ null
     └─────┘           └────────────────┘           └────────────────┘           └─────┘
```

##### Pointer Manipulation Mechanics (Visual Walkthrough)

> [!TIP]
> In technical interviews, the key to Doubly Linked List problems is the **order of updating pointers**. Reassigning pointers in the wrong sequence will overwrite references and sever the list!

###### A. Inserting a Node in the Middle (After Node `A`)
```
Original:       [ Node A ] <=================================> [ Node B ]
                                  (A.next)      (B.prev)

Step 1: Set newNode.next = A.next (pointing to B)
Step 2: Set newNode.prev = A
Step 3: Set A.next.prev = newNode (updating B's prev)
Step 4: Set A.next = newNode

Result:         [ Node A ] <───> [ New Node ] <───> [ Node B ]
```

###### B. Deleting a Node `curr` from the Middle
```
Before:         [ prevNode ] <───────> [ curr ] <───────> [ nextNode ]

Step 1: curr.prev.next = curr.next;  // prevNode now skips curr to nextNode
Step 2: curr.next.prev = curr.prev;  // nextNode now skips curr back to prevNode
Step 3: curr.prev = null; curr.next = null; // Unlink curr for garbage collection

Result:         [ prevNode ] <──────────────────────────> [ nextNode ]
```

##### Advantages & Disadvantages of DLL

| Advantages | Disadvantages |
| :--- | :--- |
| **Bidirectional Traversal**: Can be traversed forward and backward easily. | **Higher Memory Consumption**: Each node stores two reference pointers instead of one. |
| **$O(1)$ Deletion with Node Reference**: Given a pointer to a node, it can be deleted in $O(1)$ time without traversing from the head to find the predecessor. | **Complex Pointer Bookkeeping**: More pointer reassignments required on every insert and delete. |
| **Quick Insertion Before a Given Node**: Possible in $O(1)$ time using `node.prev`. | **Poor Cache Performance**: Like all node-based structures, non-contiguous memory causes CPU cache misses. |

##### Custom Doubly Linked List Java Implementation

```java
// Node representation for Doubly Linked List
class DNode {
    int data;
    DNode prev;
    DNode next;

    public DNode(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class CustomDoublyLinkedList {
    private DNode head;
    private DNode tail;

    // 1. Insert at Beginning: O(1)
    public void insertAtHead(int data) {
        DNode newNode = new DNode(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // 2. Insert at End: O(1) using tail pointer
    public void insertAtEnd(int data) {
        DNode newNode = new DNode(data);
        if (tail == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // 3. Insert after a given key: O(n)
    public void insertAfter(int targetKey, int data) {
        DNode current = head;
        while (current != null && current.data != targetKey) {
            current = current.next;
        }
        if (current == null) {
            System.out.println("Key " + targetKey + " not found!");
            return;
        }
        // If target is the tail, just use insertAtEnd
        if (current == tail) {
            insertAtEnd(data);
            return;
        }
        DNode newNode = new DNode(data);
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
    }

    // 4. Delete a node by value: O(n) search + O(1) pointer updates
    public void delete(int key) {
        if (head == null) return;

        DNode current = head;
        while (current != null && current.data != key) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Key " + key + " not found!");
            return;
        }

        // If deleting the only node
        if (current == head && current == tail) {
            head = tail = null;
            return;
        }

        // If deleting head
        if (current == head) {
            head = head.next;
            head.prev = null;
            return;
        }

        // If deleting tail
        if (current == tail) {
            tail = tail.prev;
            tail.next = null;
            return;
        }

        // Deleting from middle
        current.prev.next = current.next;
        current.next.prev = current.prev;
    }

    // 5. Reverse the Doubly Linked List in-place: O(n)
    public void reverse() {
        if (head == null || head.next == null) return;

        DNode current = head;
        DNode temp = null;

        // Swap next and prev for all nodes
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev; // Moves to original next node
        }

        // Swap head and tail
        tail = head;
        if (temp != null) {
            head = temp.prev;
        }
    }

    // 6. Forward Traversal: O(n)
    public void displayForward() {
        System.out.print("Forward:  head <-> ");
        DNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // 7. Backward Traversal: O(n)
    public void displayBackward() {
        System.out.print("Backward: tail <-> ");
        DNode temp = tail;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CustomDoublyLinkedList dll = new CustomDoublyLinkedList();

        dll.insertAtHead(20);
        dll.insertAtHead(10);
        dll.insertAtEnd(30);
        dll.insertAtEnd(40);
        dll.displayForward();  // head <-> 10 <-> 20 <-> 30 <-> 40 <-> null
        dll.displayBackward(); // tail <-> 40 <-> 30 <-> 20 <-> 10 <-> null

        dll.insertAfter(20, 25);
        dll.displayForward();  // head <-> 10 <-> 20 <-> 25 <-> 30 <-> 40 <-> null

        dll.delete(10); // Remove head
        dll.delete(40); // Remove tail
        dll.delete(25); // Remove middle
        dll.displayForward();  // head <-> 20 <-> 30 <-> null

        dll.reverse();
        dll.displayForward();  // head <-> 30 <-> 20 <-> null
    }
}
```

##### Famous Placement Question: Why is DLL used in LRU Cache?
In an **LRU (Least Recently Used) Cache**, we need two operations to run in strictly **$O(1)$ time**:
1. `get(key)`: Retrieve value and move the node to the front (Most Recently Used).
2. `put(key, value)`: Insert new key-value pair. If cache capacity is exceeded, evict the least recently used node from the end.

- A `HashMap` gives $O(1)$ lookup to the node reference.
- A **Doubly Linked List** allows $O(1)$ removal of that referenced node and $O(1)$ insertion at the head.
- *A Singly Linked List cannot do this in $O(1)$* because deleting an arbitrary node requires finding its predecessor, which takes $O(n)$ traversal.

---

#### 11. Deep Dive: Circular Linked List (CLL)

##### What is a Circular Linked List?
A **Circular Linked List** is a variation of a linked list in which there is **no `null` terminating reference**. Instead:
- In a **Circular Singly Linked List (CSLL)**: The last node's `next` points back to the first node (`head`).
- In a **Circular Doubly Linked List (CDLL)**: The last node's `next` points to `head`, and `head.prev` points back to the last node (`tail`).

```
Circular Singly Linked List:
┌──────────────────────────────────────────────────────────┐
│                                                          ▼
└── [ head: data | next ] ──> [ data | next ] ──> [ tail: data | next ]
         ▲                                                │
         └────────────────────────────────────────────────┘

Circular Doubly Linked List:
┌──────────────────────────────────────────────────────────────────────────┐
│     ┌──────────────────────────────────────────────────────────────┐     │
▼     ▼                                                              │     │
[ head: prev|data|next ] <=======> [ prev|data|next ] <=======> [ tail: prev|data|next ]
```

##### The "Tail Pointer" Optimization Pattern

> [!IMPORTANT]
> **Pro Interview Tip**: When implementing a Circular Linked List, **always store a reference to the `tail` instead of the `head`**!
> - The `tail` gives instant $O(1)$ access to the last node.
> - `tail.next` gives instant $O(1)$ access to the first node (`head`).
> - This gives you **both** $O(1)$ insert at head and $O(1)$ insert at tail with zero traversal!

```
                    ┌─────────────────────────┐
                    │                         ▼
               [ tail.next ] ───> [ Node 2 ] ───> [ tail ]
                 (Head)                             │
                    ▲                               │
                    └───────────────────────────────┘
```

##### Real-World Applications of Circular Linked Lists
1. **Round-Robin CPU Scheduling**: Operating systems allocate fixed time slices to running processes in a circular cycle.
2. **Multiplayer Board Games**: Turn management (Player 1 &rarr; Player 2 &rarr; Player 3 &rarr; Player 1) naturally loops circularly.
3. **Media Players & Playlists**: Looping audio or video playback continuously back to track 1 when reaching the end of the playlist.
4. **Circular Ring Buffers**: Memory buffers for audio streaming, I/O queuing, and networking packet queues.

##### Custom Circular Singly Linked List Java Implementation

```java
// Node representation for Circular Linked List
class CNode {
    int data;
    CNode next;

    public CNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomCircularLinkedList {
    // We maintain 'tail' instead of 'head' for O(1) operations at both ends
    private CNode tail;
    private int size;

    public CustomCircularLinkedList() {
        this.tail = null;
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return tail == null;
    }

    // 1. Insert at Beginning: O(1)
    public void insertAtHead(int data) {
        CNode newNode = new CNode(data);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail; // Points to itself
        } else {
            newNode.next = tail.next; // New node points to old head
            tail.next = newNode;      // Tail's next becomes new head
        }
        size++;
    }

    // 2. Insert at End: O(1)
    public void insertAtEnd(int data) {
        CNode newNode = new CNode(data);
        if (isEmpty()) {
            tail = newNode;
            tail.next = tail;
        } else {
            newNode.next = tail.next; // Point to head
            tail.next = newNode;      // Old tail points to new node
            tail = newNode;           // Update tail pointer!
        }
        size++;
    }

    // 3. Delete a Node by Value: O(n)
    public void delete(int key) {
        if (isEmpty()) return;

        CNode head = tail.next;
        CNode curr = head;
        CNode prev = tail;

        // Case A: List has only 1 node
        if (head == tail && head.data == key) {
            tail = null;
            size--;
            return;
        }

        // Case B: Deleting the head node
        if (head.data == key) {
            tail.next = head.next;
            size--;
            return;
        }

        // Case C: Search for the node in the remaining list
        do {
            prev = curr;
            curr = curr.next;
            if (curr.data == key) {
                prev.next = curr.next;
                // If deleting tail node, update tail reference to prev
                if (curr == tail) {
                    tail = prev;
                }
                size--;
                return;
            }
        } while (curr != head);

        System.out.println("Key " + key + " not found!");
    }

    // 4. Display list (Handling the circular termination safely)
    public void display() {
        if (isEmpty()) {
            System.out.println("List is empty!");
            return;
        }

        CNode head = tail.next;
        CNode curr = head;

        System.out.print("Circular List: ");
        do {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        } while (curr != head);
        System.out.println("(loops back to " + head.data + ")");
    }

    public static void main(String[] args) {
        CustomCircularLinkedList cll = new CustomCircularLinkedList();

        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtHead(5);
        cll.display(); // 5 -> 10 -> 20 -> 30 -> (loops back to 5)

        cll.delete(5);  // Delete head
        cll.delete(30); // Delete tail
        cll.display(); // 10 -> 20 -> (loops back to 10)

        cll.delete(20);
        cll.delete(10);
        cll.display(); // List is empty!
    }
}
```

##### Interview Essential: Floyd's Cycle Detection Algorithm (Tortoise and Hare)
One of the most frequently asked problems in interviews is: **"Determine if a given linked list has a cycle, find the length of the cycle, and return the start node of the cycle."**

###### 1. Cycle Detection ($O(n)$ time, $O(1)$ space)
Use two pointers:
- `slow` moves **1 step** at a time.
- `fast` moves **2 steps** at a time.
- If there is a cycle, `fast` will inevitably lap `slow` and both pointers will collide (`slow == fast`). If `fast` encounters `null`, there is no cycle.

###### 2. Finding the Starting Node of the Cycle
**Mathematical Proof**:
- Let distance from head to cycle entrance be $L_1$.
- Let distance from cycle entrance to meeting point be $L_2$.
- Let cycle circumference be $C$.
- Distance traveled by slow = $L_1 + L_2$.
- Distance traveled by fast = $L_1 + L_2 + k \cdot C$ (where $k \ge 1$ is full laps).
- Since fast travels twice as fast: $2(L_1 + L_2) = L_1 + L_2 + k \cdot C \implies L_1 + L_2 = k \cdot C \implies \mathbf{L_1 = k \cdot C - L_2}$.
- Therefore, after they meet, **reset `slow` to `head`** and keep `fast` at the meeting point. Move both pointers **one step at a time**. The node where they meet again is the exact **entrance of the cycle**!

```java
public class CycleDetection {
    // Detects cycle and returns starting node of loop (or null)
    public static Node findCycleStart(Node head) {
        if (head == null || head.next == null) return null;

        Node slow = head;
        Node fast = head;

        // Step 1: Detect if cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Cycle detected!
                break;
            }
        }

        // No cycle found
        if (fast == null || fast.next == null) return null;

        // Step 2: Find cycle start node
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow; // Cycle start node
    }
}
```

---

#### 12. Singly vs. Doubly vs. Circular Linked List: Master Comparison Table

| Attribute | Singly Linked List (SLL) | Doubly Linked List (DLL) | Circular Linked List (CLL) |
| :--- | :--- | :--- | :--- |
| **Node Structure** | `[ data \| next ]` | `[ prev \| data \| next ]` | `[ data \| next ]` (or doubly circular) |
| **Pointers Per Node** | 1 (`next`) | 2 (`prev`, `next`) | 1 or 2 |
| **Traversal Direction** | Forward only (unidirectional) | Forward and backward (bidirectional) | Continuous loop (can be 1-way or 2-way) |
| **Insertion / Deletion at Head** | $O(1)$ | $O(1)$ | $O(1)$ (using `tail` pointer) |
| **Insertion / Deletion at Tail** | Insert $O(1)$ with tail; Delete $O(n)$ | $O(1)$ for both with tail | $O(1)$ for both with tail & DLL |
| **Deleting Given Node Reference**| $O(n)$ (must find predecessor) | **$O(1)$** (predecessor is in `node.prev`) | $O(n)$ for CSLL; $O(1)$ for CDLL |
| **Memory Overhead** | Smallest (1 pointer overhead) | Highest (2 pointers overhead per node) | Small (CSLL) / High (CDLL) |
| **List Termination** | Ends with `null` reference | Ends with `null` on both sides | No `null` termination; loops to head |
| **Infinite Loop Risk** | Low | Low | High (traversal requires `do...while` or stop check) |
| **Primary Placement Use Cases**| Simple queues, basic chaining | Browser history (Back/Forward), LRU Cache, Undo/Redo | CPU Round Robin, Playlists, Ring Buffers |

---

### 8.4 Set Interface
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

### 8.5 Queue Interface
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

### 8.6 Map Interface
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

### 8.7 Iterating Over Collections

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
