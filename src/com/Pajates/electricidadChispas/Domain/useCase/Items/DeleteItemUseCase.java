package com.Pajates.electricidadChispas.Domain.useCase.Items;

import com.Pajates.electricidadChispas.Data.ItemDataStore;
import com.Pajates.electricidadChispas.Domain.models.Products_Service;

public class DeleteItemUseCase {
    private ItemDataStore itemDataStore;

    public DeleteItemUseCase(ItemDataStore itemDataStore){
        this.itemDataStore = itemDataStore;
    }

    public void execute(Products_Service productsService){

        itemDataStore.deleteItem(productsService);
    }


}
