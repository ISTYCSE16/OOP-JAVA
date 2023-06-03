class Encapsulation {
    public static String college = "RAJUK Uttara Model College";
    private String name;
    private int roll;

    public static void setCollege(String college) {
        Encapsulation.college = college;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public static String getCollege() {
        return college;
    }
    public int getRoll() {
        return roll;
    }
    public String getName() {
        return name;
    }

    public Encapsulation(){}; // Constructors don't have return type, not even void


    public static void main(String args[])
    {
        Encapsulation encapsulation = new Encapsulation();
        Encapsulation.setCollege("RUET"); // Used in a Static Way, using Class Name instead of the Object
        encapsulation.setName("Md. Fatin Faiaz Isty"); // Using Object to set it's values
        encapsulation.setRoll(1603011);
    }
}

/* As you can see here
 * Data Members and Methods are encapsulated into one class
 */