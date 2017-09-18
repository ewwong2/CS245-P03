
public class QuickSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		qs(a, 0, a.length-1);
	}
	
	public int divide(int [] a, int top, int bot) {
		// pivot is set to the median
		int pivot = (top+bot)/2;
		
		while (top <= bot) {
			// find the first value from top going down that is 
			// equal of greater than the value at pivot
			while (a[top] < a[pivot]) {
				top++;
			}
			// find the first value from bottom going up that is 
			// equal of less than the value at pivot
			while (a[bot] > a[pivot]) {
				bot--;
			}
			// if top and bot has not yet crossed
			if (top <= bot) {
				// top equals pivot, change pivot to bot
				// since pivot will be at bot after the swap
				if (top == pivot) {
					pivot = bot;
				}
				// bot equals pivot, change pivot to top
				else if (bot == pivot) {
					pivot = top;
				}
				// swap top and bot
				int temp = a[top];
				a[top] = a[bot];
				a[bot] = temp;
				// iterate top and bot
				top++;
				bot--;
			}
		}
		return top;
	}
	
	public void qs(int [] a, int top, int bot) {
		// Note: I used Professor Brizan's code as a guide
		//       when I got stuck
		// divide the array in a specific way
		int pivot = divide(a, top, bot);
		// repeat for the top part of the array
		if (top < pivot-1) {
			qs(a, top, pivot-1);
		}
		// repeat for the bottom part of the array
		if (pivot < bot) {
			qs(a, pivot, bot);
		}
		// base case is when top is greater than or equal to pivot 
		// and bot is less than or equal to pivot
	}

}
