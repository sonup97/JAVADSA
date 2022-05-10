

public class largeelementexample {

	public static void main(String[] args) {
//		int arr[] = {-3,4,1,2,3}
		int arr[] = {-1,-2,-3,-3,8};
		int n = arr.length;
		
		largestElement(arr,n);
		
//		
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
	}

	private static void largestElement(int[] arr, int n) {
			int large = arr[0];
			for(int i=1;i<n;i++) {
				if (arr[i]>large)
					large = arr[i];
			}
			System.out.println(large);
	}

}
