package com.ChinoMarket.pe.proyecto_crud.services;


import com.ChinoMarket.pe.proyecto_crud.entities.Cliente;
import com.ChinoMarket.pe.proyecto_crud.repository.ClienteRepository;
import jakarta.persistence.IdClass;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
@Transactional
public class ClienteServiceImpl  implements ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteServiceImpl(ClienteRepository companyRepository) {
        this.clienteRepository = companyRepository;
    }


    @Override
    public Cliente create(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente readById(Long idC) {
        return clienteRepository.findById(idC)
                .orElseThrow(() -> new NoSuchElementException("Cliente no encontrado con ID: " + idC));
    }

    @Override
    public List<Cliente> readAll() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente update(Long idC, Cliente clienteActualizado) {
        Optional<Cliente> optionalCliente = clienteRepository.findById(idC);
        if (optionalCliente.isPresent()) {
            Cliente clienteExistente = optionalCliente.get();
            clienteExistente.setNombres(clienteActualizado.getNombres());
            clienteExistente.setEmail(clienteActualizado.getEmail());
            clienteExistente.setPassword(clienteActualizado.getPassword());
            clienteExistente.setCelular(clienteActualizado.getCelular());
            clienteExistente.setDireccion(clienteActualizado.getDireccion());
            return clienteRepository.save(clienteExistente);
        }
        return null;
    }


    @Override
    public void delete(Long idC) {
        clienteRepository.deleteById(idC);
    }
}


