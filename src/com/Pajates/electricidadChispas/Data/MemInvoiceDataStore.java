package com.Pajates.electricidadChispas.Data;

import com.Pajates.electricidadChispas.Domain.models.Invoice;

import java.util.List;
import java.util.TreeMap;

public class MemInvoiceDataStore implements InvoiceDataStore {

private TreeMap<Integer, Invoice> dataStore = new TreeMap<>();

    @Override
    public void saveInvoice(Invoice invoice) { dataStore.put(invoice.getIdInvoice(), invoice);

    }

    @Override
    public void deleteInvoice(Invoice invoice) { dataStore.remove(invoice.getIdInvoice());

    }

    @Override
    public void updateInvoice(Invoice invoice) { dataStore.replace(invoice.getIdInvoice(), invoice);

    }

    @Override
    public List<Invoice> getAllInvoice() {
        return dataStore.values().stream().toList();
    }

    @Override
    public Invoice findById(Integer idInvoice) {
        return dataStore.get(idInvoice);
    }
}
