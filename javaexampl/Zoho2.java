package javaexampl;


class Zoho2
{
	public static int minJumps(int[] arr) {
	  int n = arr.length; //5
      int jumps = 0;
      int currEnd = 0; // Current end of the reachable area
      int currstart = 0; // Farthest reachable position from the current position
      					 //5-1=4
      for (int i = 0; i < n - 1; i++) {//0 1 2 3
          // Update currstart
          if (i + arr[i] > currstart) {
              currstart = i + arr[i];
          }
          
          // If current position reaches currEnd, update currEnd and increment jumps
          if (i == currEnd) {
              jumps++;
              currEnd = currstart;

              
              // If the current end is beyond the last index, return the number of jumps
              if (currEnd >= n - 1) {
                  return jumps;
              }
          }
          
          // If we encounter a 0 in the array and cannot move further, return -1
          if (arr[i] == 0 && i == currEnd) {
              return -1;
          }
      }
      
      return jumps;
}	
	public static void main(String[] args) {
		int arr[]= {2,3,1,1,4};
		System.out.println(minJumps(arr));
	}
}