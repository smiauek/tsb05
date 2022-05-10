package functionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

@FunctionalInterface
interface AddMethod {
//	void msg();
	public int add(int a, int b);
}

public class Main  {

	public static void main(String[] args) {
		// functional programming 1 - slides 3-6
		
		// stringJoiner
		
//		StringJoiner joinNames = new StringJoiner(",","[","]");
//		
//		// The add method from the StringJoiner
//		
//		joinNames.add("Sam");
//		joinNames.add("Julia");
//		joinNames.add("Sara");
//		
//		StringJoiner joinNames2 = new StringJoiner("-", "(",")");
//		
//		joinNames2.add("Joe");
//		joinNames2.add("Monika");
//		
//		StringJoiner mJoiner = joinNames.merge(joinNames2);
//		
//		System.out.println(mJoiner);
		
		
		
//		StringBuffer sb = new StringBuffer("Hello");
//		System.out.println(sb);
//		
//		sb.append("True");
//		System.out.println(sb);
//		
//		sb.insert(5, "-");
//		System.out.println(sb);
//		
//		sb.replace(5, 6, "///");		
//		System.out.println(sb);
//		
//		sb.delete(4, 5);
//		System.out.println(sb);
//		
//		sb.reverse();
//		System.out.println(sb);
//		
//		StringBuffer ad = new StringBuffer("Hello");
//		
//		System.out.println(sb.compareTo(ad));
		
//		String say = "hello";
//		AddMethod me =()->{
//			System.out.println(say);
//		};
//		
//		me.msg();
		
//		AddMethod addddd = (a,b) -> (a+b);
//		
//		System.out.println(addddd.add(2,2));
		
//		
//		List<String> myList = new ArrayList<String>();
//		
//		myList.add("Peter");
//		myList.add("Sam");
//		myList.add("Julia");
//		
//		myList.forEach((n) -> System.out.println(n));
//		
		
//		RunnableMyDemo run1 = new RunnableMyDemo("Thread-1");
//		
//		run1.start();
//		
//		RunnableMyDemo run2 = new RunnableMyDemo("Thread-2");
//		
//		run2.start();
//		
//		RunnableMyDemo run3 = new RunnableMyDemo("Thread-3");
//		
//		run3.start();
		
		Sender send = new Sender();
		
		SendingThread send1 = new SendingThread("Thread 1 sending", send);
		SendingThread send2 = new SendingThread("Thread 2 sending", send);
		
		send1.run();
		send2.run();

	}

//	@Override
//	public void msg(String msg) {
//		
//		System.out.println("Hello ");
//		
//	}

}
