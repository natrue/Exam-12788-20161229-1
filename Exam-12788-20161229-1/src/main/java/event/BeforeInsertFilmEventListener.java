package event;

import org.springframework.context.ApplicationListener;

public class BeforeInsertFilmEventListener implements ApplicationListener<BeforeInsertFilmEvent> {

	public void onApplicationEvent(BeforeInsertFilmEvent event) {
		if(event instanceof BeforeInsertFilmEvent){
			System.out.println(event.toString());
		}
	}
	


}
