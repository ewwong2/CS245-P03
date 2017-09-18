
public class MergeSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// copy the sorted array into the given array
		System.arraycopy(divide(a),0,a,0,a.length);
	}
	
	private int[] divide(int[] a) {
		// base case
		// if divided to 1 element, then return it
		if (a.length==1) { 
			return a;
		}
		// divPoint is the middle
		int divPoint = a.length/2;
		// l1 is the "top" array
		// l2 is the "bottom" array
		// each array is half the length of the a
		// but if the array length is odd, the "bottom"
		// array is one larger
		int[] l1 = new int[a.length/2];
		int[] l2 = new int[(a.length+1)/2];
		
		// copy the first half of a into l1
		for (int i=0; i<divPoint; i++) {
			l1[i] = a[i];
		}
		
		// copy the second half of a into l2
		for (int i=0, j=divPoint; j<a.length; i++, j++) {
			l2[i] = a[j];
		}
		
		// keep dividing the "top" and "bottom" arrays
		l1 = divide(l1);
		l2 = divide(l2);
		
		// merge "top" and "bottom"
		return merge( l1, l2 );
	}

	private int[] merge(int[] a, int[] b) {
		// c is the combined array
		// the length of c is the length
		// of a and b added together
		int[] c = new int[a.length+b.length];
		// indices of a, b, and c
		int ai = 0;
		int bi = 0;
		int ci = 0;
		
		// while there are still elements in both arrays
		while(ai<a.length && bi<b.length) {
			// find which is smaller
			if (a[ai] > b[bi]) {
				c[ci] = b[bi];
				ci++;
				bi++;
			} else {
				c[ci] = a[ai];
				ci++;
				ai++;
			}
		}
		
		//add the remaining elements if a has any
		while(ai<a.length) {
			c[ci] = a[ai];
			ci++;
			ai++;
		}
		// add the remaining elements is b has any
		while(bi<b.length) {
			c[ci] = b[bi];
			ci++;
			bi++;
		}
		
		// return the merged and sorted array
		return c;
	}

}
