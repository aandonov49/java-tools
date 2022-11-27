package com.ad4ubg;

import io.vertx.core.http.HttpServerRequest;
import org.jboss.logging.Logger;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;

@Path("/crc")
public class CrcResource {

    @Inject
    protected Logger LOG;

    @GET
    public void doGet(@Context HttpServerRequest request) {
        LOG.debug(request.uri());
    }

    @POST
    public void doGet(String request) {
        LOG.debug(request);
    }
}
