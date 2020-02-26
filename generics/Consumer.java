package cog.cts.twentsix.generics;

public class Consumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test<Integer> t = new Test<>();
		t.setObj(5);
		int i = (int)t.getObj();
		System.out.println(i);
		Test<String> t2 = new Test<>();
		t2.setObj("Hello");
		String s = (String) t2.getObj();
		System.out.println(s);
	}

}
