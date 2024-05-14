/**
 * 
 */
package FunctionalInterfaceInJava;

/**
 * @author 91900
 *
 */
public class HelloWorldGreeting implements Greeting {

	@Override
	public void printMessage() {
		System.out.println("Hello World");
	}
}
