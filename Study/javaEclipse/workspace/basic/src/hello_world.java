public class hello_world {

	public static void main(String[] args) {
		System.out.println("hello world");
		
		int result=0;
		
		int[] ps = new int[6];
        for (int i = 0; i < 6; i++)
            ps[i] = i;

        int[] counts = new int[5];
        for (int p : ps)
            result+= p;

        System.out.println(result);
		
	}
}