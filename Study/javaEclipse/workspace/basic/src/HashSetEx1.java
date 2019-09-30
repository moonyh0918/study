import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] objArr = {"1", new Integer(1), "2","2","4","4","3","6","8"};
		Set set = new HashSet();
		
		for(int i =0; set.size() < 6 ; i++)
			set.add((int)(Math.random()*45+1));
		
		List list = new LinkedList(set);
		
		Collections.sort(list);
		System.out.println(list);
		
		
	}

}
