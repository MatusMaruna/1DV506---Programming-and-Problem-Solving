package mm223fj_assign3;
public class Arrays {
	public static void main(String[]args){
		int [] arr = {1,2,3,5,6,6,3}; //example array
		int total = sum(arr);
		System.out.print("Printing out the array: ");
		toString(arr); 
		reverse(arr);
		System.out.print("Printing out the reverse: ");
		toString(arr);
		System.out.println("The total from the array: " + total); 
		int[] update = addN(arr,8); // add 8 to every term in the array 
		System.out.print("Printing out the array + N: ");
		toString(update); 
		boolean test = hasN(arr,6); // check if array has 6
		System.out.println("\n"+ "Has N : "+test);
		replaceAll(arr,1,7); 
		toString(arr); 
		int [] sortArray = sort(arr);
		System.out.print("Printing out the sorted array: ");
		toString(sortArray); 
		int[] sub = {9,10,11}; 
		System.out.print("Does the array have a subsequence: ");
		System.out.println(hasSubsequence(arr,sub)); 

		
		
	}
	private static int[] reverse(int[]arr) { 
		int[] reverse = new int[arr.length]; 
		for(int p = 0; p <arr.length; p++) {
			reverse[p] = arr[p]; 
		}
		for(int i = 0; i < arr.length/2; i++)
		{
		    int temp = arr[i];
		    arr[i] = reverse[arr.length - (1+i)];
		    arr[arr.length - (1+i)] = temp;
	}
		return reverse;
	}
	private static  int sum(int[] arr){
		int total = 0; 
		for(int i = 0; i<arr.length; i++){
			total = total+arr[i]; 
		}
		return total;
			
		}
	private static void toString(int[] arr){ 
		String str ="";
		for(int i = 0; i<arr.length; i++){
			str = arr[i]+","; 
			System.out.print(str); 
		}
		System.out.println("");
		}
	private static int[] addN(int[] arr, int n){
		 int[] update = new int[arr.length];
		  for(int i =0;i < arr.length;i++)
	            update[i] = arr[i];
		  for (int x = 0; x < update.length; x++) {
		        update[x] = update[x] + n;
	}
		return update;}
	private static boolean hasN(int[] arr, int n){
		for(int i = 0; i<arr.length; i++){
			if(n == arr[i]){
				return true; 
			}else if(i == arr.length){
				return false; 	 
			}
		}
		return false;
	}
	private static void replaceAll(int[] arr, int old, int nw){
	for(int i=0; i<arr.length; i++){
		if(arr[i] == old){
			arr[i] = nw;
		}
	}
}
	private static int[] sort(int[] arr){
		int [] sortArray = arr.clone(); 
		for(int i = 0; i <sortArray.length; i++){
			for(int x = i+1; x <sortArray.length; x++){ 
				if(sortArray[i]>sortArray[x]){ 
					int temp = sortArray[i];
					sortArray[i] = sortArray[x]; 
					sortArray[x] = temp; 
					
					
				
					
				}
			}
		}
		return sortArray;
	}
	private static boolean hasSubsequence(int[] arr, int[]sub){
		for (int x = 0, y = 0; x < arr.length; x++)
	         if (arr[x] == sub[y]) 
	             if (++y >= sub.length)
	                 return true;
	     return false; 
	}
}