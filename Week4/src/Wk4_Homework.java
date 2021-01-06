import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Wk4_Homework {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		//1 Create an instance of an ArrayList 
	
		List<String> employeeNames = new ArrayList<String>();
	employeeNames.add("Heath Brown");
	employeeNames.add("Chris West");
	employeeNames.add("Tyler East");
	employeeNames.add("Clark Kent");
	employeeNames.add("Jake Eli");
		
	//2 create an instance of HashSet
	
	Set<Integer> ids = new HashSet<Integer>();
	ids.add(1);
	ids.add(2);
	ids.add(3);
	ids.add(4);
	ids.add(5);
	
	//3 create an instance of HashMap
	
	Map<Integer, String> employeeMap = new HashMap<Integer, String>();
	
	//5 use a for loop to add new entries to the map
	
	int i = 0;
	for (int id : ids) {
	employeeMap.put(id, employeeNames.get(i));
		i++;
	} 
	
	//6 use a for loop to iterate over empolyeeMap.keySet() and use the key for each iteration to print to console
	
	for(Integer key : employeeMap.keySet()) {
	System.out.println("Employee" + " " + key + ":" + " " + employeeMap.get(key));
	}
	//7 create stringBUilder called idsBuilder
	
	StringBuilder idsBuilder = new StringBuilder();
		//8 iterate over ids HashSet and append each id followed by a - to idsBuilder
	for (int id : ids) {
		idsBuilder.append(id + "-");
	}
	//9 print the result of idsBuilder.toString()
	
	System.out.println( idsBuilder.toString());
		
	//10 create another StringBuilder called namesBuilder
	
	StringBuilder namesBuilder = new StringBuilder();
	
	//11 iterate over employeeNames and apped each name with - to the namesBuilder
	
	for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
	
	//12 print results of namesBuilder.toSTring
	
	System.out.println(namesBuilder.toString());
		}
}
