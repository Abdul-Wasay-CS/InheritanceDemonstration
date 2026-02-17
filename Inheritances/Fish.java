package Inheritances;

/**
 * BONUS: FISH.JAVA - Demonstrating Extensibility
 * 
 * PURPOSE:
 * This class shows how EASY it is to add a new animal type when you use
 * inheritance. Notice how simple this is compared to without inheritance.
 * Fish extends Animal and only implements Fish-specific behavior.
 * All common animal behavior is inherited automatically!
 * 
 * This demonstrates the TRUE POWER of inheritance:
 * "Adding a new animal type is quick and easy"
 */

public class Fish extends Animal {
    
    // ==================== FISH-SPECIFIC PROPERTIES ====================
    
    private String environment;     // saltwater, freshwater, both?
    private int depth;              // Current depth in water
    private boolean isSchooling;    // Are they swimming in a school?
    
    
    // ==================== CONSTRUCTOR ====================
    public Fish(String name, int age, String environment) {
        super(name, age);           // Initialize inherited properties from Animal
        this.environment = environment;
        this.depth = 0;
        this.isSchooling = false;
    }
    
    
    // ==================== OVERRIDDEN METHODS ====================
    
    /**
     * OVERRIDE: Different sound for fish
     */
    @Override
    public void makeSound() {
        System.out.println(name + " says: Blub blub...");
    }
    
    /**
     * OVERRIDE: Fish eat differently - they filter feed or nibble
     */
    @Override
    public void eat(double foodAmount) {
        // Fish are efficient eaters - they need very little food
        double fishFoodAmount = foodAmount * 0.2;  // Fish eat only 20%!
        
        super.eat(fishFoodAmount);  // Call parent's eat
        
        // Fish-specific behavior
        System.out.println(name + " nibbled on some food particles.");
    }
    
    /**
     * OVERRIDE: move() means swim for fish!
     */
    @Override
    public void move(int distance) {
        // Fish are VERY efficient swimmers - minimal energy use
        double energyUsed = distance * 0.1;  // Even better than birds!
        
        if (energyLevel >= energyUsed) {
            energyLevel -= energyUsed;
            depth = 50;  // Fish are typically at moderate depth
            System.out.println(name + " swam " + distance + " units. Energy used: " + 
                             energyUsed + ". Current depth: " + depth + " feet");
        } else {
            System.out.println(name + " is too tired to swim!");
        }
    }
    
    /**
     * OVERRIDE: Display fish-specific status
     */
    @Override
    public void displayStatus() {
        super.displayStatus();  // Show inherited status
        
        // Add fish-specific information
        System.out.println("Environment: " + environment);
        System.out.println("Current Depth: " + depth + " feet");
        System.out.println("Schooling: " + (isSchooling ? "Yes" : "No"));
    }
    
    
    // ==================== FISH-SPECIFIC METHODS ====================
    
    /**
     * FISH-SPECIFIC: Dive deeper into the water
     */
    public void dive(int targetDepth) {
        int depthDifference = Math.abs(targetDepth - depth);
        double energyNeeded = depthDifference * 0.05;
        
        if (energyLevel >= energyNeeded) {
            energyLevel -= energyNeeded;
            depth = targetDepth;
            System.out.println(name + " dove to depth: " + depth + " feet");
        } else {
            System.out.println(name + " doesn't have energy to dive deeper!");
        }
    }
    
    /**
     * FISH-SPECIFIC: Bubble blowing (often a sign of contentment)
     */
    public void blowBubbles() {
        System.out.println(name + " is blowing bubbles: blub blub blub");
        makeSound();
    }
    
    /**
     * FISH-SPECIFIC: Join a school of fish
     */
    public void joinSchool() {
        isSchooling = true;
        energyLevel -= 10;  // Uses energy to coordinate with school
        System.out.println(name + " joined a school of fish. Safety in numbers!");
    }
    
    /**
     * FISH-SPECIFIC: Leave a school
     */
    public void leaveSchool() {
        isSchooling = false;
        System.out.println(name + " left the school and is swimming solo.");
    }
    
    
    // GETTERS
    public String getEnvironment() {
        return environment;
    }
    
    public int getDepth() {
        return depth;
    }
}
