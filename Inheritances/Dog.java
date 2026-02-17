package Inheritances;

/**
 * DOG.JAVA - Child Class Inheriting from Animal
 * 
 * PURPOSE:
 * This class demonstrates how to EXTEND the Animal class.
 * Instead of rewriting all the code from Animal, Dog inherits all
 * properties and methods from Animal, then adds its own unique features.
 * 
 * KEY CONCEPTS:
 * 1. INHERITANCE: Dog IS-A Animal (uses "extends" keyword)
 * 2. METHOD OVERRIDING: Dog customizes makeSound() for its own behavior
 * 3. SUPER: Calls parent class constructor to initialize inherited properties
 * 4. CODE REUSE: eat(), sleep(), move() are inherited - NO need to rewrite!
 */

public class Dog extends Animal {
    
    // ==================== DOG-SPECIFIC PROPERTIES ====================
    // These are unique to Dog, not shared with other animals
    
    private String breed;           // What breed of dog?
    private boolean isPlayful;      // Is this dog playful?
    private int trainingLevel;      // How well is the dog trained? (0-100)
    
    
    // ==================== DOG CONSTRUCTOR ====================
    /**
     * Constructor for Dog
     * Calls super() to initialize the inherited properties (name, age, energyLevel)
     * Then initializes dog-specific properties
     */
    public Dog(String name, int age, String breed) {
        super(name, age);           // Call parent constructor to set name and age
        this.breed = breed;
        this.isPlayful = true;      // Dogs start out playful
        this.trainingLevel = 0;     // Dogs start untrained
    }
    
    
    // ==================== OVERRIDDEN METHODS ====================
    // These methods provide DOG-SPECIFIC behavior while using parent functionality
    
    /**
     * METHOD OVERRIDE: makeSound()
     * The Dog class provides its own implementation of makeSound()
     * This overrides the generic version from Animal
     */
    @Override  // This annotation helps catch errors if we misspell the method name
    public void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
    
    /**
     * METHOD OVERRIDE: eat()
     * Dogs are eager eaters! They gain energy faster and get more excited
     * This shows how child classes can modify inherited behavior
     */
    @Override
    public void eat(double foodAmount) {
        // Dogs eat with enthusiasm - bonus energy!
        super.eat(foodAmount);  // Call parent's eat method
        
        // Add dog-specific behavior
        if (isPlayful) {
            System.out.println(name + " is wagging its tail happily!");
            energyLevel += 10;  // Extra bonus for playful dogs
        }
    }
    
    /**
     * METHOD OVERRIDE: sleep()
     * Dogs need more sleep than other animals to stay healthy
     * This shows how to enhance inherited methods
     */
    @Override
    public void sleep(int hours) {
        // Dogs need more rest
        super.sleep(hours);  // Call parent's sleep method
        
        // Add extra behavior specific to dogs
        System.out.println(name + " had a good dog nap. Feeling refreshed!");
    }
    
    /**
     * METHOD OVERRIDE: move()
     * Dogs are energetic - they use less energy when moving!
     * This shows how to make methods more efficient for specific types
     */
    @Override
    public void move(int distance) {
        // Dogs are built for moving! They use less energy
        double energyUsed = distance * 0.3;  // Dogs use only 0.3 energy per unit (vs 0.5)
        
        if (energyLevel >= energyUsed) {
            energyLevel -= energyUsed;
            System.out.println(name + " (Dog) ran " + distance + " units. Energy used: " + 
                             energyUsed + ". Remaining energy: " + energyLevel);
        } else {
            System.out.println(name + " is too tired to run!");
        }
    }
    
    /**
     * METHOD OVERRIDE: displayStatus()
     * Shows dog-specific information in addition to inherited information
     */
    @Override
    public void displayStatus() {
        super.displayStatus();  // Call parent's displayStatus first
        
        // Add dog-specific information
        System.out.println("Breed: " + breed);
        System.out.println("Training Level: " + trainingLevel + "/100");
        System.out.println("Playful: " + (isPlayful ? "Yes" : "No"));
    }
    
    
    // ==================== DOG-SPECIFIC METHODS ====================
    // These methods are unique to Dog and don't exist in Animal
    
    /**
     * DOG-SPECIFIC: Fetch is something only dogs do!
     * This method uses inherited properties (energyLevel) and methods
     */
    public void fetch(String item) {
        if (energyLevel >= 15) {
            energyLevel -= 15;
            System.out.println(name + " is excitedly fetching the " + item + "!");
            System.out.println("Energy used: 15. Remaining energy: " + energyLevel);
        } else {
            System.out.println(name + " is too tired to fetch right now.");
        }
    }
    
    /**
     * DOG-SPECIFIC: Training a dog to improve its behavior
     * This shows how adding new methods extends functionality
     */
    public void train(int hoursOfTraining) {
        trainingLevel += hoursOfTraining * 10;  // Each hour adds 10 to training level
        
        if (trainingLevel > 100) {
            trainingLevel = 100;
        }
        
        energyLevel -= hoursOfTraining * 5;  // Training uses energy
        System.out.println(name + " has been trained for " + hoursOfTraining + " hours.");
        System.out.println("Training level is now: " + trainingLevel + "/100");
    }
    
    /**
     * DOG-SPECIFIC: Check if the dog is well-trained
     */
    public boolean isWellTrained() {
        return trainingLevel >= 70;
    }
    
    /**
     * DOG-SPECIFIC: Set playfulness (this affects dog behavior)
     */
    public void setPlayful(boolean playful) {
        this.isPlayful = playful;
        if (playful) {
            System.out.println(name + " is now in a playful mood!");
        } else {
            System.out.println(name + " is now calm and serious.");
        }
    }
    
    
    // ==================== GETTERS ====================
    
    public String getBreed() {
        return breed;
    }
    
    public int getTrainingLevel() {
        return trainingLevel;
    }
}
