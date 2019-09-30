import java.util.HashSet;
import java.util.Objects;

public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet set = new HashSet();
		set.add(new person("hello" , 10));
		set.add(new person("hello1" , 10));
		set.add(new person("hello" , 101));
		set.add(new person("hello1" , 101));
		
		System.out.println(set);
	}

}


class person{
	String name;
	int age;
	
	person(String name, int age){	//생성자
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {	//equals 메소드 오버라이딩 (object 끼리 같은지 검사)
		if(obj instanceof person) {	//person클래스의 객체가 맞는지 아닌지 조건검사
			person temp = (person)obj;
			return name.equals(temp.name) && age==temp.age;
		}
		
		return false;
	}
	
	
	public int hashCode() {	// 오버라이딩
		//return (name+age).hashCode();	//기본적으로 들어가는 기능으로 hashcode 생성으로 equals랑 세트로 씀
		return Objects.hash(name, age);	//JDK 1.8 버전이후로 추가된 기능으로 위와 같은 기능
	}
	
	public String toString() {	//toSting 오버라이딩
		return name+":"+age;
	}
}