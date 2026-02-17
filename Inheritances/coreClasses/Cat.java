package Inheritances.coreClasses;

/**
 * CAT.JAVA - Another Child Class Inheriting from Animal
 * 
 * PURPOSE:
 * This shows that multiple classes can inherit from the SAME parent class.
 * Cat and Dog both extend Animal, but they behave differently.
 * This demonstrates how inheritance creates a hierarchy where common
 * functionality (in Animal) is reused, but specific behaviors vary.
 * 
 * KEY CONCEPTS:
 * 1. MULTIPLE CHILDREN: Both Dog and Cat extend Animal (no code duplication)
 * 2. DIFFERENT BEHAVIORS: Cat overrides methods differently than Dog
 * 3. POLYMORPHISM: Same method name, different behavior per class
 * 4. EFFICIENCY: Shared code in Animal, unique code in Cat
 */

public class Cat extends Animal {
    
    // ==================== CAT-SPECIFIC PROPERTIES ====================
    
    private String color;           // What color is the cat?
    private int independenceLevel;  // How independent is the cat? (0-100)
    private int affectionLevel;     // How affectionate is the cat? (0-100)
    private boolean isHunting;      // Is the cat in hunting mode?
    
    
    // ==================== CAT CONSTRUCTOR ====================
    /**
     * Constructor for Cat
     * Inherits name and age through parent, adds cat-specific properties
     */
    public Cat(String name, int age, String color) {
        super(name, age);           // Initialize inherited properties
        this.color = color;
        this.independenceLevel = 50;  // Cats start moderately independent
        this.affectionLevel = 30;     // Cats start somewhat aloof
        this.isHunting = false;
    }
    
    
    // ==================== OVERRIDDEN METHODS ====================
    
    /**
     * METHOD OVERRIDE: makeSound()
     * Cats have their own unique sound
     */
    @Override
    public void makeSound() {
        if (affectionLevel > 50) {
            System.out.println(name + " says: Purrrrrr...");
        } else {
            System.out.println(name + " says: Meow!");
        }
    }
    
    /**
     * METHOD OVERRIDE: eat()
     * Cats are picky eaters - they eat less but efficiently
     * This is totally different from how dogs eat
     */
    @Override
    public void eat(double foodAmount) {
        // Cats eat less than dogs but are very efficient
        double catFoodAmount = foodAmount * 0.7;  // Cats eat 70% of what's offered
        
        super.eat(catFoodAmount);  // Call parent's eat method
        
        // Add cat-specific behavior
        if (isHunting) {
            System.out.println(name + " is still feeling the urge to hunt!");
        } else {
            System.out.println(name + " licked its whiskers clean. Perfect!");
        }
    }
    
    /**
     * METHOD OVERRIDE: move()
     * Cats are agile and use energy differently than dogs
     * Cats are built for precision, not endurance
     */
    @Override
    public void move(int distance) {
        // Cats are very efficient movers - use minimal energy
        double energyUsed = distance * 0.2;  // Even more efficient than dogs! (0.2 vs 0.5)
        
        if (energyLevel >= energyUsed) {
            energyLevel -= energyUsed;
            System.out.println(name + " (Cat) gracefully moved " + distance + " units. Energy used: " + 
                             energyUsed + ". Remaining energy: " + energyLevel);
        } else {
            System.out.println(name + " is too tired to move gracefully.");
        }
    }
    
    /**
     * METHOD OVERRIDE: sleep()
     * Cats need LOTS of sleep - they're famous for it!
     */
    @Override
    public void sleep(int hours) {
        // Cats sleep much more and get more energy back
        double sleepBonus = hours * 15;  // Cats get more energy from sleep (vs 8 for generic animals)
        energyLevel += sleepBonus;
        
        if (energyLevel > 100.0) {
            energyLevel = 100.0;
        }
        
        System.out.println(name + " took a long cat nap for " + hours + " hours (Cats need lots of sleep!)");
        System.out.println("Energy restored to: " + energyLevel);
    }
    
    /**
     * METHOD OVERRIDE: displayStatus()
     * Shows cat-specific information
     */
    @Override
    public void displayStatus() {
        super.displayStatus();  // Call parent's version first
        
        // Add cat-specific information
        System.out.println("Color: " + color);
        System.out.println("Independence Level: " + independenceLevel + "/100");
        System.out.println("Affection Level: " + affectionLevel + "/100");
        System.out.println("Hunting Mode: " + (isHunting ? "Active" : "Inactive"));
    }
    
    
    // ==================== CAT-SPECIFIC METHODS ====================
    // Only cats can do these things!
    
    /**
     * CAT-SPECIFIC: Hunting is a unique cat behavior
     * This uses inherited energyLevel but adds cat-specific logic
     */
    public void hunt(String prey) {
        if (energyLevel >= 20) {
            isHunting = true;
            energyLevel -= 20;
            System.out.println(name + " is hunting " + prey + " with intensity!");
            System.out.println("Energy used: 20. Remaining energy: " + energyLevel);
            
            // Make hunting sound
            makeSound();
        } else {
            System.out.println(name + " is too tired to hunt right now.");
        }
    }
    
    /**
     * CAT-SPECIFIC: Scratching furniture (classic cat behavior!)
     * This shows how unique cat behaviors can use inherited properties
     */
    public void scratch(String item) {
        energyLevel -= 5;
        independenceLevel += 10;  // Scratching helps cats feel more independent
        
        System.out.println(name + " is scratching the " + item + " vigorously!");
        System.out.println("Independence increased. Independence level: " + independenceLevel + "/100");
    }
    
    /**
     * CAT-SPECIFIC: Purring (only cats purr!)
     * This is unique behavior that shows affection
     */
    public void purr() {
        if (affectionLevel >= 40) {
            System.out.println(name + " is purring loudly: Purrrrrrr... This feels nice!");
        } else {
            System.out.println(name + " refuses to purr right now. Too aloof.");
        }
    }
    
    /**
     * CAT-SPECIFIC: Pet interaction
     * Cats respond to petting based on their affection level
     */
    public void petCat() {
        if (affectionLevel >= 60) {
            System.out.println(name + " purrs and rubs against you!");
            affectionLevel += 5;
        } else if (affectionLevel >= 30) {
            System.out.println(name + " tolerates your petting.");
            affectionLevel += 2;
        } else {
            System.out.println(name + " swipes at you! Too aloof right now!");
            affectionLevel -= 5;
        }
    }
    
    /**
     * CAT-SPECIFIC: Increase affection through playtime
     * Shows how specific behaviors affect cat state
     */
    public void playWithCat(int minutes) {
        if (energyLevel >= 15) {
            energyLevel -= 15;
            affectionLevel += (minutes * 2);  // Playtime builds affection
            isHunting = false;  // Stop hunting mode
            
            if (affectionLevel > 100) {
                affectionLevel = 100;
            }
            
            System.out.println(name + " played with you for " + minutes + " minutes!");
            System.out.println("Affection level increased to: " + affectionLevel + "/100");
        } else {
            System.out.println(name + " is too tired to play.");
        }
    }
    
    /**
     * CAT-SPECIFIC: Stop hunting mode
     */
    public void stopHunting() {
        isHunting = false;
        System.out.println(name + " has stopped hunting.");
    }
    
    
    // ==================== GETTERS ====================
    
    public String getColor() {
        return color;
    }
    
    public int getIndependenceLevel() {
        return independenceLevel;
    }
    
    public int getAffectionLevel() {
        return affectionLevel;
    }
}
