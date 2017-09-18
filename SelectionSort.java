
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// flag is the smallest number
		int flag;
		
		for (int k=0; k<a.length-1; k++) {
			// set flag to 0 and one more each time
			// the first number after each pass will be the smallest
			// so we can ignore one more element each pass
			flag = k;
			for (int l=k+1; l<a.length; l++) {
				// if the value at the element is less than the value at flag
				// then change flag to the element 
				if (a[l]<a[flag]) {
					flag = l;
				}
			}
			// swap k and flag
			int temp = a[k];
			a[k] = a[flag];
			a[flag] = temp;
		}

	}

}
