
import java.util.Scanner;
import java.util.HashMap;

public class Capitals {
   public static void main (String[] args) {
      HashMap<String, String> provinceCapital = new HashMap<String, String>();
      Scanner scnr = new Scanner(System.in);
      String provinceName;

      provinceCapital.put("Alberta", "Edmonton");
      provinceCapital.put("Quebec", "Quebec City");
      provinceCapital.put("Manitoba", "Winnipeg");
      provinceCapital.putIfAbsent("Quebec", "Toronto");
      provinceCapital.putIfAbsent("Yukon", "Whitehorse");

      provinceName = scnr.next();
      while (!provinceName.equals("exit")) {
         System.out.print(provinceName + ": ");
         System.out.println(provinceCapital.get(provinceName));
         provinceName = scnr.next();
      }
   }
}