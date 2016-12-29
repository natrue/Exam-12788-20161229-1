package event;

import org.springframework.context.ApplicationListener;

public class AfterInsertFilmEventListener implements ApplicationListener<AfterInsertFilmEvent> {

	public void onApplicationEvent(AfterInsertFilmEvent event) {
		if(event instanceof AfterInsertFilmEvent){
			System.out.println(event.toString());
		}
	}
	


}
