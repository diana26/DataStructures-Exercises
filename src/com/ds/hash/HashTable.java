package com.ds.hash;

public class HashTable<T> {
	Entry[] arrayHash;
	int size;
	public HashTable(int size) {
		this.size = size;
		arrayHash = new Entry[size];
		for(int i = 0; i < size; i++) 
			arrayHash[i] =  new Entry();
	}
		int GetHash(int key) {
			return key % size;
		}
		public void put(int key, Object value) {
			int hashIndex = GetHash(key);
			Entry arrayValue = arrayHash[hashIndex];
			Entry newItem = new Entry(key, value);
			newItem.next = arrayValue.next;
			arrayValue.next = newItem;
		}
		public T get(int key) {
			T value = null;
			int hashIndex = GetHash(key);
			Entry arrayValue = arrayHash[hashIndex];
			while(arrayValue != null) {
				if(arrayValue.getKey() == key) {
					value = (T) arrayValue.getValue();
					break;
				}
				arrayValue = arrayValue.next;
			}
			return value;
		}
}
