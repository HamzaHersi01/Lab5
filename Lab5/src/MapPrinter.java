import java.util.Map;

public class MapPrinter {
	public static void printKeys(Map<String, String> map) {
		//TODO: Check the keyset() method of the Map class 
		//       and use it iterate over the keys and print them
	    for (Map.Entry<String, String> entry : map.entrySet()) {
	        System.out.println("Key: "+ entry.getKey());
	    }

	}

	public static void printValues(Map<String, String> map) {
		//TODO: Check the values() method of the Map class 
		//       and use it iterate over the values and print them
	    for (Map.Entry<String, String> entry : map.entrySet()) {
	        System.out.println("Value: "+ entry.getValue());
	    }
	}

	public static void printPairs(Map<String, String> map) {
		//TODO: Check the getKey() and getValues() methods 
		//       of the Map.Entry class and use them to iterate 
		//       over the keys and  values  of a Map.Entry object 
		//       and print them
		for (Map.Entry<String, String> entry : map.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
		

	}
}