package scheduler;

import java.util.logging.Logger;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class Agendador {
	private static final Logger LOGGER = Logger.getLogger(Agendador.class.getName());
	private int count = 0;
	
	@Schedule(hour = "*", minute = "*", second = "*/5", persistent = false)
	void consultaPeriodicamente() {
		count++;
		LOGGER.info("verificando serviço externo pela " + count + "ª vez");
	}
	
}
