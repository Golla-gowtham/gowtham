public class Main
{
	public static void main(String[] args) {
	    int[] arr = {3,4,5,6,7,0,1,2};
	    int ans = pivit(arr);
	    System.out.println(ans);
	    
	}
	static int pivit(int[] arr){
	    int st = 0;
	    int end = arr.length-1;
	    while(st<=end){
	    int mid = st+(end-st)/2;
	    if(mid <end && arr[mid]>arr[mid+1]){
	        return mid;
	    }
	    else if(st<mid && arr[mid]<arr[mid+1]){
	        return mid+1;
	    }
	   else if(arr[mid]<=arr[st]){
	       end = mid-1;
	   }
	}
	return -1;
}
}
