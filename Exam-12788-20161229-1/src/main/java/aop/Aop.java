package aop;


import event.AfterInsertFilmEventPublisher;
import event.BeforeInsertFilmEventPublisher;


public class Aop {
	private AfterInsertFilmEventPublisher apublisher;
	private BeforeInsertFilmEventPublisher bpublisher;
	public void setBpublisher(BeforeInsertFilmEventPublisher bpublisher) {
		this.bpublisher = bpublisher;
	}
	public void setApublisher(AfterInsertFilmEventPublisher apublisher) {
		this.apublisher = apublisher;
	}


	//插入前的事件监听
	public void before(){
		bpublisher.pusher();
	}
	public void after(){
		apublisher.pusher();
	}
}
