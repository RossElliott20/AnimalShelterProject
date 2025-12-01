// Ross elliott
// 221
// dog subclass of animal

public class Dog extends Animal {

    private String breed; // only dogs have this

    // makes a dog object with info
    public Dog(String r, String n, String d, String p, String o, String s, String b) {
        super(r, n, d, p, o, s);

        // save breed here (dog specific)
        this.breed = b;
    }

    // get the breed name
    public String getBreed() {
        return breed;
    }

    // change breed if needed
    public void setBreed(String b) {
        this.breed = b;
    }
    // show all info about this dog
    public String displayDetails() {
        return super.displayDetails() + " | breed: " + breed;
    }
}
