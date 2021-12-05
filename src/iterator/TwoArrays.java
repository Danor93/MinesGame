package iterator;

import java.util.Iterator;

public class TwoArrays implements Iterable<Integer> {
	private int[] a1;
	private int[] a2;

	public TwoArrays(int[] a1, int[] a2) {
		this.a1 = a1;
		this.a2 = a2;

	}

	class Iterator1 implements Iterator<Integer> {// local class
		private int count1 = 0;
		private int count2 = 0;
		private int flag = 1;// flag for checking who's next array that will give a value

		@Override
		public boolean hasNext() {
			return (count1 < a1.length || count2 < a2.length);
		}

		@Override
		public Integer next() {

			if (flag == 1) {
				if (count2 < a2.length) {
					flag = 2;
				}
				if (count1 < a1.length) {
					return a1[count1++];
				}
			} else {
				if (count1 < a1.length) {
					flag = 1;
				}
				if (count2 < a2.length)
					return a2[count2++];
			}
			return null;// if somehow flag isn't 1 or 2
		}
	}

	@Override
	public Iterator<Integer> iterator() {
		return new Iterator1();
	}
}
