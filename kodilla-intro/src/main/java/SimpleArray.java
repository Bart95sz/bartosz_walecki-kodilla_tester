
public class SimpleArray {
    public static void main(String[] args) {
        String[] names = new String[5];
        names[0] = "Anna";
        names[1] = "Maja";
        names[2] = "Ula";
        names[3] = "Nina";
        names[4] = "aga";
        String name = names[3];
        System.out.println(name);
        int numberOfElements = names.length;
        System.out.println("Moja tablica zawiera" + numberOfElements + "elementów.");

    }
}