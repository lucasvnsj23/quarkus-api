package org.bb.letscode.rest;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.bb.letscode.model.Cliente;
import org.bb.letscode.service.ClienteService;

@RequestScoped
@Path("/clientes")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RestControllerClient {

    @Inject
    ClienteService clienteService;
    
    @GET
    public Response listaCliente() throws Exception  {
        return Response.status(Response.Status.OK).entity(clienteService.listaCliente()).build();
    }

    @POST
    public Response inserirCliente(Cliente cliente) throws Exception {
        return  Response.status(Response.Status.CREATED).entity(clienteService.inserirCliente(cliente)).build();
    }

    // @PUT
    // @Path("/{id}")
    // public Response atualizarCliente(final @PathParam("id") int id) throws Exception  {
    //     return Response.status(Response.Status.OK).entity(ClienteService.atualizarCliente(id)).build();

}
