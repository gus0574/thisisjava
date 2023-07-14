package ch15_컬렉션프레임워크.sec5_Tree.Comparable_Comparator;

import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new FruitComparator());
		
		treeSet.add(new Fruit("포도",3000));
		treeSet.add(new Fruit("수박",10000));
		treeSet.add(new Fruit("딸딸기",6000));
		
		for(Fruit fruit : treeSet) {
			System.out.println(fruit.name + " : " + fruit.price);
		}
	}

}
