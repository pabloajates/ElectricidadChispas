package com.Pajates.electricidadChispas.Data;

import com.Pajates.electricidadChispas.Domain.models.Client;

import java.util.List;
import java.util.TreeMap;

public class MemCustomerDataStore implements CustomerDataStore {

    private TreeMap<Integer, Client> dataStore = new TreeMap<>();

    @Override
    public void saveCustomer(Client cliente) {
        dataStore.put(cliente.getId(), cliente);
    }

    @Override
    public void deleteCustomer(Client cliente) {
        dataStore.remove(cliente.getId());
    }

    @Override
    public void updateCustomer(Client cliente) {
        dataStore.replace(cliente.getId(), cliente);
    }

    @Override
    public List<Client> getAllCustomers() {
        return dataStore.values().stream().toList();
    }

    @Override
    public Client findById(Integer codCliente) {
        return dataStore.get(codCliente);
    }
}

