package org.example.corejava.designPattern.factoryDesignPattern;

// Creator Class
abstract class Creator {
    public abstract Product factoryMethod();

    public void someOperation() {
        // Use the product
        Product product = factoryMethod();
        product.use();
    }
}

// Concrete Creator A
class ConcreteCreatorA extends Creator {
    @Override
    public Product factoryMethod() {
        return new ProductA();
    }
}

// Concrete Creator B
class ConcreteCreatorB extends Creator {
    @Override
    public Product factoryMethod() {
        return new ProductB();
    }
}

// Main class to demonstrate the Factory Method pattern
public class FactoryMethodDemo {
    public static void main(String[] args) {
        Creator creatorA = new ConcreteCreatorA();
        creatorA.someOperation(); // Output: Using Product A

        Creator creatorB = new ConcreteCreatorB();
        creatorB.someOperation(); // Output: Using Product B
    }
}
