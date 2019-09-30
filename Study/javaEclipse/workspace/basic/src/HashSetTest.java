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
	
	person(String name, int age){	//������
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {	//equals �޼ҵ� �������̵� (object ���� ������ �˻�)
		if(obj instanceof person) {	//personŬ������ ��ü�� �´��� �ƴ��� ���ǰ˻�
			person temp = (person)obj;
			return name.equals(temp.name) && age==temp.age;
		}
		
		return false;
	}
	
	
	public int hashCode() {	// �������̵�
		//return (name+age).hashCode();	//�⺻������ ���� ������� hashcode �������� equals�� ��Ʈ�� ��
		return Objects.hash(name, age);	//JDK 1.8 �������ķ� �߰��� ������� ���� ���� ���
	}
	
	public String toString() {	//toSting �������̵�
		return name+":"+age;
	}
}