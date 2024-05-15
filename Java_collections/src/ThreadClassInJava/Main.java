/**
 * 
 */
package ThreadClassInJava;

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
		Thread threadOne = new ThreadExample();
		Thread threadTwo = new ThreadExample();
		
		threadOne.setName("Thread One");
		threadTwo.setName("thread Two");
		
		threadOne.start();
		threadTwo.start();
	}

}
