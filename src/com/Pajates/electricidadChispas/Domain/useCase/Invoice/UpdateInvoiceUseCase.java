package com.Pajates.electricidadChispas.Domain.useCase.Invoice;

import com.Pajates.electricidadChispas.Data.InvoiceDataStore;
import com.Pajates.electricidadChispas.Domain.models.Invoice;

public class UpdateInvoiceUseCase {
    private InvoiceDataStore invoiceDataStore;

    public UpdateInvoiceUseCase(InvoiceDataStore invoiceDataStore) {
        this.invoiceDataStore = invoiceDataStore;
    }

    public void execute(Invoice invoice) {
        invoiceDataStore.updateInvoice(invoice);
    }
}
