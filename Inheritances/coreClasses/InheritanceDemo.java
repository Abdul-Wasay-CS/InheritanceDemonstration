package Inheritances.coreClasses;

/**
 * INHERITANCEDEMO.JAVA - Comprehensive Demonstration of Inheritance
 * 
 * PURPOSE:
 * This class demonstrates how inheritance works in practice by:
 * 1. Creating different animal types (Dog, Cat, Bird)
 * 2. Showing how they inherit common methods from Animal
 * 3. Showing how they override methods for specific behavior
 * 4. Showing how they add their own unique methods
 * 5. Comparing code efficiency with and without inheritance
 * 
 * KEY LEARNING POINTS:
 * - Inheritance reduces code duplication dramatically
 * - Parent classes provide a stable foundation
 * - Child classes customize behavior through overriding
 * - Polymorphism allows treating different objects uniformly
 * - Inheritance creates maintainable, scalable code
 */

public class InheritanceDemo {
    
    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("     INHERITANCE DEMONSTRATION - HOW IT WORKS");
        System.out.println("========================================================\n");
        
        // ====================================
        // SECTION 1: CREATE ANIMAL OBJECTS
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SECTION 1: CREATING DIFFERENT ANIMALS");
        System.out.println("=".repeat(50) + "\n");
        
        // Create a dog
        Dog myDog = new Dog("Rex", 5, "Golden Retriever");
        
        // Create a cat
        Cat myCat = new Cat("Whiskers", 3, "Orange");
        
        // Create a bird
        Bird myBird = new Bird("Tweety", 2, "Sparrow", 0.5);
        
        System.out.println("\n✓ Created 3 different animals by extending Animal class\n");
        
        
        // ====================================
        // SECTION 2: INHERITED METHODS
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SECTION 2: INHERITED METHODS (From Animal)");
        System.out.println("ALL ANIMALS INHERIT: eat(), sleep(), move(), displayStatus()");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("--- DOG INHERITED BEHAVIOR ---");
        myDog.makeSound();
        myDog.eat(20);
        myDog.sleep(8);
        myDog.move(100);
        
        System.out.println("\n--- CAT INHERITED BEHAVIOR ---");
        myCat.makeSound();
        myCat.eat(15);
        myCat.sleep(10);
        myCat.move(50);
        
        System.out.println("\n--- BIRD INHERITED BEHAVIOR ---");
        myBird.makeSound();
        myBird.eat(5);
        myBird.sleep(6);
        myBird.move(200);  // Birds fly with move()!
        
        System.out.println("\n" + "Note: Each animal inherited the SAME methods from Animal,");
        System.out.println("but behaves DIFFERENTLY based on overridden implementations!\n");
        
        
        // ====================================
        // SECTION 3: METHOD OVERRIDING
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SECTION 3: METHOD OVERRIDING (Customized Behavior)");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("--- EXAMPLE: THE move() METHOD ---\n");
        System.out.println("All animals inherit move(), but each behaves differently:\n");
        
        System.out.println("Dog move():");
        myDog.move(100);
        System.out.println("Energy used: 100 * 0.3 = 30 (Dogs are energetic!)");
        
        System.out.println("\nCat move():");
        myCat.move(100);
        System.out.println("Energy used: 100 * 0.2 = 20 (Cats are agile!)");
        
        System.out.println("\nBird move():");
        myBird.move(100);
        System.out.println("Energy used: 100 * 0.15 = 15 (Birds fly efficiently!)");
        
        System.out.println("\n→ SAME method name, DIFFERENT implementations!");
        System.out.println("→ This is POLYMORPHISM - a key benefit of inheritance\n");
        
        
        // ====================================
        // SECTION 4: CHILD-SPECIFIC METHODS
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SECTION 4: CHILD-SPECIFIC METHODS (Unique Behaviors)");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("--- DOG-SPECIFIC METHODS ---");
        myDog.setPlayful(true);
        myDog.fetch("tennis ball");
        myDog.train(2);
        if (myDog.isWellTrained()) {
            System.out.println(myDog.getName() + " is well-trained!");
        }
        
        System.out.println("\n--- CAT-SPECIFIC METHODS ---");
        myCat.playWithCat(15);
        myCat.hunt("mouse");
        myCat.purr();
        myCat.scratch("couch");
        
        System.out.println("\n--- BIRD-SPECIFIC METHODS ---");
        myBird.sing();
        myBird.flyToAltitude(300);
        myBird.soar(10);
        myBird.preenFeathers();
        
        System.out.println("\n→ Each class adds UNIQUE methods that only it has");
        System.out.println("→ This shows how inheritance allows EXTENSION without duplication\n");
        
        
        // ====================================
        // SECTION 5: DISPLAY STATUS
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SECTION 5: DISPLAYING COMPLETE STATUS");
        System.out.println("=".repeat(50));
        
        myDog.displayStatus();
        System.out.println();
        myCat.displayStatus();
        System.out.println();
        myBird.displayStatus();
        
        
        // ====================================
        // SECTION 6: CODE EFFICIENCY ANALYSIS
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SECTION 6: CODE EFFICIENCY - INHERITANCE BENEFITS");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("WITHOUT INHERITANCE (Without extending Animal):\n");
        System.out.println("You would need to code in EACH class (Dog, Cat, Bird):");
        System.out.println("  • name property");
        System.out.println("  • age property");
        System.out.println("  • energyLevel property");
        System.out.println("  • Constructor to initialize these");
        System.out.println("  • eat() method");
        System.out.println("  • sleep() method");
        System.out.println("  • move() method");
        System.out.println("  • displayStatus() method");
        System.out.println("  • Getters and setters");
        System.out.println("\nTOTAL: ~200+ lines of DUPLICATED code across 3 classes\n");
        
        System.out.println("WITH INHERITANCE (With Animal parent class):\n");
        System.out.println("Animal class has all common code (~100 lines)");
        System.out.println("Each child class only has UNIQUE code:");
        System.out.println("  • Dog: ~150 lines (dog-specific features)");
        System.out.println("  • Cat: ~150 lines (cat-specific features)");
        System.out.println("  • Bird: ~180 lines (bird-specific features)");
        System.out.println("\nTOTAL: ~100 (Animal) + 480 (children) = 580 lines");
        System.out.println("      vs. ~800+ lines WITHOUT inheritance\n");
        
        System.out.println("SAVINGS: ~200+ lines of code eliminated!");
        System.out.println("BENEFITS: Easier to maintain, update, and extend\n");
        
        
        // ====================================
        // SECTION 7: POLYMORPHISM IN ACTION
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SECTION 7: POLYMORPHISM (Treating different objects uniformly)");
        System.out.println("=".repeat(50) + "\n");
        
        // Array of Animals - works because Dog, Cat, Bird all extend Animal
        Animal[] animals = { myDog, myCat, myBird };
        
        System.out.println("Using an array of 'Animal' objects:\n");
        
        for (Animal animal : animals) {
            System.out.println("--- " + animal.getName() + " ---");
            animal.makeSound();
            animal.move(50);
            animal.displayStatus();
            System.out.println();
        }
        
        System.out.println("→ Each animal's methods behave differently");
        System.out.println("→ Same code calls different implementations");
        System.out.println("→ This is the power of POLYMORPHISM!\n");
        
        
        // ====================================
        // SECTION 8: PRACTICAL BENEFITS
        // ====================================
        System.out.println("\n" + "=".repeat(50));
        System.out.println("SECTION 8: PRACTICAL BENEFITS SUMMARY");
        System.out.println("=".repeat(50) + "\n");
        
        System.out.println("1. CODE REUSABILITY:");
        System.out.println("   - Write once in Animal, use everywhere in children");
        System.out.println("   - eat(), sleep(), move() defined once, inherited by all\n");
        
        System.out.println("2. MAINTAINABILITY:");
        System.out.println("   - Fix a bug in Animal.eat()? Fixed for all animals!");
        System.out.println("   - No need to fix it in 3 different places\n");
        
        System.out.println("3. EXTENSIBILITY:");
        System.out.println("   - Add a new animal? Just extend Animal class");
        System.out.println("   - Override methods as needed, inherit the rest\n");
        
        System.out.println("4. TYPE SAFETY:");
        System.out.println("   - All animals are also Animals");
        System.out.println("   - Can store them in Animal array/list\n");
        
        System.out.println("5. REDUCED BUGS:");
        System.out.println("   - Less duplication = fewer places for bugs to hide");
        System.out.println("   - Changes propagate to all subclasses automatically\n");
        
        System.out.println("6. CLEANER CODE:");
        System.out.println("   - Final class DogWithoutInheritance would be ~150 lines");
        System.out.println("   - But Dog (with inheritance) is only ~130 lines");
        System.out.println("   - And it's much more focused and readable!\n");
        
        
        System.out.println("========================================================");
        System.out.println("     INHERITANCE MASTERY ACHIEVED!");
        System.out.println("========================================================");
    }
}
