package com.Pajates.electricidadChispas.Data;

import com.Pajates.electricidadChispas.Domain.models.Client;

import java.util.List;

public interface CustomerDataStore {

        void saveCustomer(Client cliente);
        void deleteCustomer(Client clientes);
        void updateCustomer(Client clientes);
        List<Client> getAllCustomers();
        Client findById (Integer codCliente);
    }

