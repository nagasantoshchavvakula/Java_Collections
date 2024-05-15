/**
 * 
 */
package ThreadClassInJava;

/**
 * @author 91900
 *
 */
public class ThreadExample extends Thread {
	
	@Override
	public void run() {
		System.out.println("The Thread is"+" "+ this.getName());
	}

}
