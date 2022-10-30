import java.util.HashMap;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> tomStatus = new HashMap<String, String>();
		tomStatus.put("1","sleep");
		tomStatus.put("2","hungry");
		tomStatus.put("3","cleaness");
		tomStatus.put("4","happiness");
		
		MapPrinter q= new MapPrinter();
		q.printKeys(tomStatus);
		q.printValues(tomStatus);
		q.printPairs(tomStatus);
	}

}
