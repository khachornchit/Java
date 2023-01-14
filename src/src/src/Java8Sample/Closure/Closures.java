package Java8Sample.Closure;

import Java8Sample.Features.IProcess;

public class Closures {

	public static void main(String[] args) {
		int val = 9;
		int count = 100;

		doProcess(val, i -> System.out.println(String.format("val + count = %s", i + count)));
	}

	public static void doProcess(int i, IProcess p) {
		p.process(i);
	}

}
