package Inheritances.coreClasses;

/**
 * ANIMAL.JAVA - Base/Parent Class for Inheritance Demonstration
 * 
 * PURPOSE:
 * This is the parent class that contains common properties and behaviors
 * shared by ALL animals. This demonstrates the power of inheritance:
 * Instead of repeating the same code in Dog, Cat, Bird classes,
 * we define it ONCE here and all child classes INHERIT it.
 * 
 * BENEFITS OF THIS APPROACH:
 * 1. Code Reusability - Write once, use everywhere
 * 2. Code Maintainability - Update in one place, applies to all children
 * 3. Reduced Code Duplication - Less code to maintain = fewer bugs
 * 4. Flexible Design - Easy to add new animal types
 */

public class Animal {
    
    // ==================== COMMON PROPERTIES ====================
    // These properties are inherited by all animal classes
    // Every animal has a name, age, and energy level
    
    protected String name;          // protected: accessible by child classes
    protected int age;              // protected: accessible by child classes
    protected double energyLevel;   // protected: accessible by child classes
    
    
    // ==================== CONSTRUCTOR ====================
    /**
     * Constructor to initialize an Animal with basic properties
     * Child classes will use this or call super() to initialize parent properties
     */
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        this.energyLevel = 100.0;   // Start with full energy
    }
    
    
    // ==================== COMMON METHODS ====================
    // These methods are inherited by all animal classes
    // Every animal performs these basic activities
    
    /**
     * Common method: All animals need to eat
     * Child classes can OVERRIDE this method to provide specific eating behavior
     */
    public void eat(double foodAmount) {
        energyLevel += foodAmount;
        
        // Prevent energy from exceeding 100
        if (energyLevel > 100.0) {
            energyLevel = 100.0;
        }
        
        System.out.println(name + " is eating " + foodAmount + " units of food. Energy: " + energyLevel);
    }
    
    /**
     * Common method: All animals need to sleep
     * Sleep restores energy to all animals
     */
    public void sleep(int hours) {
        energyLevel += (hours * 8);  // Each hour of sleep restores 8 energy units
        
        // Prevent energy from exceeding 100
        if (energyLevel > 100.0) {
            energyLevel = 100.0;
        }
        
        System.out.println(name + " slept for " + hours + " hours. Energy level restored to: " + energyLevel);
    }
    
    /**
     * Common method: All animals lose energy when moving
     * Child classes may override this to change how much energy is used
     */
    public void move(int distance) {
        double energyUsed = distance * 0.5;  // Moving uses energy based on distance
        
        if (energyLevel >= energyUsed) {
            energyLevel -= energyUsed;
            System.out.println(name + " moved " + distance + " units. Energy used: " + energyUsed + 
                             ". Remaining energy: " + energyLevel);
        } else {
            System.out.println(name + " is too tired to move! Energy level: " + energyLevel);
        }
    }
    
    /**
     * Method that describes the animal's status
     * This is a template method that child classes may override
     */
    public void displayStatus() {
        System.out.println("\n--- " + name + "'s Status ---");
        System.out.println("Age: " + age + " years");
        System.out.println("Energy Level: " + energyLevel + "/100");
    }
    
    /**
     * Abstract idea: This method is meant to be OVERRIDDEN by child classes
     * Different animals make different sounds
     * The parent class provides a default, but children should override it
     */
    public void makeSound() {
        System.out.println(name + " makes a sound.");
    }
    
    
    // ==================== GETTER METHODS ====================
    // These allow other classes to access the animal's properties safely
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getEnergyLevel() {
        return energyLevel;
    }
    
    
    // ==================== SETTER METHODS ====================
    // These allow controlled modification of properties
    
    public void setName(String newName) {
        this.name = newName;
    }
    
    public void setAge(int newAge) {
        if (newAge > 0) {  // Validation: age must be positive
            this.age = newAge;
        }
    }
}
