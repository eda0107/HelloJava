package com.yedam.collections.tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruits {
	String name;
	int price;

	Fruits(String name, int price) {
		this.name = name;
		this.price = price;
	}

}

//implements~에서 객체를 만드는 방법 하나(23행부터 51행
//51행에 com 변수로 객체를 만들어 new TreeSet<>(com) 넣는 방법 하나
//람다식으로 com 대신에 o1, o2변수 넣는 것 하나
//셋 다 같은 방법

class ComparatorClass implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		if (o1.price > o2.price) {
			return 1;
		} else if (o1.price == o2.price) {
			return 0;
		} else {
			return -1;
		}

	}

}

public class ComparatorEx {
	public static void main(String[] args) {
//		TreeSet<Fruits> tSet = new TreeSet<>(new ComparatorClass());
//		tSet.add(new Fruits("aaa", 30));
//		tSet.add(new Fruits("bbbb", 25));
//		tSet.add(new Fruits("cc", 35));

//		Iterator<Fruits> iter = tSet.iterator();
//		while (iter.hasNext()) {
//			Fruits per = iter.next();
//			System.out.println(per.name + "," + per.price);
//
//		}

		Comparator<Fruits> com = new Comparator<Fruits>() {

			@Override
			public int compare(Fruits o1, Fruits o2) {

				if (o1.price > o2.price) {
					return 1;
				} else if (o1.price == o2.price) {
					return 0;
				} else {
					return -1;
				}

			}

		};
		
		
		TreeSet<Fruits> tSet = new TreeSet<>((o1, o2) -> {
			if (o1.price > o2.price) {
				return -1;
			} else if (o1.price == o2.price) {
				return 0;
			} else {
				return 1;
			}
		});
		
		tSet.add(new Fruits("aaa", 30));
		tSet.add(new Fruits("bbbb", 25));
		tSet.add(new Fruits("cc", 35));

		Iterator<Fruits> iter = tSet.iterator();
		while (iter.hasNext()) {
			Fruits per = iter.next();
			System.out.println(per.name + "," + per.price);

		}

	}

}
