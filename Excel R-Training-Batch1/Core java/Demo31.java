import java.util.HashSet;

class HashSetDemo1 {

	void HSetMethod() {

		HashSet hashSet = new HashSet();
		hashSet.add(1000);
		hashSet.add("Sohan");
		hashSet.add(9999.99);
		System.out.println(hashSet);

		for (Object x : hashSet) {
			System.out.println(x);
		}
	}
}

public class Demo31 {
	public static void main(String[] args) {
		HashSetDemo1 obj = new HashSetDemo1();
		obj.HSetMethod();
	}
}