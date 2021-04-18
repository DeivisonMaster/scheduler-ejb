package assincrono;

import java.util.logging.Logger;

import javax.ejb.Asynchronous;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Tarefa {
	private static final Logger LOGGER = Logger.getLogger(Tarefa.class.getName());

	public void processo1() {
		LOGGER.info("INICIOU PROCESSO 1");
		System.out.println("Thread atual: " + Thread.currentThread().getName());
		LOGGER.info("FINALIZOU PROCESSO 1");
	}

	@Asynchronous
	public void processo2() {
		System.out.println("INICIOU PROCESSO 2");

		try {
			Thread.sleep(5000);
			System.out.println("Hello World");
			System.out.println("Thread atual: " + Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("FINALIZOU PROCESSO 2");
	}

	public void processo3() {
		LOGGER.info("INICIOU PROCESSO 3");

		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}

		System.out.println("Thread atual: " + Thread.currentThread().getName());
		LOGGER.info("FINALIZOU PROCESSO 3");
	}
}
