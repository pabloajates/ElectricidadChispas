package com.Pajates.electricidadChispas.Data;

import com.Pajates.electricidadChispas.Domain.models.Invoice;

import java.util.List;

public interface InvoiceDataStore {

    void saveInvoice(Invoice invoice);

    void deleteInvoice(Invoice invoice);

    void updateInvoice(Invoice invoice);

    List<Invoice> getAllInvoice();

    Invoice findById (Integer idInvoice);
}
