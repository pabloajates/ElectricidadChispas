package com.Pajates.electricidadChispas.Domain.useCase;

import com.Pajates.electricidadChispas.Data.CustomerDataStore;
import com.Pajates.electricidadChispas.Domain.models.Client;
public class UpdateCustomerUseCase {

    private CustomerDataStore customerDataStore;

    public UpdateCustomerUseCase(CustomerDataStore customerDataStore) {
        this.customerDataStore = customerDataStore;
    }

    public void execute(Client cliente) {
        customerDataStore.updateCustomer(cliente);
    }
}

