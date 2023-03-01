package com.ad4ubg;

import net.ifao.application.communication.obex.v4.ObjectExchange;

import javax.enterprise.inject.Produces;
import javax.inject.Singleton;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

public class CustomJaxbContext {

    @Singleton
    @Produces
    public JAXBContext jaxbContext() throws JAXBException {
        return JAXBContext.newInstance(ObjectExchange.class);
    }
}
