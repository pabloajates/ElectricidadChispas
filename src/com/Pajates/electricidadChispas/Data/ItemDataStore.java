package com.Pajates.electricidadChispas.Data;

import com.Pajates.electricidadChispas.Domain.models.Products_Service;
import java.util.List;

public interface ItemDataStore {

    void saveItem(Products_Service productsService);
    void deleteItem(Products_Service productsService);

    void updateItem(Products_Service productsService);
    List<Products_Service> getAllItems();
    Products_Service findById (Integer codItem);



}
