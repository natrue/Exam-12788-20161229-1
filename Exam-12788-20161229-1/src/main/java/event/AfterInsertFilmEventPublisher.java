package event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class AfterInsertFilmEventPublisher implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher applicationEventPublisher;
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher=applicationEventPublisher;
	}
	public void pusher(){
		AfterInsertFilmEvent addEvent=new AfterInsertFilmEvent(this);
		applicationEventPublisher.publishEvent(addEvent);
	}

	
}
