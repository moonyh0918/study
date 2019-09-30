import java.util.Comparator;
import java.util.TreeSet;

public class TreesetEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet set = new TreeSet(new NameComp2());	//중복을 허용하지 않는다 , 범위검색이 가능하며 저장에 속도가 조금 느리다
		set.add(new Integer(100));
		set.add(100);
		set.add(60);
		set.add(90);
		set.add(120);
		set.add(10);
		set.add(new Student2("hello",10));
		
		
		
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.last());
		
	}

}
class NameComp2 implements Comparator{	//정렬기준 reutrn값에 의해 오름차순 내림차순이 정해짐
	public int compare(Object o1, Object o2) {
		return 1;
	}
	
}



class Student2 {//implements Comparable{
	String name;
	int score;
	
	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public int compareTo(Object obj) {return 1;}
	
	public String toString() {return name;}
	
	
}