
class FirstClass {
    public FirstClass() {
        System.out.println("Object of First Class Instantiated");
    }
    public void firstClassInstance() {
        System.out.println("This is an Instance of First Class");
    }
}


class SecondClass {
    public SecondClass() {
        System.out.println("Object of Second Class");
    }
    public void secondClassInstance() {
        System.out.println("This is an Instance of Second Class");
    }
}


class Constructor {

    public static void main(String args[])
    {
        FirstClass firstClass = new FirstClass();    // Instantiating the objects
        SecondClass secondClass = new SecondClass(); // Using the Constructors

        firstClass.firstClassInstance();    // Using methods of those objects
        secondClass.secondClassInstance();
    }
    
}
