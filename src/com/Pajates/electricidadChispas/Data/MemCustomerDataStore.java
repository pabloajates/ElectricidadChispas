package com.Pajates.electricidadChispas.Data;

import com.Pajates.electricidadChispas.Domain.models.Client;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
public class MemCustomerDataStore {

    //Mem quiere decir de tipo memoria
    public class memCustomerDataStore implements CustomerDataStore {

        private TreeMap<Object, Client> datastore = new TreeMap<Object, Client>();

        @Override
        public void saveCustomer(Client cliente) {
            datastore.put(cliente.getId(), cliente);
        }

        @Override
        public void deleteCustomer(Client clientes) {
            datastore.remove(clientes.getId(), clientes);
        }

        @Override
        public void updateCustomer(Client clientes) {
            datastore.replace(clientes.getId(), clientes);
        }

        @Override
        public List<Client> getAllCustomers() {
            return datastore.values().stream().collect(Collectors.toList());
        }

        @Override
        public Client findById(Integer Id) {
            return null;
        }
    }
}

