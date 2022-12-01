package com.Pajates.electricidadChispas.Domain.useCase;

import com.Pajates.electricidadChispas.Data.CustomerDataStore;
import com.Pajates.electricidadChispas.Domain.models.Client;

/**
 * Caso de uso que me permite guardar un cliente.
 */
public class AddCustomerUseCase {
    private CustomerDataStore customerDataStore;

    public AddCustomerUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore= customerDataStore;
    }

    public void execute(Client customer) {
        customerDataStore.saveCustomer(customer);
    }
}