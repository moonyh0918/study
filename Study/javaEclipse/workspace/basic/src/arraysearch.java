import java.util.Arrays;

public class arraysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] arr = {1,2,3,9,7};
		int idx = Arrays.binarySearch(arr,7);
		System.out.println(idx);

		
		int [] arr2 = {1,2,3,9,7};
		Arrays.sort(arr2);
		int idx2 = Arrays.binarySearch(arr2,7);	//�����Ŀ� ���ε� ���� ã�����ִ�.(�����˻�)
		System.out.println(idx2);
		
		
		
		
		
	}

}
