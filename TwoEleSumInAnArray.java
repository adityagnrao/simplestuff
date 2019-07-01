import java.util.*;
class TwoEleSumInAnArray {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		if(array == null || array.length < 2)
			return returnIntArray(new ArrayList<Integer>());
		
		HashSet<Integer> intSet = new HashSet<Integer>();
		SortedSet<Integer> sortedSum = new TreeSet<Integer>();
		for(int i=0; i<array.length; i++) 
			intSet.add(array[i]);
		
		for(int i=0; i<array.length; i++) {
			if(intSet.contains(targetSum - array[i]) && 
				(targetSum - array[i]) != array[i]) {
				sortedSum.add(targetSum - array[i]);
				sortedSum.add(array[i]);
				break;
			}
		}
			int[] out = returnIntArray(sortedSum);
		return  out;
		
  }
	
	private static int[] returnIntArray(Collection<Integer> list) {
		int[] ret = new int[list.size()];
		
		int j = 0;
		for(Integer i : list.toArray(new Integer[0])) 
			ret[j++] = i; 
		// for(int i=0; i < list.size(); i++)
		// 	ret[i] = list.get(i);
		
		return ret;
	}
}
