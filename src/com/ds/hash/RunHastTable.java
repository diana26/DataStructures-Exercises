package com.ds.hash;

public class RunHastTable {

	public static void main(String[] args) {
		HashTable<String> HM = new HashTable<String>(10);
		HM.put(11, "Diana");
		HM.put(12, "Cafeino");
		HM.put(13, "Mikasa");
		HM.put(13, "Eren");
		System.out.println(HM.get(13));
	}

}
