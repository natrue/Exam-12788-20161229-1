package event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;


public class BeforeInsertFilmEventPublisher implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher applicationEventPublisher;
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		this.applicationEventPublisher=applicationEventPublisher;
	}
	public void pusher(){
		BeforeInsertFilmEvent addEvent=new BeforeInsertFilmEvent(this);
		applicationEventPublisher.publishEvent(addEvent);
	}

	
}
