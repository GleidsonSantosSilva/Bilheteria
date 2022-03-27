package view;



	import java.util.concurrent.Semaphore;

import controller.PessoaThread;



	public class view {

		public static void main(String[] args) {
			Semaphore semaforo = new Semaphore(1);
			
			for (int i = 0; i < 300; i++) {
				Thread compraIngressos = new PessoaThread(i,semaforo);
				compraIngressos.start();
			}
		}

	}

