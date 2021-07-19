
import java.util.HashMap;

public class AirportCodes {
   public static void main (String[] args) {
      HashMap<String, String> airportCode = new HashMap<String, String>();

      airportCode.put("MLN", "Melilla, Spain");
      airportCode.put("IWJ", "Iwami, Japan");
      airportCode.put("LOH", "Loja, Ecuador");

      System.out.print("IWJ: ");
      System.out.println(airportCode.get("IWJ"));

      airportCode.put("LOH", "Lome, Togo");

      System.out.print("LOH: ");
      System.out.println(airportCode.get("LOH"));
   }
}