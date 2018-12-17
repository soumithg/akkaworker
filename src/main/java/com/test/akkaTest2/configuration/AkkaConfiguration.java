package com.test.akkaTest2.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.akkaTest2.actor.ComplexActor;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

@Configuration
public class AkkaConfiguration {
	
	@Bean
	public ActorSystem actorSystem() {
		
		ActorSystem actorSystem = ActorSystem.create("actor-system");
		return actorSystem;
	}
	
	
	@Bean
	public ActorRef complexActorReference(@Qualifier("actorSystem") ActorSystem actorSystem) {
		
		ActorRef actorRef = actorSystem.actorOf(Props.create(ComplexActor.class), "complex-actor");
		return actorRef;
	}

}
