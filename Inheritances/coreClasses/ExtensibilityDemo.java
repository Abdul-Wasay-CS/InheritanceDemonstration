package Inheritances.coreClasses;

/**
 * EXTENSIBILITY_DEMO.java - Showing How Easy It Is To Add New Animals
 * 
 * PURPOSE:
 * This class demonstrates the TRUE POWER of inheritance: extensibility.
 * We didn't need to modify Animal, Dog, Cat, or Bird - we simply created
 * a NEW Fish class that extends Animal. It inherits all common behavior
 * and only implements what's specific to fish.
 * 
 * This is why inheritance is so powerful for real-world applications!
 */

public class ExtensibilityDemo {
    
    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("     EXTENSIBILITY DEMO - Adding New Animal Types");
        System.out.println("========================================================\n");
        
        System.out.println("SCENARIO: A new requirement came in...");
        System.out.println("\"We need to add Fish to our animal system!\"\n");
        
        System.out.println("WITHOUT INHERITANCE:");
        System.out.println("  Step 1: Create FishWithoutInheritance class");
        System.out.println("  Step 2: Copy name, age, energyLevel properties");
        System.out.println("  Step 3: Copy constructor logic");
        System.out.println("  Step 4: Copy eat(), sleep(), move() methods");
        System.out.println("  Step 5: Customize for fish behavior");
        System.out.println("  Step 6: Test everything");
        System.out.println("  Result: 80+ lines of NEW CODE, most of which is DUPLICATION\n");
        
        System.out.println("WITH INHERITANCE:");
        System.out.println("  Step 1: Create Fish class extending Animal");
        System.out.println("  Step 2: Override makeSound(), eat(), move()");
        System.out.println("  Step 3: Add fish-specific methods");
        System.out.println("  That's it! eat(), sleep(), move() work automatically!");
        System.out.println("  Result: ~60 lines of NEW CODE, NO DUPLICATION\n");
        
        System.out.println("TIME SAVED: ~30% faster development\n");
        
        // ====================================
        // CREATE AND DEMONSTRATE FISH
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Creating Fish and Using Inherited Methods");
        System.out.println("=".repeat(50) + "\n");
        
        Fish myFish = new Fish("Nemo", 1, "Saltwater");
        
        System.out.println("Notice: Fish inherited from Animal!");
        System.out.println("  ✓ name, age, energyLevel (inherited)");
        System.out.println("  ✓ eat(), sleep(), move() (inherited)");
        System.out.println("  ✓ getters/setters (inherited)");
        System.out.println("  + PLUS fish-specific methods (dive, blowBubbles, joinSchool)\n");
        
        System.out.println("--- Fish Using Inherited Methods ---\n");
        myFish.makeSound();
        myFish.eat(10);
        myFish.sleep(8);
        myFish.move(100);
        
        System.out.println("\n--- Fish Using Its Own Methods ---\n");
        myFish.dive(200);
        myFish.blowBubbles();
        myFish.joinSchool();
        
        myFish.displayStatus();
        
        
        // ====================================
        // POLYMORPHIC ARRAY - ALL ANIMALS
        // ====================================
        System.out.println("\n\n" + "=".repeat(50));
        System.out.println("Polymorphism: All Animals in One Collection");
        System.out.println("=".repeat(50) + "\n");
        
        // Create all animals
        Dog dog = new Dog("Rex", 5, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 3, "Orange");
        Bird bird = new Bird("Tweety", 2, "Sparrow", 0.5);
        Fish fish = new Fish("Nemo", 1, "Saltwater");
        
        // Put them ALL in one array!
        Animal[] animals = { dog, cat, bird, fish };
        
        System.out.println("All animals stored in Animal[] array:\n");
        
        for (Animal animal : animals) {
            System.out.println("--- " + animal.getName() + " ---");
            animal.makeSound();
            animal.move(100);
            System.out.println();
        }
        
        System.out.println("Notice:");
        System.out.println("  • Each animal inherited from Animal");
        System.out.println("  • All can be stored in same array");
        System.out.println("  • Same method calls produce different results");
        System.out.println("  • Add new animal? Just extends Animal and add to array!\n");
        
        
        // ====================================
        // CODE COMPARISON
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Code Statistics: How Extensibility Saves Code");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("INITIAL SETUP (Animal + Dog, Cat, Bird):");
        System.out.println("  • Animal: ~100 lines");
        System.out.println("  • Dog: ~130 lines");
        System.out.println("  • Cat: ~135 lines");
        System.out.println("  • Bird: ~160 lines");
        System.out.println("  TOTAL: ~525 lines\n");
        
        System.out.println("ADDING FISH (new animal):");
        System.out.println("  • Fish: ~60 lines");
        System.out.println("  • No changes to Animal, Dog, Cat, or Bird");
        System.out.println("  NEW TOTAL: ~585 lines");
        System.out.println("  INCREASE: Only 60 lines (11% more)\n");
        
        System.out.println("IF WE ADDED FISH WITHOUT INHERITANCE:");
        System.out.println("  • FishWithoutInheritance: ~80 lines (DUPLICATED code)");
        System.out.println("  • Would need to modify existing Dog, Cat, Bird if they");
        System.out.println("    had any common methods we want to update");
        System.out.println("  INCREASE: 80+ lines (15% more) PLUS maintenance burden\n");
        
        
        // ====================================
        // FUTURE-PROOFING
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("Future-Proofing: Adding Even More Animals");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Want to add more animals? SUPER EASY:");
        System.out.println();
        System.out.println("  public class Lion extends Animal {");
        System.out.println("    // Specific lion properties");
        System.out.println("    private boolean isPride;");
        System.out.println("    ");
        System.out.println("    @Override");
        System.out.println("    public void makeSound() {");
        System.out.println("      System.out.println(name + \" roars!\");");
        System.out.println("    }");
        System.out.println("    ");
        System.out.println("    // Add lion-specific methods...");
        System.out.println("  }\n");
        
        System.out.println("  public class Elephant extends Animal {");
        System.out.println("    // Specific elephant properties");
        System.out.println("    private double tuskLength;");
        System.out.println("    ");
        System.out.println("    @Override");
        System.out.println("    public void makeSound() {");
        System.out.println("      System.out.println(name + \" trumpets!\");");
        System.out.println("    }");
        System.out.println("    ");
        System.out.println("    // Add elephant-specific methods...");
        System.out.println("  }\n");
        
        System.out.println("That's it! Each new animal:");
        System.out.println("  ✓ Inherits all common functionality");
        System.out.println("  ✓ Only implements what's unique");
        System.out.println("  ✓ Works with all existing code (polymorphism)");
        System.out.println("  ✓ Can be added to the Animal[] array\n");
        
        
        // ====================================
        // KEY TAKEAWAY
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("KEY TAKEAWAY");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("Inheritance provides:\n");
        System.out.println("1. REUSABILITY");
        System.out.println("   Code defined once in Animal, used by all animals\n");
        System.out.println("2. MAINTAINABILITY");
        System.out.println("   Update Animal → update affects all animals\n");
        System.out.println("3. EXTENSIBILITY");
        System.out.println("   Add Fish, Lion, Elephant easily without touching existing code\n");
        System.out.println("4. FLEXIBILITY");
        System.out.println("   Treat all animals uniformly through Animal interface\n");
        System.out.println("5. SCALABILITY");
        System.out.println("   System grows cleanly as new animal types are added\n");
        
        System.out.println("This is what makes OOP (Object-Oriented Programming) powerful!");
        System.out.println("This is why professional programmers use inheritance!\n");
        
        System.out.println("========================================================");
        System.out.println("        EXTENSIBILITY MASTERED!");
        System.out.println("========================================================");
    }
}
