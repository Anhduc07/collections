package collections.HashMap;
import java.util.*;

// setup value cho key trong HashMap
public class HashMapEntryKeySetValues {
    public  static void main(String[] args) {
    HashMap<String, String>  countryISOCodeMapping  = new HashMap<>();
    countryISOCodeMapping.put("Vietnam", "VN");
    countryISOCodeMapping.put("United States", "US");
    countryISOCodeMapping.put("United Kingdom", "UK");
    countryISOCodeMapping.put("Germany", "GE");
    countryISOCodeMapping.put("France", "FR");
    countryISOCodeMapping.put("China", "CN");

    Set<Map.Entry<String,String>>  countryISOCodeEntries = countryISOCodeMapping.entrySet();
    System.out.println(" countryISOCodeEntries:" +countryISOCodeMapping);

    Collection<String> ISOcode = countryISOCodeMapping.values();
    System.out.println("ISOcode:" +ISOcode);

    }
}
