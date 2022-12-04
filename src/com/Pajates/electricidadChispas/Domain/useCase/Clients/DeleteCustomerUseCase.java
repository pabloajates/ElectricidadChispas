package com.Pajates.electricidadChispas.Domain.useCase.Clients;

import com.Pajates.electricidadChispas.Data.CustomerDataStore;
import com.Pajates.electricidadChispas.Domain.models.Client;

/**
 * Eliminar un cliente
 */
public class DeleteCustomerUseCase {

    //Propiedad/atributo
    private CustomerDataStore customerDataStore;

    public DeleteCustomerUseCase(CustomerDataStore customerDataStore){
        this.customerDataStore = customerDataStore;
    }

    /**
     * Método
     */
    public void execute(Client cliente){
        customerDataStore.deleteCustomer(cliente);
    }

}