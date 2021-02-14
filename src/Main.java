import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("David");
		employeeNames.add("Kris");
		employeeNames.add("Tom");
		employeeNames.add("Brian");
		employeeNames.add("Eric");
		
		HashSet<Integer> ids = new HashSet<Integer>();
		ids.add(1700);
		ids.add(1701);
		ids.add(1702);
		ids.add(1703);
		ids.add(1704);
		
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
			
		
		int i = 0;
		for(Integer id: ids) {
			employeeMap.put(id,  employeeNames.get(i));
			i++;
		}
		
		for(int key : employeeMap.keySet()) {
			System.out.println(key  + " " + employeeMap.get(key));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		for(Integer id : ids) {
			idsBuilder.append(id);
			idsBuilder.append("-");
		}
		System.out.println(idsBuilder);
		
		StringBuilder namesBuilder = new StringBuilder();
		for(String name: employeeNames) {
			namesBuilder.append(name);
			namesBuilder.append(" ");
		}
         System.out.println(namesBuilder);
	}

}
