package com.Pajates.electricidadChispas.Domain.useCase;

import com.Pajates.electricidadChispas.Data.CustomerDataStore;
import com.Pajates.electricidadChispas.Data.MemCustomerDataStore;
import com.Pajates.electricidadChispas.Domain.models.Client;
import java.util.List;

/**
 * Caso de uso que me permite recuperar un listado de clientes.
 */
public class GetCustomersUseCase {

    private CustomerDataStore customerDataStore;

    public GetCustomersUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public List<Client> execute() {
        return customerDataStore.getAllCustomers();
    }

}
