package com.ad4ubg;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.vertx.core.http.HttpServerRequest;
import net.ifao.application.communication.aida.v4.AidaCardCreationRequest;
import net.ifao.application.communication.aida.v4.AidaCardCreationResponse;
import org.jboss.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;

@Path("/aida")
@RequestScoped
public class AidaResource {

    @Inject
    protected Logger LOG;

    @Location("aida.error")
    private Template page;

    @Inject
    private JAXBContext jaxContext;


//    public AidaResource(final Template page) throws JAXBException {
//        this.page = requireNonNull(page, "page is required");
//        context = JAXBContext.newInstance(AidaCardCreationRequest.class);
//    }

    @GET
    public void doGet(@Context HttpServerRequest request) {
        LOG.debug(request.uri());
    }

    @POST
    @Path("error")
    @Produces(MediaType.TEXT_HTML)
    public Response doPost(String request) throws JAXBException {
        Unmarshaller jaxbUnmarshaller = jaxContext.createUnmarshaller();
        AidaCardCreationRequest object = (AidaCardCreationRequest) jaxbUnmarshaller.unmarshal(new ByteArrayInputStream(request.getBytes()));
        LOG.debug(object);
        return Response.accepted(page.instance()).status(501).build();
    }

    @POST
    @Path("generate")
    @Produces(MediaType.TEXT_XML)
    public Response doPostGenerate(String request) throws JAXBException {
        Unmarshaller jaxbUnmarshaller = jaxContext.createUnmarshaller();
        AidaCardCreationRequest object = (AidaCardCreationRequest) jaxbUnmarshaller.unmarshal(new ByteArrayInputStream(request.getBytes()));
        LOG.debug(object);
        AidaCardCreationResponse cardResponse = new AidaCardCreationResponse();
        cardResponse.setCardholderName("Atanas Andonov");
        return Response.status(200).entity(cardResponse).build();
    }
}
