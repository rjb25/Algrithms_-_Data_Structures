//http://stackoverflow.com/questions/3563847/what-is-the-use-of-hashcode-in-java
/*
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/tree/master/Hash
 * COSC 311
 * HW 1205
 * FALL 2016
 */
public class Hash {
	public static void main(String[] args) {
		HashTable hash = new HashTable(8);
		String[] names = { "ikeji", "bahorski", "chaudhuri", "evett", "haynes", "maniccam", "moore", "narayanan",
				"panja", "poh", "sverdlik", "tehranipour", "zeiger", "zhang", "cowan", "francis", "mansour" };
		insertArray(names, hash);
	}

	private static void insertArray(String[] array, HashTable table) {
		for (int i = 0; i < array.length; i++) {
			table.insert(array[i]);
		}
	}
}
//OUTPUT
/*
moore ikeji bahorski evett haynes maniccam chaudhuri 

moore narayanan ikeji evett haynes panja sverdlik poh zeiger bahorski maniccam tehranipour chaudhuri 
*/
//COMMENT
/*
The reason for outputting seven in first output is that you said "When the load exceeds 75%, rehash"
 and "output the entire table just before rehashing".
 So at 7 elements you exceed, then output, then rehash.
*/