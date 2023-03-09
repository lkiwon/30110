
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {94, 85, 95, 88, 90};
		int max = num[0];
		
		for(int i=1; i<num.length; i++) {
			if(num[i]>max) {
				max = num[i];
			}
		}
		System.out.println("최대값: "+max);
	}

}
