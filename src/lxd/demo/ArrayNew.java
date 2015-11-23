package lxd.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class ArrayNew {
	public static void main(String[] args) {
		int[] a;
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		System.out.println("length of a=" + a.length);
		System.out.println(Arrays.toString(a));
		Set<String> list = new HashSet<String>();
		list.add("a");
		list.add("a");
		System.out.println(list);
	}
}
