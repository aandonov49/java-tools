package com.ad4ubg;

import io.quarkus.qute.Location;
import io.quarkus.qute.Template;
import io.quarkus.qute.TemplateInstance;
import net.ifao.application.communication.obex.v4.Confirmation;
import net.ifao.application.communication.obex.v4.ObjectExchange;
import net.ifao.application.communication.obex.v4.ObjectFactory;
import net.ifao.application.communication.obex.v4.Response;
import org.jboss.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.ByteArrayInputStream;

import static java.util.Objects.requireNonNull;

@Path("/ccbd")
@RequestScoped
public class CcbdServlet {
    @Location("page.qute")
    private Template page;
    @Inject
    protected Logger LOG;

    @Inject
    protected JAXBContext context;

//    public CcbdServlet(Template page) {
//        this.page = requireNonNull(page, "page is required");
//    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance doGet(@QueryParam("name") String name) {
        return page.data("name", name);
    }

    @POST
    @Produces(MediaType.TEXT_XML)
//    @Consumes(MediaType.TEXT_XML)
    public ObjectExchange doPost(String object) throws JAXBException {
        LOG.info(object);
        Unmarshaller jaxbUnmarshaller = context.createUnmarshaller();
        ObjectExchange objectExchange = (ObjectExchange) jaxbUnmarshaller.unmarshal(new ByteArrayInputStream(object.getBytes()));
        ObjectFactory factory = new ObjectFactory();
        return createExchangeObject(factory);
    }

    private ObjectExchange createExchangeObject(ObjectFactory factory) {
        ObjectExchange ccbdDataResponce = factory.createObjectExchange();
        ccbdDataResponce.setResponse(createXmlResponse(factory));
        return ccbdDataResponce;
    }

    private Response createXmlResponse(ObjectFactory factory) {
        Response xmlResponse = factory.createResponse();
        xmlResponse.setConfirmation(createXmlConfirmation(factory));
        return xmlResponse;
    }

    private Confirmation createXmlConfirmation(ObjectFactory factory) {
        Confirmation xmlConfirmation = factory.createConfirmation();
        xmlConfirmation.setExternalTripNumber("FakeNumber");
        return xmlConfirmation;
    }
}
