package com.iterator.dp.beans;

public class Collection implements Container {
	String studentName[] = { "Rahul", "Shruti", "Nikhil", "Rishi" };

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new NameIterator();
	}

	private class NameIterator implements Iterator {
		int index;

		public boolean hasNext() {
			if (index < studentName.length)
				return true;
			else {
				return false;
			}

		}

		public Object next() {
			if (this.hasNext()) {
				return studentName[index++];
			} else {
				return null;
			}

		}

	}

}
