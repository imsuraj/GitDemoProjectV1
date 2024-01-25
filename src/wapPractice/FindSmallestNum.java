package wapPractice;

public class FindSmallestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {3,4,5,1,0,9,8};
		
		System.out.println(smallest(a));
		
		
		
	}
	
	
	public static int smallest(int arr[]) {
		int min = arr[0];
		

		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			
						
			}
		}
		return min;
	}
		
	

}
