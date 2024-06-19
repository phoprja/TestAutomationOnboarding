package task1_hometask_singleton_pattern;

public class CandyMakerTest {
	public static void main(String[] args) {

		Thread thread1 = new Thread(() -> {
			CandyMaker candyMaker = CandyMaker.getInstance();
			candyMaker.fill();
			candyMaker.boil();
			System.out.println("Thread1 Initial state: " + candyMaker);

		});

		Thread thread2 = new Thread(() -> {
			CandyMaker candyMaker = CandyMaker.getInstance();
			candyMaker.drain();
			System.out.println("Thread2 Initial state: " + candyMaker);

		});

		thread1.start();
		thread2.start();

		try {
			thread1.join();
			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		CandyMaker candyMaker = CandyMaker.getInstance();
		System.out.println("Final state of the CandyMaker instance after threads have completed: " + candyMaker);

//        CandyMaker candyMaker = CandyMaker.getInstance();
//        candyMaker.fill();
//        candyMaker.boil();
//        candyMaker.drain();
//        System.out.println("Candy Maker class first instance:- " + candyMaker);
//
//        // Returns the same instance
//        CandyMaker candyMaker1 = CandyMaker.getInstance();
//        System.out.println("Candy Maker class second instance:- " + candyMaker1);
	}
}
