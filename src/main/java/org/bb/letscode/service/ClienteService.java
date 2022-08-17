package org.bb.letscode.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.bb.letscode.model.Cliente;
import org.bb.letscode.repository.ClienteRepository;
import org.eclipse.microprofile.openapi.annotations.parameters.RequestBody;

@RequestScoped
public class ClienteService {

    @Inject 
    ClienteRepository clienteRepository;

    public List<Cliente> listaCliente (){
        return clienteRepository.streamAll().collect(Collectors.toList());
    } 

    @Transactional
    public Cliente inserirCliente(Cliente cliente){
        clienteRepository.persist(cliente);
        return cliente;
    } 

    // @Transactional
    // public Cliente atualizarCliente (final @PathParam ("id") long id, @RequestBody Cliente cliente){
    //     Cliente clienteAtual = clienteRepository.findById(id);

    //     if (clienteAtual == null){
    //         throw new NotFoundException();
    //     }
        

    // }

}
