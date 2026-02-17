package Inheritances;

/**
 * INHERITANCE_CHEAT_SHEET.java - Quick Reference Guide
 * 
 * PURPOSE:
 * A quick reference guide to all inheritance concepts demonstrated in this package.
 * Use this as a study reference or quick lookup guide.
 */

public class InheritanceCheatSheet {
    
    public static void main(String[] args) {
        printCheatSheet();
    }
    
    private static void printCheatSheet() {
        System.out.println("\n" + "═".repeat(70));
        System.out.println("           INHERITANCE - QUICK REFERENCE GUIDE");
        System.out.println("═".repeat(70) + "\n");
        
        printSyntax();
        printKeywords();
        printAccessModifiers();
        printMethodOverriding();
        printCommonMistakes();
        printChecklist();
    }
    
    private static void printSyntax() {
        System.out.println("\n" + "┌" + "─".repeat(68) + "┐");
        System.out.println("│ 1. BASIC SYNTAX                                                    │");
        System.out.println("└" + "─".repeat(68) + "┘\n");
        
        System.out.println("Creating a Parent Class:");
        System.out.println("  public class Animal {");
        System.out.println("    protected String name;");
        System.out.println("    protected int age;");
        System.out.println("    ");
        System.out.println("    public Animal(String name, int age) {");
        System.out.println("      this.name = name;");
        System.out.println("      this.age = age;");
        System.out.println("    }");
        System.out.println("    ");
        System.out.println("    public void eat() { /* ... */ }");
        System.out.println("  }\n");
        
        System.out.println("Creating a Child Class:");
        System.out.println("  public class Dog extends Animal {     // ← EXTEND parent");
        System.out.println("    private String breed;              // ← Own property");
        System.out.println("    ");
        System.out.println("    public Dog(String name, int age, String breed) {");
        System.out.println("      super(name, age);                 // ← Call parent constructor");
        System.out.println("      this.breed = breed;");
        System.out.println("    }");
        System.out.println("    ");
        System.out.println("    @Override                           // ← Mark as override");
        System.out.println("    public void eat() {");
        System.out.println("      super.eat();                      // ← Call parent method");
        System.out.println("      // Add dog-specific behavior");
        System.out.println("    }");
        System.out.println("  }\n");
    }
    
    private static void printKeywords() {
        System.out.println("\n" + "┌" + "─".repeat(68) + "┐");
        System.out.println("│ 2. KEY KEYWORDS                                                    │");
        System.out.println("└" + "─".repeat(68) + "┘\n");
        
        System.out.println("EXTENDS");
        System.out.println("  Used to: Create inheritance relationship (IS-A)");
        System.out.println("  Syntax: public class Child extends Parent { }");
        System.out.println("  Example in code: class Dog extends Animal { }\n");
        
        System.out.println("SUPER");
        System.out.println("  Used to: Call parent class constructor or method");
        System.out.println("  Syntax 1: super(parameters);  // Call parent constructor");
        System.out.println("  Syntax 2: super.method();     // Call parent method");
        System.out.println("  Example in code:");
        System.out.println("    super(name, age);           // Lines up with Animal constructor");
        System.out.println("    super.eat(amount);          // Use parent eat logic first\n");
        
        System.out.println("@OVERRIDE");
        System.out.println("  Used to: Mark that you're overriding a parent method");
        System.out.println("  Optional but HIGHLY RECOMMENDED");
        System.out.println("  Helps catch errors if method name is wrong");
        System.out.println("  Example in code:");
        System.out.println("    @Override");
        System.out.println("    public void makeSound() { }\n");
        
        System.out.println("PROTECTED");
        System.out.println("  Used to: Make properties/methods accessible to child classes");
        System.out.println("  Syntax: protected Type name;");
        System.out.println("  Example in code: protected String name;  // Can access in Dog\n");
    }
    
    private static void printAccessModifiers() {
        System.out.println("\n" + "┌" + "─".repeat(68) + "┐");
        System.out.println("│ 3. ACCESS MODIFIERS FOR INHERITANCE                               │");
        System.out.println("└" + "─".repeat(68) + "┘\n");
        
        System.out.println("Deciding Which Modifier to Use:\n");
        
        System.out.println("  USE PROTECTED for:");
        System.out.println("    ✓ Properties that child classes need to modify");
        System.out.println("    ✓ Methods that child classes should override");
        System.out.println("    Example: protected String name;  // Dog can use this\n");
        
        System.out.println("  USE PRIVATE for:");
        System.out.println("    ✓ Internal implementation details");
        System.out.println("    ✓ Things that shouldn't be exposed to children");
        System.out.println("    Example: private double calculateCost() { }  // Internal\n");
        
        System.out.println("  USE PUBLIC for:");
        System.out.println("    ✓ The interface that external code uses");
        System.out.println("    ✓ Important methods expecting to override");
        System.out.println("    Example: public void eat(double amount) { }\n");
        
        System.out.println("  Access Level Comparison:");
        System.out.println("  ┌──────────┬────────────┬──────────────┬───────────────┐");
        System.out.println("  │ Modifier │ Same Class │ Child Class  │ Other Classes │");
        System.out.println("  ├──────────┼────────────┼──────────────┼───────────────┤");
        System.out.println("  │ public   │     ✓      │      ✓       │       ✓       │");
        System.out.println("  │ protected│     ✓      │      ✓       │       ✗       │");
        System.out.println("  │ default  │     ✓      │      ✗       │       ✗       │");
        System.out.println("  │ private  │     ✓      │      ✗       │       ✗       │");
        System.out.println("  └──────────┴────────────┴──────────────┴───────────────┘\n");
    }
    
    private static void printMethodOverriding() {
        System.out.println("\n" + "┌" + "─".repeat(68) + "┐");
        System.out.println("│ 4. METHOD OVERRIDING RULES                                         │");
        System.out.println("└" + "─".repeat(68) + "┘\n");
        
        System.out.println("Requirements for Valid Override:\n");
        
        System.out.println("  1. SAME METHOD NAME");
        System.out.println("     Parent: public void eat(double amount) { }");
        System.out.println("     Child:  public void eat(double amount) { }  ✓ Correct\n");
        
        System.out.println("  2. SAME PARAMETERS (Type and Order)");
        System.out.println("     Parent: public void move(int distance) { }");
        System.out.println("     Child:  public void move(int distance) { }  ✓ Correct");
        System.out.println("     Child:  public void move(double distance) { }  ✗ Wrong\n");
        
        System.out.println("  3. SAME or COVARIANT RETURN TYPE");
        System.out.println("     Parent: public Animal getAnimal() { }");
        System.out.println("     Child:  public Animal getAnimal() { }       ✓ Same");
        System.out.println("     Child:  public Dog getAnimal() { }          ✓ Covariant (subclass OK)\n");
        
        System.out.println("  4. NOT MORE RESTRICTIVE ACCESS");
        System.out.println("     Parent: public void eat() { }");
        System.out.println("     Child:  public void eat() { }               ✓ Same");
        System.out.println("     Child:  protected void eat() { }            ✗ More restrictive!\n");
        
        System.out.println("Common Mistake: Method Overloading vs Overriding");
        System.out.println("  OVERLOADING (multiple methods, same name, different parameters):");
        System.out.println("    public void move(int distance) { }");
        System.out.println("    public void move(String direction) { }");
        System.out.println("    → Both can exist in same class!\n");
        
        System.out.println("  OVERRIDING (one parent method, child provides its own):");
        System.out.println("    Parent: public void makeSound() { }");
        System.out.println("    Child replaces it: public void makeSound() { } // Different!");
        System.out.println("    → Only child version is used!\n");
    }
    
    private static void printCommonMistakes() {
        System.out.println("\n" + "┌" + "─".repeat(68) + "┐");
        System.out.println("│ 5. COMMON MISTAKES AND HOW TO AVOID THEM                           │");
        System.out.println("└" + "─".repeat(68) + "┘\n");
        
        System.out.println("MISTAKE 1: Forgetting super() in child constructor");
        System.out.println("  ✗ Wrong:");
        System.out.println("    public Dog(String name, String breed) {");
        System.out.println("      this.breed = breed;  // Parent properties NOT initialized!");
        System.out.println("    }");
        System.out.println("  ✓ Correct:");
        System.out.println("    public Dog(String name, String breed) {");
        System.out.println("      super(name);      // Initialize parent first");
        System.out.println("      this.breed = breed;");
        System.out.println("    }\n");
        
        System.out.println("MISTAKE 2: Missing @Override annotation");
        System.out.println("  ✗ Wrong (still works but risky):");
        System.out.println("    public void makeSond() { }  // Typo! Not overriding");
        System.out.println("  ✓ Correct:");
        System.out.println("    @Override");
        System.out.println("    public void makeSound() { }  // Compiler catches typos\n");
        
        System.out.println("MISTAKE 3: Using inheritance for HAS-A relationships");
        System.out.println("  ✗ Wrong (inheritance):");
        System.out.println("    public class Dog extends Tail { }  // Dog IS-NOT Tail!");
        System.out.println("  ✓ Correct (composition):");
        System.out.println("    public class Dog {");
        System.out.println("      private Tail tail;  // Dog HAS-A tail");
        System.out.println("    }\n");
        
        System.out.println("MISTAKE 4: Making parent classes too specific");
        System.out.println("  ✗ Wrong (too specific to dogs):");
        System.out.println("    public class Animal {");
        System.out.println("      void bark() { }  // Not all animals bark!");
        System.out.println("    }");
        System.out.println("  ✓ Correct (general for all animals):");
        System.out.println("    public class Animal {");
        System.out.println("      void makeSound() { }  // All animals have sound");
        System.out.println("    }\n");
        
        System.out.println("MISTAKE 5: Too deep inheritance hierarchies");
        System.out.println("  ✗ Too deep:");
        System.out.println("    Animal → Mammal → Canine → Dog → ServiceDog");
        System.out.println("  ✓ Simpler:");
        System.out.println("    Animal → Dog (if needed: add ServiceDog interface)\n");
        
        System.out.println("MISTAKE 6: Overriding everything unnecessarily");
        System.out.println("  ✗ Wrong (override when not needed):");
        System.out.println("    @Override");
        System.out.println("    public void sleep(int hours) {");
        System.out.println("      super.sleep(hours);  // Not adding anything!");
        System.out.println("    }");
        System.out.println("  ✓ Correct (only override when behavior differs):");
        System.out.println("    @Override");
        System.out.println("    public void sleep(int hours) {");
        System.out.println("      super.sleep(hours);");
        System.out.println("      System.out.println(\"Dog snores!\");  // Adding value");
        System.out.println("    }\n");
    }
    
    private static void printChecklist() {
        System.out.println("\n" + "┌" + "─".repeat(68) + "┐");
        System.out.println("│ 6. INHERITANCE DESIGN CHECKLIST                                    │");
        System.out.println("└" + "─".repeat(68) + "┘\n");
        
        System.out.println("Before creating an inheritance hierarchy, ask:\n");
        
        System.out.println("  RELATIONSHIP:");
        System.out.println("    ☐ Is this an IS-A relationship? (Dog IS-A Animal)");
        System.out.println("    ☐ Not HAS-A relationship? (Dog HAS-A Tail)\n");
        
        System.out.println("  PARENT DESIGN:");
        System.out.println("    ☐ Is the parent class general enough for all children?");
        System.out.println("    ☐ Does it represent a real-world category?");
        System.out.println("    ☐ Is it not too specific to one child?\n");
        
        System.out.println("  COMMON CODE:");
        System.out.println("    ☐ Did I identify all common properties?");
        System.out.println("    ☐ Did I identify all common methods?");
        System.out.println("    ☐ Are they truly needed by ALL children?\n");
        
        System.out.println("  OVERRIDING:");
        System.out.println("    ☐ Does child behavior differ from parent?");
        System.out.println("    ☐ Am I using @Override annotation?");
        System.out.println("    ☐ Am I calling super() when appropriate?\n");
        
        System.out.println("  ACCESSIBILITY:");
        System.out.println("    ☐ Are properties protected (not private)?");
        System.out.println("    ☐ Are important methods public?");
        System.out.println("    ☐ Is implementation detail private?\n");
        
        System.out.println("  DOCUMENTATION:");
        System.out.println("    ☐ Did I comment the parent class purpose?");
        System.out.println("    ☐ Did I explain which methods can be overridden?");
        System.out.println("    ☐ Did I provide examples in child classes?\n");
        
        System.out.println("If you answer YES to all these, your inheritance is well-designed!\n");
    }
}
