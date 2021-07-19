import java.util.ArrayList;

public class ShelterManager {
   public static void main(String[] args) {
      ArrayList<String> shelterPets = new ArrayList<String>();

      shelterPets.add("Nico");
      shelterPets.add("Scooby");

      System.out.println("Pets:");

      for (String petName : shelterPets) {
         System.out.println(petName);
      }
   }
}