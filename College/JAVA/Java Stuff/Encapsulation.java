// Encapsulation in Java is a process of wrapping code and 
// data together into a single unit, for example,
//  a capsule which is mixed of several medicines.

// Abstraction 
// Data hiding is the process of protecting members of class from
// unintended changes whereas abstraction is hiding the implementation
// details and showing only important n useful parts to user.

// -------------------------------------------------------------------------

    abstract class Animal { // here its just a myth or blueprint that we cant use but this can help other class to make the shit done.
        abstract void wailk();
    }

    class Horse extends Animal {

        public void wailk() {
            System.out.println("Walk Bro..");
        }
    }

    class Chicken extends Animal {
        public void wailk() {
            System.out.println("eat and run.");
        }
    }

// --------------------------------------------------------------------------


public class Encapsulation {
    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.wailk();
        Chicken chicken = new Chicken();
        chicken.wailk();
    }
}
