// Ross Elliott
// 221
// animal base class

public class Animal {
    protected String regNum, name, dob, phone, owner, lastShot;

    public Animal(String regNum, String name, String dob, String phone, String owner, String lastShot) {
        this.regNum = regNum;
        this.name = name;
        this.dob = dob;
        this.phone = phone;
        this.owner = owner;
        this.lastShot = lastShot;
    }

    public String displayDetails() {
        return regNum + " | " + name + " | " + owner + " | " + phone;
    }
}
