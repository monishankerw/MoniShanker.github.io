package org.example.corejava.designPattern.abstractDesignPattern;

// Abstract Products
interface Chair {
    void sitOn();
}

interface Sofa {
    void lieOn();
}

// Concrete Products for Victorian style
class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Victorian chair");
    }
}

class VictorianSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Victorian sofa");
    }
}

// Concrete Products for Modern style
class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sitting on a Modern chair");
    }
}

class ModernSofa implements Sofa {
    @Override
    public void lieOn() {
        System.out.println("Lying on a Modern sofa");
    }
}

// Abstract Factory
interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

// Concrete Factory for Victorian style
class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}

// Concrete Factory for Modern style
class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

// Main class to demonstrate the Abstract Factory pattern
public class AbstractFactoryDemo {
    public static void main(String[] args) {
        FurnitureFactory victorianFactory = new VictorianFurnitureFactory();
        Chair victorianChair = victorianFactory.createChair();
        Sofa victorianSofa = victorianFactory.createSofa();
        victorianChair.sitOn(); // Output: Sitting on a Victorian chair
        victorianSofa.lieOn(); // Output: Lying on a Victorian sofa

        FurnitureFactory modernFactory = new ModernFurnitureFactory();
        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        modernChair.sitOn(); // Output: Sitting on a Modern chair
        modernSofa.lieOn(); // Output: Lying on a Modern sofa
    }
}
