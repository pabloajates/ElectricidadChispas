package com.Pajates.electricidadChispas.Domain.useCase.Items;

import com.Pajates.electricidadChispas.Data.ItemDataStore;
import com.Pajates.electricidadChispas.Domain.models.Products_Service;

import java.util.List;

public class GetItemUseCase {

    private ItemDataStore itemDataStore;

    public GetItemUseCase(ItemDataStore itemDataStore) {
        this.itemDataStore = itemDataStore;
    }

    public List<Products_Service> execute() {
        return itemDataStore.getAllItems();
    }
}
