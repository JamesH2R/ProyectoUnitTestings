package com.tienda.service;

import com.tienda.domain.Cliente;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


class ClienteServiceImplTest {
    ClienteServiceImpl clienteService;
    Cliente cliente;
    @BeforeEach
    void setUp() {
        clienteService= Mockito.mock(ClienteServiceImpl.class);

    }

    @Test
    void findByApellidos() {
        when(clienteService.findByApellidos(cliente)).thenReturn(cliente);
        assertEquals(cliente, clienteService.findByApellidos(cliente));
    }

    @Test
    void getClientes() {

    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void getCliente() {
    }
}