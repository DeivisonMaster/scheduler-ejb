package assincrono;

import javax.ejb.EJB;
import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

@Singleton
@Startup
public class ExecutaTarefa {
	
	@EJB
	private Tarefa tarefa;
	
	@Schedule(hour = "*", minute = "*", second = "*/20")
	public void agendadorTarefas() {
		tarefa.processo1();
		tarefa.processo2();
		tarefa.processo3();
		
	}
}
