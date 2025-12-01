// Ross Elliott
// 221
// cat subclass of animal

public class Cat extends Animal {

    private String toy; // cats got toys

    // makes a cat object with info
    public Cat(String r, String n, String d, String p, String o, String s, String t) {
        super(r, n, d, p, o, s);
        this.toy = t;
    }

    // get the toy name
    public String getToy() {
        return toy;
    }

    // change toy if needed
    public void setToy(String t) {
        this.toy = t;
    }

    // show all info about this cat
    public String displayDetails() {
        return super.displayDetails() + " | toy: " + toy;
    }
}
