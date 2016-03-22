
package u1.test;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * 测试 ArrayList LinkedList插入效率
 * 
 * @author 孟凡鼎
 * @see ArrayList
 * @see LinkedList
 */
public class Test {

	public static void main(String[] args) {

		long startTime = System.currentTimeMillis();
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 1000000; i++) {
			list.add(i + "");
		}
		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

		startTime = System.currentTimeMillis();
		LinkedList<String> list1 = new LinkedList<String>();
		for (int i = 0; i < 1000000; i++) {
			list1.add(i + "");
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

}
