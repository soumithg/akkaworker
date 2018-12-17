package com.test.akkaTest2.actor;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class ComplexActor extends UntypedActor {

    LoggingAdapter log = Logging.getLogger(getContext().system(), this);


    public ComplexActor() {
        log.info("ComplexActor constructor");
    }

    @Override
    public void onReceive(Object msg) throws Exception {

        log.info("Received Command sent from remote in Complex Actor: " + msg);
    }
}
