
public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int temp;
		for (int i=1; i<a.length; i++) {
			temp = a[i];
			// go back up the array until there
			// is an element that is less than temp
			for (int j=i; j>0; j--) {
				// if the element is greater than temp
				// then shift the element down one
				if (temp<a[j-1]) {
					a[j] = a[j-1];
				} else {
					// if the a[j] is greater or equal to temp, 
					// then change place temp and break
					a[j] = temp;
					break;
				}
			}
		}
	}

}
