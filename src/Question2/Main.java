package Question2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		
		Tasks[] tasks = {
				new Tasks("Wash"),
				new Tasks("Brush"),
				new Tasks("Clean"),
				new Tasks("Eat")
		};
		
		
		ExecutorService  taskManager = Executors.newFixedThreadPool(4);
		
		for (Tasks t : tasks) {
			taskManager.submit(t);
		}

	}

}



class Tasks implements Runnable {
	
	String task;
	
	public Tasks(String task) {
		this.task = task;
	}

	@Override
	public void run() {
		System.out.println(this.task);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}


