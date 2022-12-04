package com.Pajates.electricidadChispas.Domain.useCase.Invoice;

import com.Pajates.electricidadChispas.Data.InvoiceDataStore;
import com.Pajates.electricidadChispas.Domain.models.Invoice;

public class AddInvoiceUseCase {
    private InvoiceDataStore invoiceDataStore;

    public AddInvoiceUseCase(InvoiceDataStore invoiceDataStore) {
        this.invoiceDataStore= invoiceDataStore;
    }

    public void execute(Invoice invoice) {
        invoiceDataStore.saveInvoice(invoice);
    }
}
