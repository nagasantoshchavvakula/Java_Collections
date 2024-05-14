/**
 * 
 */
package FunctionalInterfaceInJava;

/**
 * @author 91900
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
		helloWorldGreeting.printMessage();
		
		GoodMorningGreeting goodMorningGreeting = new GoodMorningGreeting();
		goodMorningGreeting.printMessage();
	}

}
