package com.Pajates.electricidadChispas.Domain.useCase.Invoice;

import com.Pajates.electricidadChispas.Data.InvoiceDataStore;
import com.Pajates.electricidadChispas.Domain.models.Invoice;

import java.util.List;

public class GetInvoiceUseCase {
    private InvoiceDataStore invoiceDataStore;

    public GetInvoiceUseCase(InvoiceDataStore invoiceDataStore) {
        this.invoiceDataStore = invoiceDataStore;
    }

    public List<Invoice> execute() {
        return invoiceDataStore.getAllInvoice();
    }
}
