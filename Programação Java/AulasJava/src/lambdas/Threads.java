package lambdas;

/* Thread sao processos que podem ser executados paralelamente (atravez de escalonamento). Pode ser feito com um unico processador (mas na realidade
 * ele nao esta ocorrendo paralelamente) ou com um processador com varios nucleos (paralelamente).
 * 
 */
public class Threads {

	public static void main(String[] args) {

		Runnable trabalho1 = new Trabalho1();
		Runnable trabalho2 = new Runnable() {

			// Classe anonima.
			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Tarefa #02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
			}
		};

		Runnable trabalho3 = Threads.trabalho3();

		/*
		 * () -> {
		 * 
		 * for (int i = 0; i < 10; i++) { System.out.println("Tarefa #03"); try {
		 * Thread.sleep(100); } catch (Exception e) { } }
		 * 
		 * };
		 */
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);

		t1.start();
		t2.start();
		t3.start();
	}

	static Runnable trabalho3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Tarefa #03");
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
		return null;

	}
}
