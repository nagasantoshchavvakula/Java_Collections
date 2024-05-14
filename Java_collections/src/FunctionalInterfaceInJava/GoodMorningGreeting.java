/**
 * 
 */
package FunctionalInterfaceInJava;

/**
 * @author 91900
 *
 */
public class GoodMorningGreeting implements Greeting {
	
	@Override
	public void printMessage() {
		System.out.println("Good Morning");
	}

}
