//http://stackoverflow.com/questions/303913/java-reading-integers-from-a-file-into-an-array
//http://stackoverflow.com/questions/9785336/how-to-check-if-array-indexes-are-empty-and-if-so-check-the-next
/*
 * JASON BASANESE
 * https://github.com/rjb25/Algrithms_-_Data_Structures/simplesort/simplesort.java
 * COSC 311
 * HW 09/07
 * FALL 2016
 */
import java.util.Scanner;
import java.io.*;
public class data {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("numbers.txt"));
        int[] data = new int[1000];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            data[i] = -1;
        }
        while (scanner.hasNextInt()) {
            int tempNum = scanner.nextInt();
            data[tempNum] = tempNum;
            count++;
        }
        int[] dataCondensed = new int[count];
        int index = 0;
        for (int i = 0; i < 1000; i++) {
            if (data[i] != -1) {
                dataCondensed[index] = data[i];
                index++;
            }
        }
        for (int i = 0; i < dataCondensed.length; i++) {
            System.out.println(dataCondensed[i]);

        }

    }
}
/* OUTPUT
0
1
2
3
4
5
6
7
999
*/
