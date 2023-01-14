package src.Core.Java8Sample;

import src.Core.Java8Sample.Features.IPerform;

/**
 * 
 * @author pluto
 *
 */
public class Hello {

	/**
	 * 
	 * @param pluto
	 */
	public void greet(IPerform pluto) {
		pluto.perform();
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Hello greeting = new Hello();
		
		IPerform lambdaFunction = () -> System.out.println("Lambda expression");
		
		IPerform inlineCore = new IPerform() {
			
			@Override
			public void perform() {
				System.out.println("Inline Core Function");
			}
		};
		
		greeting.greet(inlineCore);
		lambdaFunction.perform();
	}

}
