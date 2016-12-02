
public class HashTable {
	private String[] hashTable;
	private int count = 0;

	public HashTable(int length) {
		this.hashTable = new String[length];
	}

	public void insert(String name) {
		int bucket = Math.abs(name.hashCode()) % hashTable.length;
		bucket = available(bucket);
		hashTable[bucket] = name;
		++count;
		if (((double) count / hashTable.length) > .75) {
			System.out.println(this.toString());
			rehash(hashTable);
		}
	}

	private int available(int bucket) {
		if (bucket >= hashTable.length) {
			bucket %= hashTable.length;
		}
		if (hashTable[bucket] != null) {
			return available(bucket + 1);
		} else {
			return bucket;
		}

	}

	private void rehash(String[] table) {
		hashTable = new String[hashTable.length * 2];
		count = 0;
		for (int i = 0; i < table.length; i++) {
			if (table[i] != null) {
				this.insert(table[i]);
			}
		}
	}

	public String toString() {
		String toString = "";
		for (int i = 0; i < hashTable.length; i++) {
			if (hashTable[i] != null) {
				toString += hashTable[i] + " ";
			}
		}
			toString += "\n";
		return toString;
	}
}
