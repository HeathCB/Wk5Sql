import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Wk4_Homework {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//1
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Heath Brown");
		employeeNames.add("Chris West");
		employeeNames.add("Tyler East");
		employeeNames.add("Clark Kent");
		employeeNames.add("Jake Eli");
		//2
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(1);
		ids.add(2);
		ids.add(3);
		ids.add(4);
		ids.add(5);
		//3
		int i = 0;
		//4
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		//5
		for (int id : ids) {
		employeeMap.put(id, employeeNames.get(i));
			i++;
		} 
		//6
		for(Integer key : employeeMap.keySet()) {
		System.out.println("Employee" + " " + key + ":" + " " + employeeMap.get(key));
		}
		//7
		StringBuilder idsBuilder = new StringBuilder();
		//8
		for (int id : ids) {
		idsBuilder.append(id + "-");
		}
		//9
		System.out.println( idsBuilder.toString());
		//10
		StringBuilder namesBuilder = new StringBuilder();
		//11
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		//12
		System.out.println(namesBuilder.toString());
		}
}
