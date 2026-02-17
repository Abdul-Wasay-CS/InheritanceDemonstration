package Inheritances.educationalReferences;

/**
 * WITHOUTINHERITANCE.JAVA - Bad Example: What Code Looks Like WITHOUT Inheritance
 * 
 * PURPOSE:
 * This class demonstrates what happens when you DON'T use inheritance.
 * This shows you the MASSIVE code duplication that would occur.
 * By comparing this with the inheritance approach, you'll understand
 * why inheritance is so important for clean, maintainable code.
 * 
 * WARNING: This is intentionally REPETITIVE to show the problem!
 * This is how NOT to write code when multiple classes share common features.
 */

public class WithoutInheritance {
    
    /**
     * DOG WITHOUT INHERITANCE
     * This class has NO parent class - it must define EVERYTHING itself
     */
    public static class DogWithoutInheritance {
        // DUPLICATED: Same properties that would be in Animal class
        private String name;
        private int age;
        private double energyLevel;
        
        // Dog-specific properties
        private String breed;
        private boolean isPlayful;
        private int trainingLevel;
        
        // DUPLICATED Constructor with initialization code
        public DogWithoutInheritance(String name, int age, String breed) {
            this.name = name;
            this.age = age;
            this.energyLevel = 100.0;
            this.breed = breed;
            this.isPlayful = true;
            this.trainingLevel = 0;
        }
        
        // DUPLICATED: eat() method (same logic as Animal but for Dog)
        public void eat(double foodAmount) {
            energyLevel += foodAmount;
            if (energyLevel > 100.0) {
                energyLevel = 100.0;
            }
            System.out.println(name + " is eating " + foodAmount + " units of food.");
            
            // Dog-specific eating behavior
            if (isPlayful) {
                System.out.println(name + " is wagging its tail happily!");
                energyLevel += 10;
            }
        }
        
        // DUPLICATED: sleep() method (same logic as Animal but for Dog)
        public void sleep(int hours) {
            energyLevel += (hours * 8);
            if (energyLevel > 100.0) {
                energyLevel = 100.0;
            }
            System.out.println(name + " slept for " + hours + " hours.");
        }
        
        // DUPLICATED: move() method (with dog-specific logic)
        public void move(int distance) {
            double energyUsed = distance * 0.3;
            if (energyLevel >= energyUsed) {
                energyLevel -= energyUsed;
                System.out.println(name + " ran " + distance + " units.");
            } else {
                System.out.println(name + " is too tired to run!");
            }
        }
        
        // Dog-specific methods
        public void fetch(String item) {
            if (energyLevel >= 15) {
                energyLevel -= 15;
                System.out.println(name + " fetched the " + item + "!");
            }
        }
        
        public void train(int hours) {
            trainingLevel += hours * 10;
            if (trainingLevel > 100) trainingLevel = 100;
            energyLevel -= hours * 5;
        }
    }
    
    
    /**
     * CAT WITHOUT INHERITANCE
     * Again, cat must define ALL properties and methods itself
     * This is a lot of repeated code from DogWithoutInheritance!
     */
    public static class CatWithoutInheritance {
        // DUPLICATED: Same properties again!
        private String name;
        private int age;
        private double energyLevel;
        
        // Cat-specific properties
        private String color;
        private int independenceLevel;
        private int affectionLevel;
        private boolean isHunting;
        
        // DUPLICATED Constructor (similar to Dog)
        public CatWithoutInheritance(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.energyLevel = 100.0;
            this.color = color;
            this.independenceLevel = 50;
            this.affectionLevel = 30;
            this.isHunting = false;
        }
        
        // DUPLICATED: eat() method (different logic than Dog but similar structure)
        public void eat(double foodAmount) {
            // Code repeated from Animal, but adapted for cats
            double catFoodAmount = foodAmount * 0.7;
            energyLevel += catFoodAmount;
            if (energyLevel > 100.0) {
                energyLevel = 100.0;
            }
            System.out.println(name + " is eating " + catFoodAmount + " units of food.");
            
            if (isHunting) {
                System.out.println(name + " is still feeling the urge to hunt!");
            }
        }
        
        // DUPLICATED: sleep() method (cats need more sleep)
        public void sleep(int hours) {
            double sleepBonus = hours * 15;  // Different multiplier for cats
            energyLevel += sleepBonus;
            if (energyLevel > 100.0) {
                energyLevel = 100.0;
            }
            System.out.println(name + " took a long cat nap for " + hours + " hours.");
        }
        
        // DUPLICATED: move() method (cats are more efficient)
        public void move(int distance) {
            double energyUsed = distance * 0.2;  // Different multiplier
            if (energyLevel >= energyUsed) {
                energyLevel -= energyUsed;
                System.out.println(name + " gracefully moved " + distance + " units.");
            } else {
                System.out.println(name + " is too tired to move!");
            }
        }
        
        // Cat-specific methods
        public void hunt(String prey) {
            if (energyLevel >= 20) {
                isHunting = true;
                energyLevel -= 20;
                System.out.println(name + " is hunting " + prey + "!");
            }
        }
        
        public void purr() {
            if (affectionLevel >= 40) {
                System.out.println(name + " is purring loudly!");
            }
        }
    }
    
    
    /**
     * BIRD WITHOUT INHERITANCE
     * And again, we must repeat all the common animal code!
     */
    public static class BirdWithoutInheritance {
        // DUPLICATED: Same properties for the THIRD TIME
        private String name;
        private int age;
        private double energyLevel;
        
        // Bird-specific properties
        private String species;
        private double wingSpan;
        private int altitude;
        private boolean canFly;
        
        // DUPLICATED Constructor (similar pattern to Dog and Cat)
        public BirdWithoutInheritance(String name, int age, String species, double wingSpan) {
            this.name = name;
            this.age = age;
            this.energyLevel = 100.0;
            this.species = species;
            this.wingSpan = wingSpan;
            this.altitude = 0;
            this.canFly = true;
        }
        
        // DUPLICATED: eat() method (for birds)
        public void eat(double foodAmount) {
            double birdFoodAmount = foodAmount * 0.3;
            energyLevel += birdFoodAmount;
            if (energyLevel > 100.0) {
                energyLevel = 100.0;
            }
            System.out.println(name + " pecked at the food.");
        }
        
        // DUPLICATED: sleep() method (could be generic or bird-specific)
        public void sleep(int hours) {
            energyLevel += (hours * 8);
            if (energyLevel > 100.0) {
                energyLevel = 100.0;
            }
            System.out.println(name + " slept for " + hours + " hours.");
        }
        
        // DUPLICATED: move() method (but birds fly!)
        public void move(int distance) {
            double energyUsed = distance * 0.15;
            if (energyLevel >= energyUsed && canFly) {
                energyLevel -= energyUsed;
                altitude = 150;
                System.out.println(name + " flew " + distance + " units.");
            } else {
                System.out.println(name + " can't fly right now!");
            }
        }
        
        // Bird-specific methods
        public void flyToAltitude(int targetAltitude) {
            int altitudeDifference = Math.abs(targetAltitude - altitude);
            double energyNeeded = altitudeDifference * 0.1;
            
            if (energyLevel >= energyNeeded) {
                energyLevel -= energyNeeded;
                altitude = targetAltitude;
                System.out.println(name + " flew to altitude: " + altitude + " feet");
            }
        }
        
        public void sing() {
            System.out.println(name + " is singing a beautiful song!");
        }
    }
    
    
    // ====================================
    // DEMONSTRATION
    // ====================================
    
    public static void main(String[] args) {
        System.out.println("========================================================");
        System.out.println("  WITHOUT INHERITANCE - The Problems This Approach Has");
        System.out.println("========================================================\n");
        
        // Create objects without inheritance
        DogWithoutInheritance dog = new DogWithoutInheritance("Rex", 5, "Golden Retriever");
        CatWithoutInheritance cat = new CatWithoutInheritance("Whiskers", 3, "Orange");
        BirdWithoutInheritance bird = new BirdWithoutInheritance("Tweety", 2, "Sparrow", 0.5);
        
        System.out.println("PROBLEM 1: CODE DUPLICATION");
        System.out.println("Notice: name, age, and energyLevel are defined in EACH class");
        System.out.println("Without inheritance, we repeat this for Dog, Cat, Bird (and any new animal)");
        System.out.println();
        
        System.out.println("PROBLEM 2: eat(), sleep(), move() are implemented similarly");
        System.out.println("The logic is basically the same, but repeated 3+ times");
        System.out.println();
        
        System.out.println("PROBLEM 3: Maintenance Nightmare");
        System.out.println("Example: You discover a bug in the eat() method");
        System.out.println("WITHOUT inheritance:");
        System.out.println("  - Fix DogWithoutInheritance.eat()");
        System.out.println("  - Fix CatWithoutInheritance.eat()");
        System.out.println("  - Fix BirdWithoutInheritance.eat()");
        System.out.println("  - Fix every other animal class eat() method");
        System.out.println("WITH inheritance:");
        System.out.println("  - Fix Animal.eat() ONCE");
        System.out.println("  - All animals automatically have the fix!");
        System.out.println();
        
        System.out.println("PROBLEM 4: Inconsistency Risk");
        System.out.println("Copying code to multiple places means:");
        System.out.println("  - One class might have outdated logic");
        System.out.println("  - Different implementations of the same thing");
        System.out.println("  - Hard to debug which version is correct");
        System.out.println();
        
        System.out.println("PROBLEM 5: Adding New Animals is Expensive");
        System.out.println("Want to add a Fish class? You must:");
        System.out.println("  - Copy name, age, energyLevel properties");
        System.out.println("  - Copy eat(), sleep(), move() methods");
        System.out.println("  - Customize them for fish behavior");
        System.out.println("  - That's ~80+ lines just to maintain common functionality!");
        System.out.println();
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("CODE COMPARISON:");
        System.out.println("=".repeat(50));
        System.out.println("\nWithout Inheritance Total Lines of Code:");
        System.out.println("  - DogWithoutInheritance: ~70 lines");
        System.out.println("  - CatWithoutInheritance: ~75 lines");
        System.out.println("  - BirdWithoutInheritance: ~80 lines");
        System.out.println("  - TOTAL: ~225 lines (!!!)\n");
        
        System.out.println("With Inheritance Total Lines of Code:");
        System.out.println("  - Animal (parent): ~100 lines");
        System.out.println("  - Dog: ~130 lines");
        System.out.println("  - Cat: ~135 lines");
        System.out.println("  - Bird: ~160 lines");
        System.out.println("  - TOTAL: ~525 lines\n");
        
        System.out.println("BUT: The inheritance version has:");
        System.out.println("  - Better code organization");
        System.out.println("  - Much less code duplication (eliminated ~200+ lines of duplication)");
        System.out.println("  - Better maintainability");
        System.out.println("  - More features in each class");
        System.out.println("  - Easier to extend with new animals\n");
        
        System.out.println("SOLUTION: USE INHERITANCE!");
        System.out.println("This is exactly why the InheritanceDemo classes use inheritance.");
    }
}
