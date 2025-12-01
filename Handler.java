// Handler - main class 
import java.util.Scanner;

public class Handler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShelterManager s = new ShelterManager();

        System.out.print("file name: ");
        String f = sc.nextLine();

        s.readAnimals(f);
        s.showAll();

        sc.close();
    }
}

