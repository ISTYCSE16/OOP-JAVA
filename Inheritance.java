public class Inheritance {
    
    public static void main(String args[]) {
        Parent p = new Parent();
        Child c = new Child();
        //Child cp = new Parent(); // Will not Work
        Parent pc = new Child();

        // Using c to override a method
        p.display(); // display() method, originally in Parent Class
        c.display(); // display() method, overriden by Child Class
        c.useMethod(); // useMethod(), a method of parent, being used by child, via inheritance
        pc.display(); // Child Class is now more advanced, so Parent Class object can be resolved into child class object
    } 
    
}

class Parent {
    public void display () { /// This method will be overriden in child class
        System.out.println("Display Method of Inheritance");
    }

    public void useMethod() {
        System.out.println("This method is for use of Child Class");
    }
}

class Child extends Parent {
    public void display() {
        System.out.println("Display Child Method");
    }
}


