
public class BubbleSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		for (int k=1; k<a.length; k++) {
			// iterate one less each time
			// because the largest number has already
			// "sank" so it does not need to be "bubbled"
			for (int l=0; l<a.length-k; l++) {
				if (a[l]>a[l+1]) {
					// swap
					int temp = a[l];
					a[l] = a[l+1];
					a[l+1] = temp;
				}
			}
		}
	}

}
