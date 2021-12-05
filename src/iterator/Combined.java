package iterator;

import java.util.Iterator;

public class Combined<E> implements Iterable<E> {
	private Iterator<E> first;
	private Iterator<E> second;

	public Combined(Iterable<E> first, Iterable<E> second) {
		this.first = first.iterator();
		this.second = second.iterator();
	}

	class Iterator1 implements Iterator<E> {// local class
		private int flag = 1;

		@Override
		public boolean hasNext() {
			return (first.hasNext() || second.hasNext());
		}

		@Override
		public E next() {
			if (first.hasNext() && second.hasNext()) {
				if (flag == 1) {
					flag = 2;
					return first.next();
				} else {
					flag = 1;
					return second.next();
				}
			} else {
				if (first.hasNext()) {
					return first.next();
				} else {
					if (second.hasNext()) {
						return second.next();
					}
				}
			}
			return null;
		}

	}

	@Override
	public Iterator<E> iterator() {

		return new Iterator1();
	}
}
