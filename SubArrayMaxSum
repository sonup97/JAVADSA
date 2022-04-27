package campus;



//Prefix Fix Approach O(N^2)

public class SubArrayPrefixSum {
	
	
	public static void printSubArray(int[] arr,int n) {
		
		int arr1 [] = new int [n];
		arr1[0] = arr[0];
		for(int i=1;i<n;i++) {
			arr1[i] = arr1[i-1]+arr[i];
		}
//		
		
		int large_sum=0;
		
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				
				int sum = i > 0? arr1[j]-arr1[i-1] : arr1[j];
		
				
				// put a check is subarraySum > largest_sum
				large_sum = Math.max(large_sum,sum);
			}
			}
//		
		
			System.out.println("Large_sum "+large_sum);
}
	

	

	public static void main(String[] args) {
//		int arr[] = {10,20,30,40,50,60};
		int arr[] = {-1,3,4,-1,5,-12,6,1,3};
		
		int n = arr.length;
		printSubArray(arr,n);
		
		//Print All element from array
//		for(int i =0;i<n;i++) {
//			System.out.println(arr[i]);
//		}
		//print all element from array 2nd way
//		for(int x : arr) {
//			System.out.println(x);
//		}
		}

}
