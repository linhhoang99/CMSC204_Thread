import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;
/**
 * 
 * @author Hieu Tran
 *
 */
public class CarQueue {
	Random dirirections;
	Queue<Integer> queue;
	public CarQueue() {
		dirirections=new Random();
		queue=new ArrayDeque<Integer>();
		queue.add(dirirections.nextInt(4));
		queue.add(dirirections.nextInt(4));
		queue.add(dirirections.nextInt(4));
		queue.add(dirirections.nextInt(4));
		queue.add(dirirections.nextInt(4));
		queue.add(dirirections.nextInt(4));
	}
	public int deleteQueue() {
		int randomNum;
		randomNum=queue.remove();
		return randomNum;
		
	}
	public void addToQueue() {
		class Run implements Runnable{
			@Override
			public void run() {
				try {
					while (true) {
						queue.add(dirirections.nextInt(4));
						Thread.sleep(100);
					}
					
				} catch (InterruptedException element) {
					element.printStackTrace();
				}
				
			}
		}
		Run run=new Run();
		Thread runThread=new Thread(run);
		runThread.start();
	}
}