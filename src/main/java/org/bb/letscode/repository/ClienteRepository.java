package org.bb.letscode.repository;

import javax.enterprise.context.ApplicationScoped;

import org.bb.letscode.model.Cliente;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

@ApplicationScoped
public class ClienteRepository implements PanacheRepository<Cliente>{
    
}
