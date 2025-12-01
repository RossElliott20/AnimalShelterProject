// Ross elliott
// 221
// shelter manager - reads file and shows animals

import java.io.*;

public class ShelterManager {

    // makes a small list to hold animals
    private Animal[] animals = new Animal[50];
    private int count = 0;

    // reads animal info from file
    public void readAnimals(String file) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;

            // go through file line by line
            while ((line = br.readLine()) != null) {

                // split stuff up by commas
                String[] parts = line.split(",");

                // skip lines that are missing info
                if (parts.length < 8) continue;

                // grab what we need
                String type = parts[0].trim();
                String phone = parts[4].trim();

                // check if phone looks okay or not. im pretty sure i did this right because we did the phone regex in class
                if (!phone.matches("^\\(\\d{3}\\)\\d{3}-\\d{3}$")) continue;

                // make dog or cat based on first word
                if (type.equalsIgnoreCase("dog"))
                    animals[count++] = new Dog(parts[1], parts[2], parts[3], phone, parts[5], parts[6], parts[7]);
                else if (type.equalsIgnoreCase("cat"))
                    animals[count++] = new Cat(parts[1], parts[2], parts[3], phone, parts[5], parts[6], parts[7]);
            }

            // done reading
            br.close();

        } catch (Exception e) {
            // if something breaks reading the file
            System.out.println("file problem");
        }
    }

    // shows every animal that got added
    public void showAll() {
        for (int i = 0; i < count; i++) {
            System.out.println(animals[i].displayDetails());
        }
    }
}
