package com.iterator.dp.Test;

import com.iterator.dp.beans.Collection;
import com.iterator.dp.beans.Iterator;

public class IteratorDPTest {
	public static void main(String[] args) {
		Collection collection = new Collection();
		Iterator itr = collection.iterator();
		System.out.print("Name of the Students: ");
		while (itr.hasNext()) {
			String name = (String) itr.next();
			System.out.print(name + " ,");
		}

	}

}
