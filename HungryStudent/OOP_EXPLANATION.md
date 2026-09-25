# Hungry Student — College Food Delivery App
## Java OOP Mini-Project Submission

---

### 1. Project Overview
The **Hungry Student** application simulates a college food delivery system where students can order food, make payments using various payment methods, and receive their orders via different delivery modes.

The project is designed in strict compliance with Object-Oriented Programming (OOP) principles and meets all funny rules and functional requirements specified in the assignment handout.

---

### 2. Architecture & Class Structure

| Class Name | Type | Purpose |
| :--- | :--- | :--- |
| `Student` | Concrete Class | Encapsulates student data (`name`, `studentId`, `walletBalance`, `hungerLevel`), manages wallet balance, checks hunger alerts, and initiates orders. |
| `FoodOrder` | Concrete Class | Encapsulates food order details (`orderId`, `foodName`, `price`, `quantity`), calculates total price, and triggers funny rules. |
| `Payment` | Abstract Base Class | Defines abstract contract for all payment methods (`pay(double amount)`). |
| `UPI` | Concrete Subclass | Inherits from `Payment`; implements UPI payment processing. |
| `CreditCard` | Concrete Subclass | Inherits from `Payment`; implements Credit Card payment processing. |
| `Cash` | Concrete Subclass | Inherits from `Payment`; implements Cash payment processing. |
| `Delivery` | Abstract Base Class | Defines abstract contract for delivery methods (`deliver()`, `deliver(String foodName)`). |
| `BikeDelivery` | Concrete Subclass | Inherits from `Delivery`; handles bike delivery dispatch. |
| `DroneDelivery` | Concrete Subclass | Inherits from `Delivery`; handles drone delivery dispatch. |
| `HungryStudentApp` | Driver Class | Contains the `main` method executing and testing all scenarios. |

---

### 3. Application of the 4 OOP Pillars

#### Pillar 1: Encapsulation
- **Data Hiding**: All member variables across classes (`Student`, `FoodOrder`, `Payment`, `Delivery`) are declared with `private` access modifiers to prevent unintended external manipulation.
- **Controlled Access**: Access to fields is strictly mediated through `public` getters and setters with validation rules:
  - In `Student`: `walletBalance` cannot be negative; wallet balance is only deducted when placing orders or added via `addMoney()`.
  - In `FoodOrder`: `price` must be non-negative, and `quantity` must be at least 1.
- **Information Protection**: Hunger level and wallet checks are enclosed inside their respective classes.

#### Pillar 2: Abstraction
- **Abstract Classes**: `Payment` and `Delivery` are declared as `abstract` classes. They cannot be instantiated directly; they outline the required interface for all concrete payment and delivery options.
- **Contract Definition**:
  - `Payment` abstracts the payment transaction behind `public abstract void pay(double amount)`.
  - `Delivery` abstracts food dispatch behind `public abstract void deliver(String foodName)`.
- **Hiding Complexity**: The `Student` and `FoodOrder` do not need to know the internal working of UPI servers, card validation algorithms, or drone navigation systems.

#### Pillar 3: Inheritance
- **Reusability and IS-A Hierarchy**:
  - `UPI extends Payment`, `CreditCard extends Payment`, and `Cash extends Payment` establish that each is a specialized type of `Payment`. Common properties like `paymentType` are inherited from the parent class.
  - `BikeDelivery extends Delivery` and `DroneDelivery extends Delivery` establish that each is a specialized type of `Delivery`.
- Subclasses use `super(...)` to invoke the parent class constructors, reducing code duplication.

#### Pillar 4: Polymorphism
- **Runtime Polymorphism (Dynamic Method Dispatch / Method Overriding)**:
  - The `Student.orderFood(FoodOrder order, Payment paymentMethod, Delivery deliveryMethod)` method accepts base references of type `Payment` and `Delivery`.
  - At runtime, Java dynamically calls the overridden methods:
    - Calling `paymentMethod.pay(...)` invokes the specific subclass implementation (`UPI`, `CreditCard`, or `Cash`).
    - Calling `deliveryMethod.deliver(...)` invokes the specific subclass implementation (`BikeDelivery` or `DroneDelivery`).
- **Compile-Time Polymorphism (Method Overloading)**:
  - `Student.addMoney(double amount)` and `Student.addMoney(double amount, String source)` provide multiple signatures for adding funds.
  - `Student.orderFood(FoodOrder order)` is overloaded to provide a default payment and delivery option.
  - `Delivery.deliver()` and `Delivery.deliver(String foodName)`.

---

### 4. Implementation of "Funny Rules"

| Rule Requirement | Implementation Location | Output Triggered |
| :--- | :--- | :--- |
| `hungerLevel > 80` | `Student.checkHunger()` | `"EMERGENCY! Feed the student immediately!"` |
| Cannot spend more than `walletBalance` | `Student.orderFood()` | `"Order Error: The student cannot spend more than walletBalance!"` |
| Food is `"Biryani"` | `FoodOrder.checkFunnyRules()` | `"Student has chosen happiness"` |
| `quantity > 3` | `FoodOrder.checkFunnyRules()` | `"Bro, are you feeding the entire class?"` |
| Bike Delivery | `BikeDelivery.deliver()` | `"Your food is coming by bike"` |
| Drone Delivery | `DroneDelivery.deliver()` | `"Your food is flying to you"` |

---

### 5. How to Compile and Run

1. Open PowerShell or Command Prompt in the project folder:
   ```bash
   cd "c:\Users\bhanu\OneDrive\Desktop\desktop\placement&training\HungryStudent"
   ```

2. Compile all Java files:
   ```bash
   javac Payment.java UPI.java CreditCard.java Cash.java Delivery.java BikeDelivery.java DroneDelivery.java FoodOrder.java Student.java HungryStudentApp.java
   ```

3. Run the driver program:
   ```bash
   java HungryStudentApp
   ```
