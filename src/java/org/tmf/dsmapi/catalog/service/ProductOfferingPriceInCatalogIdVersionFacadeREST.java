package org.tmf.dsmapi.catalog.service;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.tmf.dsmapi.catalog.ProductOfferingPrice;
import org.tmf.dsmapi.commons.ParsedVersion;
import org.tmf.dsmapi.commons.exceptions.BadUsageException;
import org.tmf.dsmapi.commons.jaxrs.PATCH;

/**
 *
 * @author bahman.barzideh
 *
 */
@Stateless
@Path("catalog/{catalogId}:({catalogVersion})/productOfferingPrice")
public class ProductOfferingPriceInCatalogIdVersionFacadeREST extends AbstractFacadeREST<ProductOfferingPrice> {
    private static final Logger logger = Logger.getLogger(ProductOfferingPrice.class.getName());

    @EJB
    private ProductOfferingPriceFacade manager;

    /*
     *
     */
    public ProductOfferingPriceInCatalogIdVersionFacadeREST() {
        super(ProductOfferingPrice.class);
    }

    /*
     *
     */
    @Override
    public Logger getLogger() {
        return logger;
    }

    /*
     *
     */
    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response create(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion, ProductOfferingPrice input, @Context UriInfo uriInfo) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:create(catalogId: {0}, catalogVersion: {1})", new Object[]{catalogId, catalogVersion});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

    /*
     *
     */
    @PUT
    @Path("{entityId}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response update(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion, @PathParam("entityId") String entityId, ProductOfferingPrice input, @Context UriInfo uriInfo) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:update(catalogId: {0}, catalogVersion: {1}, entityId: {2})", new Object[]{catalogId, catalogVersion, entityId});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

    /*
     *
     */
    @PUT
    @Path("{entityId}:({entityVersion})")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response update(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion, @PathParam("entityId") String entityId, @PathParam("entityVersion") ParsedVersion entityVersion, ProductOfferingPrice input, @Context UriInfo uriInfo) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:update(catalogId: {0}, catalogVersion: {1}, entityId: {2}, entityVersion: {3})", new Object[]{catalogId, catalogVersion, entityId, entityVersion});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

    /*
     *
     */
    @PATCH
    @Path("{entityId}")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response edit(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion, @PathParam("entityId") String entityId, ProductOfferingPrice input, @Context UriInfo uriInfo) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:edit(catalogId: {0}, catalogVersion: {1}, entityId: {2})", new Object[]{catalogId, catalogVersion, entityId});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

    /*
     *
     */
    @PATCH
    @Path("{entityId}:({entityVersion})")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response edit(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion, @PathParam("entityId") String entityId, @PathParam("entityVersion") ParsedVersion entityVersion, ProductOfferingPrice input, @Context UriInfo uriInfo) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:edit(catalogId: {0}, catalogVersion: {1}, entityId: {2}, entityVersion: {3})", new Object[]{catalogId, catalogVersion, entityId, entityVersion});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

    /*
     *
     */
    @DELETE
    @Path("{entityId}")
    public Response remove(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion, @PathParam("entityId") String entityId) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:remove(catalogId: {0}, catalogVersion: {1}, entityId: {2})", new Object[]{catalogId, catalogVersion, entityId});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

    /*
     *
     */
    @DELETE
    @Path("{entityId}:({entityVersion})")
    public Response remove(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion, @PathParam("entityId") String entityId, @PathParam("entityVersion") ParsedVersion entityVersion) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:remove(catalogId: {0}, catalogVersion: {1}, entityId: {2}, entityVersion: {3})", new Object[]{catalogId, catalogVersion, entityId, entityVersion});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

    /*
     *
     */
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response find(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion, @QueryParam("depth") int depth, @Context UriInfo uriInfo) throws BadUsageException {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:find(catalogId: {0}, catalogVersion: {1}, depth: {2})", new Object[]{catalogId, catalogVersion, depth});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

    /*
     *
     */
    @GET
    @Path("{entityId}")
    @Produces({MediaType.APPLICATION_JSON})
    public Response findById(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion, @PathParam("entityId") String entityId, @QueryParam("depth") int depth, @Context UriInfo uriInfo) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:find(catalogId: {0}, catalogVersion: {1}, entityId: {2}, depth: {3})", new Object[]{catalogId, catalogVersion, entityId, depth});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

    /*
     *
     */
    @GET
    @Path("{entityId}:({entityVersion})")
    @Produces({MediaType.APPLICATION_JSON})
    public Response find(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion, @PathParam("entityId") String entityId, @PathParam("entityVersion") ParsedVersion entityVersion, @QueryParam("depth") int depth, @Context UriInfo uriInfo) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:find(catalogId: {0}, catalogVersion: {1}, entityId: {2}, entityVersion: {3}, depth: {4})", new Object[]{catalogId, catalogVersion, entityId, entityVersion, depth});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

    /*
     *
     */
    @GET
    @Path("admin/proto")
    @Produces({MediaType.APPLICATION_JSON})
    public Response proto(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:proto(catalogId: {0}, catalogVersion: {1})", new Object[]{catalogId, catalogVersion});

        return Response.ok(ProductOfferingPrice.createProto()).build();
    }

    /*
     *
     */
    @GET
    @Path("admin/count")
    @Produces({MediaType.TEXT_PLAIN})
    public Response count(@PathParam("catalogId") String catalogId, @PathParam("catalogVersion") ParsedVersion catalogVersion) {
        logger.log(Level.FINE, "ProductOfferingPriceInCatalogIdVersionFacadeREST:count(catalogId: {0}, catalogVersion: {1})", new Object[]{catalogId, catalogVersion});

        return Response.status(Response.Status.FORBIDDEN).build();
    }

}
