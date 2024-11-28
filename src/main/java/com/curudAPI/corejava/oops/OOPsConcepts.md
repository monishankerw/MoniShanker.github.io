```markdown
# Object-Oriented Programming (OOP)

Object-Oriented Programming (OOP) is a programming paradigm 
based on the concepts of **classes** and **objects**, 
which allows developers to model real-world entities in software.
OOP enhances the design, development, and maintenance of complex systems through key principles 
such as **inheritance**, **polymorphism**, **abstraction**, and **encapsulation**.

## Features of OOP
1. **Focus on Data:** Emphasizes data over procedures.
2. **Object-Based Structure:** Programs are divided into objects.
3. **Data Characterization:** Data structures are designed to represent object characteristics.
4. **Data Hiding:** External functions cannot access hidden data.
5. **Encapsulation of Methods:** Methods operate on data within an object, binding behavior and data together.

## OOPS CONCEPTS 
1. **OBJECT**
2. **CLASS**
3. **INHERITANCE**
4. **POLYMORPHISM**
5. **ABSTRACTION**
6. **ENCAPSULATION**
7. **ASSOCIATION**
8. **COMPOSITION**
9. **COUPLING**
10.**COHESION**
## Real-Time Example: Bank Account Management System

An example of OOP concepts can be demonstrated in a **Bank Account Management System**.

### 1. **Class and Object**
   - **Class:** `BankAccount`
   - **Object Examples:** `customerAccount`, `savingsAccount`, `checkingAccount`

   ```java
   public class BankAccount {
       private String accountNumber;
       private double balance;

       public BankAccount(String accountNumber, double initialBalance) {
           this.accountNumber = accountNumber;
           this.balance = initialBalance;
       }

       public void deposit(double amount) {
           balance += amount;
       }

       public void withdraw(double amount) {
           if (amount <= balance) {
               balance -= amount;
           } else {
               System.out.println("Insufficient balance.");
           }
       }

       public double getBalance() {
           return balance;
       }
   }
   ```

### 2. **Inheritance**
- **Classes:** `SavingsAccount` and `CheckingAccount` extending `BankAccount`

   ```java
   public class SavingsAccount extends BankAccount {
       private double interestRate;

       public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
           super(accountNumber, initialBalance);
           this.interestRate = interestRate;
       }

       public void applyInterest() {
           double interest = getBalance() * interestRate;
           deposit(interest);
       }
   }
   ```

### 3. **Polymorphism**
- **Method Overriding Example:** `withdraw` method in `CheckingAccount`

   ```java
   public class CheckingAccount extends BankAccount {
       private double transactionFee;

       public CheckingAccount(String accountNumber, double initialBalance, double transactionFee) {
           super(accountNumber, initialBalance);
           this.transactionFee = transactionFee;
       }

       @Override
       public void withdraw(double amount) {
           super.withdraw(amount + transactionFee);
       }
   }
   ```

### 4. **Abstraction**
- **Class**: `BankAccount` provides only necessary methods to interact with account balance.

### 5. **Encapsulation**
- **Data Members**: `accountNumber`, `balance`, `interestRate`, and `transactionFee` are private, only accessible through specific methods.

---

## Object Creation in Java

### 1. **Using `new` Operator**
   ```java
   MyClass obj = new MyClass();
   ```

### 2. **Using `Class.newInstance()`**
   ```java
   MyClass obj = MyClass.class.newInstance();
   ```

### 3. **Using `Constructor.newInstance()`**
   ```java
   Constructor<MyClass> constructor = MyClass.class.getConstructor();
   MyClass obj = constructor.newInstance();
   ```

### 4. **Using `clone()` Method**
   ```java
   MyClass obj2 = (MyClass) obj1.clone();
   ```

### 5. **Using Deserialization**
   ```java
   FileInputStream fis = new FileInputStream("object.ser");
   ObjectInputStream ois = new ObjectInputStream(fis);
   MyClass obj2 = (MyClass) ois.readObject();
   ```

---

## Advantages of OOP Over Procedure-Oriented Programming
1. Easier development and maintenance.
2. Provides data hiding, restricting global data access.

---

## Why Java is Not 100% Object-Oriented

Java is not fully object-oriented because it supports **primitive data types** (e.g., `int`, `char`, `boolean`), which are not objects. In a fully object-oriented language, everything, including basic data types, would be represented as objects.

### Example
```java
public class PrimitiveExample {
    public static void main(String[] args) {
        int number = 10;
        Integer objectNumber = 10;

        System.out.println("Primitive data type: " + number);
        System.out.println("Object (Wrapper class): " + objectNumber);
    }
}
```

- `number` is a primitive data type, not an object.
- `objectNumber` is an object of the `Integer` wrapper class.

This distinction prevents Java from being considered fully object-oriented.
```