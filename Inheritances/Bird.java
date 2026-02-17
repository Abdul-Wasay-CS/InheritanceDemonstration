package Inheritances;

/**
 * BIRD.JAVA - Third Child Class Inheriting from Animal
 * 
 * PURPOSE:
 * This demonstrates how VERY DIFFERENT animals can still inherit from
 * the same parent class. While Dog and Cat are similar, Bird is quite different
 * with flying abilities. Yet they all share common Animal properties!
 * 
 * KEY CONCEPTS:
 * 1. FLEXIBILITY: Parent class (Animal) is general enough for diverse children
 * 2. EXTENSION: Bird adds flying-specific behavior while inheriting walk/eat
 * 3. CODE REUSE: eat(), sleep(), displayStatus() still work for birds
 * 4. POLYMORPHISM: move() behaves completely different for birds (flying!)
 */

public class Bird extends Animal {
    
    // ==================== BIRD-SPECIFIC PROPERTIES ====================
    
    private String species;         // What species of bird?
    private double wingSpan;        // How large are the wings?
    private int altitude;           // Current flying altitude
    private boolean canFly;         // Can this bird fly?
    
    
    // ==================== BIRD CONSTRUCTOR ====================
    /**
     * Constructor for Bird
     * Inherits basic animal properties, adds bird-specific features
     */
    public Bird(String name, int age, String species, double wingSpan) {
        super(name, age);           // Initialize inherited properties
        this.species = species;
        this.wingSpan = wingSpan;
        this.altitude = 0;          // Birds start on the ground
        this.canFly = true;         // Most birds can fly
    }
    
    
    // ==================== OVERRIDDEN METHODS ====================
    
    /**
     * METHOD OVERRIDE: makeSound()
     * Birds have unique vocalizations
     */
    @Override
    public void makeSound() {
        if (species.equalsIgnoreCase("parrot")) {
            System.out.println(name + " says: Squawk! Squawk!");
        } else if (species.equalsIgnoreCase("owl")) {
            System.out.println(name + " says: Hoot! Hoot!");
        } else if (species.equalsIgnoreCase("sparrow")) {
            System.out.println(name + " says: Tweet! Tweet!");
        } else {
            System.out.println(name + " makes a bird call: Chirp!");
        }
    }
    
    /**
     * METHOD OVERRIDE: eat()
     * Birds peck at food - different eating behavior
     */
    @Override
    public void eat(double foodAmount) {
        // Birds eat very little but frequently
        double birdFoodAmount = foodAmount * 0.3;  // Birds eat only 30% of offered food
        
        super.eat(birdFoodAmount);  // Use parent's eat method
        
        // Add bird-specific behavior
        System.out.println(name + " pecked at the food delicately. Yum!");
    }
    
    /**
     * METHOD OVERRIDE: move()
     * THIS IS KEY: For birds, "move" means FLY, not walk!
     * This shows how child classes can completely redefine inherited behavior
     */
    @Override
    public void move(int distance) {
        // Birds primarily fly - much more efficient than walking
        double energyUsed = distance * 0.15;  // Flying uses minimal energy!!!
        
        if (energyLevel >= energyUsed && canFly) {
            energyLevel -= energyUsed;
            altitude = 150;  // Flying at moderate altitude
            System.out.println(name + " (Bird) flew " + distance + " units. Energy used: " + 
                             energyUsed + ". Current altitude: " + altitude + " feet");
        } else if (!canFly) {
            System.out.println(name + " can't fly. Must walk instead (uses more energy).");
            // Fall back to walking like a normal animal
            super.move(distance);
        } else {
            System.out.println(name + " is too tired to fly!");
        }
    }
    
    /**
     * METHOD OVERRIDE: displayStatus()
     * Shows bird-specific status information
     */
    @Override
    public void displayStatus() {
        super.displayStatus();  // Call parent version
        
        // Add bird-specific information
        System.out.println("Species: " + species);
        System.out.println("Wing Span: " + wingSpan + " feet");
        System.out.println("Current Altitude: " + altitude + " feet");
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }
    
    
    // ==================== BIRD-SPECIFIC METHODS ====================
    // These are unique to birds!
    
    /**
     * BIRD-SPECIFIC: Fly to a specific altitude
     * Shows how birds use energy differently when flying
     */
    public void flyToAltitude(int targetAltitude) {
        if (!canFly) {
            System.out.println(name + " cannot fly!");
            return;
        }
        
        // Calculate energy needed to climb
        int altitudeDifference = Math.abs(targetAltitude - altitude);
        double energyNeeded = altitudeDifference * 0.1;
        
        if (energyLevel >= energyNeeded) {
            energyLevel -= energyNeeded;
            altitude = targetAltitude;
            System.out.println(name + " flew to altitude: " + altitude + " feet");
            System.out.println("Energy used: " + energyNeeded + ". Remaining: " + energyLevel);
        } else {
            System.out.println(name + " doesn't have enough energy to reach that altitude!");
        }
    }
    
    /**
     * BIRD-SPECIFIC: Perch on something
     * Birds land and rest on branches
     */
    public void perch() {
        altitude = 0;
        System.out.println(name + " has perched on a branch and is resting.");
        energyLevel += 10;  // Perching restores a little energy
        
        if (energyLevel > 100) {
            energyLevel = 100;
        }
    }
    
    /**
     * BIRD-SPECIFIC: Build a nest
     * Only birds can do this!
     */
    public void buildNest() {
        if (energyLevel >= 25) {
            energyLevel -= 25;
            System.out.println(name + " is building a nest. Hard work!");
            System.out.println("Energy used: 25. Remaining: " + energyLevel);
        } else {
            System.out.println(name + " is too tired to build a nest right now.");
        }
    }
    
    /**
     * BIRD-SPECIFIC: Sing beautifully
     * Some birds are known for their songs
     */
    public void sing() {
        System.out.println(name + " is singing a beautiful melody: ");
        for (int i = 0; i < 3; i++) {
            makeSound();
        }
    }
    
    /**
     * BIRD-SPECIFIC: Soar through the sky
     * This is a graceful flying movement that preserves energy
     */
    public void soar(int duration) {
        if (!canFly) {
            System.out.println(name + " cannot soar - cannot fly!");
            return;
        }
        
        if (energyLevel >= 5) {
            // Soaring uses very little energy - birds let wind currents carry them
            double energyUsed = duration * 0.2;
            energyLevel -= energyUsed;
            altitude = 500;
            
            System.out.println(name + " is soaring gracefully on thermal currents at " + 
                             altitude + " feet for " + duration + " seconds");
            System.out.println("Energy used: " + energyUsed + ". Remaining: " + energyLevel);
        } else {
            System.out.println(name + " is too tired to soar.");
        }
    }
    
    /**
     * BIRD-SPECIFIC: Preen feathers
     * Birds spend time maintaining their feathers
     */
    public void preenFeathers() {
        System.out.println(name + " is preening its feathers to keep them clean and strong.");
        energyLevel -= 5;
        System.out.println("Feathers are now pristine!");
    }
    
    /**
     * BIRD-SPECIFIC: Injury affecting flight ability
     */
    public void injureWing() {
        canFly = false;
        System.out.println(name + " has injured its wing and cannot fly!");
    }
    
    /**
     * BIRD-SPECIFIC: Recover from injury
     */
    public void healWing() {
        canFly = true;
        System.out.println(name + "'s wing has healed! Can fly again!");
    }
    
    
    // ==================== GETTERS ====================
    
    public String getSpecies() {
        return species;
    }
    
    public double getWingSpan() {
        return wingSpan;
    }
    
    public int getAltitude() {
        return altitude;
    }
    
    public boolean canFly() {
        return canFly;
    }
}
